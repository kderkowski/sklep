package market;

import sklep.OsobaFizyczna;

public class Market {

	private int towar;
	private int ilosc;
	private int piwo;

	public Market(String string, int i) {
		// TODO Auto-generated constructor stub
	}


	public void dostawa(int ilosc) {
		this.ilosc += ilosc;
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
	
	public int getTowar() {
		return towar;
	}

	public void setTowar(int towar) {
		this.towar = towar;
	}

	public int getIlosc() {
		return ilosc;
	}

	public void setIlosc(int ilosc) {
		this.ilosc = ilosc;
	}

	public void sprzedaz(OsobaFizyczna osoba) {
		sprzedaz (osoba,1);
	}	

	public void sprzedaz(OsobaFizyczna osoba, int iloscpiw) {
		if (osoba.getWiek() < OsobaFizyczna.PELNOLETNOSC) {
			System.out.println("Drogi kliencie " + osoba.getImie() +"jestes niepe³nnoletni SPADAJ");
			return;
		}
			if (ilosc < iloscpiw) {
				System.out.println("Brak piwa");
				return;
			}
			ilosc -= iloscpiw;
			int a = osoba.getStan();
			a += iloscpiw;
			osoba.setStan(a);
		}

	public void sprzedaz2(OsobaFizyczna osoba, int iloscpaczek) {
		if (osoba.getWiek() < OsobaFizyczna.PELNOLETNOSC) {
			System.out.println("Drogi kliencie " + osoba.getImie() +"jestes niepe³nnoletni SPADAJ");
			return;
		}
			if (ilosc < iloscpaczek) {
				System.out.println("Brak piwa");
				return;
			}
			ilosc -= iloscpaczek;
			int a = osoba.getStan();
			a += iloscpaczek;
			osoba.setStan(a);
		}
	public void sprzedaz3(OsobaFizyczna osoba, int iloscjabl) {
		if (osoba.getWiek() < OsobaFizyczna.PELNOLETNOSC) {
			System.out.println("Drogi kliencie " + osoba.getImie() +"jestes niepe³nnoletni SPADAJ");
			return;
		}
			if (ilosc < iloscjabl) {
				System.out.println("Brak piwa");
				return;
			}
			ilosc -= iloscjabl;
			int a = osoba.getStan();
			a += iloscjabl;
			osoba.setStan(a);
		}

	@Override
	public String toString() {
		return "Sklepik [towar=" + towar + ", ilosc=" + ilosc + "]";
	}
	
}
