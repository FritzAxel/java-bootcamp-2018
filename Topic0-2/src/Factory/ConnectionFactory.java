package Factory;

/**
 * @author Axel Fritz
 */

import DBConexion.Connection;

public interface ConnectionFactory {
	
	Connection getConnection();
	
}
