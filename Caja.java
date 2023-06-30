public class Caja<T> {
    private T dato;

    public Caja() {
        super();
    }

    public T getDato() {
        return this.dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public static <T> void poCaja(T elemento, Caja<T> caja) {
        caja.setDato(elemento);
    }

    public static void main(String[] args) {
        Caja<Integer> micaja = new Caja<Integer>();
        Caja.poCaja(new Integer(5), micaja);
        Caja.poCaja(new Integer(7), micaja);

        System.out.println(micaja.getDato());
    }
}
