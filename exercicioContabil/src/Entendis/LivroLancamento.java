package Entendis;

public class LivroLancamento {
	private Lancamento[] lancamentos;

	public LivroLancamento () {
		this.lancamentos = new Lancamento[0];
	}
	
	public void registar (Lancamento lancamento) {
		Lancamento[] aux = new Lancamento [lancamentos.length + 1];
		
		for (int i=0; i<lancamentos.length; i++) {
			aux[i] = lancamentos[i];
		}
		
		aux[lancamentos.length - 1] = lancamento;
		lancamentos = aux;
	}
	
}