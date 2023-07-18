package TemasEda.AplicacionInterface;

public class Principal {
    public static void main(String[] args) {
        Rectangulo rec = new Rectangulo(2.0, 4.0);
        Triangulo tria = new Triangulo(5, 8);

        System.out.println("el area del triangulo es: " + rec.area());
        System.out.println("el area del rectangulo es: " + tria.area());
    }
}
