package problem_set8_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

//Set up HikariCP in a 
//plain Java app, and test fetching connections from the pool. 
public class HikariCPDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:mysql://localhost:3306/java_db");
		config.setUsername("root");
		config.setMaximumPoolSize(10);
		config.setConnectionTimeout(30000);

		try (HikariDataSource datasource = new HikariDataSource(config);
				Connection conn = datasource.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM student;")) {
			while (rs.next()) {
				System.out.println(rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
