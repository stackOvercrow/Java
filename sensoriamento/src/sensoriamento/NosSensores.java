package sensoriamento;

public class NosSensores extends UnidadeSensora {
	Sensor[] sensores;
	
	public NosSensores() {
		super();
	}
	
	public void addSensor (Sensor sensor) {
		Sensor[] aux = new Sensor[sensores.length + 1];
		
		for (int i=0; i < sensores.length; i++)
			aux[i] = sensores[i];
		
		aux[sensores.length - 1]=sensor;
		sensores = aux;
		
	}
	
}
