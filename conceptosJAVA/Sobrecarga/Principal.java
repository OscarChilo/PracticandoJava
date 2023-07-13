package conceptosJAVA.Sobrecarga;

public class Principal {
    public static void main(String[] args) {
        Numero num = new Numero();
        num.set(10);
        num.set(2, 4.2);
        num.set(2.5);
        System.out.println("el valor de los atributos es: num1=" + num.getNumero1() + " numero2=" + num.getNumero2());

    }
}
