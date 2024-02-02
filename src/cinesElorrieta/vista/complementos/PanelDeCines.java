package cinesElorrieta.vista.complementos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PanelDeCines extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panelDeCines;

	/**
	 * Create the frame.
	 */
	public JPanel inicializarPanelDeCines() {
		panelDeCines = new JPanel();
		panelDeCines.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		return panelDeCines;	
	}

}
