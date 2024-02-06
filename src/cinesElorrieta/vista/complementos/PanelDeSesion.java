package cinesElorrieta.vista.complementos;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PanelDeSesion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panelDeSesion;
	
	
	
	public PanelDeSesion(ArrayList<JPanel> paneles) {
		panelDeSesion = new JPanel();
		panelDeSesion.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
	}
	public JPanel inicializarPanelDeSesion() {
		return panelDeSesion;
	}
}
