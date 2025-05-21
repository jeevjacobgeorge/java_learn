package problem_set8_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
//. Create a program that uses PreparedStatement to perform a login check
//(username & password).
public class LoginCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username:");
		String username = sc.nextLine();
		System.out.println("Enter password");
		String password = sc.nextLine();
		sc.close();
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db","jeev","jeev@123");
			//Table initialisation 
			Statement stmt = conn.createStatement()) {
			stmt.execute("CREATE TABLE IF NOT EXISTS users(id INT PRIMARY KEY,username VARCHAR(100),password VARCHAR(255));");
			stmt.executeUpdate("INSERT IGNORE INTO users VALUES(1,'jeev','jeev@123');");
			//Login 
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM users WHERE username=? AND password=?;");
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				System.out.println("Login was successfull");
			}
			else {
				System.out.println("Wrong Credentials");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
