package DBConexion;

public class MySQLConnectionFactory implements ConnectionFactory{

	public Connection getConnection() {
		return new MySQLConnection();
	}
}
