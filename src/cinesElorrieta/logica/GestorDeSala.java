package cinesElorrieta.logica;

import java.sql.*;

import cinesElorrieta.bbdd.Cine;
import cinesElorrieta.bbdd.Reto3Utils;
import cinesElorrieta.bbdd.Sala;

public class GestorDeSala {

	private void datosSala(Sala sala) {
		Connection connection = null;

		// Vamos a lanzar una sentencia SQL contra la BBDD
		Statement statement = null;

		try {
			// El Driver que vamos a usar
			Class.forName(Reto3Utils.DRIVER);

			// Abrimos la conexion con BBDD
			connection = DriverManager.getConnection(Reto3Utils.URL, Reto3Utils.USER, Reto3Utils.PASS);

			// Vamos a lanzar la sentencia...
			statement = connection.createStatement();

			// Montamos la SQL
			Sala newsala = new Sala();
			String sql = "insert into sala (CodSala, Nombre, CodCine) VALUES ('" + newsala.getCodSala() + "', '"
					+ newsala.getNomSala() + "', '" + newsala.getCodCine() + "')";

			// La ejecutamos...
			statement.executeUpdate(sql);

		} catch (SQLException sqle) {
			System.out.println("Error con la BBDD - " + sqle.getMessage());
		} catch (Exception e) {
			System.out.println("Error generico - " + e.getMessage());
		} finally {
			// Cerramos al reves de como las abrimos
			try {
				if (statement != null)
					statement.close();
			} catch (Exception e) {
				// No hace falta
			}
			;
			try {
				if (connection != null)
					connection.close();
			} catch (Exception e) {
				// No hace falta
			}
			;
		}

	}
}
