package warzywniak;

public class Sklepik {

	private String marka;
	private int ilosc;
	private int ilos1;
	private int ilos2;

	public Sklepik(String marka, int ilosc) {
		this.marka = marka;
		this.ilosc = ilosc;
	}

	public Sklepik(String marka, int ilosc, int ilos1, int ilos2) {
		this.marka = marka;
		this.ilosc = ilosc;
		this.ilos1 = ilos1;
		this.ilos2 = ilos2;
	}

	
	public Sklepik() {
		// TODO Auto-generated constructor stub
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

	// public void sprzedaz(Osoba osoba) {
	// if (osoba.getWiek() < Osoba.PELNOLETNOSC) {
	// System.out.println("Drogi kliencie " + osoba.getImie());
	// return;
	// }
	// if (ilosc < 1) {
	// System.out.println("Brak piwa");
	// return;
	// }
	// ilosc -= 1;
	// int a = osoba.getStan();
	/// a += 1;
	// osoba.setStan(a);
	// }

//	 public void sprzedaz(OsobaFizyczna osoba) {
//	 sprzedaz(osoba,1);
//	 }

	public void sprzedaz(OsobaFizyczna osoba, Jablka ja, int ilosc1, Banany ba, int ilosc2) {
	//	Jablka ja = new Jablka();
	//	if (osoba.getWiek()< OsobaFizyczna.PELNOLETNOSC) {
	//		System.out.println("Drogi kliencie " + osoba.getImie() +"jestes niepe³nnoletni SPADAJ");
	//		return;
	//	}

		//ja.setIloscJa(5);
		if (marka.equals(ja.getRodzaj())) {
			if (ilosc < ilosc1) {
				System.out.println("Brak Jab³ek");
				return;
			}
			ilosc -= ilosc1;
			int a = osoba.getStan();
			a += ilosc1;
			osoba.setStan(a);
		}

		if (marka.equals(ba.getRodzaj())) {
			if (ilosc < ilosc2) {
				System.out.println("Brak Bananów");
				return;
			}
			ilosc -= ilosc2;
			int a = osoba.getStan();
			a += ilosc2;
			osoba.setStan(a);
		}
	}

	@Override
	public String toString() {
		return "Sklepik [marka=" + marka + ", ilosc=" + ilosc + "]";
	}

}
