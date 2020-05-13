package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TesteConexao {
		public static void main(String[] args) throws Exception {
			final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
			final String usuario = "root";
			final String senha = "123456";
			
			Connection conexao = DriverManager
					.getConnection(url, usuario, senha);
			
			System.out.println("Conexao efetuada com sucesso");
			conexao.close();
		}
}		
