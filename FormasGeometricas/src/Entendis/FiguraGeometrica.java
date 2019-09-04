package Entendis;

public abstract class FiguraGeometrica {
	private String nome;
	private String cor;
	
	public String getNome () {
		return this.nome;
	}
	
	public String getCor () {
		return this.cor;
	}
		
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCor(String cor) {
		 this.cor = cor;
	}
}
