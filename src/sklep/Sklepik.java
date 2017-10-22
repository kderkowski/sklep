package sklep;

import sklep.OsobaFizyczna;

public abstract class Sklepik {

	private String marka;
	private int ilosc;
	private int cena;

	public Sklepik(String marka, int ilosc, int cena ) {
		this.marka = marka;
		this.ilosc = ilosc;
		this.cena = cena;
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
		if (ilosc < iloscjabl) {
			System.out.println("Brak piwa");
			return;
		}
		ilosc -= iloscjabl;
		int a = osoba.getStan();
		a += iloscjabl;
		osoba.setStan(a);
	}
	public void sprzedazBanany(OsobaFizyczna osoba, int iloscban) {
		if (ilosc < iloscban) {
			System.out.println("Brak piwa");
			return;
		}
		ilosc -= iloscban;
		int a = osoba.getStan();
		a += iloscban;
		osoba.setStan(a);
	}
		
		public void sprzedazFajki(OsobaFizyczna osoba, int iloscpaczek) {
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
		public void sprzedazBrowar(OsobaFizyczna osoba, int iloscpiw) {
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
		public void sprzedazNapoj(OsobaFizyczna osoba, int iloscbutel) {
			if (ilosc < iloscbutel) {
				System.out.println("Brak piwa");
				return;
			}
			ilosc -= iloscbutel;
			int a = osoba.getStan();
			a += iloscbutel;
			osoba.setStan(a);
	}
		public void stanMagazynu(String nazwa, int ilosc) {

	}
		
		public void sprzedazMleko(OsobaFizyczna osoba, int ilosckarto) {
			if (ilosc < ilosckarto) {
				System.out.println("Brak piwa");
				return;
			}
			ilosc -= ilosckarto;
			int a = osoba.getStan();
			a += ilosckarto;
			osoba.setStan(a);
	}
		
		public void sprzedazMleko () {
			
		}	
		

//	@Override
//	public String toString() {
//		return "Sklepik [marka=" + marka + ", ilosc=" + ilosc + "]";
//	}

		@Override
		public String toString() {
			return "[marka=" + marka + ", ilosc=" + ilosc + ", cena=" + cena + "]";
		}
		 protected abstract void promocja();
}
