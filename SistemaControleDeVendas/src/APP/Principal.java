package APP;

import Model.Entidades.CMYK;
import Model.Entidades.Cor;
import Model.Entidades.RGB;

public class Principal {


	public static void main(String[] args) {
	
		Cor cor1 = new RGB();
		Cor cor2 = new CMYK();
		RGB cor3 = new RGB();
		CMYK cor4 = new CMYK();
		RGB cor5 = new RGB();
		
		cor1.setCor("FF0000"); //vermelho
		cor3.setCor("B46C72"); //antigo
		
		cor5.setCor("FF0000");
		
		cor2.setCor("B46C72"); //antigo
		cor4.setCor("FF0000"); //vermelho
		
		System.out.println("\nEspeciaria Antiga em RGB" +cor2.toString());
		System.out.println();
		System.out.println("Especiaria Antiga em CMYK\n" +cor3.toString());
		System.out.println();
		
		System.out.println("Distancia euclidiana RGB/RBG: "+cor1.distanciaEuclidiana(cor3));
		System.out.println("Distancia euclidiana CMYK/RGB: "+cor1.distanciaEuclidiana(cor5));
		System.out.println("Distancia euclidiana CMYK/RGB: "+cor4.distanciaEuclidiana(cor3));
	}
	

}