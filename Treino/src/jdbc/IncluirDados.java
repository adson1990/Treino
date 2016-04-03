package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IncluirDados {
	/**Nesta classe foi colocado 3 métodos de inclusão de dados diferentes
	 *para aprendizado das várias maneiras de interagir com o BD.  */

	public static void main(String[] args) throws Exception {
		
		String sql = "insert into pessoas values (?,?,?,?)";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String[] pessoas = {"Anna", "Valeria", "Aline", "Claudia", "Celly"};
		
		try (Connection con = DriverManager.getConnection(url, "adson", "lu121190")) {
				
			try (PreparedStatement stm = con.prepareStatement(sql)){
				for (int i = 0; i< pessoas.length; i++) {
					stm.setInt(1, i+9);
					stm.setString(2, pessoas[i]);
					stm.setString(3, "F");
					stm.setString(4, pessoas[i].toLowerCase()+"@teste.com.br");
					stm.addBatch();
				}stm.executeBatch();
			  }catch (SQLException e){}
			
			sql = "select * from pessoas";
			try (PreparedStatement stm2 = con.prepareStatement(sql);
			ResultSet rs = stm2.executeQuery()){
				while(rs.next()){
					String s = "Código: " + rs.getString(1) + ", "+
							"Nome: " + rs.getString(2)+", "+
							"Sexo: " + rs.getString(3)+ ", " +
							"E-mail: " + rs.getString(4);
					
					System.out.println(s);
				}
			}
		}
		
		/*
		try (Connection con = DriverManager.getConnection(url, "adson", "lu121190");
			PreparedStatement pstm = con.prepareStatement(sql)){
			for (int i = 0; i< pessoas.length; i++) {
				pstm.setInt(1, i+4);
				pstm.setString(2, pessoas[i]);
				pstm.setString(3, "F");
				pstm.setString(4, pessoas[i].toLowerCase()+"@teste.com.br");
				pstm.addBatch();
			}
			
			
			pstm.executeBatch();
		}Este bloco de comando é campaz de executar mais de 1 linha da comando por vez*/
		
		/*try (Connection con = DriverManager.getConnection(url, "adson", "lu121190");
			PreparedStatement pstm = con.prepareStatement(sql)){
				pstm.executeUpdate();
				
			 } este comando serve para executar 1 linha de comando por vez apenas.*/

	}

}
