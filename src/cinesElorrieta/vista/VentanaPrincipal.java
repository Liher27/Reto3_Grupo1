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

import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame {
	private JFrame frame;

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new VentanaPrincipal().frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public VentanaPrincipal() {
		inicializarPaneles();
	}

	private void inicializarPaneles() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// 0
		PanelDeBienvenida panelDeBienvenida = new PanelDeBienvenida();
		JPanel thePanelBienvenida = panelDeBienvenida.getPanelDeBienvenida();
		thePanelBienvenida.setVisible(true);
		frame.getContentPane().add(thePanelBienvenida);
		Session.getInstance().setPanelDeBienvenida(panelDeBienvenida);

		// 1
		PanelDeCines panelDeCines = new PanelDeCines();
		JPanel thePanelCines = panelDeCines.getPanelDeCines();
		thePanelCines.setVisible(false);
		frame.getContentPane().add(thePanelCines);
		Session.getInstance().setPanelDeCines(panelDeCines);

		// 2
		PanelDePeliculas panelDePeliculas = new PanelDePeliculas();
		JPanel thePanelPeliculas = panelDePeliculas.getPanelDePeliculas();
		thePanelPeliculas.setVisible(false);
		frame.getContentPane().add(thePanelPeliculas);
		Session.getInstance().setPanelDePeliculas(panelDePeliculas);

		// 3
		PanelDeSesion panelDeSesion = new PanelDeSesion();
		JPanel thePanelDeSesion = panelDeSesion.getPanelDeSesion();
		thePanelDeSesion.setVisible(false);
		frame.getContentPane().add(thePanelDeSesion);
		Session.getInstance().setPanelDeSesion(panelDeSesion);

		// 4
		PanelDeRegistro panelDeRegistro = new PanelDeRegistro();
		JPanel thePanelDeRegistro = panelDeRegistro.getPanelDeRegistro();
		thePanelDeRegistro.setVisible(false);
		frame.getContentPane().add(thePanelDeRegistro);
		Session.getInstance().setPanelDeRegistro(panelDeRegistro);

		// 5
		PanelDeLogin panelDeLogin = new PanelDeLogin();
		JPanel thePanelDeLogin = panelDeLogin.getPanelDeLogin();
		thePanelDeLogin.setVisible(false);
		frame.getContentPane().add(thePanelDeLogin);
		Session.getInstance().setPanelDeLogin(panelDeLogin);

		// 6
		PanelDeResumen panelDeResumen = new PanelDeResumen();
		JPanel thePanelDeResumen = panelDeResumen.getPanelDeResumen();
		thePanelDeResumen.setVisible(false);
		frame.getContentPane().add(thePanelDeResumen);
		Session.getInstance().setPanelDeResumen(panelDeResumen);

	}

}