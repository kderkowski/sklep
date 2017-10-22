package sklep;

public class OsobaFizyczna implements Osoba {

	private String imie;
	private String nazwisko;
	private int stan = 0;
	private int wiek;

	public final static int PELNOLETNOSC = 18;

	public OsobaFizyczna(String imie, String nazwisko, int wiek) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
	}

	public OsobaFizyczna(String imie, String nazwisko) {
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public int getStan() {
		return stan;
	}

	public void setStan(int stan) {
		this.stan = stan;
	}

	public int getWiek() {
		return wiek;
	}

	public void setWiek(int wiek) {
		this.wiek = wiek;
	}

	@Override
	public String toString() {
		return "Klient [imie=" + imie + ", nazwisko=" + nazwisko + ", stan=" + stan + ", wiek=" + wiek + "]";
	}

	@Override
	public String nazwa() {
		// TODO Auto-generated method stub
		return imie;
	}

}
