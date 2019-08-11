package Entendis;

public class RegistroContabil {
	private String nomeEmpresa;
	private int CNPJ;
	private Balanco balanco;
	private Lancamento livro;

	public RegistroContabil (String nomeEmpresa, int CNPJ, String descricao, double valor, String nomeCredito, String nomeDebito) {
		this.setCNPJ(CNPJ);
		this.setNomeEmpresa(nomeEmpresa);
		Conta credito = balanco.findContaByNome (nomeCredito);
		Conta debito = balanco.findContaByNome (nomeDebito);
		Lancamento livro = new Lancamento (descricao, valor, credito, debito); 
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

}
