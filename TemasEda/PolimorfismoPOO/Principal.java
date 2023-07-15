package TemasEda.PolimorfismoPOO;

public class Principal {

    public static void main(String[] args) {

        Vehiculo misVehiculos[] = new Vehiculo[4];
        misVehiculos[0] = new Vehiculo("4646as", "honda", "camioneta");
        misVehiculos[1] = new VehiculoCamion(5, "HYS2323", "hyndai", "Camion hd78");
        misVehiculos[2] = new VehiculoDeportivo(4, "wqd323", "bmw", "aspire");
        misVehiculos[3] = new VehiculoPasajero(24, "ajs23424", "volvo", "marcopolo");
        // vehiculo.mostrar();
        // camion.mostrar();
        for (Vehiculo elemento : misVehiculos) {
            System.out.println(elemento.mostrar());
            System.out.println("");
        }
    }
}
