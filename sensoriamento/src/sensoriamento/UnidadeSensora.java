package sensoriamento;

public abstract class UnidadeSensora {
	private double latitude;
	private double longitude; 
	private double altura;
	private String ID;
	
	public UnidadeSensora() {
		super();
	}
	
	public double getLatitude () {
		return this.latitude;
	}
	
	public double getLongitude() {
		return this.longitude;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public String getId() {
		return this.ID;
	}
	
}
