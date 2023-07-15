package TemasEda.SoftwareAreas;

public class Principal {
    public static void main(String[] args) {
        Poligono misPoligonos[] = new Poligono[2];
        misPoligonos[0] = new Rectangulo(12, 45);
        misPoligonos[1] = new Triangulo(12, 6);

        for (Poligono cada : misPoligonos) {
            System.out.println(cada.toString() + "\nY su area es:" + cada.area());
        }
    }
}
