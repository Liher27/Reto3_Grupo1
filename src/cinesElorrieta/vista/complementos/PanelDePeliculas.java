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
import cinesElorrieta.bbdd.Sesion;
import cinesElorrieta.logica.GestorDePeliculas;
import cinesElorrieta.logica.GestorDeSesion;
import cinesElorrieta.logica.Session;

public class PanelDePeliculas {

	private JPanel panelDePeliculas;
	public JTable tablaDePeliculas = null;
	public static String code; 
	/**
	 * Launch the application.
	 */

	public PanelDePeliculas(ArrayList<JPanel> paneles) {
		
		Session session = Session.getInstance ();
		session.setCode("PATATA");
		
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
		peliculaScroll.setBounds(235, 127, 512, 195);
		panelDePeliculas.add(peliculaScroll);
		
		 DefaultTableModel modelo = new DefaultTableModel();
		 tablaDePeliculas = new JTable(modelo);
		 modelo.addColumn("CodPelicula");
		 modelo.addColumn("Nombre");
		 modelo.addColumn("Genero");
		 modelo.addColumn("Duracion");
		 modelo.addColumn("Precio");
		 displayPelis( modelo);
		 
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

				/*panelDePeliculas.setVisible(false);
				 
				paneles.get(0).setVisible(false);
				paneles.get(1).setVisible(false);
				paneles.get(2).setVisible(false);
				paneles.get(3).setVisible(true);*/
			
				
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
		
		
		JButton buscarSesion = new JButton("Buscar Sesion");
		buscarSesion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		
			int peliculaSeleccionada =tablaDePeliculas.getSelectedRow();
			int column1 = tablaDePeliculas.getSelectedColumnCount()-1;
						
//			MetodoSingleton saludo1  = MetodoSingleton.getSingletonInstance("Hola");
//			MetodoSingleton saludo2 = MetodoSingleton.getSingletonInstance("Que te ");
//			        
//			        System.out.println(saludo1.getSaludo());
//			        System.out.println(saludo2.getSaludo());   
	
			panelDePeliculas.setVisible(false);
			 
			paneles.get(0).setVisible(false);
			paneles.get(1).setVisible(false);
			paneles.get(2).setVisible(false);
			paneles.get(3).setVisible(true);
			}
			
		});
			
		buscarSesion.setBounds(390, 343, 192, 43);
		panelDePeliculas.add(buscarSesion);
		
	}

	public JPanel inicializarPanelDePeliculas() {
		return panelDePeliculas;
	}
	private void displayPelis(DefaultTableModel modelo) {
		GestorDePeliculas gestorDePeliculas = new GestorDePeliculas();
		List<Pelicula> pelis = gestorDePeliculas.getLasPeliculas();
		for (int i = 0; i < pelis.size(); i++) {
			String[] linea = { Integer.toString(pelis.get(i).getCodPelicula()), pelis.get(i).getNombre(), pelis.get(i).getGenero(), Integer.toString(pelis.get(i).getDuracion()), Float.toString(pelis.get(i).getPrecio()) };
			modelo.addRow(linea);
		}
	}
	
}
