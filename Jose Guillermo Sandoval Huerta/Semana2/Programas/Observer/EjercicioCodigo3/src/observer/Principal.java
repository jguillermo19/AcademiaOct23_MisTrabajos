package observer;

public class Principal {

	public static void main(String[] args) {
		Semaforo semaforo = new Semaforo();

		Peaton peaton = new Peaton(semaforo);
		Coche coche1 = new Coche("azul", semaforo);
		Coche coche2 = new Coche("blanco", semaforo);

		Policia policiaTransito = new Policia("transito", semaforo);

		semaforo.cambiarVerde();
		System.out.println("");

		semaforo.cambiarAmarillo();
		System.out.println("");

		semaforo.cambiarRojo();
		System.out.println("");

	}

}
