package cinesElorrieta.logica;

import cinesElorrieta.bbdd.Cliente;
import cinesElorrieta.bbdd.Reto3Utils;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GestorDeCliente {
	public static final String URL = "jdbc:mysql://localhost:3307/reto3_grupo1";

	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";

	public boolean UsuarioIngresadoCorrectamente(/*
													 * JTextField textFieldDNIRegistro, JTextField
													 * textFieldNombreRegistro, JTextField
													 * textFieldPrimerApellidoRegistro, JTextField
													 * textFieldSegundoApellidoRegistro, JTextField
													 * textFieldContrasenyaRegistro, JTextField
													 * textFieldConfirmarContrasenyaRegistro, JTextField
													 * textFieldSexoRegistro
													 */) {

		boolean ret = false;
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
			Cliente cliente = new Cliente();

			String sql = MessageFormat.format(
					"INSERT INTO CLIENTE (DNI, NOMBRE, APELLIDO1, APELLIDO2, SEXO, CONTRASENA)"
							+ " VALUES (''{0}'', ''{1}'', ''{2}', '{3}'', ''{4}'', ''{5}'')",
					cliente.getDNI(), cliente.getNombre(), cliente.getApellido1(), cliente.getApellido2(),
					cliente.getSexo(), cliente.getContrasena());
			System.out.println(sql);
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
		return ret;
	}

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

	public boolean compararRegistroUsuario(JTextField textFieldDNIRegistro, JTextField textFieldNombreRegistro,
			JTextField textFieldPrimerApellidoRegistro, JTextField textFieldSegundoApellidoRegistro,
			JPasswordField passwordFieldContrasenyaRegistro, JTextField textFieldSexoRegistro)
			throws HeadlessException {

		String getInputDni = textFieldDNIRegistro.getText();
		String getInputNombre = textFieldNombreRegistro.getText();
		String getInputApellido = textFieldPrimerApellidoRegistro.getText();
		String getInputSegundoApellido = textFieldSegundoApellidoRegistro.getText();
		String getInputContrasenna = passwordFieldContrasenyaRegistro.getPassword().toString();
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