package warzywniak;

public class OsobaPrawna implements Osoba {

	private String nazwafirmy;

	public OsobaPrawna(String nazwafirmy) {
		this.nazwafirmy = nazwafirmy;
	}

	@Override
	public String nazwa() {
		// TODO Auto-generated method stub
		return nazwafirmy;
	}
}
