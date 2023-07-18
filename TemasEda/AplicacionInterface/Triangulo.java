package TemasEda.AplicacionInterface;

public class Triangulo implements Figura {
    double altura, base;

    public Triangulo(double altura, double base) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return (base * altura) / 2;
    }

}
