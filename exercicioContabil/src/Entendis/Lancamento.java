package Entendis;
import Entendis.ContaAtivo;
import Entendis.ContaPassivo;
import Entendis.ContaPatrimonio;

public class Lancamento {
	private String descricao;
	private double valor;
	private Conta debito;
	private Conta credito;
	
	public Lancamento (String descricao, double valor) {
		this.setDescricao(descricao);
		this.setValor(valor);
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
	

}
