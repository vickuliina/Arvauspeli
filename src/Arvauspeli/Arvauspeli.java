package Arvauspeli;

import java.util.Random;
import java.util.Scanner;

public class Arvauspeli {

	public static void main(String[] args) {
		
		Scanner lukija = new Scanner(System.in);
		Random random = new Random();
		
		Peli uusiPeli = new Peli();
		
		String[] aiheet = {"TANSSIJA", "SOITIN", "NAAKKELIN 'SALAINEN' PAHE", "ALKOHOLIJUOMA", "TUOTEMERKKI", "KULKUVÄLINE", "ELÄIN", "KASVI", "AUTOMERKKI", "ELOKUVA", "KAUPUNKI", "RUOKA", "RISKI", "KIRJA", "KIRJAILIJA", "JUOMA", "URHEILULAJI", "JOUKKUE", "MAA", "KOULUAINE", "BAARI", "TYÖKALU"};
		uusiPeli.lisaaAiheet(aiheet);
		
		char[] kirjaimet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'R', 'S', 'T', 'U', 'V', 'Y', 'Ä'};
		uusiPeli.lisaaKirjaimet(kirjaimet);
		
		uusiPeli.annaAlkuteksti();
		//System.out.println(aiheet.length);
		//System.out.println(kirjaimet.length);
		uusiPeli.asetaPelaajaMaara();
		
		for(int i=0; i<uusiPeli.annaPelaajaMaara(); i++) {
			System.out.println("Anna pelaajan " + (i+1) + " nimimerkki pisteiden tallennusta varten");
			String nimi = lukija.nextLine();
			Pelaaja pelaaja = new Pelaaja(nimi, 0);
			uusiPeli.lisaaPelaaja(pelaaja);
		}
		
		uusiPeli.aloitaPeli();
		
		//EI TOIMI!
		int aiheidenMaara = uusiPeli.annaAiheidenMaara();
		
		for(int i=0; i<aiheidenMaara; i++) {
			uusiPeli.kierros();
			if(uusiPeli.annaAiheidenMaara() == 0) {
				uusiPeli.kierroksetLoppu();
			}
			else {
				uusiPeli.jatkaKierrosta();
			}
		}
		
		uusiPeli.peliLoppui();
		uusiPeli.annaTulokset();
	}

}
