package conceptosJAVA.StaticAtributosMetodos;

public class Principal {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(45);
        // Triangulo t2 = new Triangulo(34, "trian2");

        // System.out.println("el valor del triangulo t1 es: " + t1.getArea());
        // System.out.println("el valor del triangulo t2 es: " + t2.getArea());

        Triangulo.setNombre("nuevo nombre con static");

        System.out.println("el valor del triangulo t1 es: " + t1.getArea() + " y el nombre del triangulo es "
                + Triangulo.getNombre());
    }

}
