package cinesElorrieta.vista.complementos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import cinesElorrieta.bbdd.Pelicula;
import cinesElorrieta.logica.GestorDePeliculas;

public class PanelDePeliculas {

	private JPanel panelDePeliculas;

	/**
	 * Launch the application.
	 */

	public PanelDePeliculas(ArrayList<JPanel> paneles) {

		panelDePeliculas = new JPanel();
		panelDePeliculas.setBounds(0, 0, 984, 611);
		panelDePeliculas.setBackground(new Color(42, 26, 29));
		panelDePeliculas.setLayout(null);

		JLabel tituloPanelDeRegistro = new JLabel("Selección de peliculas");
		tituloPanelDeRegistro.setForeground(new Color(253, 185, 74));
		tituloPanelDeRegistro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		tituloPanelDeRegistro.setBounds(328, 32, 337, 64);
		panelDePeliculas.add(tituloPanelDeRegistro);
		
		GestorDePeliculas gestorDePeliculas = new GestorDePeliculas();
		
		List<Pelicula> pelis = gestorDePeliculas.getLasPeliculas();
		
		String [] index={"CodPelicula","Nombre","Genero","Duracion","Precio"};
		Object[][] data = new Object[pelis.size()][index.length];
		for (int i=0; i < pelis.size();i++) {
			Pelicula pelicula = pelis.get(i);
			data[i][0] = pelicula.getCodPelicula();
			data[i][1] = pelicula.getNombre();
			data[i][2] = pelicula.getGenero();
			data[i][3] = pelicula.getDuracion();
			data[i][4] = pelicula.getPrecio();
		}
		JScrollPane peliculaScroll = new JScrollPane();
		peliculaScroll.setBounds(235, 127, 512, 195);
		panelDePeliculas.add(peliculaScroll);
		
		 DefaultTableModel modelo = new DefaultTableModel(data, index);
		 JTable tablaDePeliculas = new JTable(modelo);
		 tablaDePeliculas.setBounds(235, 127, 512, 195);
		
		 peliculaScroll.setViewportView(tablaDePeliculas);
		
        
		JButton btnVolverPanelDePeliculas = new JButton("Volver");
		btnVolverPanelDePeliculas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelDePeliculas.setVisible(false);

				paneles.get(0).setVisible(true);
				paneles.get(1).setVisible(false);
				paneles.get(2).setVisible(false);
			}
		});
		btnVolverPanelDePeliculas.setForeground(new Color(0, 0, 0));
		btnVolverPanelDePeliculas.setBounds(100, 556, 98, 33);
		panelDePeliculas.add(btnVolverPanelDePeliculas);

		JButton btnContinuarPanelDePeliculas = new JButton("Continuar");
		btnContinuarPanelDePeliculas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				panelDePeliculas.setVisible(false);
				 
				paneles.get(0).setVisible(false);
				paneles.get(1).setVisible(false);
				paneles.get(2).setVisible(false);
				paneles.get(3).setVisible(true);
			
				
			}
		});
		btnContinuarPanelDePeliculas.setForeground(new Color(0, 0, 0));
		btnContinuarPanelDePeliculas.setBounds(800, 556, 98, 33);
		panelDePeliculas.add(btnContinuarPanelDePeliculas);

		JLabel lblLogoCineElorrieta = new JLabel("");
		lblLogoCineElorrieta.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoCineElorrieta.setBounds(33, 33, 90, 90);
		lblLogoCineElorrieta.setIcon(new ImageIcon("src/LogoCineElorrieta.png"));
		panelDePeliculas.add(lblLogoCineElorrieta);
	}

	public JPanel inicializarPanelDePeliculas() {
		return panelDePeliculas;
	}
}
