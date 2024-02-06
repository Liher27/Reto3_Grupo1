package cienElorrieta.ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JComboBox;

public class DiseñoPaneles extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldDNIRegistro;
	private JTextField textFieldNombreRegistro;
	private JTextField textFieldPrimerApellidoRegistro;
	private JTextField textFieldSegundoApellidoRegistro;
	private JTextField textFieldContrasenyaRegistro;
	private JTextField textFieldConfirmarContrasenyaRegistro;
	private JTextField textFieldSexoRegistro;

	/**
	 * Launch the application
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiseñoPaneles frame = new DiseñoPaneles();
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
	public DiseñoPaneles() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(42, 26, 29));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDNIRegistro = new JLabel("DNI");
		lblDNIRegistro.setForeground(new Color(253, 185, 74));
		lblDNIRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblDNIRegistro.setBounds(192, 130, 86, 43);
		contentPane.add(lblDNIRegistro);
		
		JLabel lblNombreRegistro = new JLabel("Nombre");
		lblNombreRegistro.setForeground(new Color(253, 185, 74));
		lblNombreRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNombreRegistro.setBounds(192, 200, 86, 27);
		contentPane.add(lblNombreRegistro);
		
		JLabel lblPrimerApellidoRegistro = new JLabel("Primer apellido");
		lblPrimerApellidoRegistro.setForeground(new Color(253, 185, 74));
		lblPrimerApellidoRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblPrimerApellidoRegistro.setBounds(192, 270, 176, 32);
		contentPane.add(lblPrimerApellidoRegistro);
		
		JLabel lblSegundoApellidoRegistro = new JLabel("Segundo apellido");
		lblSegundoApellidoRegistro.setForeground(new Color(253, 185, 74));
		lblSegundoApellidoRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblSegundoApellidoRegistro.setBounds(192, 340, 176, 32);
		contentPane.add(lblSegundoApellidoRegistro);
		
		JLabel lblContrasenyaRegistro = new JLabel("Contraseña");
		lblContrasenyaRegistro.setForeground(new Color(253, 185, 74));
		lblContrasenyaRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblContrasenyaRegistro.setBounds(192, 410, 159, 31);
		contentPane.add(lblContrasenyaRegistro);
		
		JLabel lblConfirmarContrasenyaRegistro = new JLabel("Confirmar contraseña");
		lblConfirmarContrasenyaRegistro.setForeground(new Color(253, 185, 74));
		lblConfirmarContrasenyaRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblConfirmarContrasenyaRegistro.setBounds(192, 480, 216, 32);
		contentPane.add(lblConfirmarContrasenyaRegistro);
		
		JLabel lblSexoRegistro = new JLabel("Sexo");
		lblSexoRegistro.setForeground(new Color(253, 185, 74));
		lblSexoRegistro.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblSexoRegistro.setBounds(192, 550, 230, 32);
		contentPane.add(lblSexoRegistro);
		
		textFieldDNIRegistro = new JTextField();
		textFieldDNIRegistro.setBounds(513, 146, 176, 20);
		contentPane.add(textFieldDNIRegistro);
		textFieldDNIRegistro.setColumns(10);
		
		textFieldNombreRegistro = new JTextField();
		textFieldNombreRegistro.setBounds(513, 208, 176, 20);
		contentPane.add(textFieldNombreRegistro);
		textFieldNombreRegistro.setColumns(10);
		
		textFieldPrimerApellidoRegistro = new JTextField();
		textFieldPrimerApellidoRegistro.setBounds(513, 281, 176, 20);
		contentPane.add(textFieldPrimerApellidoRegistro);
		textFieldPrimerApellidoRegistro.setColumns(10);
		
		textFieldSegundoApellidoRegistro = new JTextField();
		textFieldSegundoApellidoRegistro.setBounds(513, 351, 176, 20);
		contentPane.add(textFieldSegundoApellidoRegistro);
		textFieldSegundoApellidoRegistro.setColumns(10);
		
		textFieldContrasenyaRegistro = new JTextField();
		textFieldContrasenyaRegistro.setBounds(513, 351, 176, 20);
		contentPane.add(textFieldContrasenyaRegistro);
		textFieldContrasenyaRegistro.setColumns(10);
		
		textFieldConfirmarContrasenyaRegistro = new JTextField();
		textFieldConfirmarContrasenyaRegistro.setBounds(513, 420, 176, 20);
		contentPane.add(textFieldConfirmarContrasenyaRegistro);
		textFieldConfirmarContrasenyaRegistro.setColumns(10);
		
		textFieldSexoRegistro = new JTextField();
		textFieldSexoRegistro.setBounds(513, 561, 176, 20);
		contentPane.add(textFieldSexoRegistro);
		textFieldSexoRegistro.setColumns(10);
		
		JLabel tituloPanelDeRegistro = new JLabel("Registrar nuevo usuario");
		tituloPanelDeRegistro.setForeground(new Color(253, 185, 74));
		tituloPanelDeRegistro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		tituloPanelDeRegistro.setBounds(328, 32, 337, 64);
		contentPane.add(tituloPanelDeRegistro);
		
		JLabel lblLogoCineElorrieta = new JLabel("");
		lblLogoCineElorrieta.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoCineElorrieta.setBounds(34, 32, 90, 90);
		lblLogoCineElorrieta.setIcon(new ImageIcon("src/LogoCineElorrieta.png"));
		contentPane.add(lblLogoCineElorrieta);
		
		JButton btnCancelarPanelDeRegistro = new JButton("Cancelar");
		btnCancelarPanelDeRegistro.setForeground(new Color(0, 0, 0));
		btnCancelarPanelDeRegistro.setBounds(35, 577, 89, 23);
		contentPane.add(btnCancelarPanelDeRegistro);
		
		JButton btnConfirmarDeRegistro = new JButton("Confirmar");
		btnConfirmarDeRegistro.setForeground(new Color(0, 0, 0));
		btnConfirmarDeRegistro.setBounds(849, 577, 101, 23);
		contentPane.add(btnConfirmarDeRegistro);
		
		
}
}
