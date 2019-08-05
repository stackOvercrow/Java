package Entendis;

public class Estoque {
	private Produto[] produtos = new Produto[0];
	
	public void setProdutos(Produto produto) {
		Produto[] aux = new Produto[produtos.length+1];
		
		for(int i=0; i < produtos.length; i++) {
			aux[i] = produtos[i];
		}
		
		aux[produtos.length] = produto; 
		produtos = aux;
		
	}	

	public Produto[] getProdutos() {
		Produto[] aux = new Produto[produtos.length];
		
		for (int i=0; i < produtos.length; i++) {
			aux[i] = produtos[i];
		}
		
		return aux;	
		
	}
	
}
