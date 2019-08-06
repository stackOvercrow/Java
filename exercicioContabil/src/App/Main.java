package App;

import Entendis.ContaAtivo;
import Entendis.ContaPassivo;
import Entendis.ContaPatrimonio;
import Entendis.RegistroContabil;

public class Main {

	public static void main(String[] args) {
		
		ContaAtivo ativo = new ContaAtivo ("1516", 450.00);
		ContaPassivo passivo = new ContaPassivo ("1616", 100.20);
		ContaPatrimonio patrimonio = new ContaPatrimonio ("1717", 1500.00);

		ativo.setSaldo(50.20);
		passivo.setSaldo(20.00);
		patrimonio.setSaldo(10.00);
		
		ativo.setDebito(30.00);
		passivo.setDebito(20.00);
		patrimonio.setDebito(5.00);
		
		RegistroContabil registro = new RegistroContabil("Import", 78145666);
		
		registro.AddConta(ativo);
		registro.AddConta(patrimonio);
		registro.AddConta(passivo);
		
		System.out.println (registro.toString());

	}

}
