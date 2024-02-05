package cinesElorrieta.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cinesElorrieta.modelo.Cine;
import cinesElorrieta.modelo.Pelicula;
import cinesElorrieta.modelo.Reto3Utils;
import cinesElorrietaTest.modeloTest.PeliculaTest;

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
	public void getCineById() {
		
	}
	



	
}
