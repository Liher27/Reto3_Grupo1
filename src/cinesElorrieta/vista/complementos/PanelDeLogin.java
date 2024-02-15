package cinesElorrieta.vista.complementos;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import cinesElorrieta.logica.GestorDeCliente;
import cinesElorrieta.logica.Session;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Color;

public class PanelDeLogin {

	public JTextField fieldUsuario = null;
	public JPasswordField fieldContrasenna = null;
	
	private JPanel panelDeLogin;

	/**
	 * Create the frame.
	 * @param paneles 
	 */
	public PanelDeLogin(ArrayList<JPanel> paneles) {
		Session session = Session.getInstance ();
		
		
		panelDeLogin = new JPanel();
		panelDeLogin.setBackground(new Color(42, 26, 29));
		panelDeLogin.setBounds(0, 0, 984, 611);
		panelDeLogin.setLayout(null);

		JLabel tituloLogIn = new JLabel("Iniciar sesión");
		tituloLogIn.setHorizontalAlignment(SwingConstants.CENTER);
		tituloLogIn.setForeground(new Color(253, 185, 74));
		tituloLogIn.setForeground(new Color(253, 185, 74));
		tituloLogIn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		tituloLogIn.setBounds(328, 32, 337, 64);
		panelDeLogin.add(tituloLogIn);

		JLabel labelUsuario = new JLabel("Usuario");
		labelUsuario.setForeground(new Color(253, 185, 74));
		labelUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelUsuario.setBounds(300, 225, 109, 14);
		panelDeLogin.add(labelUsuario);

		JLabel labelContrasena = new JLabel("Contraseña");
		labelContrasena.setForeground(new Color(253, 185, 74));
		labelContrasena.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelContrasena.setBounds(300, 373, 109, 14);
		panelDeLogin.add(labelContrasena);

		fieldUsuario = new JTextField();
		fieldUsuario.setBounds(470, 224, 211, 20);
		panelDeLogin.add(fieldUsuario);
		fieldUsuario.setColumns(10);

		fieldContrasenna = new JPasswordField();
		fieldContrasenna.setBounds(470, 372, 211, 20);
		panelDeLogin.add(fieldContrasenna);
		fieldContrasenna.setColumns(10);


		JButton jButtonLoginConfirmar = new JButton("Confirmar");
		jButtonLoginConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GestorDeCliente gestorDeCliente = new GestorDeCliente();
				if (gestorDeCliente.compararLoginUsuario(fieldUsuario, fieldContrasenna) == true) {
					panelDeLogin.setVisible(false);
				
					paneles.get(0).setVisible(false);
					paneles.get(1).setVisible(true);
					paneles.get(2).setVisible(false);
					paneles.get(3).setVisible(false);
					paneles.get(4).setVisible(false);
					paneles.get(5).setVisible(false);
					paneles.get(6).setVisible(false);
				}
			}
		});
		jButtonLoginConfirmar.setBounds(800, 556, 98, 33);
		panelDeLogin.add(jButtonLoginConfirmar);

		JButton jButtonLoginSalir = new JButton("Salir");
		jButtonLoginSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelDeLogin.setVisible(false);
				
				paneles.get(0).setVisible(true);
				paneles.get(1).setVisible(false);
				paneles.get(2).setVisible(false);
				paneles.get(3).setVisible(false);
				paneles.get(4).setVisible(false);
				paneles.get(5).setVisible(false);
				paneles.get(6).setVisible(false);

			}
		});
		jButtonLoginSalir.setBounds(100, 556, 98, 33);
		panelDeLogin.add(jButtonLoginSalir);
		
		JLabel lblLogoCineElorrieta = new JLabel("");
		lblLogoCineElorrieta.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoCineElorrieta.setBounds(33, 33, 90, 90);
		lblLogoCineElorrieta.setIcon(new ImageIcon("src/LogoCineElorrieta.png"));
		panelDeLogin.add(lblLogoCineElorrieta);
	
	}

	/**
	 * It returns the earlier created pannel in order to be used in the "PanelPrincipal" class.
	 * @return
	 */
	
	
	public JPanel getPanelDeLogin() {
		return panelDeLogin;
	}
	
	public JPanel incializarPanelDeLogin() {
		return panelDeLogin;
	}
}
