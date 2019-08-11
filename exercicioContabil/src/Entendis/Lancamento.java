package Entendis;

public class Lancamento {
	private String descricao;
	private double valor;
	private Conta debito;
	private Conta credito;
	
	public Lancamento (String descricao, double valor, Conta credito, Conta debito) {
		this.setDescricao(descricao);
		this.setValor(valor);
		this.credito = credito;
		this.debito = debito;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getDescricao () {
		return this.descricao;
	}
	
	public double getValor () {
		return this.valor;
	}
	
	public String toString() {
		return "Descricao: "
				+getDescricao()
				+"\nDebitar: caixa ............. R$ "
				+getValor()
				+"\nCreditar: caixa ............ R$ "
				+getValor();
	}
	
}
