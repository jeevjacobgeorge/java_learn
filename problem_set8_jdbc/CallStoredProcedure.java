package problem_set8_jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;
	
public class CallStoredProcedure {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db","jeev","jeev@123");
				CallableStatement cstmt = conn.prepareCall("{ call getStudentName(?,?) }");
						Scanner sc = new Scanner(System.in);) {
			System.out.println("Enter id of student");
			cstmt.setInt(1, (int) sc.nextInt());
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.execute();
			String name = cstmt.getString(2);
			System.out.print(name);

;		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
