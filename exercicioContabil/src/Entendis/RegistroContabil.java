package Entendis;

public class RegistroContabil {
	private String nomeEmpresa;
	private int CNPJ;
	private Conta[] contas = new Conta[0];
	private Lancamento livroLancamento;

	public RegistroContabil (String nomeEmpresa, int CNPJ) {
		this.setCNPJ(CNPJ);
		this.setNomeEmpresa(nomeEmpresa);
	}
	
	public int getCNPJ () {
		return this.CNPJ;
	}
	
	public String getNomeEmpresa () {
		return this.nomeEmpresa;
	} 
	
	void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	
	public void setCNPJ(int CNPJ) {
		this.CNPJ = CNPJ;
	}
	
	public void AddConta(Conta Conta) {
		Conta[] aux =  new Conta[contas.length + 1];
		int i=0;
		
		for (i=0; i < contas.length; i++) {
			aux[i] = contas[i];
		}
		
		aux[contas.length] = Conta;
		contas = aux;
	}
	
	public Conta[] getContas() {
		Conta[] aux =  new Conta[contas.length + 1];
		
		int i=0;
		
		for (i=0; i < contas.length; i++) {
			aux[i] = contas[i];
		}

		return aux;
	}
	
	public String toString () {
		return "Registros\n";
	}
	
}
