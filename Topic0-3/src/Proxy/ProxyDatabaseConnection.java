package Proxy;

public class ProxyDatabaseConnection implements DatabaseConnection{

	private RealDatabaseConnection dbC;

	
	public ProxyDatabaseConnection(RealDatabaseConnection databaseConnection) {
		this.dbC = databaseConnection;
	}
	
	/**
	 * This method simulate the connection to the database.
	 */
	@Override
	public void connect() {
		//get connect to a proxy database.		
	}
	
}
