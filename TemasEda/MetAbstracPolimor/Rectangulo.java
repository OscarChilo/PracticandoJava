package TemasEda.MetAbstracPolimor;

public class Rectangulo extends Figura {
    private double al, an;

    public Rectangulo(double al, double an) {
        super("Rectangulo");
        this.al = al;
        this.an = an;
    }

    @Override
    public double area() {
        return al * an;
    }

}
