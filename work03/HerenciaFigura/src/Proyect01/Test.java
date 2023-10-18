package Proyect01;

public class Test {
	
	public static void main (String[] args) {
		Circulo cir1=new Circulo(2.5);
		Rectangulo rect1=new Rectangulo(5,6);
		Cuadrado cuad1=new Cuadrado(8);
		
		System.out.println("El area del circulo es: "+cir1.area());
		System.out.println("El area del rectangulo es: "+rect1.area());
		System.out.println("El area del cuadrado es: "+cuad1.area());
	}

}
