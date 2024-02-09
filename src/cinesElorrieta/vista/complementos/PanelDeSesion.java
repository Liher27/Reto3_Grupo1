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

import cinesElorrieta.bbdd.Sesion;
import cinesElorrieta.logica.GestorDeSesion;

public class PanelDeSesion {
//*/*/
	private JPanel panelDeSesion;

	/**
	 * Launch the application.
	 */

	public PanelDeSesion(ArrayList<JPanel> paneles) {

		panelDeSesion = new JPanel();
		panelDeSesion.setBounds(0, 0, 984, 611);
		panelDeSesion.setBackground(new Color(42, 26, 29));
		panelDeSesion.setLayout(null);

		JLabel tituloPanelDeRegistro = new JLabel("Sesion de la pelicula");
		tituloPanelDeRegistro.setForeground(new Color(253, 185, 74));
		tituloPanelDeRegistro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		tituloPanelDeRegistro.setBounds(328, 32, 337, 64);
		panelDeSesion.add(tituloPanelDeRegistro);
		
		GestorDeSesion gestorDeSesion = new GestorDeSesion();
		
		List<Sesion> sesiones = gestorDeSesion.getSesionesDelaPelicula();
		
		String [] index={"CodSesion","CodSala","CodPelicula","Fecha","Hora","Precio"};
		Object[][] data = new Object[sesiones.size()][index.length];
		for (int i=0; i < sesiones.size();i++) {
			Sesion Sesion = sesiones.get(i);
			data[i][0] = Sesion.getCodSesion();
			data[i][1] = Sesion.getCodSala();
			data[i][2] = Sesion.getCodPelicula();
			data[i][3] = Sesion.getFecha();
			data[i][4] = Sesion.getHora();
			data[i][5] = Sesion.getPrecioSesion();
		}
		JScrollPane sesionScroll = new JScrollPane();
		sesionScroll.setBounds(235, 127, 512, 195);
		panelDeSesion.add(sesionScroll);
		
		 DefaultTableModel modelo = new DefaultTableModel(data, index);
		 JTable tablaDeSesion = new JTable(modelo);
		 tablaDeSesion.setBounds(235, 127, 512, 195);
		
		 sesionScroll.setViewportView(tablaDeSesion);
		
        
		JButton btnVolverPanelDeSesion = new JButton("Volver");
		btnVolverPanelDeSesion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelDeSesion.setVisible(false);

				paneles.get(0).setVisible(true);
				paneles.get(1).setVisible(false);
				paneles.get(2).setVisible(false);
			}
		});
		btnVolverPanelDeSesion.setForeground(new Color(0, 0, 0));
		btnVolverPanelDeSesion.setBounds(100, 556, 98, 33);
		panelDeSesion.add(btnVolverPanelDeSesion);

		JButton btnContinuarPanelDeSesion = new JButton("Continuar");
		btnContinuarPanelDeSesion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

		
				panelDeSesion.setVisible(false);
				paneles.get(0).setVisible(false);
				paneles.get(1).setVisible(true);
				

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
	}

	public JPanel inicializarPanelDeSesion() {
		return panelDeSesion;
	}
}
