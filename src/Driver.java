import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Driver {

	public static void main(String[] args) {
		try {
			Connection  myConn = DriverManager.getConnection("jdbc:mysql://195.37.176.178:11336/dbwebanw_sose15_01", "dbweb_user_01", "ssVDg8E0ub");
			Statement myStm = myConn.createStatement(); 
			ResultSet myRs = myStm.executeQuery ("SELECT * FROM dbwebanw_sose15_01.kunde");
			while (myRs.next()) { 
				System.out.println (myRs.getString("Vorname"));
			}
			
		}
		catch (Exception exc) {
			
			exc.printStackTrace();
		}	
	}

}
