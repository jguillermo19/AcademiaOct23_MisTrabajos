package inyeccionDependencias;

public class Principal {
	public static void main(String[] args) {

		//Inyeccion a traves de variable
		Ticket vuelo1 = new Ticket("A106", "Patrobas", "Cancún", "Enero 2024");
		InyectorAvion.inyectarAvion(vuelo1, "vs");
		vuelo1.reservarAvion();

		//Inyeccion a traves de setter
		Ticket vuelo2 = new Ticket("JA20", "Epeneto", "Monterrey", "Abril 2024");
		InyectorAvion.inyectarAvion2(vuelo2, "am");
		vuelo2.reservarAvion2();

		//Inyeccion a traves de constructor
		Ticket2 vuelo3 = InyectorAvion.inyectarAvion3("va");
		vuelo3.reservarAvion();
	}
}
