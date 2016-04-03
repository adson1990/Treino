package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContaCrud {
	
	public void criarConta(Connection c, Conta conta) throws Exception{
		String sql = "insert into conta values (?,?,?)";//comando sql de inclusão de mais de 1 item
		
		try(PreparedStatement stm = c.prepareStatement(sql)){//statement
		
		stm.setInt(1, conta.numero);
		stm.setString(2, conta.cliente);
		stm.setDouble(3, conta.saldo);
		
		stm.executeUpdate();
		}
		
	}

	public List<Conta> lerConta(Connection c) throws Exception{
		List<Conta> list = new ArrayList<>();//retorno do método
		String sql = "select * from conta";//query de visualização
		
		try(PreparedStatement stm = c.prepareStatement(sql);//statement
				ResultSet rs = stm.executeQuery()){//resultset
			while(rs.next()){
				list.add(new Conta(rs.getInt(1), rs.getString(2), rs.getDouble(3)));//add ao array de conta
			}
		}
		return list;
	}
	
	public void alterarConta(Connection c, Conta conta) throws Exception{
		String sql = "update conta set cliente =? , saldo =? where numero=?";//comando sql de inclusão de mais de 1 item
		
		try(PreparedStatement stm = c.prepareStatement(sql)){//statement
		
		stm.setString(1, conta.cliente);
		stm.setDouble(2, conta.saldo);
		stm.setInt(3, conta.numero);
		
		stm.executeUpdate();
		}	
	}
	
	public void excluirConta(Connection c, Conta conta) throws Exception{
		String sql = "delete conta where numero=?";//comando sql de inclusão de mais de 1 item
		
		try(PreparedStatement stm = c.prepareStatement(sql)){//statement
		
		stm.setInt(1, conta.numero);
		
		stm.executeUpdate();
		}	
	}

	public void transfere(Connection c, Conta origem, Conta destino, double valor) throws Exception{
		
		if(origem.saldo >= valor){
			try{
			c.setAutoCommit(false);
			
			//SAQUE
			origem.saldo -= valor;
			alterarConta(c, origem);
			
			//DEPOSITO
			destino.saldo += valor;
			alterarConta(c, destino);
			
			c.commit();
			}catch(Exception e){
				c.rollback();
				System.err.println("OPERAÇÃO CANCELADA.");
			}
			
		}
	}
	
	public static void main(String[] args) throws Exception {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try(Connection con = DriverManager.getConnection(url, "adson", "lu121190")){
			ContaCrud crud = new ContaCrud();
			/*
			conta1.saldo = 9000.99;
			crud.alterarConta(con, conta1);
			
			crud.excluirConta(con, conta3);
			
			Conta conta1 = new Conta(1, "adson", 1_000.10);
			Conta conta2 = new Conta(2, "miguel", 2_000.20);
			Conta conta3 = new Conta(3, "caua", 3_000.30);
			
			crud.criarConta(con, conta1);
			crud.criarConta(con, conta2);
			crud.criarConta(con, conta3	);
			*/
			
			
			List<Conta> lista = crud.lerConta(con);
			for (Conta conta : lista) {
				System.out.println(conta);
			}
			Conta origem = lista.get(0);
			Conta destino = lista.get(1);
			
			crud.transfere(con, origem, destino, 500);
			
			lista = crud.lerConta(con);
			for (Conta conta : lista) {
				System.out.println(conta);
			}
		}//try
		
	}
}