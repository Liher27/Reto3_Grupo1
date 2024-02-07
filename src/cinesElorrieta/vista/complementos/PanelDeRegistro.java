package cinesElorrieta.vista.complementos;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import cinesElorrieta.logica.GestorDeCliente;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelDeRegistro {

	private JPanel panelDeRegistro;

	
	private JTextField textFieldDNIRegistro;
	private JTextField textFieldNombreRegistro;
	private JTextField textFieldPrimerApellidoRegistro;
	private JTextField textFieldSegundoApellidoRegistro;
	private JTextField textFieldContrasenyaRegistro;
	private JTextField textFieldConfirmarContrasenyaRegistro;
	private JTextField textFieldSexoRegistro;
	
	
	public PanelDeRegistro(ArrayList<JPanel> paneles) {
		
		panelDeRegistro = new JPanel();
		panelDeRegistro.setBounds(0, 0, 984, 611);
		panelDeRegistro.setBackground(new Color(42, 26, 29));
		panelDeRegistro.setLayout(null);
		
		JLabel lblDNIRegistro = new JLabel("DNI");
		lblDNIRegistro.setForeground(new Color(253, 185, 74));
		lblDNIRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblDNIRegistro.setBounds(192, 130, 86, 43);
		panelDeRegistro.add(lblDNIRegistro);
		
		JLabel lblNombreRegistro = new JLabel("Nombre");
		lblNombreRegistro.setForeground(new Color(253, 185, 74));
		lblNombreRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNombreRegistro.setBounds(192, 200, 86, 27);
		panelDeRegistro.add(lblNombreRegistro);
		
		JLabel lblPrimerApellidoRegistro = new JLabel("Primer apellido");
		lblPrimerApellidoRegistro.setForeground(new Color(253, 185, 74));
		lblPrimerApellidoRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblPrimerApellidoRegistro.setBounds(192, 270, 176, 32);
		panelDeRegistro.add(lblPrimerApellidoRegistro);
		
		JLabel lblSegundoApellidoRegistro = new JLabel("Segundo apellido");
		lblSegundoApellidoRegistro.setForeground(new Color(253, 185, 74));
		lblSegundoApellidoRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblSegundoApellidoRegistro.setBounds(192, 340, 176, 32);
		panelDeRegistro.add(lblSegundoApellidoRegistro);
		
		JLabel lblContrasenyaRegistro = new JLabel("Contraseña");
		lblContrasenyaRegistro.setForeground(new Color(253, 185, 74));
		lblContrasenyaRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblContrasenyaRegistro.setBounds(192, 410, 159, 31);
		panelDeRegistro.add(lblContrasenyaRegistro);
		
		JLabel lblConfirmarContrasenyaRegistro = new JLabel("Confirmar contraseña");
		lblConfirmarContrasenyaRegistro.setForeground(new Color(253, 185, 74));
		lblConfirmarContrasenyaRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblConfirmarContrasenyaRegistro.setBounds(192, 484, 209, 27);
		panelDeRegistro.add(lblConfirmarContrasenyaRegistro);
		
		JLabel lblSexoRegistro = new JLabel("Sexo");
		lblSexoRegistro.setForeground(new Color(253, 185, 74));
		lblSexoRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblSexoRegistro.setBounds(192, 550, 230, 32);
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
		
		JTextField textFieldSegundoApellidoRegistro = new JTextField();
		textFieldSegundoApellidoRegistro.setBounds(513, 420, 176, 20);
		panelDeRegistro.add(textFieldSegundoApellidoRegistro);
		textFieldSegundoApellidoRegistro.setColumns(10);
		
		JTextField textFieldContrasenyaRegistro = new JTextField();
		textFieldContrasenyaRegistro.setBounds(513, 351, 176, 20);
		panelDeRegistro.add(textFieldContrasenyaRegistro);
		textFieldContrasenyaRegistro.setColumns(10);
		
		JTextField textFieldConfirmarContrasenyaRegistro = new JTextField();
		textFieldConfirmarContrasenyaRegistro.setBounds(513, 492, 176, 20);
		panelDeRegistro.add(textFieldConfirmarContrasenyaRegistro);
		textFieldConfirmarContrasenyaRegistro.setColumns(10);
		
		JTextField textFieldSexoRegistro = new JTextField();
		textFieldSexoRegistro.setBounds(513, 561, 176, 20);
		panelDeRegistro.add(textFieldSexoRegistro);
		textFieldSexoRegistro.setColumns(10);
		
		JLabel tituloPanelDeRegistro = new JLabel("Registrar nuevo usuario");
		tituloPanelDeRegistro.setForeground(new Color(253, 185, 74));
		tituloPanelDeRegistro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		tituloPanelDeRegistro.setBounds(328, 32, 337, 64);
		panelDeRegistro.add(tituloPanelDeRegistro);
		
		JLabel lblLogoCineElorrieta = new JLabel("");
		lblLogoCineElorrieta.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoCineElorrieta.setBounds(34, 32, 90, 90);
		lblLogoCineElorrieta.setIcon(new ImageIcon("src/LogoCineElorrieta.png"));
		panelDeRegistro.add(lblLogoCineElorrieta);
		
		JButton btnCancelarPanelDeRegistro = new JButton("Bienvenida");
		btnCancelarPanelDeRegistro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelDeRegistro.setVisible(false);
			 
				paneles.get(0).setVisible(true);
				paneles.get(1).setVisible(false);
				paneles.get(2).setVisible(false);
				paneles.get(3).setVisible(false);
				paneles.get(4).setVisible(false);
			}
		});
		btnCancelarPanelDeRegistro.setForeground(new Color(0, 0, 0));
		btnCancelarPanelDeRegistro.setBounds(35, 577, 89, 23);
		panelDeRegistro.add(btnCancelarPanelDeRegistro);
		
		JButton btnConfirmarDeRegistro = new JButton("Confirmar");
		btnConfirmarDeRegistro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GestorDeCliente.UsuarioIngresadoCorrectamente(); {
				
				panelDeRegistro.setVisible(false);
	panelDeRegistro.setVisible(false);
				
				paneles.get(0).setVisible(false);
				paneles.get(1).setVisible(false);
				paneles.get(2).setVisible(false);
				paneles.get(3).setVisible(false);
				paneles.get(4).setVisible(false);
				paneles.get(5).setVisible(true);
				}
				
			}
		});
		btnConfirmarDeRegistro.setForeground(new Color(0, 0, 0));
		btnConfirmarDeRegistro.setBounds(849, 577, 101, 23);
		panelDeRegistro.add(btnConfirmarDeRegistro);
		
	}

	public JPanel inicializarPanelDeRegistro() {
		return panelDeRegistro;
	}

}
