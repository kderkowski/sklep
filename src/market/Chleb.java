package market;

public class Chleb {
	private String rodzaj;
	private int cena;
	private int iloscBoch;

	public Chleb(String rodzaj, int iloscBoch) {
		this.rodzaj = rodzaj;
		this.iloscBoch = iloscBoch;
	}

	public Chleb(int cena, int iloscBoch) {
		this.cena = cena;
		this.iloscBoch = iloscBoch;
	}
}
