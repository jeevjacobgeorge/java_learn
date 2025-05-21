package problem_set8_jdbc;
//Write a program to perform insert/up- date/delete operations using transac- tions and rollback on failure.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionDemo {
	public static void main(String[] args) {
		Connection conn = null;
		try  {
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db","jeev","jeev@123");
			conn.setAutoCommit(false);
			
			//Insert
			PreparedStatement istmt = conn.prepareStatement("INSERT INTO student VALUES(4,'FARDEEN');");
			istmt.executeUpdate();
			
			//Update
			PreparedStatement ustmt = conn.prepareStatement("UPDATE student SET name='george' WHERE id=3;");
			ustmt.executeUpdate();
			
			// Simulate failure by uncommenting below line 
//			int i = 3/0; 
			
			//Delete
			PreparedStatement dstmt = conn.prepareStatement("DELETE FROM student WHERE id=4;");
			dstmt.executeUpdate();
			
			conn.commit();
            System.out.println(" Transaction successful!");

		} catch (Exception e) {
			try {
				if (conn!=null) {
					conn.rollback();
                    System.out.println("❌ Transaction failed. Rolled back.");				
				}
				
			} 	catch (SQLException  e1) {
                	System.out.println(" Rollback failed: " + e1.getMessage());
				}
			
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
