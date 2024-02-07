package cinesElorrieta.logica;

import cinesElorrieta.vista.complementos.PanelDeLogin;
import cinesElorrieta.vista.PanelPrincipal;
import javax.swing.JOptionPane;

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
				PanelDeLogin.fieldUsuario.setText("");
				PanelDeLogin.fieldContrasenna.setText("");
			}
			} else {
			JOptionPane.showMessageDialog(null, "Error, no se ha introducido usuario o contraseña.", "Error",
					JOptionPane.ERROR_MESSAGE);
			PanelDeLogin.fieldUsuario.setText("");
			PanelDeLogin.fieldContrasenna.setText("");
		}
	}

	/**
	 * It checks if the user is an usual one.
	 * 
	 * @return true if it is an usual user.
	 * @return false in other case.
	 */
	private static boolean isUser() {
		return PanelDeLogin.fieldUsuario.getText().equalsIgnoreCase(LOGIN_USER)
				&& String.valueOf(PanelDeLogin.fieldContrasenna.getPassword()).toString().equals(PASS_USER);
	}

	/**
	 * It checks if the user is the administrator.
	 * 
	 * @return true if it is the administrator.
	 * @return false in other case.
	 */
	private static boolean isAdmin() {
		return PanelDeLogin.fieldUsuario.getText().equalsIgnoreCase(LOGIN_ADMIN)
				&& String.valueOf(PanelDeLogin.fieldContrasenna.getPassword()).toString().equals(PASS_ADMIN);
	}

	/**
	 * It checks if the user has filled every field in the panel.
	 * 
	 * @return true if every fields are filled.
	 * @return false in other case.
	 */
	private static boolean fieldsLlenos() {
		boolean ret = false;
		if ((null != PanelDeLogin.fieldUsuario.getText()) && (!PanelDeLogin.fieldUsuario.getText().isEmpty())
				&& (null != PanelDeLogin.fieldContrasenna.getPassword()) && (PanelDeLogin.fieldContrasenna.getPassword().length > 0))
			ret = true;
		return ret;
	}
}
