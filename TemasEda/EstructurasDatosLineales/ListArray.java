package TemasEda.EstructurasDatosLineales;

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

    public T[] get() {
        return this.list;
    }
}
