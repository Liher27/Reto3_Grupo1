package cinesElorrieta.modelo;

import java.sql.Connection;
import java.sql.*;
import com.mysql.cj.xdevapi.Statement;

public class Reto3Utils {
	// La URL donde esta la Base de Datos. Se descompone en:
		// driver : bbd : // IP : Puerto / Schema
		public static final String URL = "jdbc:mysql://localhost:3306/reto3_grupo1";

		// El Driver que vamos a usar
		public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
		
		// Nombre y Pass de acceso a la Base de Datos
		public static final String USER = "root";
		public static final String PASS = "";
		
		public static void main(String[] args) {
			Connection coon = null;
			java.sql.Statement stmt = null;
			PreparedStatement ps = null;
			try {
				Class.forName(DRIVER);
				coon = DriverManager.getConnection(URL,USER,PASS);
				stmt = coon.createStatement();
				String sql;
				sql = "SELECT * FROM pelicula";
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()) {
					int CodPelicula = rs.getInt("CodPelicula");
					String Nombre= rs.getString("Nombre");
					String Genero = rs.getString("Genero");
					int Duracion = rs.getInt("Duracion");
					int precio = rs.getInt("Precio");
					
					System.out.println("Codigo de la peli:" +CodPelicula );
					System.out.println("Nombre de la peli:" +Nombre );
					System.out.println("Genero de la peli:" +Genero );
					System.out.println("Duracion de la peli:" +Duracion );
					System.out.println("Precio de la peli:" +precio );
					System.out.println("\n");
				}
				rs.close();
				stmt.close();
				coon.close();
				
			}catch(SQLException se) {
				se.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}finally{
				try {
					if(stmt!=null) stmt.close();
				}catch(SQLException se2) {
					// no hace nada
				}
				try {
					if(coon!= null)coon.close();
				}catch(SQLException se) {
					se.printStackTrace();
				}
			}
		
		
		}

}
