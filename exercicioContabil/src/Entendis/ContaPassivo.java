package Entendis;

public class ContaPassivo extends Conta{

	/* dividas e obrigações*/
	public ContaPassivo(String nome, double saldo) {
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
		return "Nome da conta: "
				+getNome()
				+"Saldo da conta: R$"
				+getSaldo();
	}

}
