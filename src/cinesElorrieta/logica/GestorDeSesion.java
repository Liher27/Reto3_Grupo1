package cinesElorrieta.logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cinesElorrieta.bbdd.Reto3Utils;
import cinesElorrieta.bbdd.Sesion;
import cinesElorrieta.bbdd.SessionesSeleccionada;

public class GestorDeSesion {

	public void datosSesion(Sesion sesion) {
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


	
	public List<SessionesSeleccionada> sessionesSeleccionada  (int code) {
		ArrayList<SessionesSeleccionada> sesionesCompras = new ArrayList<SessionesSeleccionada>();
		try {
			Class.forName(Reto3Utils.DRIVER);

			Connection connection = DriverManager.getConnection(Reto3Utils.URL, Reto3Utils.USER, Reto3Utils.PASS);

			Statement statement = connection.createStatement();

			String sql = "SELECT pelicula.NombrePelicula, sesion.Fecha, sesion.Hora, sala.NombreSala, sesion.Precio, cine.NombreCine FROM sesion JOIN pelicula ON sesion.CodPelicula"
					+ ""+" = pelicula.CodPelicula JOIN cine ON pelicula.CodCine  "+"=  cine.CodCine JOIN sala ON sesion.CodSala = sala.CodSala WHERE sesion.CodSesion  ='" + code + "'";

			ResultSet result = statement.executeQuery(sql);
			// wdad
			while (result.next()) {
				SessionesSeleccionada sesion = new SessionesSeleccionada();
				sesion.setNombrePeli(result.getString("NOMBREPELICULA"));
				sesion.setNombreSala(result.getString("NOMBRESALA"));
				sesion.setFecha(result.getDate("FECHA"));
				sesion.setHora(result.getTime("HORA"));
				sesion.setPrecio(result.getFloat("PRECIO"));
				sesion.setNomCine(result.getString("NOMBRECINE"));
				
				sesionesCompras.add(sesion);
				
			}
			System.out.println("sessiones es:" + code);
		} catch (ClassNotFoundException e) {
			System.out.println("Ha dado fallo -> " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Malformacion sqlazo -> " + e.getMessage());
		}

		return sesionesCompras;
	
		
	}

	public List<Sesion> seleccionarPeliculaParaSesion(int code) {
		System.out.println("Code de la pelicula es: " + code);
		List<Sesion> sesiones = new ArrayList<Sesion>();
		try {
			Class.forName(Reto3Utils.DRIVER);

			Connection connection = DriverManager.getConnection(Reto3Utils.URL, Reto3Utils.USER, Reto3Utils.PASS);

			Statement statement = connection.createStatement();

			String sql = "SELECT sesion.CodSesion, sesion.CodSala, pelicula.NombrePelicula,sesion.Fecha,sesion.Hora,sesion.precio,sesion.CodPelicula FROM SESION JOIN PELICULA ON sesion.CodPelicula "
					+ "= pelicula.CodPelicula where sesion.CodPelicula ='" + code + "'";

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
	public void sessionesCompra() {
		
		
		try {
			Class.forName(Reto3Utils.DRIVER);

			Connection connection = DriverManager.getConnection(Reto3Utils.URL, Reto3Utils.USER, Reto3Utils.PASS);

			Statement statement = connection.createStatement();

			String sql = "SELECT * FROM SESION ";

			ResultSet result = statement.executeQuery(sql);
			// wdad
			while (result.next()) {
				

			}

		} catch (ClassNotFoundException e) {
			System.out.println("Ha dado fallo -> " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Malformacion sqlazo -> " + e.getMessage());
		}

	}
}