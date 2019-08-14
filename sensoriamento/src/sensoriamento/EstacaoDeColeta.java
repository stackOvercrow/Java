package sensoriamento;

public class EstacaoDeColeta extends UnidadeSensora{
	private long[] latitudes;
	private long[] longitudes;
	private long[] alturas;
	private long mediaLatitude;
	
	public EstacaoDeColeta() {
		super();
	}
	
	
	
	public void registrarLatitude (long latitude) {
		long[] aux = new long[latitudes.length+1];
		
		for (int i=0; i <latitudes.length; i++) {
			aux[i] = latitudes[i];
			
		}
		
		aux[latitudes.length - 1] = latitude;
		latitudes = aux;

	}
	
	public void registrarLongitude (long longitude) {
		long[] aux = new long[longitudes.length+1];
		
		for (int i=0; i <longitudes.length; i++) {
			aux[i] = longitudes[i];
			
		}
		
		aux[longitudes.length - 1] = longitude;
		longitudes = aux;

	}
	
	public void registrarAltura (long altura) {
		long[] aux = new long[alturas.length+1];
		
		for (int i=0; i <alturas.length; i++) {
			aux[i] = alturas[i];
			
		}
		
		aux[alturas.length - 1] = altura;
		alturas = aux;

	}
	
}
