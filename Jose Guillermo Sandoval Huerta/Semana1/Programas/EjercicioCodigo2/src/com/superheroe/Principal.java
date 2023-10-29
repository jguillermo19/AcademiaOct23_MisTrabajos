package com.superheroe;

public class Principal {

	public static void main(String[] args) {

		SpiderPeopleVerso[] spiderVerso = {
				new Spiderman("Peter Parker", "Spiderman", 19999)
				, new Spiderman("Miles Morales", "Spiderman", 1610)
				, new SpiderAnimal("Peter Porker", "Spider-Ham", 8311)
				, new Simbionte("Eddie Brock", "Venom", 616)
				, new Simbionte("Cletus Kasady", "Carnage", 876)
		};
		
		personajes(spiderVerso);
	}
	
	private static void personajes(SpiderPeopleVerso[] spiderVerso) {
		int i = 0;
		for(SpiderPeopleVerso sv : spiderVerso) {
			System.out.println("*********** No." + (++i) + "************");
			System.out.println(sv);
			System.out.println("Nombre Civil: " + sv.getNombreCivil());
			System.out.println(sv.tipoHabilidad( (int)(Math.random()*5+1) ) );
			sv.origenPoder();
		}
	}

}
