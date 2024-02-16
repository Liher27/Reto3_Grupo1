package cinesElorrieta.vista.complementos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import cinesElorrieta.bbdd.Sesion;
import cinesElorrieta.logica.GestorDeSesion;
import cinesElorrieta.logica.Session;
import cinesElorrieta.vista.complementos.PanelDePeliculas;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class PanelDeSesion {
	

	// */
	private JPanel panelDeSesion;
	private JTextField textField;
	private String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * Launch the application.
	 * 
	 * @param paneles
	 */

	public PanelDeSesion() {
		Session session = Session.getInstance();

		panelDeSesion = new JPanel();
		panelDeSesion.setBounds(0, 0, 984, 611);
		panelDeSesion.setBackground(new Color(42, 26, 29));
		panelDeSesion.setLayout(null);

//		PanelDePeliculas panelDePeliculas = new PanelDePeliculas();
		JLabel tituloPanelDeRegistro = new JLabel("Sesion de la pelicula");
		tituloPanelDeRegistro.setForeground(new Color(253, 185, 74));
		tituloPanelDeRegistro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		tituloPanelDeRegistro.setBounds(328, 32, 337, 64);
		panelDeSesion.add(tituloPanelDeRegistro);

		setCode(session.getCode());
		GestorDeSesion gestorDeSesion = new GestorDeSesion();
		List<Sesion> sesiones = gestorDeSesion.seleccionarPeliculaParaSesion(code);

		String[] index = { "CodSesion", "CodSala", "CodPelicula", "Fecha", "Hora", "Precio" };
		Object[][] data = new Object[sesiones.size()][index.length];
		for (int i = 0; i < sesiones.size(); i++) {
			Sesion Sesion = sesiones.get(i);
			data[i][0] = Sesion.getCodSesion();
			data[i][1] = Sesion.getCodSala();
			data[i][2] = Sesion.getCodPelicula();
			data[i][3] = Sesion.getFecha();
			data[i][4] = Sesion.getHora();
			data[i][5] = Sesion.getPrecioSesion();
		}

	
	{
		
		
		JScrollPane sesionScroll = new JScrollPane();
		sesionScroll.setBounds(235, 127, 512, 195);
		panelDeSesion.add(sesionScroll);

		DefaultTableModel modelo = new DefaultTableModel(data,index);
		/*modelo.addColumn("CodSesion");
		modelo.addColumn("CodSala");
		modelo.addColumn("CodPelicula");
		modelo.addColumn("Fecha");
		modelo.addColumn("Hora");
		modelo.addColumn("Precio");
		
		displaySession(modelo);*/
		
		JTable tablaDeSesion = new JTable(modelo);
		tablaDeSesion.setBounds(235, 127, 512, 195);

		sesionScroll.setViewportView(tablaDeSesion);

		JButton btnVolverPanelDeSesion = new JButton("Volver");
		btnVolverPanelDeSesion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
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
			public void mouseClicked(MouseEvent e) {
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

	

		JComboBox<Sesion> ComboBoxFecha = new JComboBox<Sesion>(new Vector<Sesion>());
		ComboBoxFecha.setBounds(235, 421, 126, 31);
		panelDeSesion.add(ComboBoxFecha);

		JComboBox<Sesion> ComboBoxHora = new JComboBox<Sesion>(new Vector<Sesion>());
		ComboBoxHora.setBounds(621, 421, 126, 31);
		panelDeSesion.add(ComboBoxHora);
		}
	}
	/*private void displaySession(DefaultTableModel modelo ) {
	GestorDeSesion gestorDeSesion = new GestorDeSesion();
	List<Sesion> sesion = gestorDeSesion.getSesionesDelaPelicula();

	
	for (int i = 0; i < sesion.size(); i++) {
		 
		Date fecha = ((Sesion) sesion).getFecha();
		Time hora = ((Sesion) sesion).getHora();
		
		Object[] linea = { Integer.toString(sesion.get(i).getCodSesion()),Integer.toString(sesion.get(i).getCodSala()),
				Integer.toString(sesion.get(i).getCodPelicula()), fecha, hora,
				Float.toString(sesion.get(i).getPrecioSesion())};
		modelo.addRow(linea);
	}*/
	

	public JPanel inicializarPanelDeSesion() {
		return panelDeSesion;
	}

	public JPanel getPanelDeSesion() {
		return panelDeSesion;
	}
}
