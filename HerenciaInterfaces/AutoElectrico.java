package HerenciaInterfaces;

public class AutoElectrico implements Recargable, Vehiculo {

    public void recargar() {
        System.out.println("recargando bateria ");
    }

    @Override
    public void acelerar() {
        // TODO Auto-generated method stub

    }
}
