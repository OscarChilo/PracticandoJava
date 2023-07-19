package TemasEda.InterfazComparable;

public class Alumno implements Comparable<Alumno> {
    private String nombre;
    private int edad;
    private int codigo;

    public Alumno(String nombre, int edad, int codigo) {
        this.nombre = nombre;
        this.edad = edad;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public int compareTo(Alumno a) {
        int comparacion = Integer.compare(this.edad, a.edad);
        if (comparacion == 0) {
            comparacion = this.nombre.compareTo(a.nombre);
        }
        return comparacion;
    }

}
