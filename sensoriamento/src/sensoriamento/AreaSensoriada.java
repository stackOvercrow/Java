package sensoriamento;

public class AreaSensoriada {
	UnidadeSensora[] unidades;
	
	public AreaSensoriada () {
		this.unidades = new UnidadeSensora[0];
	}
	
	public void addUnidadeSensora (UnidadeSensora unidade) {
		UnidadeSensora[] aux = new UnidadeSensora[unidades.length+1];
		
		for (int i=0; i<unidades.length; i++) 
			aux[i] = unidades[i];
		
		aux[unidades.length - 1] = unidade;
		unidades = aux;
	}
	
		
	
}
