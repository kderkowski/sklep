package market;

public class Papierosy {
	private String markaFajek;
	private int iloscPaczek;
	private int cena;

	public Papierosy(String markaFajek, int iloscPaczek) {
		this.markaFajek = markaFajek;
		this.iloscPaczek = iloscPaczek;
}

	public Papierosy(int cena, int iloscPaczek) {
		this.cena = cena;
		this.iloscPaczek = iloscPaczek;
	}
}
