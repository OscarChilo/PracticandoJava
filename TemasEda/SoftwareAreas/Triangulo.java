package TemasEda.SoftwareAreas;

public class Triangulo extends Poligono {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        super(3);
        this.base = base;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public String toString() {
        return "Triangulo, Tiene " + numeroLados + " lados y la base : " + base + " , la altura es: " + altura;
    }

    public double area() {
        return base * altura / 2;
    }
}
