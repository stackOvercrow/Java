package Entendis;

public class Cubo extends Figura3D {

	private double aresta;

	@Override
	public double CalcularArea() {
		return 6 * (Math.pow(aresta, 2));		
	}

	@Override
	public double CalcularVolume() {
		return Math.pow(aresta, 3);		
	}
	
	public double getAresta() {
		return this.aresta;
	}
	
	public void setAresta(double aresta) {
		this.aresta = aresta;
	}

}
