package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ModelController {
	
	private String user = "root";
	private String pass = "root";
	private final String connectionURL = "jdbc:mysql://localhost:3306/my1stjob?serverTimezone=GMT%2B3&useAffectedRows=true&useUnicode=true&serverEncoding=utf8&autoReconnect=true";
	private Connection connection;
	
	public ModelController() {
		try {
			this.connection = DriverManager.getConnection(connectionURL, user, pass);
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
