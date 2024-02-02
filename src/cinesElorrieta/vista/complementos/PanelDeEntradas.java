package cinesElorrieta.vista.complementos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PanelDeEntradas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panelDeEntradas;
	/**
	 * Create the frame.
	 */
	public JPanel inicializarPanelDeEntradas() {
		panelDeEntradas = new JPanel();
		panelDeEntradas.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		return panelDeEntradas;
	}

}
