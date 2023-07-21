package conceptosJAVA.CopaLibertadoresGenericidad;

public class Principal {
    public static void main(String[] args) {
        Sorteador<String> sorteo = new Sorteador<>();

        sorteo.add("uno");
        sorteo.add("dos");
        sorteo.add("tres");

        while (!sorteo.isEmpty()) {
            System.out.println("El siguiente sorteado es: " + sorteo.remove());
        }
    }

    public static void retardo(int s) {
        try {
            Thread.sleep(s * 1000);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("error de concurrencia: ");
        }
    }
}
