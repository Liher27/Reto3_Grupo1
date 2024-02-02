package cinesElorrieta.vista.complementos;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PanelDePeliculas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panelDePeliculas;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 * @return 
	 */
	public JPanel inicializarPanelDePeliculas() {
		panelDePeliculas = new JPanel();
		panelDePeliculas.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		return panelDePeliculas;

	}

}
