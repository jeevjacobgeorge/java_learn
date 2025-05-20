package problem_set8_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//Modify the JdbcStatementInsert to use PreparedStatement. 
public class JdbcPreparedStatementInsert {

	public static void main(String[] args) {
		Connection conn;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db","jeev","jeev@123");
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM student WHERE name = ?;");
			pstmt.setString(1, "JEEV");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
            	System.out.println(rs.getInt(1)+"\t"+rs.getString(2));            	
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
