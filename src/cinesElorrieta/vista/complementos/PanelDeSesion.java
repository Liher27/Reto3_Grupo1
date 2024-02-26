
package cinesElorrieta.vista.complementos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import cinesElorrieta.bbdd.Entrada;
import cinesElorrieta.bbdd.Sesion;
import cinesElorrieta.logica.GestorDeSesion;
import cinesElorrieta.logica.Session;

/**
 * 
 * @author yifei liher y iñigo
 * 
 *         El panel que contiene contenidos de las sessiones
 * 
 */
public class PanelDeSesion {

	private JPanel panelDeSesion = null;
	public JTable tablaDeSesion = null;
	private int codPelicula = 0;
	private DefaultTableModel modelo = null;
	public ArrayList<Object> sesionesComprada = new ArrayList<Object>();

	/**
	 * El panel de sesion
	 * 
	 * @param entradas
	 */
	public PanelDeSesion(ArrayList<Entrada> entradas) {

		panelDeSesion = new JPanel();
		panelDeSesion.setBounds(0, 0, 984, 611);
		panelDeSesion.setBackground(new Color(42, 26, 29));
		panelDeSesion.setLayout(null);

		JLabel tituloPanelDeRegistro = new JLabel("Sesion de la pelicula");
		tituloPanelDeRegistro.setForeground(new Color(253, 185, 74));
		tituloPanelDeRegistro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		tituloPanelDeRegistro.setBounds(328, 32, 337, 64);
		panelDeSesion.add(tituloPanelDeRegistro);

		modelo = new DefaultTableModel();
		modelo.addColumn("CodSession");
		modelo.addColumn("CodSala");
		modelo.addColumn("CodPelicula");
		modelo.addColumn("Fecha");
		modelo.addColumn("Hora");
		modelo.addColumn("Precio");

		tablaDeSesion = new JTable(modelo);
		tablaDeSesion.setBounds(235, 127, 512, 195);

		JScrollPane sesionScroll = new JScrollPane();
		sesionScroll.setBounds(234, 185, 512, 195);
		panelDeSesion.add(sesionScroll);
		sesionScroll.setViewportView(tablaDeSesion);

		JButton btnVolverPanelDeSesion = new JButton("Volver");
		btnVolverPanelDeSesion.addMouseListener(new MouseAdapter() {
			@Override
			/**
			 * El boton para volver a la pagina
			 * 
			 * @param e
			 */
			public void mouseClicked(MouseEvent e) {
				vaciarTablaDeSesion();

				Session.getInstance().getPanelDeBienvenida().getPanelDeBienvenida().setVisible(true);
				Session.getInstance().getPanelDeCines().getPanelDeCines().setVisible(false);
				Session.getInstance().getPanelDePeliculas().getPanelDePeliculas().setVisible(false);
				Session.getInstance().getPanelDeLogin().getPanelDeLogin().setVisible(false);
				Session.getInstance().getPanelDeRegistro().getPanelDeRegistro().setVisible(false);
				Session.getInstance().getPanelDeResumen().getPanelDeResumen().setVisible(false);
				Session.getInstance().getPanelDeSesion().getPanelDeSesion().setVisible(false);
			}
		});
		btnVolverPanelDeSesion.setForeground(new Color(0, 0, 0));
		btnVolverPanelDeSesion.setBounds(100, 556, 98, 33);
		panelDeSesion.add(btnVolverPanelDeSesion);

		JButton btnContinuarPanelDeSesion = new JButton("Continuar");
		btnContinuarPanelDeSesion.addMouseListener(new MouseAdapter() {
			@Override
			/**
			 * El boton que nos lleve hasta otro cine para hacer compras
			 */
			public void mouseClicked(MouseEvent e) {
				vaciarTablaDeSesion();

				Session.getInstance().getPanelDeBienvenida().getPanelDeBienvenida().setVisible(false);
				Session.getInstance().getPanelDeCines().getPanelDeCines().setVisible(true);
				Session.getInstance().getPanelDePeliculas().getPanelDePeliculas().setVisible(false);
				Session.getInstance().getPanelDeLogin().getPanelDeLogin().setVisible(false);
				Session.getInstance().getPanelDeRegistro().getPanelDeRegistro().setVisible(false);
				Session.getInstance().getPanelDeResumen().getPanelDeResumen().setVisible(false);
				Session.getInstance().getPanelDeSesion().getPanelDeSesion().setVisible(false);
			}
		});
		btnContinuarPanelDeSesion.setForeground(new Color(0, 0, 0));
		btnContinuarPanelDeSesion.setBounds(800, 556, 98, 33);
		panelDeSesion.add(btnContinuarPanelDeSesion);

		JLabel lblLogoCineElorrieta = new JLabel("");
		lblLogoCineElorrieta.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoCineElorrieta.setBounds(33, 33, 90, 90);
		lblLogoCineElorrieta.setIcon(new ImageIcon("src/LogoCineElorrieta.png"));
		panelDeSesion.add(lblLogoCineElorrieta);

		JButton btnAadir = new JButton("Añadir");
		btnAadir.addMouseListener(new MouseAdapter() {
			/***
			 * Aqui añadimos las sesiones al panel de compra
			 */
			@Override
			public void mouseClicked(MouseEvent e) {
				JFrame jFrame = new JFrame();
				int result = JOptionPane.showConfirmDialog(jFrame, "¿Estás seguro que quieres añadir esta sesión?");

				if (result == 0) {
					GestorDeSesion gestorS = new GestorDeSesion();
					Entrada entrada = new Entrada();
					int filaSesionSeleccionada = tablaDeSesion.getSelectedRow();
					if (filaSesionSeleccionada != -1) {
						Session.getInstance().getPanelDeResumen().vaciarTablaCompra();
						int sessionSeleccionada = Integer
								.parseInt(modelo.getDataVector().get(tablaDeSesion.getSelectedRow()).get(0).toString());
						new Sesion();
						if (!(entradas.size() > 4)) {
							entrada.setSesion(gestorS.getSesionSeleccionada(sessionSeleccionada));
							entradas.add(entrada);
						} else {
							JOptionPane.showMessageDialog(null, "Has llegado al máximo de sesiones seleccionables", "Error",
									JOptionPane.ERROR_MESSAGE);
						}

						if (sessionSeleccionada != -1) {
							Session.getInstance().getPanelDeResumen().setCodePeliSesion(sessionSeleccionada);
							Session.getInstance().getPanelDeResumen().displayComprasTabla(entradas);
							Session.getInstance().getPanelDeResumen().calculoDePrecio(entradas);

							Session.getInstance().getPanelDeBienvenida().getPanelDeBienvenida().setVisible(false);
							Session.getInstance().getPanelDeCines().getPanelDeCines().setVisible(false);
							Session.getInstance().getPanelDePeliculas().getPanelDePeliculas().setVisible(false);
							Session.getInstance().getPanelDeLogin().getPanelDeLogin().setVisible(false);
							Session.getInstance().getPanelDeRegistro().getPanelDeRegistro().setVisible(false);
							Session.getInstance().getPanelDeResumen().getPanelDeResumen().setVisible(false);
							Session.getInstance().getPanelDeSesion().getPanelDeSesion().setVisible(true);

						} else {
							JOptionPane.showMessageDialog(null, "Error, no has seleccionado niguna sesión.", "Error",
									JOptionPane.ERROR_MESSAGE);
						}
					} else if (result == 1) {
						// no hace nada
					}
				}

			}

		});
		btnAadir.setForeground(Color.BLACK);
		btnAadir.setBounds(441, 403, 98, 33);
		panelDeSesion.add(btnAadir);

	}

	public void displayTable() {

		GestorDeSesion gestorDeSesion = new GestorDeSesion();
		List<Sesion> sesion = gestorDeSesion.seleccionarPeliculaParaSesion(this.getCode());

		for (int i = 0; i < sesion.size(); i++) {
			Date fecha = sesion.get(i).getFecha();
			Time hora = sesion.get(i).getHora();

			Object[] linea = { Integer.toString(sesion.get(i).getCodSesion()),
					Integer.toString(sesion.get(i).getSala().getCodSala()),
					Integer.toString(sesion.get(i).getPelicula().getCodPelicula()), fecha, hora,
					Float.toString(sesion.get(i).getPrecioSesion()) };

			modelo.addRow(linea);
		}
	}

	private void vaciarTablaDeSesion() {
		modelo = (DefaultTableModel) this.tablaDeSesion.getModel();
		modelo.setRowCount(0);
	}

	public int getCode() {
		return codPelicula;
	}

	public void setCode(int code) {
		this.codPelicula = code;
	}

	public JPanel getPanelDeSesion() {
		return panelDeSesion;
	}
}
