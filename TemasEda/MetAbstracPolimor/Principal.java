package TemasEda.MetAbstracPolimor;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Figura> misfiguras = new ArrayList<>();

        Rectangulo myRectangulo = new Rectangulo(15, 20);
        Circulo myCirculo = new Circulo(10);
        Cuadrado myCuadrado = new Cuadrado(15);
        Circulo myCirculo2 = new Circulo(17);

        misfiguras.add(myCirculo2);
        misfiguras.add(myCirculo);
        misfiguras.add(myCuadrado);
        misfiguras.add(myRectangulo);

        for (Figura figura : misfiguras) {
            System.out.println(figura);
        }
    }
}
