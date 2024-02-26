package cinesElorrieta.vista.complementos;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import cinesElorrieta.logica.GestorDeCliente;
import cinesElorrieta.logica.Session;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPasswordField;

/**
 * El panel para registro con los datos que ha introducido el usuario
 */
public class PanelDeRegistro {

	private JPanel panelDeRegistro;

	private JTextField passwordFieldContrasenyaRegistro;
	private JPasswordField passwordFieldConfirmarContrasenyaRegistro;
	/**
	 * panel principal 
	 */
	public PanelDeRegistro() {
		panelDeRegistro = new JPanel();
		panelDeRegistro.setBounds(0, 0, 984, 611);
		panelDeRegistro.setBackground(new Color(42, 26, 29));
		panelDeRegistro.setLayout(null);

		JLabel lblDNIRegistro = new JLabel("DNI");
		lblDNIRegistro.setForeground(new Color(253, 185, 74));
		lblDNIRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblDNIRegistro.setBounds(235, 130, 86, 43);
		panelDeRegistro.add(lblDNIRegistro);

		JLabel lblNombreRegistro = new JLabel("Nombre");
		lblNombreRegistro.setForeground(new Color(253, 185, 74));
		lblNombreRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNombreRegistro.setBounds(235, 200, 86, 27);
		panelDeRegistro.add(lblNombreRegistro);

		JLabel lblPrimerApellidoRegistro = new JLabel("Primer apellido");
		lblPrimerApellidoRegistro.setForeground(new Color(253, 185, 74));
		lblPrimerApellidoRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblPrimerApellidoRegistro.setBounds(235, 270, 176, 32);
		panelDeRegistro.add(lblPrimerApellidoRegistro);

		JLabel lblPeliculasVistas = new JLabel("PeliculasVistas");
		lblPeliculasVistas.setForeground(new Color(253, 185, 74));
		lblPeliculasVistas.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblPeliculasVistas.setBounds(235, 340, 176, 32);
		panelDeRegistro.add(lblPeliculasVistas);

		JLabel lblContrasenyaRegistro = new JLabel("Contraseña");
		lblContrasenyaRegistro.setForeground(new Color(253, 185, 74));
		lblContrasenyaRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblContrasenyaRegistro.setBounds(235, 410, 159, 31);
		panelDeRegistro.add(lblContrasenyaRegistro);

		JLabel lblConfirmarContrasenyaRegistro = new JLabel("Confirmar contraseña");
		lblConfirmarContrasenyaRegistro.setForeground(new Color(253, 185, 74));
		lblConfirmarContrasenyaRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblConfirmarContrasenyaRegistro.setBounds(235, 484, 209, 27);
		panelDeRegistro.add(lblConfirmarContrasenyaRegistro);

		JLabel lblSexoRegistro = new JLabel("Sexo");
		lblSexoRegistro.setForeground(new Color(253, 185, 74));
		lblSexoRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblSexoRegistro.setBounds(235, 550, 230, 32);
		panelDeRegistro.add(lblSexoRegistro);

		JTextField textFieldDNIRegistro = new JTextField();
		textFieldDNIRegistro.setBounds(513, 146, 176, 20);
		panelDeRegistro.add(textFieldDNIRegistro);
		textFieldDNIRegistro.setColumns(10);

		JTextField textFieldNombreRegistro = new JTextField();
		textFieldNombreRegistro.setBounds(513, 208, 176, 20);
		panelDeRegistro.add(textFieldNombreRegistro);
		textFieldNombreRegistro.setColumns(10);

		JTextField textFieldPrimerApellidoRegistro = new JTextField();
		textFieldPrimerApellidoRegistro.setBounds(513, 281, 176, 20);
		panelDeRegistro.add(textFieldPrimerApellidoRegistro);
		textFieldPrimerApellidoRegistro.setColumns(10);

		JTextField textFielPeliculasVistas = new JTextField();
		textFielPeliculasVistas.setBounds(513, 351, 176, 20);
		panelDeRegistro.add(textFielPeliculasVistas);
		textFielPeliculasVistas.setColumns(10);

		JTextField textFieldSexoRegistro = new JTextField();
		textFieldSexoRegistro.setBounds(513, 561, 176, 20);
		panelDeRegistro.add(textFieldSexoRegistro);
		textFieldSexoRegistro.setColumns(10);

		JLabel tituloPanelDeRegistro = new JLabel("Registrar nuevo usuario");
		tituloPanelDeRegistro.setForeground(new Color(253, 185, 74));
		tituloPanelDeRegistro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		tituloPanelDeRegistro.setBounds(328, 32, 349, 64);
		panelDeRegistro.add(tituloPanelDeRegistro);

		JLabel lblLogoCineElorrieta = new JLabel("");
		lblLogoCineElorrieta.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoCineElorrieta.setBounds(34, 32, 90, 90);
		lblLogoCineElorrieta.setIcon(new ImageIcon("src/LogoCineElorrieta.png"));
		panelDeRegistro.add(lblLogoCineElorrieta);

		JButton btnCancelarPanelDeRegistro = new JButton("Bienvenida");
		btnCancelarPanelDeRegistro.addMouseListener(new MouseAdapter() {
			@Override
			/**
			 * Volvemos al panel de bienvenida
			 * @param e
			 */
			public void mouseClicked(MouseEvent e) {
				Session.getInstance().getPanelDeBienvenida().getPanelDeBienvenida().setVisible(true);
				Session.getInstance().getPanelDeCines().getPanelDeCines().setVisible(false);
				Session.getInstance().getPanelDePeliculas().getPanelDePeliculas().setVisible(false);
				Session.getInstance().getPanelDeLogin().getPanelDeLogin().setVisible(false);
				Session.getInstance().getPanelDeRegistro().getPanelDeRegistro().setVisible(false);
				Session.getInstance().getPanelDeResumen().getPanelDeResumen().setVisible(false);
				Session.getInstance().getPanelDeSesion().getPanelDeSesion().setVisible(false);
			}
		});
		btnCancelarPanelDeRegistro.setForeground(new Color(0, 0, 0));
		btnCancelarPanelDeRegistro.setBounds(100, 556, 98, 33);
		panelDeRegistro.add(btnCancelarPanelDeRegistro);

		JButton btnConfirmarDeRegistro = new JButton("Confirmar");
		btnConfirmarDeRegistro.addActionListener(new ActionListener() {
			/**
			 * Comfirmamos para registrar una nueva cuenta
			 * @param e
			 */
			public void actionPerformed(ActionEvent e) {
				boolean CampoVacio = false;
				JTextField[] campos = { textFieldDNIRegistro, textFieldNombreRegistro, textFieldPrimerApellidoRegistro,
						textFielPeliculasVistas, passwordFieldContrasenyaRegistro, textFieldSexoRegistro };
				for (int i = 0; i < campos.length; i++) {
					if (campos[i].getText().isEmpty()) {
						CampoVacio = true;
						break;
					}
				}
				if (CampoVacio) {
					JOptionPane.showMessageDialog(null, "El campo esta vacio!! \n Rellenarlo Por favor", "Error",
							JOptionPane.ERROR_MESSAGE);

				} else {
					GestorDeCliente gestorDeCliente = new GestorDeCliente();

					gestorDeCliente.compararRegistroUsuario(textFieldDNIRegistro, textFieldNombreRegistro,
							textFieldPrimerApellidoRegistro, textFielPeliculasVistas, passwordFieldContrasenyaRegistro,
							textFieldSexoRegistro);

					Session.getInstance().getPanelDeBienvenida().getPanelDeBienvenida().setVisible(false);
					Session.getInstance().getPanelDeCines().getPanelDeCines().setVisible(false);
					Session.getInstance().getPanelDePeliculas().getPanelDePeliculas().setVisible(false);
					Session.getInstance().getPanelDeLogin().getPanelDeLogin().setVisible(true);
					Session.getInstance().getPanelDeRegistro().getPanelDeRegistro().setVisible(false);
					Session.getInstance().getPanelDeResumen().getPanelDeResumen().setVisible(false);
					Session.getInstance().getPanelDeSesion().getPanelDeSesion().setVisible(false);
				}
			}
		});
		btnConfirmarDeRegistro.setForeground(new Color(0, 0, 0));
		btnConfirmarDeRegistro.setBounds(800, 556, 98, 33);
		panelDeRegistro.add(btnConfirmarDeRegistro);

		passwordFieldContrasenyaRegistro = new JPasswordField();
		passwordFieldContrasenyaRegistro.setBounds(513, 492, 176, 20);
		panelDeRegistro.add(passwordFieldContrasenyaRegistro);

		passwordFieldConfirmarContrasenyaRegistro = new JPasswordField();
		passwordFieldConfirmarContrasenyaRegistro.setBounds(513, 421, 176, 20);
		panelDeRegistro.add(passwordFieldConfirmarContrasenyaRegistro);

	}
	/**
	 * obtener a este panel 
	 * @return panelDeRegistro
	 */
	public JPanel getPanelDeRegistro() {
		return panelDeRegistro;
	}

}
