package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AcessoBanco {
	/**Esta classe tem por objetivo 
	 *executar um comando de SELECT no banco
	 */

	public static void main(String[] args) throws Exception {
		
		String sql = "select * from pessoas";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try(Connection con = DriverManager.getConnection(url, "adson", "lu121190");
			PreparedStatement stm = con.prepareStatement(sql);
			ResultSet rs = stm.executeQuery()){//query = consulta/ update = deleta, insere e atualiza
			
			while(rs.next()){
				String s = rs.getString("codigo") + "; " +
						   rs.getString("nome") + "; " +
						   rs.getString("sexo") + "; " +
						   rs.getString("email");
				System.out.println(s);
				//a coluna pode ser recuperada pelo nome ou pela posição dela a partir no número 1
			}
			
		}

	}

}
