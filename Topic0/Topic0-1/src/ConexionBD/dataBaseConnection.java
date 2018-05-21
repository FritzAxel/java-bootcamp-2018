package ConexionBD;

public class dataBaseConnection {

	
	
	
	private static dataBaseConnection instance = null;
	
	public static dataBaseConnection getInstance() {
		if(instance == null)
			instance = new dataBaseConnection();
		return instance;
	}
	

	public void getConnection() {
		
	};
}
