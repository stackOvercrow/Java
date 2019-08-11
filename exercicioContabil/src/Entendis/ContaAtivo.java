package Entendis;


public class ContaAtivo extends Conta{

	public ContaAtivo(String nome, double saldo) {
		super(nome, saldo);
	}

	public void Creditar (double valor, Conta passivo, Conta patrimonio) {
		this.saldo -= valor;
		passivo.Creditar(valor);
		patrimonio.Creditar(valor);
	}
	
	public void Debitar (double valor) {
		this.saldo += valor;	

	}
	
}
