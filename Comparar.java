public class Comparar<T extends Comparable<T>> {
    private T a;
    private T b;

    public Comparar(T a, T b) {
        this.a = a;
        this.b = b;
    }

    public T max() {
        return ((this.a.compareTo(b) > 0) ? a : b);
    }

    public static void main(String[] args) {
        Comparar c = new Comparar(9, 8);
        // c.max();
        System.out.println(c.max());
    }
}
