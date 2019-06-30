package Arvauspeli;

import Arvauspeli.Pelaaja;
import Arvauspeli.Peli;

public class Pelaaja extends Peli implements Comparable<Pelaaja>  {
	protected String nimi;
	protected int pisteet;
	
	//----------------KONSTRUKTORI---------------//
	
	public Pelaaja(String nimi, int pisteet) {
		this.nimi = nimi;
		this.pisteet = pisteet;
	}
	
	//-----------------------------------------------------//
	
	
	public void lisaaNimi(String nimi) {
		this.nimi = nimi;
	}
	
	public String annaNimi() {
		return nimi;
	}

	public void lisaaPiste() {
		pisteet += 1;
	}
	
	public int annaPisteet() {
		return pisteet;
	}

	public int compareTo(Pelaaja pelaaja) {
		if(pisteet > pelaaja.annaPisteet()) {
			return -1;
		}
		else if (pisteet == pelaaja.annaPisteet()){
			return 0;
		}
		return 1;
    }
	
	public String toString() {
		return nimi + ", " + Integer.toString(pisteet) + " ";
	}
}


