package ConexionBD;

public class Main {

	public static void main(String[] args) {

		dataBaseConnection db = dataBaseConnection.getInstance();
		db.getConnection();
		
	}

}
