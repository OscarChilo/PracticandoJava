package conceptosJAVA.CopaLibertadoresGenericidad;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Random;

public class Sorteador<T> {
    private ArrayList<T> elementos;
    private Random rdn;

    public Sorteador() {
        this.elementos = new ArrayList<>();
        this.rdn = new Random();
    }

    // agregar un elemento
    public void add(T elemento) {
        elementos.add(elemento);
    }

    // obtener un elemento de forma aleatoria

    public T get() {
        checkEmptyness();
        return elementos.get(rdn());
    }

    public T remove() {
        checkEmptyness();
        return elementos.remove(rdn());
    }

    // retornar si esta vacia o no
    public boolean isEmpty() {
        return false;
    }

    private int rdn() {
        return rdn.nextInt(elementos.size());
    }

    private void checkEmptyness() {
        if (isEmpty()) {
            throw new NoSuchElementException("no hay elementos en el sorteador");

        }
    }
}
