package cinesElorrieta.vista.complementos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import cinesElorrieta.bbdd.Pelicula;
import cinesElorrieta.logica.GestorDePeliculas;
import cinesElorrieta.logica.Session;

public class PanelDePeliculas {

	private JPanel panelDePeliculas;
	public JTable tablaDePeliculas = null;
	private DefaultTableModel modelo = null;
	private int CodCine = 0;

	public PanelDePeliculas() {
		panelDePeliculas = new JPanel();
		panelDePeliculas.setBounds(0, 0, 984, 611);
		panelDePeliculas.setBackground(new Color(42, 26, 29));
		panelDePeliculas.setLayout(null);

		JLabel tituloPanelDeRegistro = new JLabel("Selección de peliculas");
		tituloPanelDeRegistro.setForeground(new Color(253, 185, 74));
		tituloPanelDeRegistro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		tituloPanelDeRegistro.setBounds(328, 32, 337, 64);
		panelDePeliculas.add(tituloPanelDeRegistro);

		JScrollPane peliculaScroll = new JScrollPane();
		peliculaScroll.setBounds(236, 164, 512, 195);
		panelDePeliculas.add(peliculaScroll);

		modelo = new DefaultTableModel();
		tablaDePeliculas = new JTable(modelo);
		modelo.addColumn("CodPelicula");
		modelo.addColumn("Nombre");
		modelo.addColumn("Genero");
		modelo.addColumn("Duracion");
		modelo.addColumn("Precio");

		tablaDePeliculas.setBounds(235, 127, 512, 195);

		peliculaScroll.setViewportView(tablaDePeliculas);

		JButton btnVolverPanelDePeliculas = new JButton("Volver");
		btnVolverPanelDePeliculas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				vaciarTablaDePeliculas();
				
				Session.getInstance().getPanelDeBienvenida().getPanelDeBienvenida().setVisible(true);
				Session.getInstance().getPanelDeCines().getPanelDeCines().setVisible(false);
				Session.getInstance().getPanelDePeliculas().getPanelDePeliculas().setVisible(false);
				Session.getInstance().getPanelDeLogin().getPanelDeLogin().setVisible(false);
				Session.getInstance().getPanelDeRegistro().getPanelDeRegistro().setVisible(false);
				Session.getInstance().getPanelDeResumen().getPanelDeResumen().setVisible(false);
				Session.getInstance().getPanelDeSesion().getPanelDeSesion().setVisible(false);
			}
		});
		btnVolverPanelDePeliculas.setForeground(new Color(0, 0, 0));
		btnVolverPanelDePeliculas.setBounds(442, 567, 98, 33);
		panelDePeliculas.add(btnVolverPanelDePeliculas);

		JLabel lblLogoCineElorrieta = new JLabel("");
		lblLogoCineElorrieta.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoCineElorrieta.setBounds(33, 33, 90, 90);
		lblLogoCineElorrieta.setIcon(new ImageIcon("src/LogoCineElorrieta.png"));
		panelDePeliculas.add(lblLogoCineElorrieta);

		JButton buscarSesion = new JButton("Buscar Sesion");
		buscarSesion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int peliculaSeleccionada =
					Integer.parseInt(modelo.getDataVector().get(tablaDePeliculas.getSelectedRow()).get(0).toString());

				if (peliculaSeleccionada != -1) {
					
					vaciarTablaDePeliculas();
					
					Session.getInstance().getPanelDeSesion().setCode(peliculaSeleccionada);
					Session.getInstance().getPanelDeSesion().displayTable();

					Session.getInstance().getPanelDeBienvenida().getPanelDeBienvenida().setVisible(false);
					Session.getInstance().getPanelDeCines().getPanelDeCines().setVisible(false);
					Session.getInstance().getPanelDePeliculas().getPanelDePeliculas().setVisible(false);
					Session.getInstance().getPanelDeLogin().getPanelDeLogin().setVisible(false);
					Session.getInstance().getPanelDeRegistro().getPanelDeRegistro().setVisible(false);
					Session.getInstance().getPanelDeResumen().getPanelDeResumen().setVisible(false);
					Session.getInstance().getPanelDeSesion().getPanelDeSesion().setVisible(true);

				} else {
					JOptionPane.showMessageDialog(null, "Error, no se ha encontrado ninguna película.", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		buscarSesion.setBounds(391, 426, 192, 43);
		panelDePeliculas.add(buscarSesion);

	}
	
	public void displayPelis() {
		GestorDePeliculas gestorDePeliculas = new GestorDePeliculas();
		List<Pelicula> sesiones = gestorDePeliculas.getLasPeliculas(this.getCodCine());
		for (int i = 0; i < sesiones.size(); i++) {
			String[] linea = { Integer.toString(sesiones.get(i).getCodPelicula()), sesiones.get(i).getNombre(),
					sesiones.get(i).getGenero(), Integer.toString(sesiones.get(i).getDuracion()),
					Float.toString(sesiones.get(i).getPrecio()) };
			modelo.addRow(linea);
		}
	}
	
	private void vaciarTablaDePeliculas() {
		modelo = (DefaultTableModel) this.tablaDePeliculas.getModel();
		modelo.setRowCount(0);
	}
	
	public int getCodCine() {
		return CodCine;
	}

	public void setCodCine(int codCine) {
		CodCine = codCine;
	}


	public JPanel getPanelDePeliculas() {
		return panelDePeliculas;
	}
}
