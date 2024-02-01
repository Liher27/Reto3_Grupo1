package cinesElorrieta.vista;

import cinesElorrieta.controlador.GestorDeCliente;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelDeLogin extends JFrame {

	public static JTextField fieldUsuario = null;
	public static JPasswordField fieldContrasenna = null;
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelDeLogin frame = new PanelDeLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PanelDeLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel tituloLogIn = new JLabel("Iniciar sesión");
		tituloLogIn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tituloLogIn.setBounds(470, 90, 146, 32);
		contentPane.add(tituloLogIn);

		JLabel labelUsuario = new JLabel("Usuario");
		labelUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelUsuario.setBounds(300, 225, 109, 14);
		contentPane.add(labelUsuario);

		JLabel labelContrasena = new JLabel("Contraseña");
		labelContrasena.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelContrasena.setBounds(300, 373, 109, 14);
		contentPane.add(labelContrasena);

		fieldUsuario = new JTextField();
		fieldUsuario.setBounds(470, 224, 211, 20);
		contentPane.add(fieldUsuario);
		fieldUsuario.setColumns(10);

		fieldContrasenna = new JPasswordField();
		fieldContrasenna.setBounds(470, 372, 211, 20);
		contentPane.add(fieldContrasenna);
		fieldContrasenna.setColumns(10);

		JButton jButtonLoginConfirmar = new JButton("Confirmar");
		jButtonLoginConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GestorDeCliente.comprobarLogin();
			}
		});
		jButtonLoginConfirmar.setBounds(800, 556, 98, 33);
		contentPane.add(jButtonLoginConfirmar);

		JButton jButtonLoginSalir = new JButton("Salir");
		jButtonLoginSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

//				cambiarPanel(panelBienvenida, panelLogin);
			}
		});
		jButtonLoginSalir.setBounds(100, 556, 98, 33);
		contentPane.add(jButtonLoginSalir);
	}

}
