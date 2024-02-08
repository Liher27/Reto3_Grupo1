package cinesElorrieta.logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import cinesElorrieta.bbdd.Pelicula;
import cinesElorrieta.bbdd.Reto3Utils;

/**
 * Clase que gestiona los alumno
 */
public class GestorDePeliculas {
	
	public void datosCine(Pelicula peli) {
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
			Pelicula newPeli = new Pelicula();
			String sql = "insert into cine (CodPelicula, Nombre, Genero,Duracion,Precio) VALUES ('" +
					newPeli.getCodPelicula() + "', '" + 
					newPeli.getNombre() + "', '" + 
					newPeli.getGenero() + "', '" +
					newPeli.getDuracion() + "', '" + 
					newPeli.getPrecio() + "')";
			
			// La ejecutamos...
			statement.executeUpdate(sql);
			
		} catch (SQLException sqle) {  
			System.out.println("Error con la BBDD - " + sqle.getMessage());
		} catch(Exception e){ 
			System.out.println("Error generico - " + e.getMessage());
		} finally {
			// Cerramos al reves de como las abrimos
			try {
				if (statement != null) 
					statement.close(); 
			} catch(Exception e){ 
				// No hace falta				
			};
			try {
				if (connection != null) 
					connection.close(); 
			} catch(Exception e){ 
				// No hace falta
			};					
		}
		
	}
	public List<String> getLasPeliculas(DefaultTableModel modelo, JTable tablaDePeliculas ) {
		List<String> pelis = new ArrayList<String>();
		modelo =(DefaultTableModel) tablaDePeliculas.getModel();
		modelo.setRowCount(0);
		try {
			Class.forName(Reto3Utils.DRIVER);
			
			Connection connection = DriverManager.getConnection(Reto3Utils.URL, Reto3Utils.USER, Reto3Utils.PASS);
			
			Statement statement = connection.createStatement();
			
			String sql = "SELECT * FROM PELICULA";
			
			ResultSet result = statement.executeQuery(sql);
			
			while(result.next()) {
				modelo.addRow(new Object[ ] {
						result.getInt("ID"),
						result.getString("NOMBRE"),
						result.getString("APELLIDO"),
			            result.getInt("EDAD")
				
			});
		}
		} catch (ClassNotFoundException e) {
			System.out.println("Ha dado fallo -> " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Malformacion sqlazo -> " + e.getMessage());
		}
		
		return pelis;
		
	}
}
	
	/*public static  Vector getRows() {
		Connection connection = null;
		
		// Vamos a lanzar una sentencia SQL contra la BBDD
		PreparedStatement prepareStatement = null;
		Vector<Vector<String>> rows = null;
		Vector<Vector<?>> columnas = null;
		
		
		try {
			// El Driver que vamos a usar
			Class.forName(Reto3Utils.DRIVER);
			
			// Abrimos la conexion con BBDD
			connection = DriverManager.getConnection(Reto3Utils.URL, Reto3Utils.USER, Reto3Utils.PASS);
			
			// Vamos a lanzar la sentencia...
			prepareStatement = connection.prepareStatement("Select * from pelicula");
			ResultSet result = prepareStatement.executeQuery();
			if(result.wasNull())
			JOptionPane.showMessageDialog(null, "No hay nigun resultado");
			rows = new Vector<Vector<String>>();
			
			ResultSetMetaData rsmd = (ResultSetMetaData) result.getMetaData();
			
			while(result.next()) {
				Vector<Vector<String>> vector = new Vector<Vector<String>>();
				columnas.addElement(getNextRow(result,rsmd));
				
				}
			
			
			}catch (ClassNotFoundException e){
				System.out.println("No ha podidi cargar el drive");
				e.printStackTrace();
			} catch (SQLException e) {
				System.out.println("No ha podido cargar a la base de datos");
				e.printStackTrace();
			}
		return rows;*/
	