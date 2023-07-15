package TemasEda.SoftwareAreas;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static ArrayList<Poligono> poligonos = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        llenarPoligonos();
        mostrarRespuestas();
    }

    public static void llenarPoligonos() {
        int opcion;
        char respuesta;
        do {
            do {
                System.out.println("Elige polinomio que desea");
                System.out.println("1. Triangulo \n2. Rectangulo\nIngrese tu opcion:");
                opcion = scan.nextInt();
            } while (opcion > 2 || opcion < 1);

            switch (opcion) {
                case 1:
                    llenarTriangulo();
                    break;
                case 2:
                    llenarRectangulo();
                    break;
            }
            System.out.println("\nDesea seguir ingresando poligonos:s/n.");
            respuesta = scan.next().charAt(0);
        } while (respuesta == 's' || respuesta == 'S');

    }

    public static void llenarTriangulo() {
        double l1, l2, l3;
        System.out.println("Ingrese los lados:");
        l1 = scan.nextDouble();
        l2 = scan.nextDouble();
        l3 = scan.nextDouble();

        Triangulo triangulo = new Triangulo(l1, l2, l3);
        poligonos.add(triangulo);

    }

    public static void llenarRectangulo() {
        double l1, l2;
        System.out.println("Ingrese los lados");
        l1 = scan.nextDouble();
        l2 = scan.nextDouble();
        Rectangulo rectangulo = new Rectangulo(l1, l2);
        poligonos.add(rectangulo);
    }

    public static void mostrarRespuestas() {
        for (Poligono ele : poligonos) {
            System.out.println(ele.toString());
            System.out.println(ele.area());
        }
    }
}
