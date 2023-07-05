package HerenciaInterfaces;

public interface VehiculoRecargable extends Recargable, Vehiculo {

    public void recargar(){
        System.out.println("recargando bateria");
    }

}
