package br.sceweb.servico;

import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
/**
 * Fazer conex�o do programa com MySQL
 * @author Lab103
 * @version 1
 */
public class FabricaDeConexoes {
	public Connection getConnection() {
		String url = "jdbc:mysql://localhost/sceweb";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return (Connection) DriverManager.getConnection(url, "root", "alunofatec");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
