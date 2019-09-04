package Entendis;

public class Quadrado extends Figura2D {

	private double lado; 
	
	public double getLado () {
		return this.lado;
	}
	
	public void setLado (double lado) {
		this.lado = lado;
	}
	
	@Override
	public double CalcularArea() {
		return Math.pow(lado, 2);		
	}
	
}
