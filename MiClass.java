public class MiClass<T> {
    private T[] elementos;

    public MiClass(T[] elementos) {
        this.elementos = elementos;
    }

    public T getElementos(int index) {
        return this.elementos[index];
    }

    public static void main(String[] args) {
        Integer[] numeros = { 2, 5, 8, 3, 5 };
        String[] palabras = { "no", "quiero", "nada" };

        MiClass<Integer> listNumeros = new MiClass<>(numeros);
        MiClass<String> listPalabras = new MiClass<>(palabras);

        System.out.println(listNumeros.getElementos(1));
        System.out.println(listPalabras.getElementos(2));

    }
}
