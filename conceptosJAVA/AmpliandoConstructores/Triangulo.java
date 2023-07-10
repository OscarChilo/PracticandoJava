package conceptosJAVA.AmpliandoConstructores;

/**
 * Triangulo
 */
public class Triangulo {

    private Vertice a, b, c;

    public Triangulo(Vertice a, Vertice b, Vertice c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Vertice getA() {
        return a;
    }

    public void setA(Vertice a) {
        this.a = a;
    }

    public Vertice getB() {
        return b;
    }

    public void setB(Vertice b) {
        this.b = b;
    }

    public Vertice getC() {
        return c;
    }

    public void setC(Vertice c) {
        this.c = c;
    }

}