package com.oracletest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

public class DbConnection {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		PrintStream fw = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{  
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/oracletest?characterEncoding=latin1&useConfigs=maxPerformance","root","root");
				fw=new PrintStream(new File("C:/my/testout.txt"));
				stmt=con.createStatement();  
				rs=stmt.executeQuery("select countrycode,a.employeename,b.employeename as managername from employee a left join employee b on a.mgrid=b.employeeid inner join address on a.addressid=Address.addressid order by countrycode desc;");  
				HashSet<String> countrycode = new HashSet<>();
				while(rs.next()) {
					if(countrycode.contains(rs.getString(1)))
					fw.println("  "+"  "+rs.getString(2)+"  "+rs.getString(3));
					else
					fw.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
					countrycode.add(rs.getString(1));
				}
			}
			catch (ClassNotFoundException e) {
				System.out.println(e);
			}
			catch (FileNotFoundException e) {
			System.out.println(e);
			}
			catch (Exception e) {
			System.out.println(e);
			}
			finally{
				if (fw != null) fw.close();
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
				if (con != null) con.close();
			}
		}
		
	}
