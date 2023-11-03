package observer;

public class Semaforo extends Sujeto{
	void luzVerde(){
		cambiarVerde();
	}
	
	void luzAmarilla(){
		cambiarAmarillo();
	}
	
	void luzRoja(){
		cambiarRojo();
	}
}
