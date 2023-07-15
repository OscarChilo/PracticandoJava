package TemasEda.PolimorfismoPOO;

public class VehiculoCamion extends Vehiculo {
    protected int tonelage;

    public VehiculoCamion(int tonelage, String matricula, String mmarca, String modelo) {
        super(matricula, mmarca, modelo);
        this.tonelage = tonelage;
    }

    public int getTonelage() {
        return tonelage;
    }

    @Override
    public String mostrar() {
        return "la matricula es: " + matricula + "\nla marca es: " + marca
                + "\nel modelo es: " + modelo + "\nel tonelage de carro es: " + tonelage;

    }
}
