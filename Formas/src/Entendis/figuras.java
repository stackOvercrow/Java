package Entendis;

public class figuras {
	private double area;
	private cor numCor;
	
	public figuras (double area, cor numCor) {
		this.setArea(area);
		this.setNumCor(numCor);
	}
	
	public void setArea (double area) {
		this.area = area;
	}
	
	public double getArea () {
		return area;
	}
	
	public void setNumCor (cor numCor) {
		this.numCor=numCor;
	}

	public void setCor(cor numCor) {
		this.numCor = numCor;
	}
	
	public cor getCor() {
		return numCor;
	}
	
}
