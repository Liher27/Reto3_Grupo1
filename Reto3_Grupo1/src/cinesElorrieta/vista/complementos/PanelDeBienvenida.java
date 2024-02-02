package cinesElorrieta.vista.complementos;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PanelDeBienvenida extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 * @return 
	 */
	
	private JPanel panelDeBienvenida;
	
	public JPanel inicializarPanelDeBienvenida() {
		panelDeBienvenida = new JPanel();
		panelDeBienvenida.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelDeBienvenida = new JPanel();
		panelDeBienvenida.setBounds(0, 0, 984, 611);

		JLabel lblBienvenida = new JLabel("");
		lblBienvenida.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelDeBienvenida.setVisible(false);
//				panelDeLogin.setVisible(true);
//				esperar();
			}
		});
		lblBienvenida.setBounds(0, 0, 984, 611);
		lblBienvenida.setText("Hola");
		panelDeBienvenida.add(lblBienvenida);
	
		return panelDeBienvenida;
	}


}
