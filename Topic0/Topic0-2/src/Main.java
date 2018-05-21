import Factory.*;

public class Main {

	private enum DatabaseType {MYSQL, POSTGRE}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DatabaseType databaseType = DatabaseType.MYSQL;
		ConnectionFactory connectionFactory = getConnectionFactory(databaseType);
	}
	
	private static ConnectionFactory getConnectionFactory(DatabaseType databaseType) {
		
		switch(databaseType) {
		case MYSQL:
			return new MySQLConnectionFactory();
		default:
			return new PostgreSQLConnectionFactory();
		}
		
	}

}
