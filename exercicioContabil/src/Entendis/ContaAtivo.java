package Entendis;


public class ContaAtivo extends Conta{

	public ContaAtivo(String nome, double saldo) {
		super(nome, saldo);
		this.setNome(nome);
		this.setSaldo(saldo);
	}

	public void setCredito (double valor) {
		this.saldo -= valor;		
	}
	
	public void setDebito (double valor) {
		if (valor <= this.saldo)
			this.saldo += valor;
		return;
	}
	
	public String toString() {
		return "Nome da conta: "
				+getNome()
				+"\nSaldo da conta: R$"
				+getSaldo();
	}
	
}
