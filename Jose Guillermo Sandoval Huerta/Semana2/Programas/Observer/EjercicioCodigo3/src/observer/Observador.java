package observer;

public abstract class Observador {
	
	Sujeto sujeto;
	
	public Observador(Sujeto sujeto) {
		this.sujeto = sujeto;
		sujeto.agregarObservador(this);
	}

	abstract void verLuzVerde();
	
	abstract void verLuzAmarrilla();
	
	abstract void verLuzRoja();
}
