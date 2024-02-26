package cinesElorrieta.logica;

import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cinesElorrieta.bbdd.ConvertirTiempo;
import cinesElorrieta.bbdd.Entrada;
import cinesElorrieta.bbdd.Reto3Utils;

/**
 * 	
 *
 * @author yifei liher y iñigo
 * 
 * Clase para insertar las entradas a la tabla de base de datos
 */
public class GestorDeInformacionDeEntrada {
	
	
	/**
	 * Funcion principal para insertar la entrada
	 * 
	 * @param entradas
	 * el array donde se guarda las entradas
	 * @return las entradas
	 */
	public boolean insertarEntrada(ArrayList<Entrada>entradas) {
		ConvertirTiempo convertirTiempo = new ConvertirTiempo();
		Connection conn = null;
		PreparedStatement pstmt = null;
		for(int i = 0; i < entradas.size(); i++) {
			Timestamp fechaCompra = convertirTiempo.convertirASqlDate(entradas.get(i).getFechaCompra());
			String precio = String.valueOf(entradas.get(i).getSesion().getPrecioSesion());
			String codCine = Integer.toString(entradas.get(i).getSesion().getSala().getCine().getCodCine());
			String dni = entradas.get(i).getCliente().getDNI();
			String codPelicula = Integer.toString(entradas.get(i).getSesion().getSala().getCine().getCodCine());
			String codSala = Integer.toString(entradas.get(i).getSesion().getSala().getCodSala());
			String codSession = Integer.toString(entradas.get(i).getSesion().getCodSesion());
			ResultSet rs = null;
			
		try {
			conn = DriverManager.getConnection(Reto3Utils.URL, Reto3Utils.USER, Reto3Utils.PASS);
			String sql = "INSERT INTO ENTRADA(FecCompra,PRECIOENTRADA,CODCINE,DNI,CODPELICULA,CODSALA,CODSESION) VALUES(?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setTimestamp(1, fechaCompra);
			pstmt.setString(2, precio);
			pstmt.setString(3, codCine);
			pstmt.setString(4, dni);
			pstmt.setString(5, codPelicula);
			pstmt.setString(6, codSala);
			pstmt.setString(7,codSession);
			int j = pstmt.executeUpdate();
			if ( j> 0) {
				return true;
			}

		} catch (SQLException throwables) {
			throwables.printStackTrace();
		} finally {
			Reto3Utils reto3Utils = new Reto3Utils();
			reto3Utils.release(conn, pstmt, rs);
		}
		System.out.println(fechaCompra);
		System.out.println(precio);
		System.out.println(codCine);
		System.out.println(dni);
		System.out.println(codPelicula);
		System.out.println(codSala);
		System.out.println(codSession);
		
	}
		return false;
	}
	
	

	}
	    
	
	

