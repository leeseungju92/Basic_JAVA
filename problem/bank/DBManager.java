package problem.bank;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {
	private static Connection conn;
	private final static String DRIVER="oracle.jdbc.driver.OracleDriver";
	private final static String URL="jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private final static String ID="java";
	private final static String PW="1234";
	
	private DBManager() {}
	
	public static Connection getConnection() {
		try {
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(URL,ID,PW);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	
	
	
}
