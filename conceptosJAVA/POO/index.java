package conceptosJAVA.POO;

public class index {
    public static void main(String[] args) {
        Guerrero g1 = new Guerrero();
        Guerrero g2 = new Guerrero();

        g1.nombre = "Goku";
        g1.fuerza = 56;
        g1.salud = 99;

        g2.nombre = "vegueta";
        g2.fuerza = 87;
        g2.salud = 85;

        System.out.println("el nombre de mi guerrero es : " + g1.nombre);
    }
}
