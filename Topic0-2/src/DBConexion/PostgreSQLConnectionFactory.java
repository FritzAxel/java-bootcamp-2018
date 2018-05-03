package DBConexion;

public class PostgreSQLConnectionFactory implements ConnectionFactory{

	@Override
	public Connection getConnection() {
		return new PostgreSQLConnection();
	}
	
}
