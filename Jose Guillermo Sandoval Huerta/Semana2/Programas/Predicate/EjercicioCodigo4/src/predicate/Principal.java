package predicate;

import java.util.*;
import java.util.function.Predicate;

public class Principal {
	public static void main(String[] args) {
		
		List<Pirata> listaPiratas = new ArrayList<>();
		listaPiratas.add(new Pirata("Edward Teach", "Barbanegra", "Espada recta",12));
		listaPiratas.add(new Pirata("Bartholomew Roberts", "El Diablo Negro", "Pistolas de chispa",9));
		listaPiratas.add(new Pirata("Henry Morgan", "El Pirata Morgan", "Sable",17));
		
		// Tipo Arma
		poderArma(listaPiratas, pir -> pir.getArma().length() > 5);		
		System.out.println();
		
		// Rango Pirata
		rango(listaPiratas, pir -> pir.getTesoros()>10);
	}

	private static void poderArma(List<Pirata> listaPiratas, Predicate<Pirata> pre) {
		for(Pirata pirata:listaPiratas) {
			if(pre.test(pirata))
				System.out.println("Poder: " + pirata.getArma() + " - Efectiva");
			else
				System.out.println("Poder: " + pirata.getArma() + " - Debil");
		}
	}

	private static void rango(List<Pirata> listaPiratas, Predicate<Pirata> pre) {
		for(Pirata pirata:listaPiratas) {
			if(pre.test(pirata))
				System.out.println("Gran Pirata: " + pirata.getApodo());
			else
				System.out.println("     Pirata: " + pirata.getApodo());
		}
	}
}
