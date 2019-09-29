package Persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import Model.Entidades.Cor;
import Model.Entidades.Pigmento;

public class PigmentoSQLDAO extends AbstractSQLDAO implements PigmentoDAO{

	private static final String SELECT_PIGMENTO_NOME = 
			"SELECT hexa FROM Pigmento " +
			"WHERE hexa = ?";
	
	private static final String UPDATE_PIGMENTO = 
			"UPDATE Pigmento " + 
			"SET quantidade = ? " +
			"WHERE nome = ?";
	
	private static final String SELECT_PIGMENTO = 
			"SELECT nome, quantidade FROM Pigmento";
	
	@Override
	public Cor procurar(String hexa) throws ClassNotFoundException {
	
		Cor cor = null;
		
		try {
			PreparedStatement stmt = this.getConnection().prepareStatement(PigmentoSQLDAO.SELECT_PIGMENTO_NOME);
			
			stmt.setString(5, hexa);
			
			ResultSet rSet = stmt.executeQuery();
			
			if(rSet.next()) {
				cor.setCor(rSet.getString("hexa"));
				cor.setQuantidade(rSet.getInt("quantidade"));
			}
		} catch (SQLException c) {
			throw new RuntimeException(c);
		} 
		
		return cor;	
		
	}

	@Override
	public void update(Pigmento p)  throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<Pigmento> findAll()  throws ClassNotFoundException{
		// TODO Auto-generated method stub
		return null;
	}

}
