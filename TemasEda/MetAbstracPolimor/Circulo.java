package TemasEda.MetAbstracPolimor;

public class Circulo extends Figura {
    static final double p = 3.1415;
    private double radio;

    public Circulo(double radio) {
        super("Circulo");
        this.radio = radio;

    }

    public double area() {
        return p * Math.pow(this.radio, 2);
    }

}
