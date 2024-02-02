package cinesElorrieta.vista.complementos;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PanelBienvenida extends JFrame {

	private static final long serialVersionUID = 1L;
	private static JPanel PanelBienvenida;

	/**
	 * Launch the application.
	 */
	
	public static void inicializarPanelDeBienvenida() {
		PanelBienvenida = new JPanel();
		PanelBienvenida.setBorder(new EmptyBorder(5, 5, 5, 5));
		PanelBienvenida = new JPanel();
		PanelBienvenida.setBounds(0, 0, 984, 611);

		JLabel lblBienvenida = new JLabel("");
		lblBienvenida.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PanelBienvenida.setVisible(false);
//				panelLogin.setVisible(true);
//				esperar();
			}
		});
		lblBienvenida.setBounds(0, 0, 984, 611);
		lblBienvenida.setText("Hola");
		PanelBienvenida.add(lblBienvenida);
	}


}
