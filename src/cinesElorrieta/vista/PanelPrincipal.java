package cinesElorrieta.vista;

import cinesElorrieta.vista.complementos.PanelBienvenida;
import cinesElorrieta.vista.complementos.PanelDeLogin;
import cinesElorrieta.vista.complementos.PanelCines;
import cinesElorrieta.vista.complementos.PanelDeEntradas;
import cinesElorrieta.vista.complementos.PanelDePeliculas;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;


public class PanelPrincipal extends JPanel {
	
	private JFrame frame = null;
	private JPanel panelBienvenida = null;
	private JPanel panelDeLogin = null;


	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelPrincipal window = new PanelPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * It initializes the program.
	 */


	

	

}
