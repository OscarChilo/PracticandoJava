package conceptosJAVA.AtributosFinal;

public class Libro {

    // son dos formas de un atributo final: usando un constructor sin incializar e
    // inicializando con constructor vacio
    private static final int ISBN = 0;

    public Libro() {
        // this.ISBN = ISBN;
    }

    public int getISBN() {
        return ISBN;
    }

    /*
     * public void setISBN(int ISBN) {
     * this.ISBN = ISBN;
     * }
     */

}
