package JDBC;

public class Ex1_JDBC {
/*
	
	JDBC connection steps code:

		JDBC connection steps:

		package org.cts.toyota.login;

		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.PreparedStatement;
		import java.sql.ResultSet;
		import java.sql.SQLException;

		public class Details {
		  public static void main(String[] args) {
		    Connection con = null;
		    try {
		      // load the driver
		      Class.forName("com.mysql.jdbc.Driver");
		      // connec to db
		      con = DriverManager.getConnection("jdbc:mysql://127.0.0.1localhost:portnum/schemaName", "username",
		          "password");
		      // write a sql query
		      String sql = "Select * from employees";
		      PreparedStatement ps = con.prepareStatement(sql);
		      // execute query
		      ResultSet rs = ps.executeQuery();
		      // iterate
		      while (rs.next()) {
		        int empId = rs.getInt("id");
		        String empName = rs.getString("name");
		      }

		    } catch (Throwable e) {
		      e.printStackTrace();
		    } finally {
		      try {
		        // close db connection
		        con.close();
		      } catch (SQLException e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		      }
		    }

		  }

		}*/
}
