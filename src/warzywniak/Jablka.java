package warzywniak;

public class Jablka implements iJablka  {

	private int iloscJa;
	private String rodzaj = "Jablka";
	private int cena;
	
	public Jablka(int iloscJa, int cena) {
		super();
		this.iloscJa = iloscJa;
		this.cena = cena;
	}


	public Jablka() {
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
