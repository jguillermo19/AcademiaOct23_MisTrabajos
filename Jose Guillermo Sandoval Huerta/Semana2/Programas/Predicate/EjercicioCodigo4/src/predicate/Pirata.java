package predicate;

public class Pirata {
    private String nombre;
    private String apodo;
    private String arma;
    private int tesoros;

    public Pirata(String nombre, String apodo, String arma, int tesoros) {
		this.nombre = nombre;
		this.apodo = apodo;
		this.arma = arma;
		this.tesoros = tesoros;
	}

	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getTesoros() {
        return tesoros;
    }

    public void setTesoros(int tesoros) {
        this.tesoros = tesoros;
    }

    @Override
    public String toString() {
        return "Pirata{" +
                "nombre= '" + nombre + '\'' +
                ", apodo= '" + apodo + '\'' +
                ", arma= '" + arma + '\'' +
                ", tesoros= '" + tesoros + '\'' +
                '}';
    }
}
