package conceptosJAVA.Sobrecarga;

public class Numero {
    private int numero1 = 0;
    private double numero2 = 0;

    public void set(int num1, double num2) {
        this.numero1 = num1;
        this.numero2 = num2;
    }

    public void set(int num) {
        numero1 = num;
    }

    public void set(double num) {
        numero2 = num;
    }

    public int getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }
}
