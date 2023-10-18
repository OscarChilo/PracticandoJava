package Proyect01;

public class Circulo implements Figura {
	double radio;
	
	public Circulo(double radio) {
		this.radio=radio;
	}
	
	public double area() {
		return Math.PI*Math.pow(radio, 2);
	}

}
