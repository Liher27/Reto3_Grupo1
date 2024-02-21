package cinesElorrieta.logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cinesElorrieta.bbdd.Pelicula;
import cinesElorrieta.bbdd.Reto3Utils;


public class GestorDePeliculas {

	public List<Pelicula> getLasPeliculas(int CodCine) {
		List<Pelicula> pelis = new ArrayList<Pelicula>();

		try {
			Class.forName(Reto3Utils.DRIVER);

			Connection connection = DriverManager.getConnection(Reto3Utils.URL, Reto3Utils.USER, Reto3Utils.PASS);

			Statement statement = connection.createStatement();

			String sql = "SELECT * FROM PELICULA where CodCine = '" + CodCine + "'";

			ResultSet result = statement.executeQuery(sql);
		
			while (result.next()) {
				Pelicula pelicula = new Pelicula();
				pelicula.setCodPelicula(result.getInt("CODPELICULA"));
				pelicula.setNombre(result.getString("NOMBREPELICULA"));
				pelicula.setGenero(result.getString("GENERO"));
				pelicula.setDuracion(result.getInt("DURACION"));
				pelicula.setPrecio(result.getFloat("PRECIO"));

				pelis.add(pelicula);

			}

		} catch (ClassNotFoundException e) {
			System.out.println("Ha dado fallo -> " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Malformacion sqlazo -> " + e.getMessage());
		}

		return pelis;

	}

}

