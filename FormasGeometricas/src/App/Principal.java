package App;

import Entendis.Cilindro;
import Entendis.Circulo;
import Entendis.Cubo;
import Entendis.Figura2D;
import Entendis.Figura3D;
import Entendis.FiguraGeometrica;
import Entendis.Quadrado;
import Entendis.Triangulo;

public class Principal {

	public static void main(String[] args) {
		
		Cilindro c1 = new Cilindro();
		c1.setAltura(3);
		c1.setRaio(2);
		c1.setNome("Cilindro");
		
		Circulo c2 = new Circulo();
		c2.setRaio(2);
		c2.setNome("Circulo");
		
		Cubo c3 = new Cubo ();
		c3.setAresta(3);
		c3.setNome("Cubo");		
		
		Quadrado c4 = new Quadrado();
		c4.setLado(2);
		c4.setNome("Quadrado");
		
		Triangulo c5 = new Triangulo();
		c5.setaltura(2);
		c5.setBase(3);
		c5.setNome("Triangulo");
		
		FiguraGeometrica[] figuras = new FiguraGeometrica[5];
		
		figuras[0] = c1;
		figuras[1] = c2;
		figuras[2] = c3;
		figuras[3] = c4;
		figuras[4] = c5;
		
		for (int i=0; i<figuras.length; i++) {
			System.out.println("------------------------");
			System.out.println(figuras[i].getNome());
			
			if (figuras[i] instanceof Figura2D) {
				Figura2D f2d = (Figura2D) figuras[i];
				System.out.println(f2d.CalcularArea());
			}
			

			if (figuras[i] instanceof Figura3D) {
				Figura3D f3d = (Figura3D) figuras[i];
				System.out.println(f3d.CalcularArea());
				System.out.println(f3d.CalcularVolume());
			}
			
			System.out.println();
		}

	}

}
