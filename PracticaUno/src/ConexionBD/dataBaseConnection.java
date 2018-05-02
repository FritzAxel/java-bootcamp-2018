package ConexionBD;

public class dataBaseConnection {

	private static dataBaseConnection singleton = null;
	
	public static dataBaseConnection getInstance() {
		if(singleton == null)
			singleton = new dataBaseConnection();
		return singleton;
	}
	

	public void getConnection() {
		
	};
}
