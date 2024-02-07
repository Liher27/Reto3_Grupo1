package cinesElorrieta.vista.complementos;

import java.awt.Component;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PanelDePeliculas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panelDePeliculas;

	/**
	 * Launch the application.
	 */
	public PanelDePeliculas(ArrayList<JPanel> paneles) {
		panelDePeliculas = new JPanel();
		panelDePeliculas.setBorder(new EmptyBorder(5, 5, 5, 5));
	}
	
	/**
	 * It returns the earlier created pannel in order to be used in the "PanelPrincipal" class.
	 * @return
	 */
	public JPanel inicializarPanelDePeliculas() {
		return panelDePeliculas;
	}

}
