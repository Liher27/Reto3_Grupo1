package cinesElorrieta.vista.complementos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import cinesElorrieta.logica.Session;

public class PanelDeResumen {

	private JPanel panelDeResumen;

	/**
	 * Launch the application.
	 */
	public PanelDeResumen() {
		Session session = Session.getInstance ();
		
		panelDeResumen = new JPanel();
		panelDeResumen.setBounds(0, 0, 984, 611);
		panelDeResumen.setBackground(new Color(42, 26, 29));
		panelDeResumen.setLayout(null);
		
		JLabel tituloPanelDeRegistro = new JLabel("Resumen de la compra");
		tituloPanelDeRegistro.setForeground(new Color(253, 185, 74));
		tituloPanelDeRegistro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		tituloPanelDeRegistro.setBounds(328, 32, 400, 64);
		panelDeResumen.add(tituloPanelDeRegistro);
		
		JButton btnVolverPanelDeResumen = new JButton("Bienvenida");
		btnVolverPanelDeResumen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				panelDeResumen.setVisible(false);
				session.getPanelDeBienvenida().getPanelDeBienvenida().setVisible(true);
				session.getPanelDeCines().getPanelDeCines().setVisible(false);
				session.getPanelDePeliculas().getPanelDePeliculas().setVisible(false);
				session.getPanelDeSesion().getPanelDeSesion().setVisible(false);
			
			}
		});
		btnVolverPanelDeResumen.setForeground(new Color(0, 0, 0));
		btnVolverPanelDeResumen.setBounds(100, 556, 150, 33);
		panelDeResumen.add(btnVolverPanelDeResumen);
		
		JButton btnIrARegistroPanelDeResumen = new JButton("Registro / Iniciar Sesion");
		btnIrARegistroPanelDeResumen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFrame jFrame = new JFrame();
				int result = JOptionPane.showConfirmDialog(jFrame, "¿Tienes una cuenta creada?");
				if (result == 0) {
//					panelDeResumen.setVisible(false);
			
					session.getPanelDeBienvenida().getPanelDeBienvenida().setVisible(false);
					session.getPanelDeCines().getPanelDeCines().setVisible(false);
					session.getPanelDePeliculas().getPanelDePeliculas().setVisible(false);
					session.getPanelDeSesion().getPanelDeSesion().setVisible(false);
					session.getPanelDeRegistro().getPanelDeRegistro().setVisible(true);
				} else if (result == 1) {
//					panelDeResumen.setVisible(false);
					session.getPanelDeBienvenida().getPanelDeBienvenida().setVisible(false);
					session.getPanelDeCines().getPanelDeCines().setVisible(false);
					session.getPanelDePeliculas().getPanelDePeliculas().setVisible(false);
					session.getPanelDeSesion().getPanelDeSesion().setVisible(false);
					session.getPanelDeRegistro().getPanelDeRegistro().setVisible(true);
					
				} else {
//					panelDeResumen.setVisible(false);
					session.getPanelDeBienvenida().getPanelDeBienvenida().setVisible(false);
					session.getPanelDeCines().getPanelDeCines().setVisible(false);
					session.getPanelDePeliculas().getPanelDePeliculas().setVisible(true);
			}
			}
		});
		btnIrARegistroPanelDeResumen.setForeground(new Color(0, 0, 0));
		btnIrARegistroPanelDeResumen.setBounds(720, 556, 178, 33);
		panelDeResumen.add(btnIrARegistroPanelDeResumen);
		
		JLabel lblLogoCineElorrieta = new JLabel("");
		lblLogoCineElorrieta.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoCineElorrieta.setBounds(33, 33, 90, 90);
		lblLogoCineElorrieta.setIcon(new ImageIcon("src/LogoCineElorrieta.png"));
		panelDeResumen.add(lblLogoCineElorrieta);
	}
	
	public JPanel getPanelDeResumen() {
		return panelDeResumen;
	}

	public JPanel inicializarPanelDePeliculas() {
		return panelDeResumen;
	}

}
