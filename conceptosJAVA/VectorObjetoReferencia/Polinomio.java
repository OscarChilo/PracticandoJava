package conceptosJAVA.VectorObjetoReferencia;

import java.util.Random;

public class Polinomio {
    private Vertice[] v;

    public Polinomio(int tam) {
        int aux1, aux2;

        Random scan = new Random(System.nanoTime());

        v = new Vertice[tam];

        for (int i = 0; i < tam; i++) {
            aux1 = scan.nextInt(10);
            aux2 = scan.nextInt(10);

            v[i] = new Vertice(aux1, aux2);
        }

    }

    public void mostar(int i) {
        int pos = i - 1;
        System.out.println("los valores de la posicion " + i + " es X: " + v[pos].getX() + " Y: " + v[pos].getY());
    }

}
