package Main;

import Builder.DatabaseConnectionBuilder;

public class User {
	public void connectDatabase(DatabaseConnectionBuilder builder) {
		builder.getConnect();
	}
}
