package cinesElorrieta.vista;

import cinesElorrieta.logica.Session;
import cinesElorrieta.vista.complementos.PanelDeBienvenida;
import cinesElorrieta.vista.complementos.PanelDeLogin;
import cinesElorrieta.vista.complementos.PanelDeCines;
import cinesElorrieta.vista.complementos.PanelDePeliculas;
import cinesElorrieta.vista.complementos.PanelDeRegistro;
import cinesElorrieta.vista.complementos.PanelDeResumen;
import cinesElorrieta.vista.complementos.PanelDeSesion;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelPrincipal extends JFrame {
	private JFrame frame;
	private ArrayList <JPanel> paneles = null;
	
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
		
		//0
		PanelDeBienvenida panelDeBienvenida = new PanelDeBienvenida(paneles);
		JPanel PanelDeBienvenida = panelDeBienvenida.inicializarPanelDeBienvenida();
		PanelDeBienvenida.setVisible(true);
		paneles.add(PanelDeBienvenida);
		frame.getContentPane().add(PanelDeBienvenida);	
	
		//1
		PanelDeCines panelDeCines = new PanelDeCines(paneles);
		JPanel PanelDeCines = panelDeCines.inicializarPanelDeCines();
		PanelDeCines.setVisible(false);
		paneles.add(PanelDeCines);
		frame.getContentPane().add(PanelDeCines);
		
		//2
		PanelDePeliculas panelDePeliculas = new PanelDePeliculas(paneles);
		JPanel PanelDePeliculas = panelDePeliculas.inicializarPanelDePeliculas();
		PanelDePeliculas.setVisible(false);
		paneles.add(PanelDePeliculas);
		frame.getContentPane().add(PanelDePeliculas);
		
		//3
		PanelDeSesion panelDeSesion = new PanelDeSesion(paneles);
		JPanel PanelDeSesion = panelDeSesion.inicializarPanelDeSesion();
		PanelDeSesion.setVisible(false);
		paneles.add(PanelDeSesion);
		frame.getContentPane().add(PanelDeSesion);

		//4
		PanelDeRegistro panelDeRegistro = new PanelDeRegistro(paneles);
		JPanel PanelDeRegistro = panelDeRegistro.inicializarPanelDeRegistro();
		PanelDeRegistro.setVisible(false);
		paneles.add(PanelDeRegistro);
		frame.getContentPane().add(PanelDeRegistro);
		
		
		//5
		PanelDeLogin panelDeLogin = new PanelDeLogin(paneles);
		JPanel PanelDeLogin = panelDeLogin.incializarPanelDeLogin();
		PanelDeLogin.setVisible(false);
		paneles.add(PanelDeLogin);
		frame.getContentPane().add(PanelDeLogin);
		
		//6
		PanelDeResumen panelDeResumen = new PanelDeResumen(paneles);
		JPanel PanelDeResumen = panelDeResumen.inicializarPanelDeResumen();
		PanelDeResumen.setVisible(false);
		paneles.add(PanelDeLogin);
		frame.getContentPane().add(PanelDeLogin);
	

	}
	
}