package Main;

import Builder.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatabaseConnectionBuilder builder;
		if(isSQL())
			builder = new MySQLConnectionBuilder();
		else
			builder = new PostgreSQLConnectionBuilder();
		User user = new User();
		user.connectDatabase(builder);
	}
	
	public static boolean isSQL() {
		return false;
	}

}
