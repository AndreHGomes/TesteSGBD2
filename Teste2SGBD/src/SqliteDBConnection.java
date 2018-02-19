import java.sql.*;

public class SqliteDBConnection {
	Connection conn = null;
	
	public static Connection conectar() {
		String urldb = "jdbc:sqlite:C://sqlite/SQLiteStudio/dbtests/test2.db";
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection(urldb);
			return conn;
		}catch(Exception e) {
				System.out.println(e.getMessage());
				return null;
			}
	}
		
}
