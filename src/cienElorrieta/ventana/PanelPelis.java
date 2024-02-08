package cienElorrieta.ventana;

import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import cinesElorrieta.logica.GestorDePeliculas;

public class PanelPelis extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PanelPelis() {
		setLayout(null);
		
		
		GestorDePeliculas gestocine = new GestorDePeliculas();
		List<String> pelis = gestocine.getLasPeliculas(null, table);
		
		 DefaultTableModel model = new DefaultTableModel();
		 model.addColumn("CodPelicula");
		 model.addColumn("Nombre");
		 model.addColumn("Genero");
		 model.addColumn("Duracion");
		 model.addColumn("Precio");
		 
		 for (String data : pelis) {
	            model.addRow(new Object[]{data});
		 }
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 53, 488, 331);
		add(scrollPane);
		
		table = new JTable(model);
		scrollPane.setViewportView(table);
		

	}
}
