package DBConexion;

public class MySQLConnection implements Connection{
	
	@Override
	public void connect() {
		System.out.println("Conectando a base de datos MYSQL..");
	}
}
