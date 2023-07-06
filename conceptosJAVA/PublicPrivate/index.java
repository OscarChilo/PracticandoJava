package conceptosJAVA.PublicPrivate;

public class index {
    public static void main(String[] args) {
        Libro lib1 = new Libro();
        Libro lib2 = new Libro();

        lib1.titulo = "el rey pesscado";
        lib2.titulo = "colamajkbsdavh";

        System.out.println(lib1.titulo);
        System.out.println(lib2.titulo);
    }
}
