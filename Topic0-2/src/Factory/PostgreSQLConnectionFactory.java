package Factory;

import DBConexion.Connection;
import DBConexion.PostgreSQLConnection;

public class PostgreSQLConnectionFactory implements ConnectionFactory{

	@Override
	public Connection getConnection() {
		return new PostgreSQLConnection();
	}
	
}
