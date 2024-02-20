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

/**
 * Clase que gestiona los alumno
 */
public class GestorDePeliculas {

	public List<Pelicula> getLasPeliculas(int CodCine) {
		List<Pelicula> pelis = new ArrayList<Pelicula>();

		try {
			Class.forName(Reto3Utils.DRIVER);

			Connection connection = DriverManager.getConnection(Reto3Utils.URL, Reto3Utils.USER, Reto3Utils.PASS);

			Statement statement = connection.createStatement();

			String sql = "SELECT * FROM PELICULA where CodCine = '" + CodCine + "'";

			ResultSet result = statement.executeQuery(sql);
			// wdad
			while (result.next()) {
				Pelicula pelicula = new Pelicula();
				pelicula.setCodPelicula(result.getInt("CODPELICULA"));
				pelicula.setNombre(result.getString("NOMBRE"));
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

/*
 * public static Vector getRows() { Connection connection = null;
 * 
 * // Vamos a lanzar una sentencia SQL contra la BBDD PreparedStatement
 * prepareStatement = null; Vector<Vector<String>> rows = null;
 * Vector<Vector<?>> columnas = null;
 * 
 * 
 * try { // El Driver que vamos a usar Class.forName(Reto3Utils.DRIVER);
 * 
 * // Abrimos la conexion con BBDD connection =
 * DriverManager.getConnection(Reto3Utils.URL, Reto3Utils.USER,
 * Reto3Utils.PASS);
 * 
 * // Vamos a lanzar la sentencia... prepareStatement =
 * connection.prepareStatement("Select * from pelicula"); ResultSet result =
 * prepareStatement.executeQuery(); if(result.wasNull())
 * JOptionPane.showMessageDialog(null, "No hay nigun resultado"); rows = new
 * Vector<Vector<String>>();
 * 
 * ResultSetMetaData rsmd = (ResultSetMetaData) result.getMetaData();
 * 
 * while(result.next()) { Vector<Vector<String>> vector = new
 * Vector<Vector<String>>(); columnas.addElement(getNextRow(result,rsmd));
 * 
 * }
 * 
 * 
 * }catch (ClassNotFoundException e){
 * System.out.println("No ha podidi cargar el drive"); e.printStackTrace(); }
 * catch (SQLException e) {
 * System.out.println("No ha podido cargar a la base de datos");
 * e.printStackTrace(); } return rows;
 */
