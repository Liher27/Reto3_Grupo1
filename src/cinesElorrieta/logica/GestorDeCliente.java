package cinesElorrieta.logica;

import cinesElorrieta.vista.complementos.PanelDeLogin;
import cinesElorrieta.bbdd.Reto3Utils;
import cinesElorrieta.vista.PanelPrincipal;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GestorDeCliente {
	public static final String URL = "jdbc:mysql://localhost:3307/reto3_grupo1";

	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";

	public static final String USER = "root";
	public static final String PASS = "";

	private static final String LOGIN_USER = "Usuario";
	private static final String PASS_USER = "Contrasenna";
	private static final String LOGIN_ADMIN = "Admin";
	private static final String PASS_ADMIN = "Admin";

	public static void UsuarioIngresadoCorrectamente() {
		
	}
	
	
	public static void comprobarLogin() {
		PanelDeLogin panelDePelicula = new PanelDeLogin(null);
		if (fieldsLlenos()) {
			
			if (isUser()) {
				JOptionPane.showMessageDialog(null, "Usuario y contraseña correctos", "OK!",
						JOptionPane.INFORMATION_MESSAGE);
			} else if (isAdmin()) {
				JOptionPane.showMessageDialog(null, "Que dice el admin", "OK!",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				
				JOptionPane.showMessageDialog(null, "Error, usuario o contraseña incorrecta.", "Error",
						JOptionPane.ERROR_MESSAGE);
				panelDePelicula.fieldUsuario.setText("");
				panelDePelicula.fieldContrasenna.setText("");
			}
			} else {
			JOptionPane.showMessageDialog(null, "Error, no se ha introducido usuario o contraseña.", "Error",
					JOptionPane.ERROR_MESSAGE);
			panelDePelicula.fieldUsuario.setText("");
			panelDePelicula.fieldContrasenna.setText("");
		}
	}

	/**
	 * It checks if the user is an usual one.
	 * 
	 * @return true if it is an usual user.
	 * @return false in other case.
	 */
	private static boolean isUser() {
		PanelDeLogin panelDePelicula = new PanelDeLogin(null);
		return panelDePelicula.fieldUsuario.getText().equalsIgnoreCase(LOGIN_USER)
				&& String.valueOf(panelDePelicula.fieldContrasenna.getPassword()).toString().equals(PASS_USER);
	}

	/**
	 * It checks if the user is the administrator.
	 * 
	 * @return true if it is the administrator.
	 * @return false in other case.
	 */
	private static boolean isAdmin() {
		PanelDeLogin panelDePelicula = new PanelDeLogin(null);
		return panelDePelicula.fieldUsuario.getText().equalsIgnoreCase(LOGIN_ADMIN)
				&& String.valueOf(panelDePelicula.fieldContrasenna.getPassword()).toString().equals(PASS_ADMIN);
	}

	/**
	 * It checks if the user has filled every field in the panel.
	 * 
	 * @return true if every fields are filled.
	 * @return false in other case.
	 */
	private static boolean fieldsLlenos() {
		PanelDeLogin panelDePelicula = new PanelDeLogin(null);
		boolean ret = false;
		if ((null != panelDePelicula.fieldUsuario.getText()) && (!panelDePelicula.fieldUsuario.getText().isEmpty())
				&& (null != panelDePelicula.fieldContrasenna.getPassword()) && (panelDePelicula.fieldContrasenna.getPassword().length > 0))
			ret = true;
		return ret;
	}


	public boolean compararLoginUsuario( JTextField fieldUsuario, JTextField fieldContrasenna) {
		boolean ret = false;
		
		String getInputId = fieldUsuario.getText();
		String getInputPass =fieldContrasenna.getText();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		try {
			conn =DriverManager.getConnection(Reto3Utils.URL, Reto3Utils.USER, Reto3Utils.PASS);
			String sql = "SELECT NOMBRE, CONTRASENA FROM CLIENTE WHERE NOMBRE = ? AND CONTRASENA = ?";
			 pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,getInputId);
			pstmt.setString(2, getInputPass);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				JOptionPane.showMessageDialog(null,"Has iniciado correctamente");
				ret = true;
				}else {
				JOptionPane.showMessageDialog(null,"Datos no encontrado en base de datos");
				ret = false;
			}
			
		}catch (SQLException throwables) {
			throwables.printStackTrace();
		}finally {
			Reto3Utils reto3Utils = new Reto3Utils();
			reto3Utils.release(conn, pstmt, rs);
		}
		return ret;
		
	}
}