package conceptosJAVA.AtributosFinal;

public class Principal {
    public static void main(String[] args) {
        Libro lib = new Libro();
        Libro lib2 = new Libro();

        System.out.println("El valor de ISBN es: " + lib.getISBN());
        // lib.setISBN(50);
        System.out.println("El valor de ISBN es: " + lib2.getISBN());
    }
}
