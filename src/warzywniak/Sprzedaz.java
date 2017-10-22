package warzywniak;

import java.util.ArrayList;
import java.util.List;

public class Sprzedaz {

	public static void main(String[] argc) {
		OsobaFizyczna osoba1 = new OsobaFizyczna("Krystian", "Derkowski", 33);
		OsobaFizyczna osoba2 = new OsobaFizyczna("Zenon", "Iksinski", 16);
		OsobaFizyczna osoba3 = new OsobaFizyczna("Waldemar", "Papier", 18);
		OsobaFizyczna fiz = new OsobaFizyczna("Staszek", "Tr¹balski");
		OsobaPrawna praw = new OsobaPrawna ("Atena");
	//	System.out.println(osoba1);
	//	System.out.println(osoba2);
	//	System.out.println(osoba3);
		
		SklepikJablka sklepik1 = new SklepikJablka("Jablka", 3);
		SklepikBanany sklepik2 = new SklepikBanany("Bana", 3);
		System.out.println(sklepik1);
		System.out.println(sklepik2);
		sklepik1.sprzedaz(osoba1,1);
//		sklepik1.sprzedaz(osoba1,1);
		sklepik2.sprzedaz(osoba1,2);
//		sklepik1.sprzedaz(osoba1,1,"Jablka");
		System.out.println(osoba1);
//		System.out.println(sklepik1);
//		sklepik1.sprzedaz(osoba2);
//		System.out.println(osoba2);
//		sklepik1.sprzedaz(osoba1);
//		sklepik1.sprzedaz(osoba3);
//		sklepik1.sprzedaz(osoba1);
//		sklepik1.dostawa(5);
		System.out.println(sklepik1);
		System.out.println(sklepik2);
		System.out.println("Stan magazynu Jab³ek: " +sklepik1.getIlosc());
		System.out.println("Stan magazynu Bananów: " +sklepik2.getIlosc());
	}


}
