package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) throws Exception {
		final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		final String usuario = "root";
		final String senha = "123456";

		Connection conexao = DriverManager
				.getConnection(url, usuario, senha);
		
		Statement stmt = conexao.createStatement();
		stmt.execute("create database if not exists curso_java");
		
		System.out.println("banco criado com sucesso");

		conexao.close();
	}

}
