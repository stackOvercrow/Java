package Entendis;

public class Circulo extends Figura2D {

	private double raio;
	
	public double getRaio() {
		return this.raio;
	}
	
	public void setRaio (double raio) {
		this.raio = raio;
	}
	
	@Override
	public double CalcularArea() {
		return	Math.PI * (Math.pow(raio, 2));	
	}
	
	

}
