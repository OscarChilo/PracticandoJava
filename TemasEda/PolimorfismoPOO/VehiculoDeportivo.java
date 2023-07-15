package TemasEda.PolimorfismoPOO;

public class VehiculoDeportivo extends Vehiculo {
    private int cilindrada;

    public VehiculoDeportivo(int cilindrada, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public String mostrar() {
        return "la matricula es: " + matricula + "\nla marca es: " + marca
                + "\nel modelo es: " + modelo + "\nel cilindro es: " + cilindrada;

    }
}
