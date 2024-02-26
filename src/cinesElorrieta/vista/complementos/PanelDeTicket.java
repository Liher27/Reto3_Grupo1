package cinesElorrieta.vista.complementos;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import cinesElorrieta.bbdd.Entrada;
import cinesElorrieta.logica.GestorDeEntrada;
import cinesElorrieta.logica.Session;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 * Panel donde se genear el fichero con el boton
 * 
 */
public class PanelDeTicket extends JPanel {

	private static final long serialVersionUID = 1L;
	/**
	 * panelDeTicket
	 */
	private JPanel panelDeTicket;

	/**
	 * panel de ticket
	 * 
	 * @param entradas el array de entradas
	 */
	public PanelDeTicket(ArrayList<Entrada> entradas) {
		panelDeTicket = new JPanel();
		panelDeTicket.setBounds(0, 0, 984, 611);
		panelDeTicket.setBackground(new Color(42, 26, 29));
		panelDeTicket.setLayout(null);

		JLabel graciasPorSuCompra = new JLabel("Gracias Por Su compra");
		graciasPorSuCompra.setForeground(new Color(253, 185, 74));
		graciasPorSuCompra.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 50));
		graciasPorSuCompra.setBounds(189, 205, 607, 97);
		panelDeTicket.add(graciasPorSuCompra);

		JButton btnNewButton = new JButton("Genera Su Ticket");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			/**
			 * Con ese mouseClicked generaremos el Ticket
			 */
			public void mouseClicked(MouseEvent e) {

				GestorDeEntrada gestorDeEntrada = new GestorDeEntrada();
				gestorDeEntrada.crearTicket(entradas);
				/*
				 * GestorDeInsertEntrada gestorDeInsertEntrada = new GestorDeInsertEntrada();
				 * gestorDeInsertEntrada.insertarEntrada(entradas);
				 */

				Session.getInstance().getPanelDeBienvenida().getPanelDeBienvenida().setVisible(true);
				Session.getInstance().getPanelDeCines().getPanelDeCines().setVisible(false);
				Session.getInstance().getPanelDePeliculas().getPanelDePeliculas().setVisible(false);
				Session.getInstance().getPanelDeLogin().getPanelDeLogin().setVisible(false);
				Session.getInstance().getPanelDeRegistro().getPanelDeRegistro().setVisible(false);
				Session.getInstance().getPanelDeResumen().getPanelDeResumen().setVisible(false);
				Session.getInstance().getPanelDeSesion().getPanelDeSesion().setVisible(false);
				Session.getInstance().getPanelDeTicket().getPanelDeTicket().setVisible(false);
				Session.getInstance().getPanelDeResumen().vaciarTablaCompra();
				Session.getInstance().getPanelDeResumen().vaciarPrecio();
				;
			}
		});
		btnNewButton.setBounds(378, 327, 169, 54);
		panelDeTicket.add(btnNewButton);
	}

	/**
	 * obtener a este panel
	 * 
	 * @return panelDeTicket
	 */
	public JPanel getPanelDeTicket() {
		return panelDeTicket;
	}

	/**
	 * setear panelDeTicket
	 * 
	 * @param panelDeTicket panelDeTicket
	 */
	public void setPanelDeTicket(JPanel panelDeTicket) {
		this.panelDeTicket = panelDeTicket;
	}
}
