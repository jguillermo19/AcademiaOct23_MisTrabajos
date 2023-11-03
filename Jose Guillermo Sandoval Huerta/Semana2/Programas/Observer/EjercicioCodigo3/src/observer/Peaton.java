package observer;

public class Peaton extends Observador{
	
	public Peaton(Sujeto sj) {
		super(sj);
	} 
	
	void cruzar() {
		System.out.println("Peaton: cruzar calle");
	}
	
	void prepararse() {
		System.out.println("Peaton: prepararse a cruzar");
	}
	
	void esperar() {
		System.out.println("Peaton: esperar en la esquina");
	}

	@Override
	void verLuzVerde() {
		esperar();
	}

	@Override
	void verLuzAmarrilla() {
		prepararse();
	}

	@Override
	void verLuzRoja() {
		cruzar();
	}
}
