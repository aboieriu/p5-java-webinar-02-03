package com.pentalog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author aboieriu
 */
public class MainAppWithJDBCSupport {

	static final String JDBC_DRIVER = "org.postgresql.Driver";

	static final String USER = "BORA";
	static final String PASS = "BORA";

	static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/airportdb";

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;

		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Connecting to a selected database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected database successfully...");

			stmt = conn.createStatement();

			String query = "select * from test_table";

			ResultSet result = stmt.executeQuery(query);

			while (result.next()) {
				System.out.println(result.getString(1));
			}

		} catch (ClassNotFoundException | SQLException ex) {
			ex.printStackTrace();
		}finally{
			//finally block used to close resources
			try{
				if(stmt!=null) {
					conn.close();
				}
			}catch(SQLException se){
				se.printStackTrace();
			}// do nothing
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}//end finally try
		}//end try
	}
}
