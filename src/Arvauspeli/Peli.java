package Arvauspeli;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.Collections;

public class Peli {
	ArrayList<String> aiheet;
	ArrayList<Character> kirjaimet;
	ArrayList<Pelaaja> pelaajat;
	Scanner lukija = new Scanner(System.in);
	Random random = new Random();
	int pelaajaMaara;
	
	public Peli() {
		aiheet = new ArrayList();
		kirjaimet = new ArrayList();
		pelaajat = new ArrayList<Pelaaja>();
	}

	public void lisaaAiheet(String[] listaAiheista) {
		for(int i=0; i<listaAiheista.length; i++) {
			aiheet.add(listaAiheista[i]);
		}
	}
	
	public void lisaaKirjaimet(char[] kirjainLista) {
		for(int i=0; i<kirjainLista.length; i++) {
			kirjaimet.add(kirjainLista[i]);
		}
	}
	
	public void annaAlkuteksti() {
		System.out.println("Tervetuloa pelaamaan peli�, johon tarvitaan nopeaa ajattelukyky�." + "\n"
							+ "Ruudulle tulostuu aihe ja aiheenne luettua my�s kirjain." + "\n"
							+ "Teht�v�n�nne on keksi� mahdollisimman nopeasti aiheeseen liittyv� sana joka alkaa kyseisell� kirjaimella." + "\n"
							+ "Nopeiten arvannut saa pisteen." + "\n"
							+ "\n"
							+ "Ei muuta kun pelaamaan!" + "\n");
	}
	
	public void asetaPelaajaMaara() {
		System.out.println("Anna pelaajam��r�");
		pelaajaMaara = lukija.nextInt();
	}
	
	public int annaPelaajaMaara() {
		return pelaajaMaara;
	}
	
	public void lisaaPelaaja(Pelaaja pelaaja) {
		pelaajat.add(pelaaja);
	}
	
	public void aloitaPeli() {
		System.out.println("\n" + "Ei muuta kun aloitetaan, kai olette valmiita!");
	}
	
	public int annaAiheidenMaara() {
		return aiheet.size();
	}
	
	//EI TOIMI!
	
	public void kierros() {
		String a = lukija.nextLine();
		
		int aiheKohta = random.nextInt(aiheet.size());
		System.out.println("T�ss� on aiheenne: " + aiheet.get(aiheKohta));
		aiheet.remove(aiheKohta);
			
		String b = lukija.nextLine();
			
		int kirjainKohta = random.nextInt(kirjaimet.size());
		System.out.println("Ja t�ss� kirjain: " + kirjaimet.get(kirjainKohta));
		kirjaimet.remove(kirjainKohta);
			
		String c = lukija.nextLine();
		
		System.out.println("-------------------------------------------" + "\n" 
							+ "Kuka voitti kierroksen, antakaapas nimimerkki");
		
		boolean nimiLoyty = false;
		
		while(nimiLoyty == false) {
			String voittajanNimi = lukija.nextLine();
			for(int j=0; j<pelaajat.size(); j++) {
				if ((pelaajat.get(j).annaNimi().equals(voittajanNimi))) {
					pelaajat.get(j).lisaaPiste();
					System.out.println("Hienoa, piste lis�ttiin pelaajalle " + voittajanNimi + "!");
					nimiLoyty = true;
					break;
				}
			}
			if (nimiLoyty == false) {
				System.out.println("Nimimerkki� ei l�ytynyt. Anna nimimerkki uudestaan.");
			}
		}
	}
	
	public void jatkaKierrosta() {
		System.out.println("Ja jatketaan..." + "\n" + "----------------------------------------------------");
	}
	
	public void kierroksetLoppu() {
		System.out.println("Aiheet loppuivat, joten on aika katsoa, kuka kruunataan voittajaksi!");
		//String a = lukija.nextLine();
	}

	public void peliLoppui() {
		System.out.println("Ja voittajahan on.....");
		String b = lukija.nextLine();
		
		Collections.sort(pelaajat);
		
		//MIT� TEHD� JOS TULEE TASAPELI!?!
		
		System.out.println(pelaajat.get(0).annaNimi() + " " + pelaajat.get(0).annaPisteet() + " pisteell�!!" + "\n"
				+ "Onneksi olkoon voittajalle!");
	}
	
	public void annaTulokset() {
		for(int i=0; i<pelaajat.size(); i++) {
			System.out.println(i+1 + ". " + pelaajat.get(i).toString()); 
		}
		System.out.println("**************************************************************************");
	}
	
	
}
