package DBConexion;

public class PostgreSQLConnection implements Connection {

	@Override
	public void connect() {
		System.out.println("Conectando a base de datos PostgreSQL");
	}

}
