package Factory;

import DBConexion.Connection;
import DBConexion.MySQLConnection;

public class MySQLConnectionFactory implements ConnectionFactory{

	public Connection getConnection() {
		return new MySQLConnection();
	}
}
