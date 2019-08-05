package Aplications;

import Entendis.Estoque;
import Entendis.Produto;

public class Main {

	public static void main(String[] args) {
		
		Produto produtoA = new Produto ("TV", 900);		
		Produto produtoB = new Produto ("Fryer", 400);	
		
		Estoque estoque = new Estoque();
		
		estoque.setProdutos(produtoA);		
		estoque.setProdutos(produtoB);
		
		Produto[] produtos = estoque.getProdutos();
		
		for (int i=0; i < produtos.length; i++) {
			System.out.println(produtos[i].toString());
		}

	}
	

}
