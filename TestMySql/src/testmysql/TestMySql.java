/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elayne
 */
public class TestMySql {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             // TODO code application logic here
            
        String URL = "jdbc:mysql://ip:porta/base_de_dados?useTimezone=true&serverTimezone=UTC";
        String User = "usuario";
        String Password = "senha";
        String Table = "tabela";
        String Driver = "com.mysql.cj.jdbc.Driver";
        Connection conn = null;
        Statement stmt;
           
        try {       
            Class.forName(Driver).newInstance();
            conn = DriverManager.getConnection(URL, User, Password);
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(TestMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(conn != null){
            try {
                stmt = conn.createStatement();
                stmt.execute("insert into alunos (nome, data_nascimento, endereco, cidade, cpf)" +
                   "values ('Nino','2017-02-28','Kamassary','Camacari','00000000110')" );
                stmt.close(); 
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(TestMySql.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}