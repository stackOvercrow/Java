package Entendis;

public abstract class Conta {
	private String nome;
	public double saldo;

	public Conta (String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}

	public String getNome() {
		return this.nome;
	}
	
	public double getSaldo () {
		return this.saldo;
	}
	
	public abstract Creditar (double valor);
	
	public abstract Debitar (double valor);
		
	public String toString() {
		return "Nome da conta: "
				+getNome()
				+"Saldo da conta: R$"
				+getSaldo();
	}
}
