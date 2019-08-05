package Entendis;

public class circulo extends figuras {
	private double raio;
	
	public circulo (double area,cor numCor, double raio) {
		super(area, numCor);
		this.setRaio(raio);
	}

	public void setRaio (double raio) {
		this.raio = raio;
	}
	
	public double getRaio () {
		return this.raio;
	}
	
	public double area() {
		return Math.pow(getRaio(), 2) * 3.14;
	}
	
	
	public String toString() {
		return "Area: "
				+area();
	}
}
