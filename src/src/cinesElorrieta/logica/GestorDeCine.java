package cinesElorrieta.logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import cinesElorrieta.bbdd. Cine;
import cinesElorrieta.bbdd.Reto3Utils;

public class GestorDeCine {

	
	public void insertarCine(Cine cine) {
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
		Cine newcine = new Cine();
		
		String sql = MessageFormat.format("INSERT INTO CINE(NOMBRE, CODCINE, DIRECCION) VALUES (''{0}'', ''{1}'', ''{2}'')",
		cine.getNomCine(),
		cine.getCodCine(),
		cine.getDirCine());
		System.out.println(sql);
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
	
	GestorDeCine gestorprueba = new GestorDeCine();
	
	// Nuevo alumno a insertar...
	Cine newcine = new Cine();
	newcine.setCodCine(4);
	newcine.setNomCine("Random");
	newcine.setDirCine("Random");
	
	gestorprueba.insertarCine(newcine);
	}
	
	}
	public void getCineById(int id ) {
	
	
	}
	
	
	
	public List<String> getNameOfCines() {
	List<String> resposne = new ArrayList<String>();
	
	try {
	Class.forName(Reto3Utils.DRIVER);
	
	Connection connection = DriverManager.getConnection(Reto3Utils.URL, Reto3Utils.USER, Reto3Utils.PASS);
	
	Statement statement = connection.createStatement();
	
	String sql = "SELECT NOMBRE FROM CINE";
	
	ResultSet result = statement.executeQuery(sql);
	
	while(result.next()) {
	resposne.add(result.getString("NOMBRE"));
	}
	} catch (ClassNotFoundException e) {
	System.out.println("Ha dado fallo -> " + e.getMessage());
	} catch (SQLException e) {
	System.out.println("Malformacion sqlazo -> " + e.getMessage());
	}
	
	return resposne;
	
	}
}