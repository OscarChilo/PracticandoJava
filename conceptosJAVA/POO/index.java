package conceptosJAVA.POO;

public class index {
    public static void main(String[] args) {
        Guerrero g1 = new Guerrero(); // estamos haciendo una instacia la clase Guerrero
        // Guerrero g2 = new Guerrero();

        g1.setNombre("Goku");
        g1.setFuerza(45);
        g1.setSalud(90);

        System.out.println("el nombre de mi guerrero es:" + g1.getNombre() + " la fuerza que tiene  es "
                + g1.getFuerza() + " y cantida de vida que tiene es " + g1.getSaludg());
    }
}
