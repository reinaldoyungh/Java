package entities;

public class Retangulo {
	
	public double a;
	public double b;
	
	public double area() {
		double p = a * b;
		return p;
	}
	
	public double perimetro() {
		double p = 2*(a+b);
		return p;
	}
	
	public double diagonal() {
		double p = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
		return p;
	}
	
}
