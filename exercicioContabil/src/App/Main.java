package App;

import Entendis.ContaAtivo;
import Entendis.ContaPassivo;
import Entendis.ContaPatrimonio;
import Entendis.Lancamento;
import Entendis.RegistroContabil;

public class Main {

	public static void main(String[] args) {
		
		ContaAtivo ativo = new ContaAtivo ("1516", 0);
		ContaPassivo passivo = new ContaPassivo ("1516", 0);
		ContaPatrimonio patrimonio = new ContaPatrimonio ("1717", 0);

		ativo.Debitar(10);
		passivo.Creditar(400);
		patrimonio.Creditar(100);
		ativo.Creditar(2, passivo, patrimonio);
	
		
		//System.out.println("Saldo na conta Ativa: R$ " +ativo.getSaldo());
		//System.out.println ("Saldo na conta Patrimonio: R$ " +patrimonio.getSaldo());
		//System.out.println ("Saldo na conta Passiva: R$ " +passivo.getSaldo());
	} 

}
