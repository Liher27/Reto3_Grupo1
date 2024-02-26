package cinesElorrieta.logica;

import cinesElorrieta.bbdd.Cliente;

import cinesElorrieta.bbdd.Reto3Utils;

import java.awt.HeadlessException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import javax.swing.JTextField;

/**
 * 
 * 
 * @author yifei liher y iñigo
 * 
 *         Clase para el usuario puede logearse y registrarse
 * 
 * 
 */
public class GestorDeCliente {

	/**
	 * 
	 * El metodo para inciar el usaurio
	 * 
	 * @param fieldUsuario     obtener el nombre de usuario
	 * 
	 * @param fieldContrasenna obtener la contraseña deñ usuario
	 * 
	 * @return el nombre y usuario
	 */
	public Cliente obtenerUsuario(JTextField fieldUsuario, JTextField fieldContrasenna) {

		Cliente ret = null;
		String getInputId = fieldUsuario.getText();
		String getInputPass = fieldContrasenna.getText();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet result = null;

		try {
			Class.forName(Reto3Utils.DRIVER);

			conn = DriverManager.getConnection(Reto3Utils.URL, Reto3Utils.USER, Reto3Utils.PASS);
			String sql = "SELECT * FROM CLIENTE WHERE NOMBRE = ? AND CONTRASENA = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, getInputId);
			pstmt.setString(2, getInputPass);
			result = pstmt.executeQuery();
			// wdad
			if (result.next()) {
				JOptionPane.showMessageDialog(null, "Has iniciado correctamente");
				ret = new Cliente();
				ret.setDNI(result.getString("DNI"));
				ret.setNombre(result.getString("NOMBRE"));
				ret.setApellido1(result.getString("APELLIDOS"));
				ret.setContrasena(result.getString("PELICULASVISTAS"));
				ret.setSexo(result.getString("SEXO"));
				ret.setContrasena(result.getString("CONTRASENA"));

			} else {
				JOptionPane.showMessageDialog(null, "Usuario no encontrado");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Ha dado fallo -> " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Malformacion sqlazo -> " + e.getMessage());
		}

		return ret;
	}

	/**
	 * 
	 * @param fieldUsuario     insertar el nombre usuario a base de datos
	 * 
	 * @param fieldContrasenna insertar el nombre contraseña a base de datos
	 * 
	 * @return nombre contraseña
	 */
	public boolean compararLoginUsuario(JTextField fieldUsuario, JTextField fieldContrasenna) {
		boolean ret = false;

		String getInputId = fieldUsuario.getText();
		String getInputPass = fieldContrasenna.getText();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(Reto3Utils.URL, Reto3Utils.USER, Reto3Utils.PASS);
			String sql = "SELECT NOMBRE, CONTRASENA FROM CLIENTE WHERE NOMBRE = ? AND CONTRASENA = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, getInputId);
			pstmt.setString(2, getInputPass);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				JOptionPane.showMessageDialog(null, "Has iniciado correctamente");
				ret = true;
			} else {
				JOptionPane.showMessageDialog(null, "Datos no encontrado en base de datos");
				ret = false;
			}

		} catch (SQLException throwables) {
			throwables.printStackTrace();
		} finally {
			Reto3Utils reto3Utils = new Reto3Utils();
			reto3Utils.release(conn, pstmt, rs);
		}
		return ret;

	}

	/**
	 * 
	 * 
	 * 
	 * @param textFieldDNIRegistro             Devuelve DNI
	 * @param textFieldNombreRegistro          Devuelve Nombre
	 * @param textFieldPrimerApellidoRegistro  Devuelve Apellido
	 * @param textFieldSegundoApellidoRegistro Devuelve peliculasVistas
	 * @param passwordFieldContrasenyaRegistro Devuelve contraseña
	 * @param textFieldSexoRegistro            Devuelve Sexo
	 * @return DNI Nombre Apellido contraseña peliculasVistas Sexo
	 * @throws HeadlessException El metodo para registro de usuario
	 */

	public boolean compararRegistroUsuario(JTextField textFieldDNIRegistro, JTextField textFieldNombreRegistro,
			JTextField textFieldPrimerApellidoRegistro, JTextField textFieldSegundoApellidoRegistro,
			JTextField passwordFieldContrasenyaRegistro, JTextField textFieldSexoRegistro) throws HeadlessException {

		String getInputDni = textFieldDNIRegistro.getText();
		String getInputNombre = textFieldNombreRegistro.getText();
		String getInputApellido = textFieldPrimerApellidoRegistro.getText();
		String getInputSegundoApellido = textFieldSegundoApellidoRegistro.getText();
		String getInputContrasenna = passwordFieldContrasenyaRegistro.getText().toString();
		String getInputSexo = textFieldSexoRegistro.getText();

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(Reto3Utils.URL, Reto3Utils.USER, Reto3Utils.PASS);
			String sql = "INSERT INTO CLIENTE(DNI,NOMBRE,APELLIDOS,PELICULASVISTAS,SEXO,CONTRASENA) VALUES(?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, getInputDni);
			pstmt.setString(2, getInputNombre);
			pstmt.setString(3, getInputApellido);
			pstmt.setString(4, getInputSegundoApellido);
			pstmt.setString(5, getInputSexo);
			pstmt.setString(6, getInputContrasenna);
			int i = pstmt.executeUpdate();
			if (i > 0) {
				return true;
			}

		} catch (SQLException throwables) {
			throwables.printStackTrace();
		} finally {
			Reto3Utils reto3Utils = new Reto3Utils();
			reto3Utils.release(conn, pstmt, rs);
		}
		return false;

	}
}