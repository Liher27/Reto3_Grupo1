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
		
		Session session = new Session();
		
		//0
		PanelDeBienvenida panelDeBienvenida = new PanelDeBienvenida();
		JPanel PanelDeBienvenida = panelDeBienvenida.inicializarPanelDeBienvenida();
		PanelDeBienvenida.setVisible(true);
		session.getPanelDeBienvenida();
		frame.getContentPane().add(PanelDeBienvenida);	
	
		//1
		PanelDeCines panelDeCines = new PanelDeCines();
		JPanel PanelDeCines = panelDeCines.inicializarPanelDeCines();
		PanelDeCines.setVisible(false);
		session.getPanelDeCines();
		frame.getContentPane().add(PanelDeCines);
		
		//2
		PanelDePeliculas panelDePeliculas = new PanelDePeliculas();
		JPanel PanelDePeliculas = panelDePeliculas.inicializarPanelDePeliculas();
		PanelDePeliculas.setVisible(false);
		session.getPanelDePeliculas();
		frame.getContentPane().add(PanelDePeliculas);

		//3
		PanelDeSesion panelDeSesion = new PanelDeSesion();
		JPanel PanelDeSesion = panelDeSesion.inicializarPanelDeSesion();
		PanelDeSesion.setVisible(false);
		session.getPanelDeSesion();
		frame.getContentPane().add(PanelDeSesion);	

		//4
		PanelDeRegistro panelDeRegistro = new PanelDeRegistro();
		JPanel PanelDeRegistro = panelDeRegistro.inicializarPanelDeRegistro();
		PanelDeRegistro.setVisible(false);
		session.getPanelDeRegistro();
		frame.getContentPane().add(PanelDeRegistro);
		
		
		//5
		PanelDeLogin panelDeLogin = new PanelDeLogin();
		JPanel PanelDeLogin = panelDeLogin.incializarPanelDeLogin();
		PanelDeLogin.setVisible(false);
		session.getPanelDeLogin();
		frame.getContentPane().add(PanelDeLogin);
		
		//6.
		PanelDeResumen panelDeResumen = new PanelDeResumen();
		JPanel PanelDeResumen = panelDeResumen.inicializarPanelDePeliculas();
		PanelDeResumen.setVisible(false);
		session.getPanelDeResumen();
		frame.getContentPane().add(PanelDeResumen);	

	}
	
}
