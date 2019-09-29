package Persistencia;

import java.util.Collection;

import Model.Entidades.Cor;
import Model.Entidades.Pigmento;

public interface PigmentoDAO {
	
	public Cor procurar(String hexa) throws ClassNotFoundException; // procura pelo pigmento 
	public void update(Pigmento p) throws ClassNotFoundException; // atualizar o estoque
	public Collection<Pigmento> findAll() throws ClassNotFoundException;

}
