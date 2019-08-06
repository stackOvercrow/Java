package Entendis;

public class ContaPatrimonio extends Conta{

	public ContaPatrimonio(String nome, double saldo) {
		super(nome, saldo);
		this.setNome(nome);
		this.setSaldo(saldo);
	}

	public void setDebito (double valor) {
		if (valor <= this.saldo)
			this.saldo += valor;
		return;
	}
	
	public String toString() {
		return "\nNome da conta: "
				+getNome()
				+"\nSaldo da conta: R$"
				+getSaldo();
	}
}
