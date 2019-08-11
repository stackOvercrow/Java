package Entendis;

public class ContaPassivo extends Conta{

	/* dividas e obrigações*/
	public ContaPassivo(String nome, double saldo) {
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
