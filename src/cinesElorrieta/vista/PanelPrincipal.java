package cinesElorrieta.vista;

import cinesElorrieta.vista.complementos.PanelDeBienvenida;
import cinesElorrieta.vista.complementos.PanelDeLogin;
import cinesElorrieta.vista.complementos.PanelDeCines;
import cinesElorrieta.vista.complementos.PanelDeEntradas;
import cinesElorrieta.vista.complementos.PanelDePeliculas;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class PanelPrincipal extends JFrame {
	
	private JPanel contentPane;

	private PanelDeBienvenida panelDeBienvenida;
	private PanelDeLogin panelDeLogin;
	private PanelDeCines panelDeCines;
	private PanelDeEntradas panelDeEntradas;
	private PanelDePeliculas panelDePeliculas;
	
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelPrincipal frame = new PanelPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * It initializes the program.
	 */


	public PanelPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		PanelDeBienvenida panelDeBienvenida = new PanelDeBienvenida();
		contentPane.add(panelDeBienvenida.inicializarPanelDeBienvenida());
		
		PanelDeLogin panelDeLogin = new PanelDeLogin();
		contentPane.add(panelDeLogin.inicializarPanelDeLogin());
		contentPane.setLayout(null);
		
		PanelDeCines panelDeCines = new PanelDeCines();
		contentPane.add(panelDeCines.inicializarPanelDeCines());
		contentPane.setLayout(null);
		
		PanelDeEntradas panelDeLogin = new PanelDeLogin();
		contentPane.add(panelDeLogin.inicializarPanelDeLogin());
		contentPane.setLayout(null);
		
		PanelDePeliculas panelDeLogin = new PanelDeLogin();
		contentPane.add(panelDeLogin.inicializarPanelDeLogin());
		contentPane.setLayout(null);
		
	}
	
}