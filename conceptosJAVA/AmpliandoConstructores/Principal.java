package conceptosJAVA.AmpliandoConstructores;

import java.util.Random;

public class Principal {

    public static void main(String[] args) {
        int aux1, aux2;
        Random scan = new Random(System.nanoTime());

        aux1 = scan.nextInt(10);
        aux2 = scan.nextInt(10);
        Vertice a = new Vertice(aux1, aux2);

        aux1 = scan.nextInt(10);
        aux2 = scan.nextInt(10);
        Vertice b = new Vertice(aux1, aux2);

        aux1 = scan.nextInt(10);
        aux2 = scan.nextInt(10);
        Vertice c = new Vertice(aux1, aux2);

        Triangulo t1 = new Triangulo(a, b, c);

        System.out.println("Cuales son los puntos de los vertices?");
        System.out.println("De A son: " + t1.getA().getX() + " " + t1.getB().getY());
        System.out.println("De B son: " + t1.getB().getX() + " " + t1.getB().getY());
        System.out.println("De C son: " + t1.getC().getX() + " " + t1.getC().getY());

        System.out.println("Cambiar los puntos del vertice A por (7,5).");

        t1.getA().setX(7);
        t1.getA().setY(5);

        System.out.println("Los nuevos puntos de los vertices son:");
        System.out.println("De A son: " + a.getX() + " " + a.getY());
        System.out.println("De B son: " + t1.getB().getX() + " " + t1.getB().getY());
        System.out.println("De C son: " + t1.getC().getX() + " " + t1.getC().getY());
    }

}
