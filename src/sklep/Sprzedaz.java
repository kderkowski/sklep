package sklep;

import java.util.ArrayList;
import java.util.List;

public abstract class Sprzedaz {

	public static void main(String[] argc) {
		OsobaFizyczna osoba1 = new OsobaFizyczna("Krystian", "Derkowski", 33);
		OsobaFizyczna osoba2 = new OsobaFizyczna("Zenon", "Iksinski", 16);
		OsobaFizyczna osoba3 = new OsobaFizyczna("Waldemar", "Papier", 18);
		OsobaFizyczna fiz = new OsobaFizyczna("Staszek", "Tr¹balski");
		OsobaPrawna praw = new OsobaPrawna ("Atena");
	//	System.out.println(osoba1);
	//	System.out.println(osoba2);
	//	System.out.println(osoba3);
		
		Sklepik sklepik1 = new Sklepik("Jablka", 3, 3);
		Sklepik sklepik2 = new Sklepik("Banany", 3, 4);
		Sklepik sklepik3 = new Sklepik("Malboro", 3, 14);
		Sklepik sklepik4 = new Sklepik("¯ubr", 3, 1);
		Sklepik sklepik5 = new Sklepik("Pepsi", 3, 1);
		System.out.println(osoba1);
		System.out.println(" ");
		System.out.println(sklepik1);
		System.out.println(sklepik2);
		System.out.println(sklepik3);
		System.out.println(sklepik4);
		System.out.println(sklepik5);
		sklepik1.sprzedaz(osoba1,1);
		sklepik2.sprzedazBanany(osoba1,2);
		sklepik3.sprzedazFajki(osoba1,2);
		sklepik4.sprzedazBrowar(osoba1, 1);
		sklepik5.sprzedazNapoj(osoba1, 1);
		System.out.println("DOSTAWA");
//		System.out.println(sklepik1);
//		sklepik1.sprzedaz(osoba2);
//		System.out.println(osoba2);
//		sklepik1.sprzedaz(osoba1);
//		sklepik1.sprzedaz(osoba3);
//		sklepik1.sprzedaz(osoba1);
		sklepik1.dostawa(5);
		sklepik2.dostawa(5);
		sklepik3.dostawa(5);
		System.out.println(sklepik1);
		System.out.println(sklepik2);
		System.out.println(sklepik3);
		System.out.println(sklepik4);
		System.out.println(sklepik5);
		System.out.println("STAN MAGAZYNU");
		System.out.println("Stan magazynu Jab³ek: " +sklepik1.getIlosc());
		System.out.println("Stan magazynu Banany: " +sklepik2.getIlosc());
		System.out.println("Stan magazynu Fajki: " +sklepik3.getIlosc());
		System.out.println("Stan magazynu Browar: " +sklepik4.getIlosc());
		System.out.println("Stan magazynu Napoj: " +sklepik5.getIlosc());
		
//		List<Osoba> osoby = new ArrayList<>();
//		osoby.add(osoba1);
//		osoby.add(osoba2);
//		osoby.add(praw);
//		osoby.add(fiz);
//		osoby.forEach(i->System.out.println(i.nazwa()));
	}
	
	 protected abstract void promocja();

}
