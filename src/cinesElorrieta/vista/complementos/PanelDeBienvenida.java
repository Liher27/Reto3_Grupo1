package cinesElorrieta.vista.complementos;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import cinesElorrieta.logica.Session;

public class PanelDeBienvenida {

	private JPanel panelDeBienvenida = null;
	private JLabel lblBienvenida = null;
	private JLabel lblLogoCineElorrieta = null;

	public PanelDeBienvenida() {

		panelDeBienvenida = new JPanel();
		panelDeBienvenida.setBounds(0, 0, 984, 611);
		panelDeBienvenida.setBackground(new Color(42, 26, 29));

		lblBienvenida = new JLabel("");
		lblBienvenida.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenida.setBounds(0, 0, 984, 611);

		lblBienvenida.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				esperar();

				Session.getInstance().getPanelDeBienvenida().getPanelDeBienvenida().setVisible(false);
				Session.getInstance().getPanelDeCines().getPanelDeCines().setVisible(true);
				Session.getInstance().getPanelDePeliculas().getPanelDePeliculas().setVisible(false);
				Session.getInstance().getPanelDeLogin().getPanelDeLogin().setVisible(false);
				Session.getInstance().getPanelDeRegistro().getPanelDeRegistro().setVisible(false);
				Session.getInstance().getPanelDeResumen().getPanelDeResumen().setVisible(false);
				Session.getInstance().getPanelDeSesion().getPanelDeSesion().setVisible(false);

			}
		});

		panelDeBienvenida.setLayout(null);
		lblBienvenida.setIcon(new ImageIcon("src/ImagenBienvenida.png"));
		panelDeBienvenida.add(lblBienvenida);

		lblLogoCineElorrieta = new JLabel("");
		lblLogoCineElorrieta.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoCineElorrieta.setBounds(33, 33, 90, 90);
		lblLogoCineElorrieta.setIcon(new ImageIcon("src/LogoCineElorrieta.png"));
		panelDeBienvenida.add(lblLogoCineElorrieta);
	}

	public JPanel getPanelDeBienvenida() {
		return panelDeBienvenida;
	}

	private void esperar() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
	}

}
