package cinesElorrieta.vista.complementos;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelDeResumen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panelDeResumen;

	/**
	 * Create the frame
	 * @param paneles 
	 */
	public PanelDeResumen(ArrayList<JPanel> paneles) {
		panelDeResumen = new JPanel();
		setContentPane(panelDeResumen);
		panelDeResumen.setLayout(null);
	}

	public JPanel inicializarPanelDePeliculas() {
		return panelDeResumen;
	}

}
