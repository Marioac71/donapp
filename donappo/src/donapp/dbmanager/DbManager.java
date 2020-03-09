package donapp.dbmanager;

import java.sql.Connection;    
import java.sql.DriverManager;
import java.sql.SQLException;



//public class DbManager {
//
//	private static Connection con;
//	private static DbManager ref=null;
//	private String url="jdbc:mysql://localhost:3306/user?serverTimezone=UTC"; 
//	
//	private DbManager (String user, String pass) {
//		try {
//			con=DriverManager.getConnection(url,user,pass);
//			System.out.println(con);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//	
//	public static DbManager getInstance() {
//		
//		if (ref==null) {
//			ref= new DbManager("root","root");
//		}
//		
//		return ref;
//	}
//	
//	public Connection getCon() {
//		return con;
//	}
//}
public class DbManager {

	protected static Connection con;

	private static DbManager istance;

	private DbManager() {
		// TODO Auto-generated constructor stub
	}

	public static DbManager getIstance(String username, String password) {
		if(istance == null) {   //<-- cosi' viene istanziata una sola volta
			//System.out.println("Sto creando l'oggetto");
			istance = new DbManager();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			String url = "jdbc:mysql://localhost:3306/donapp?serverTimezone=Europe/Rome";
			try {
				con=DriverManager.getConnection(url, username, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return istance;
	}

	public static Connection getCon() {
		return con;
	}

	public static void setCon(Connection con) {
		DbManager.con = con;
	}
	
	
}


