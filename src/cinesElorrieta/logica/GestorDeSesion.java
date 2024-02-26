package cinesElorrieta.logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cinesElorrieta.bbdd.Cine;
import cinesElorrieta.bbdd.Pelicula;
import cinesElorrieta.bbdd.Reto3Utils;
import cinesElorrieta.bbdd.Sala;
import cinesElorrieta.bbdd.Sesion;

/**
 * La clase que gestiona las sesiones
 */
public class GestorDeSesion {
	/**
	 * La clase que recive el codigo de session y inprime las sesiones que
	 * corresponda en la tabla de resumen
	 * 
	 * @param code el codigo de sesion seleccionada
	 * @return code
	 */
	public Sesion getSesionSeleccionada(int code) {

		Sesion ret = null;
		try {
			Class.forName(Reto3Utils.DRIVER);

			Connection connection = DriverManager.getConnection(Reto3Utils.URL, Reto3Utils.USER, Reto3Utils.PASS);

			Statement statement = connection.createStatement();

			String sql = "SELECT pelicula.NombrePelicula, sesion.Fecha, sesion.Hora, sala.NombreSala, sesion.Precio, cine.NombreCine FROM sesion JOIN pelicula ON sesion.CodPelicula"
					+ "" + " = pelicula.CodPelicula JOIN cine ON pelicula.CodCine  "
					+ "=  cine.CodCine JOIN sala ON sesion.CodSala = sala.CodSala WHERE sesion.CodSesion  ='" + code
					+ "'";

			ResultSet result = statement.executeQuery(sql);
			// wdad
			if (result.next()) {
				ret = new Sesion();
				Pelicula pelicula = new Pelicula();
				pelicula.setNombre(result.getString("NOMBREPELICULA"));
				ret.setPelicula(pelicula);
				Sala sala = new Sala();
				sala.setNomSala(result.getString("NOMBRESALA"));
				ret.setFecha(result.getDate("FECHA"));
				ret.setHora(result.getTime("HORA"));

				ret.setPrecioSesion(result.getFloat("PRECIO"));
				Cine cine = new Cine();
				cine.setNomCine(result.getString("NOMBRECINE"));
				sala.setCine(cine);
				ret.setSala(sala);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Ha dado fallo -> " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Malformacion sqlazo -> " + e.getMessage());
		}

		return ret;

	}

	/**
	 * El metodo para las devueler las sesiones de la pelicula
	 * 
	 * @param code recive el codigo de pelicula
	 * @return las sesiones que corresponde
	 */
	public List<Sesion> seleccionarPeliculaParaSesion(int code) {
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
				Sala sala = new Sala();
				sala.setCodSala(result.getInt("CODSALA"));
				sesion.setSala(sala);
				Pelicula pelicula = new Pelicula();
				pelicula.setCodPelicula(result.getInt("CODPELICULA"));
				sesion.setPelicula(pelicula);

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