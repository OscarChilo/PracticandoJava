package conceptosJAVA.Constructor;

public class Principal {
    public static void main(String[] args) {
        Coche toyota = new Coche("jeep", 23, 67);

        /*
         * toyota.setAceleracion(0);
         * toyota.setVelocidad(0);
         * toyota.setNombre("prius");
         */

        System.out.println("el nombre de mi coche es " + toyota.getNombre() + " y tiene una velocidad de "
                + toyota.getVelocidad());
    }
}
