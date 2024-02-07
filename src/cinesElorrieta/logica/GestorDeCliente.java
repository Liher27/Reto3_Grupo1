package cinesElorrieta.logica;

import cinesElorrieta.vista.complementos.PanelDeLogin;
import cinesElorrieta.bbdd.Cliente;
import cinesElorrieta.bbdd.Reto3Utils;
import cinesElorrieta.vista.PanelPrincipal;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GestorDeCliente {
	public static final String URL = "jdbc:mysql://localhost:3307/reto3_grupo1";

	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";

	public boolean UsuarioIngresadoCorrectamente(/*JTextField textFieldDNIRegistro, JTextField textFieldNombreRegistro,
			JTextField textFieldPrimerApellidoRegistro, JTextField textFieldSegundoApellidoRegistro,
			JTextField textFieldContrasenyaRegistro, JTextField textFieldConfirmarContrasenyaRegistro, JTextField textFieldSexoRegistro*/) {
		
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
			
			String sql = MessageFormat.format("INSERT INTO CLIENTE (DNI, NOMBRE, APELLIDO1, APELLIDO2, SEXO, CONTRASENA)"
					+ " VALUES (''{0}'', ''{1}'', ''{2}', '{3}'', ''{4}'', ''{5}'')",
			cliente.getDNI(),
			cliente.getNombre(),
			cliente.getApellido1(),
			cliente.getApellido2(),
			cliente.getSexo(),
			cliente.getContrasena());
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
		};}
		return ret;
		
		//GestorDeCliente gestorprueba = new GestorDeCliente();
		
		// Nuevo alumno a insertar...
//		Cliente cliente = new Cliente();
//		cliente.setDNI();
//		cliente.setNombre();
//		cliente.setApellido1();
//		cliente.setApellido2();
//		cliente.setSexo();
//		cliente.setContrasena();
//		
//		gestorprueba.insertarCliente(cliente);
//		
//		}
//		return ret;
//		
	}
	
	
//	public static void comprobarLogin() {
//		PanelDeLogin panelDePelicula = new PanelDeLogin(null);
//		if (fieldsLlenos()) {
//			
//			if (isUser()) {
//				JOptionPane.showMessageDialog(null, "Usuario y contraseña correctos", "OK!",
//						JOptionPane.INFORMATION_MESSAGE);
//			} else if (isAdmin()) {
//				JOptionPane.showMessageDialog(null, "Que dice el admin", "OK!",
//						JOptionPane.INFORMATION_MESSAGE);
//			} else {
//				
//				JOptionPane.showMessageDialog(null, "Error, usuario o contraseña incorrecta.", "Error",
//						JOptionPane.ERROR_MESSAGE);
//				panelDePelicula.fieldUsuario.setText("");
//				panelDePelicula.fieldContrasenna.setText("");
//			}
//			} else {
//			JOptionPane.showMessageDialog(null, "Error, no se ha introducido usuario o contraseña.", "Error",
//					JOptionPane.ERROR_MESSAGE);
//			panelDePelicula.fieldUsuario.setText("");
//			panelDePelicula.fieldContrasenna.setText("");
//		}
//	}
//
//	/**
//	 * It checks if the user is an usual one.
//	 * 
//	 * @return true if it is an usual user.
//	 * @return false in other case.
//	 */
//	private static boolean isUser() {
//		PanelDeLogin panelDePelicula = new PanelDeLogin(null);
//		return panelDePelicula.fieldUsuario.getText().equalsIgnoreCase(LOGIN_USER)
//				&& String.valueOf(panelDePelicula.fieldContrasenna.getPassword()).toString().equals(PASS_USER);
//	}
//
//	/**
//	 * It checks if the user is the administrator.
//	 * 
//	 * @return true if it is the administrator.
//	 * @return false in other case.
//	 */
//	private static boolean isAdmin() {
//		PanelDeLogin panelDePelicula = new PanelDeLogin(null);
//		return panelDePelicula.fieldUsuario.getText().equalsIgnoreCase(LOGIN_ADMIN)
//				&& String.valueOf(panelDePelicula.fieldContrasenna.getPassword()).toString().equals(PASS_ADMIN);
//	}
//
//	/**
//	 * It checks if the user has filled every field in the panel.
//	 * 
//	 * @return true if every fields are filled.
//	 * @return false in other case.
//	 */
//	private static boolean fieldsLlenos() {
//		PanelDeLogin panelDePelicula = new PanelDeLogin(null);
//		boolean ret = false;
//		if ((null != panelDePelicula.fieldUsuario.getText()) && (!panelDePelicula.fieldUsuario.getText().isEmpty())
//				&& (null != panelDePelicula.fieldContrasenna.getPassword()) && (panelDePelicula.fieldContrasenna.getPassword().length > 0))
//			ret = true;
//		return ret;
//	}


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