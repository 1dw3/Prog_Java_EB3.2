package eb3;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class probaDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection konexioa =
			DriverManager.getConnection("jdbc:mysql://localhost/bdalumnos", "root", "");
			// ondo burutu baldin bada
			System.out.println("Konexio egokia.");
			// konexioa itxi
			konexioa.close();
			}
			catch (SQLException | ClassNotFoundException sqle){
			// ez baldin bada konexioa era egokian egin
			sqle.printStackTrace();
			System.out.println("Konexio errorea");
			}

	}

}
