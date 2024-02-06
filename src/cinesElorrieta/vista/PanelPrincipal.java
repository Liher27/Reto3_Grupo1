package cinesElorrieta.vista;

import cinesElorrieta.vista.complementos.PanelDeBienvenida;
import cinesElorrieta.vista.complementos.PanelDeLogin;
import cinesElorrieta.vista.complementos.PanelDeCines;
import cinesElorrieta.vista.complementos.PanelDeEntradas;
import cinesElorrieta.vista.complementos.PanelDePeliculas;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelPrincipal extends JFrame {
	
	private JFrame frame;
	private ArrayList <JPanel> paneles = null;

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
					new PanelPrincipal().frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PanelPrincipal() {
		inicializarPaneles();
	}

	private void inicializarPaneles() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		paneles = new ArrayList <JPanel> ();
		
		PanelDeBienvenida panelDeBienvenida = new PanelDeBienvenida(paneles);
		JPanel PanelDeBienvenida = panelDeBienvenida.inicializarPanelDeBienvenida();
		PanelDeBienvenida.setVisible(true);
		
		paneles.add(PanelDeBienvenida);
		frame.getContentPane().add(PanelDeBienvenida);
		
		PanelDeLogin panelDeLogin = new PanelDeLogin();
		JPanel PanelDeLogin = panelDeLogin.inicializarPanelDeLogin();
		PanelDeLogin.setVisible(false);

		paneles.add(PanelDeLogin);
		frame.getContentPane().add(PanelDeLogin);
		
		PanelDeCines panelDeCines = new PanelDeCines();
		JPanel PanelDeCines = panelDeCines.inicializarPanelDeCines();
		PanelDeCines.setVisible(false);

		paneles.add(PanelDeCines);
		frame.getContentPane().add(PanelDeCines);
		
		PanelDeEntradas panelDeEntradas= new PanelDeEntradas();
		JPanel PanelDeEntradas = panelDeEntradas.inicializarPanelDeEntradas();
		PanelDeEntradas.setVisible(false);

		paneles.add(PanelDeEntradas);
		frame.getContentPane().add(PanelDeEntradas);
		
		PanelDePeliculas panelDePeliculas = new PanelDePeliculas();
		JPanel PanelDePeliculas = panelDePeliculas.inicializarPanelDePeliculas();
		PanelDePeliculas.setVisible(false);

		paneles.add(PanelDePeliculas);
		frame.getContentPane().add(PanelDePeliculas);

		
	
		
	}
	
}