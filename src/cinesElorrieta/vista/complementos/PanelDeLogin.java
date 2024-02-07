package cinesElorrieta.vista.complementos;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import cinesElorrieta.logica.GestorDeCliente;
import cinesElorrieta.vista.PanelPrincipal;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PanelDeLogin {

	public static JTextField fieldUsuario = null;
	public static JPasswordField fieldContrasenna = null;
	
	private JPanel panelDeLogin;

	/**
	 * Create the frame.
	 * @wbp.parser.entryPoint
	 */
	public PanelDeLogin(ArrayList<JPanel> paneles) {
		panelDeLogin = new JPanel();
		panelDeLogin.setBounds(0, 0, 984, 611);
		panelDeLogin.setLayout(null);

		JLabel tituloLogIn = new JLabel("Iniciar sesión");
		tituloLogIn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tituloLogIn.setBounds(470, 90, 146, 32);
		panelDeLogin.add(tituloLogIn);

		JLabel labelUsuario = new JLabel("Usuario");
		labelUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelUsuario.setBounds(300, 225, 109, 14);
		panelDeLogin.add(labelUsuario);

		JLabel labelContrasena = new JLabel("Contraseña");
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
				GestorDeCliente.comprobarLogin(); {
					panelDeLogin.setVisible(false);
					
					paneles.get(0).setVisible(false);
					paneles.get(1).setVisible(false);
					paneles.get(2).setVisible(false);
					paneles.get(3).setVisible(false);
					paneles.get(4).setVisible(false);
					paneles.get(5).setVisible(false);
					paneles.get(6).setVisible(true);
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
			}
		});
		jButtonLoginSalir.setBounds(100, 556, 98, 33);
		panelDeLogin.add(jButtonLoginSalir);
	
		
		
	}

	public JPanel incializarPanelDeLogin() {
		return panelDeLogin;
	}
}

