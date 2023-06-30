public class MyClass {
    public static <T> void imprimir(T[] arreglo) {
        for (T elemento : arreglo) {
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {
        String[] palabras = { "hola", "mundo", "desde", "java" };
        Integer[] numeros = { 5, 5, 8, 7 };

        imprimir(palabras);
        imprimir(numeros);
    }
}
