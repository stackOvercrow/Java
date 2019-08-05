package App;

import Entendis.circulo;
import Entendis.cor;
import Entendis.retangulo;

public class Aplications {

	public static void main(String[] args) {
		retangulo imagem = new retangulo (1, cor.BLUE , 4.5, 2);
		System.out.println(imagem.toString());	
		
		circulo A = new circulo (0,cor.RED,4);
		System.out.println(A.toString());
	}

}