package cinesElorrieta.logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cinesElorrieta.bbdd.Reto3Utils;

/**
 * 
 * 
 * @author yifei liher y iñigo
 * 
 * 
 */
public class GestorDeCine {

	/**
	 * El metodo para conseguir nombres de cines
	 * 
	 * @return List
	 */
	public List<String> getNameOfCines() {
		List<String> resposne = new ArrayList<String>();

		try {
			Class.forName(Reto3Utils.DRIVER);

			Connection connection = DriverManager.getConnection(Reto3Utils.URL, Reto3Utils.USER, Reto3Utils.PASS);

			Statement statement = connection.createStatement();

			String sql = "SELECT NOMBRECINE FROM CINE";

			ResultSet result = statement.executeQuery(sql);

			while (result.next()) {
				resposne.add(result.getString("NOMBRECINE"));
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Ha dado fallo -> " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Malformacion sqlazo -> " + e.getMessage());
		}

		return resposne;

	}
}