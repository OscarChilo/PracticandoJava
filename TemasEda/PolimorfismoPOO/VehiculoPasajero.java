package TemasEda.PolimorfismoPOO;

public class VehiculoPasajero extends Vehiculo {
    private int pasajeros;

    public VehiculoPasajero(int pasajeros, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.pasajeros = pasajeros;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public String mostrar() {
        return "la matricula es: " + matricula + "\nla marca es: " + marca
                + "\nel modelo es: " + modelo + "\nel numero de asientos es: " + pasajeros;

    }
}
