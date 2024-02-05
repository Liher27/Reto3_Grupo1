
package cinesElorrieta.controlador;

import java.sql.*;

public class GestorDeCine {

	public static final String URL = "jdbc:mysql://localhost:3307/reto3_grupo1";

	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";

	public static final String USER = "root";
	public static final String PASS = "";

	public static void main(String[] args) {
		Connection coon = null;
		java.sql.Statement stmt = null;
		PreparedStatement ps = null;
		try {
			Class.forName(DRIVER);
			coon = DriverManager.getConnection(URL, USER, PASS);
			stmt = coon.createStatement();
			String sql;
			sql = "SELECT * FROM cine";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int CodPelicula = rs.getInt("CodCine");
				String Nombre = rs.getString("Nombre");
				String Genero = rs.getString("Direccion");

				System.out.println("Codigo de la peli:" + CodPelicula);
				System.out.println("Codigo de la peli:" + Nombre);
				System.out.println("Codigo de la peli:" + Genero);
				System.out.println("\n");
			}
			rs.close();
			stmt.close();
			coon.close();

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
				// no hace nada
			}
			try {
				if (coon != null)
					coon.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}

	}

}
