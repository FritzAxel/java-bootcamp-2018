package Proxy;

public class ProxyDatabaseConnection implements DatabaseConnection{

	private RealDatabaseConnection dbC;

	
	public ProxyDatabaseConnection(RealDatabaseConnection databaseConnection) {
		this.dbC = databaseConnection;
	}
	
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
	}
	
}
