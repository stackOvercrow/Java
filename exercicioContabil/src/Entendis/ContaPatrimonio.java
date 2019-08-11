package Entendis;

public class ContaPatrimonio extends Conta{

	public ContaPatrimonio(String nome, double saldo) {
		super(nome, saldo);
	}

	public void Debitar (double valor) {
		if (valor <= this.saldo)
			this.saldo -= valor;
		return;
	}
	
	public void Creditar (double valor) {
		this.saldo += valor;
	}
	
}
