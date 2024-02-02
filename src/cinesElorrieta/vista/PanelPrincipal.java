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
	private JPanel panelCines = null;
	private JPanel panelDeEntradas = null;
	private JPanel panelDePeliculas = null;



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


	private PanelPrincipal() {
		inicializar();
	}

	/**
	 * It initialize the different panels.
	 */
	private void inicializar() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		PanelBienvenida.inicializarPanelDeBienvenida();
		frame.getContentPane().add(panelBienvenida);
		panelBienvenida.setLayout(null);
		panelBienvenida.setVisible(true);

		PanelCines.inicializarPanelCines();
		frame.getContentPane().add(panelCines);
		panelCines.setLayout(null);
		panelCines.setVisible(false);

		PanelDeEntradas.inicializarPanelDeEntradas();
		frame.getContentPane().add(panelDeEntradas);
		panelDeEntradas.setLayout(null);
		panelDeEntradas.setVisible(false);

		PanelDeLogin.inicializarPanelDeLogin();
		frame.getContentPane().add(panelDeLogin);
		panelDeLogin.setLayout(null);
		panelDeLogin.setVisible(false);

		PanelDePeliculas.inicializarPanelDePeliculas();
		frame.getContentPane().add(panelDePeliculas);
		panelDePeliculas.setLayout(null);
		panelDePeliculas.setVisible(false);

}
}