package Entendis;

public class Balanco {
	private Conta[] contas = new Conta[0];
	
	public Conta findContaByNome (String nome) {
		for(Conta conta: this.contas)
			if(conta.getNome().equals(nome))
				return conta;
		return null;
	}
	
	public void ajustar (String nomeCredito, String nomeDebito, double valor) {
		this.findContaByNome(nomeCredito).Creditar(valor);
		this.findContaByNome(nomeDebito).Debitar(valor);
	}
	
}
