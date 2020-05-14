package jdbc;

public class DAOTeste {

	public static void main(String[] args) {
		DAO dao = new DAO();
		
		String sql = "insert into pessoas (nome, codigo) values (?,?)";
		System.out.println(dao.incluir(sql, "Franciele Warvick", 13));
		System.out.println(dao.incluir(sql, "Bruna Jamil", 14));
		System.out.println(dao.incluir(sql, "Ana Chinael", 15));
		
		dao.close();
	}

}
