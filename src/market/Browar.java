package market;

public class Browar {
	private String markaPiwa;
	private int cena;
	private int iloscPiw;
	private int piwo = 1;

	public Browar(String markaPiwa, int iloscPiw, int piwo) {
		super(iloscPiw, iloscPiw, piwo);
	}

	public String getMarkaPiwa() {
		return markaPiwa;
	}

	public void setMarkaPiwa(String markaPiwa) {
		this.markaPiwa = markaPiwa;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public int getIloscPiw() {
		return iloscPiw;
	}

	public void setIloscPiw(int iloscPiw) {
		this.iloscPiw = iloscPiw;
	}

	public int getPiwo() {
		return piwo;
	}

	public void setPiwo(int piwo) {
		this.piwo = piwo;
	}
	

//	public Browar(int cena, int iloscPiw) {
	//	this.cena = cena;
		//this.iloscPiw = iloscPiw;
	//}
}
