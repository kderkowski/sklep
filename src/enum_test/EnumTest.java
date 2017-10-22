package enum_test;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;

public class EnumTest {
	
	public static void main(String[] argc) {
		EnumPrzedmioty.ARBUZ.gnije();
		System.out.println(EnumPrzedmioty.JABLKO.name());
		EnumPrzedmioty.JABLKO.gnije();
		System.out.println(EnumPrzedmioty.JABLKO.getCode());
		Arrays.asList(EnumPrzedmioty.values()).forEach(o->System.out.println(o.getCode()+" " +o.getCode()));
		
		Set<EnumPrzedmioty> towar1 = EnumSet.allOf(EnumPrzedmioty.class);
		towar1.forEach(System.out::println);
	}

}
