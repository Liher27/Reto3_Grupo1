package cinesElorrieta.logica;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import cinesElorrieta.bbdd.Cine;
import cinesElorrieta.bbdd.Pelicula;
import cinesElorrieta.bbdd.Reto3Utils;
import cinesElorrieta.bbdd.Sesion;
import cinesElorrieta.logica.Session;

public class GestorDeSesion {

	private void datosSesion(Sesion sesion) {
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
			Sesion newSesion = new Sesion();
			String sql = "insert into cine (CodCine, Nombre, Direccion) VALUES ('" + newSesion.getCodSesion() + "', '"
					+ newSesion.getCodSala() + "', '" + newSesion.getCodPelicula() + "', '" + newSesion.getFecha()
					+ "', '" + newSesion.getHora() + "', '" + newSesion.getPrecioSesion() + "')";

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

	/*
	 * public List<Sesion> getLaSesion() { List<Sesion> sesion = new
	 * ArrayList<Sesion>();
	 * 
	 * try { Class.forName(Reto3Utils.DRIVER);
	 * 
	 * Connection connection = DriverManager.getConnection(Reto3Utils.URL,
	 * Reto3Utils.USER, Reto3Utils.PASS);
	 * 
	 * Statement statement = connection.createStatement();
	 * 
	 * String sql = "SELECT * FROM SESION";
	 * 
	 * ResultSet result = statement.executeQuery(sql); // wdad while (result.next())
	 * { Sesion sesiones = new Sesion();
	 * sesiones.setCodSesion(result.getInt("CODSESION"));
	 * sesiones.setFecha(result.getDate("FECHA"));
	 * sesiones.setHora(result.getTime("HORA"));
	 * sesiones.setCodSala(result.getInt("CODSALA"));
	 * sesiones.setPrecioSesion(result.getFloat("PRECIO"));
	 * 
	 * sesion.add(sesiones);
	 * 
	 * }
	 * 
	 * } catch (ClassNotFoundException e) { System.out.println("Ha dado fallo -> " +
	 * e.getMessage()); } catch (SQLException e) {
	 * System.out.println("Malformacion sqlazo -> " + e.getMessage()); }
	 * 
	 * return sesion;
	 * 
	 * }
	 */
	Session session = new Session();
	String code = session.getCode();
	public List<Sesion> seleccionarPeliculaParaSesion(String code) {
		List<Sesion> sesiones = new ArrayList<Sesion>();
		try {
			Class.forName(Reto3Utils.DRIVER);

			Connection connection = DriverManager.getConnection(Reto3Utils.URL, Reto3Utils.USER, Reto3Utils.PASS);

			Statement statement = connection.createStatement();

			String sql = ("SELECT * FROM SESION WHERE CODPELICULA = '" + code + "'");

			ResultSet result = statement.executeQuery(sql);

			while (result.next()) {
				Sesion sesion = new Sesion();

				sesion.setCodSesion(result.getInt("CODSESION"));

				sesion.setFecha(result.getDate("FECHA"));

				sesion.setHora(result.getTime("HORA"));

				sesion.setCodSala(result.getInt("CODSALA"));

				sesion.setPrecioSesion(result.getFloat("PRECIO"));

				sesion.setCodPelicula(result.getInt("CODPELICULA"));

				sesiones.add(sesion);

			}

		} catch (ClassNotFoundException e) {
			System.out.println("Ha dado fallo -> " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Malformacion sqlazo -> " + e.getMessage());
		}
		return sesiones;
	}

	public List<Sesion> getSesionesDelaPelicula() {
		List<Sesion> sesiones = new ArrayList<Sesion>();

		try {
			Class.forName(Reto3Utils.DRIVER);

			Connection connection = DriverManager.getConnection(Reto3Utils.URL, Reto3Utils.USER, Reto3Utils.PASS);

			Statement statement = connection.createStatement();

			String sql = "SELECT * FROM SESION ";

			ResultSet result = statement.executeQuery(sql);
			// wdad
			while (result.next()) {
				Sesion sesion = new Sesion();
				sesion.setCodSesion(result.getInt("CODSESION"));
				sesion.setCodSala(result.getInt("CODSALA"));
				sesion.setCodPelicula(result.getInt("CODPELICULA"));
				sesion.setFecha(result.getDate("FECHA"));
				sesion.setHora(result.getTime("HORA"));
				sesion.setPrecioSesion(result.getFloat("PRECIO"));

				sesiones.add(sesion);

			}

		} catch (ClassNotFoundException e) {
			System.out.println("Ha dado fallo -> " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Malformacion sqlazo -> " + e.getMessage());
		}

		return sesiones;

	}
}