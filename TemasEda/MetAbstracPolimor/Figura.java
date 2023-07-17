package TemasEda.MetAbstracPolimor;

public abstract class Figura {
    private String nombre;

    public abstract double area();

    public Figura(String n) {
        this.nombre = n;
    }

    public String toString() {
        return this.nombre + " tiene area de: " + area();
    }

}
