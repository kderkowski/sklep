package warzywniak;

public class Banany implements iBanany {

	private int iloscJa;
	private String rodzaj = "Banan";
	private int cena;
	
	public Banany(int iloscJa, int cena) {
		super();
		this.iloscJa = iloscJa;
		this.cena = cena;
	}


	public Banany() {
		// TODO Auto-generated constructor stub
	}


	public int getIloscJa() {
		return iloscJa;
	}

	public void setIloscJa(int iloscJa) {
		this.iloscJa = iloscJa;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}


	public String getRodzaj() {
		return rodzaj;
	}


	public void setRodzaj(String rodzaj) {
		this.rodzaj = rodzaj;
	}
	
	@Override
	public String nazwa() {
		// TODO Auto-generated method stub
		return rodzaj;
	}
}
