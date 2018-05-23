package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLAccess {

	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
	
	/**
	 * This method gets the connection to the database and executes the query.
	 * @throws Exception
	 */
	public void readDataBase() throws Exception{
		
		try {
			//Setup the connection with the DB.
			connection = DriverManager.getConnection("jdbc:mysql://localhost/high_school?" + "user=root&password=axel26");
			
			statement = connection.createStatement();
			
			resultSet = statement
					.executeQuery("SELECT t.last_name, t.first_name, d.name AS nameDay, cxd.start, cxd.finish, c.name AS courseName FROM course_x_day cxd INNER JOIN course c ON cxd.course_id = c.id INNER JOIN `day` d ON cxd.day_id = d.id INNER JOIN teacher t ON c.teacher_id = t.id WHERE t.id = 5");
			writeResulSet(resultSet);
			
		}catch (Exception e) {
			throw e;
		}finally {
			close();
		}
		
	}
	
	/**
	 * This method shows the result of the query.
	 * @param resultSet
	 * @throws SQLException
	 */
	public void writeResulSet(ResultSet resultSet) throws SQLException {
		
		while(resultSet.next()) {
			
			String teacherLastName = resultSet.getString("t.last_name");
			String teacherFirstName = resultSet.getString("t.first_name");
			String day = resultSet.getString("nameDay");
			String start = resultSet.getString("cxd.start");
			String finish = resultSet.getString("cxd.finish");
			String courseName = resultSet.getString("courseName");
			
			System.out.println("Teacher: "+teacherLastName + " " + teacherFirstName);
			System.out.println("Schedule: ");
			System.out.println(day + " " + start + "-" + finish + ": <" + courseName +">");
		}
	}
	
	/**
	 * This method close the ResultSet.
	 */
	 private void close() {
	        try {
	            if (resultSet != null) {
	                resultSet.close();
	            }

	            if (statement != null) {
	                statement.close();
	            }

	            if (connection != null) {
	                connection.close();
	            }
	        } catch (Exception e) {

	        }
	    }
}
