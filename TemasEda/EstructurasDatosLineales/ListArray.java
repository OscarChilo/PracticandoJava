package TemasEda.EstructurasDatosLineales;

import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class ListArray<T> {
    private T[] list;
    private int index;

    public ListArray(int n) {
        this.index = 0;
        this.list = (T[]) new Object[n];
    }

    public void add(T i) {
        list[index] = i;
        index++;
    }

    public T get(int i) {
        return list[i];
    }

    public int size() {
        return index;
    }

    public boolean isEmpty() {
        return index == 0;
    }

    @Override
    public Iterator<T> iter() {
        return new Iterator<T>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < index && list[currentIndex] != null;
            }

            @Override
            public T next() {
                return list[currentIndex];
            }
        };
    }
}
