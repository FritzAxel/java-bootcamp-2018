package Factory;

import DBConexion.Connection;

public interface ConnectionFactory {
	
	Connection getConnection();
	
}
