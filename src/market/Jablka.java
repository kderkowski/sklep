package market;

public class Jablka {
	private String rodzajJabl;
	private int cena;
	private int iloscJabl;

	public Jablka(String rodzajJabl, int iloscJabl) {
		this.rodzajJabl = rodzajJabl;
		this.iloscJabl = iloscJabl;
	}
	public Jablka(int cena, int iloscJabl) {
		this.cena = cena;
		this.iloscJabl = iloscJabl;
	}
}
