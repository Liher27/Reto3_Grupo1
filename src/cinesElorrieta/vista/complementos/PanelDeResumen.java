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

import cinesElorrieta.bbdd.SessionesSeleccionada;
import cinesElorrieta.logica.GestorDeSesion;
import cinesElorrieta.logica.Session;

public class PanelDeResumen {

	private JPanel panelDeResumen;
	private JTable tablaDeCompra = null;
	private DefaultTableModel modeloCompra = null;
	public  List<Object> sesiones = new ArrayList<>();
	public int codePeliSesion = 0;
	
	
	public int getCodePeliSesion() {
		return codePeliSesion;
	}
	public void setCodePeliSesion(int codePeliSesion) {
		this.codePeliSesion = codePeliSesion;
	}
	/**
	 * Launch the application.
	 * 
	 * @param paneles
	 */
	public PanelDeResumen() {
		panelDeResumen = new JPanel();
		panelDeResumen.setBounds(0, 0, 984, 611);
		panelDeResumen.setBackground(new Color(42, 26, 29));
		panelDeResumen.setLayout(null);

		JLabel tituloPanelDeRegistro = new JLabel("Resumen de la compra");
		tituloPanelDeRegistro.setForeground(new Color(253, 185, 74));
		tituloPanelDeRegistro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		tituloPanelDeRegistro.setBounds(328, 32, 400, 64);
		panelDeResumen.add(tituloPanelDeRegistro);
		
		

		 modeloCompra = new DefaultTableModel();
		tablaDeCompra = new JTable(modeloCompra);
		modeloCompra.addColumn("Nombre");
		modeloCompra.addColumn("Fecha");
		modeloCompra.addColumn("Hora");
		modeloCompra.addColumn("Cine");
		modeloCompra.addColumn("Sala");
		modeloCompra.addColumn("Precio");
		
		JScrollPane compraScroll = new JScrollPane();
		compraScroll.setBounds(236, 164, 512, 195);
		panelDeResumen.add(compraScroll);
		compraScroll.setViewportView(tablaDeCompra);

		JButton btnVolverPanelDeResumen = new JButton("Bienvenida");
		btnVolverPanelDeResumen.addMouseListener(new MouseAdapter() {
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
		btnVolverPanelDeResumen.setForeground(new Color(0, 0, 0));
		btnVolverPanelDeResumen.setBounds(100, 556, 150, 33);
		panelDeResumen.add(btnVolverPanelDeResumen);

		JButton btnIrARegistroPanelDeResumen = new JButton("Registro / Iniciar Sesion");
		btnIrARegistroPanelDeResumen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFrame jFrame = new JFrame();
				int result = JOptionPane.showConfirmDialog(jFrame, "¿Tienes una cuenta creada?");
				if (result == 0) {
					Session.getInstance().getPanelDeBienvenida().getPanelDeBienvenida().setVisible(false);
					Session.getInstance().getPanelDeCines().getPanelDeCines().setVisible(false);
					Session.getInstance().getPanelDePeliculas().getPanelDePeliculas().setVisible(false);
					Session.getInstance().getPanelDeLogin().getPanelDeLogin().setVisible(true);
					Session.getInstance().getPanelDeRegistro().getPanelDeRegistro().setVisible(false);
					Session.getInstance().getPanelDeResumen().getPanelDeResumen().setVisible(false);
					Session.getInstance().getPanelDeSesion().getPanelDeSesion().setVisible(false);
				} else if (result == 1) {
					Session.getInstance().getPanelDeBienvenida().getPanelDeBienvenida().setVisible(false);
					Session.getInstance().getPanelDeCines().getPanelDeCines().setVisible(false);
					Session.getInstance().getPanelDePeliculas().getPanelDePeliculas().setVisible(false);
					Session.getInstance().getPanelDeLogin().getPanelDeLogin().setVisible(false);
					Session.getInstance().getPanelDeRegistro().getPanelDeRegistro().setVisible(true);
					Session.getInstance().getPanelDeResumen().getPanelDeResumen().setVisible(false);
					Session.getInstance().getPanelDeSesion().getPanelDeSesion().setVisible(false);
				}
			}
		});
		btnIrARegistroPanelDeResumen.setForeground(new Color(0, 0, 0));
		btnIrARegistroPanelDeResumen.setBounds(720, 556, 178, 33);
		panelDeResumen.add(btnIrARegistroPanelDeResumen);

		JLabel lblLogoCineElorrieta = new JLabel("");
		lblLogoCineElorrieta.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoCineElorrieta.setBounds(33, 33, 90, 90);
		lblLogoCineElorrieta.setIcon(new ImageIcon("src/LogoCineElorrieta.png"));
		panelDeResumen.add(lblLogoCineElorrieta);
		
		JButton btnFinalizarYComprar = new JButton("Finalizar Y Comprar");
		btnFinalizarYComprar.setForeground(Color.BLACK);
		btnFinalizarYComprar.setBounds(414, 556, 150, 33);
		panelDeResumen.add(btnFinalizarYComprar);
	}
	public void displayComprasTabla() {
		GestorDeSesion gestorDeSesion = new GestorDeSesion();
		List<SessionesSeleccionada> sesionesComprada =  gestorDeSesion.sessionesSeleccionada(this.getCodePeliSesion());
		for (int i = 0; i < sesionesComprada.size(); i++) {
		
			
			String nombrePelicula = sesionesComprada.get(i).getNombrePeli();
			String nombreCine = sesionesComprada.get(i).getNomCine();
			String nombreSala = sesionesComprada.get(i).getNombreSala();
			float precio = sesionesComprada.get(i).getPrecio();
			Date fecha = sesionesComprada.get(i).getFecha();
			Time hora = sesionesComprada.get(i).getHora();
			Object[] linea = { nombrePelicula,fecha,hora,nombreCine,nombreSala, precio};

			sesiones.add(linea);
			
		}
		
		
	}
	
	public void muestraTabla() {
		for(int i = 0; i <sesiones.size(); i++) {
			Object [] fila = (Object[]) sesiones.get(i);
			modeloCompra.addRow(fila);
				
		}
	    
	}
	void vaciarTablaCompra() {
		modeloCompra = (DefaultTableModel) this.tablaDeCompra.getModel();
		modeloCompra.setRowCount(0);
	}

	public JPanel getPanelDeResumen() {
		return panelDeResumen;
	}

	public JPanel inicializarPanelDeResumen() {
		return panelDeResumen;
	}
	
	


}
