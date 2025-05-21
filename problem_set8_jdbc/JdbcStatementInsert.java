package problem_set8_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//Write a JDBC program to:
// Connect to a MySQL database.
// Insert 5 records into a student
//table using Statement. 

public class JdbcStatementInsert {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/java_db";
		String username = "jeev";
		String password = "jeev@123";
		
		try {
			Connection conn = DriverManager.getConnection(url,username,password);
			Statement stmt = conn.createStatement();
			
			stmt.execute("CREATE TABLE IF NOT EXISTS student(id INT PRIMARY KEY, name VARCHAR(255));");
			stmt.executeUpdate("INSERT IGNORE INTO student VALUES(1,'JEEV');");
			stmt.executeUpdate("INSERT IGNORE INTO student VALUES(2,'JACOB');");
			stmt.executeUpdate("INSERT IGNORE INTO student VALUES(3,'GEORGE');");
            System.out.println("Inserted 3 records successfully.");
//            ResultSet rs = stmt.executeQuery("SELECT * FROM student;");
//            System.out.println("Id\tName");
//            while(rs.next()) {
//            	System.out.println(rs.getInt(1)+"\t"+rs.getString(2));            	
//            }
			//close 
            stmt.close();
            conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
