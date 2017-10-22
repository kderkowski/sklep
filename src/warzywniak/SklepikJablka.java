package warzywniak;

import warzywniak.OsobaFizyczna;

public class SklepikJablka {

	private String marka;
	private int ilosc;

	public SklepikJablka(String marka, int ilosc) {
		this.marka = marka;
		this.ilosc = ilosc;
	}

	public void dostawa(int ilosc) {
		this.ilosc += ilosc;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public int getIlosc() {
		return ilosc;
	}

	public void setIlosc(int ilosc) {
		this.ilosc = ilosc;
	}

//	public void sprzedaz(Osoba osoba) {
//		if (osoba.getWiek() < Osoba.PELNOLETNOSC) {
//			System.out.println("Drogi kliencie " + osoba.getImie());
//			return;
//		}
//		if (ilosc < 1) {
//			System.out.println("Brak piwa");
//			return;
//		}
//		ilosc -= 1;
//		int a = osoba.getStan();
///		a += 1;
//		osoba.setStan(a);
//	}
	
	public void sprzedaz(OsobaFizyczna osoba) {
		sprzedaz (osoba,1);
	}	

	public void sprzedaz(OsobaFizyczna osoba, int iloscjabl) {
		if (osoba.getWiek() < OsobaFizyczna.PELNOLETNOSC) {
			System.out.println("Drogi kliencie " + osoba.getImie() +"jestes niepe³nnoletni SPADAJ");
			return;
		}
		if (ilosc < iloscjabl) {
			System.out.println("Brak Jablek");
			return;
		}
		ilosc -= iloscjabl;
		int a = osoba.getStan();
		a += iloscjabl;
		osoba.setStan(a);
	}

	@Override
	public String toString() {
		return "Sklepik [marka=" + marka + ", ilosc=" + ilosc + "]";
	}
	
}

