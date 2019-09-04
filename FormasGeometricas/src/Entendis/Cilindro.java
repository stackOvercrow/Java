package Entendis;

public class Cilindro extends Figura3D {

	private double raio;
	private double altura;
	
	@Override
	public double CalcularArea() {
		return (2* (Math.PI)*raio) * (altura+raio);		
	}

	@Override
	public double CalcularVolume() {
		return (Math.PI* (Math.pow(raio, 2)) * altura);		
	}
	
	public double getRaio() {
		return this.raio;
	}
	
	public void setRaio (double raio) {
		this.raio = raio;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}

}
