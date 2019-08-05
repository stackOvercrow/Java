package Entendis;

public class retangulo extends figuras {
	private double largura;
	private double altura;
	
	public retangulo (double area, cor numCor, double largura, double altura) {
		super(area,numCor);
		this.setAltura(altura);
		this.setLargura(largura);
	}
	
	public void setAltura (double altura) {
		this.altura = altura;
	}
	
	public void setLargura (double largura) {
		this.largura = largura;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public double getLargura() {
		return this.largura;
	}
	
	public double area (double altura, double largura) {
		return this.altura * this.largura;
 	}
	
	public String toString() {
		return "Area: "
				+area(largura, altura)
				+"\nCor: "
				+getCor();
	}
}
