package Entendis;

public class Conta {
	private String nome;
	public double saldo;

	public Conta (String nome, double saldo) {
		this.setNome(nome);
		this.setSaldo(saldo);
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public void setSaldo (double saldo) {
		this.saldo = saldo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getSaldo () {
		return this.saldo;
	}
	
	public void Credito (double valor) {
		this.saldo += valor;
	}
	
	public void Debito (double valor) {
		this.saldo -= valor;
	}
	
	public String toString() {
		return "Nome da conta: "
				+getNome()
				+"Saldo da conta: R$"
				+getSaldo();
	}
}
