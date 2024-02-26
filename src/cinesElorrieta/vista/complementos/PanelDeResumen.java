package cinesElorrieta.vista.complementos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

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
import cinesElorrieta.logica.Session;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

/**
 * Panel donde se gestiona las sesiones añadido
 */
public class PanelDeResumen {

	private JPanel panelDeResumen;
	private JTable tablaDeCompra = null;
	private DefaultTableModel modeloCompra = null;
	/**
	 * codigo de sesion
	 */
	public int codePeliSesion = 0;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * obtener el codigo
	 * 
	 * @return codePeliSesion
	 */
	public int getCodePeliSesion() {
		return codePeliSesion;
	}

	/**
	 * setear el codigo
	 * 
	 * @param codePeliSesion codePeliSesion
	 */
	public void setCodePeliSesion(int codePeliSesion) {
		this.codePeliSesion = codePeliSesion;
	}

	/**
	 * Panel principal
	 * 
	 * @param entradas el array de entradas
	 */
	public PanelDeResumen(ArrayList<Entrada> entradas) {
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
			/**
			 * Volvemos al panel inicio y resetamos la tabla
			 * 
			 * @param e
			 */
			public void mouseClicked(MouseEvent e) {
				vaciarTablaCompra();
				vaciarPrecio();
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

		JLabel lblLogoCineElorrieta = new JLabel("");
		lblLogoCineElorrieta.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoCineElorrieta.setBounds(33, 33, 90, 90);
		lblLogoCineElorrieta.setIcon(new ImageIcon("src/LogoCineElorrieta.png"));
		panelDeResumen.add(lblLogoCineElorrieta);

		JButton btnFinalizarYComprar = new JButton("Finalizar Y Comprar");
		btnFinalizarYComprar.addMouseListener(new MouseAdapter() {
			@Override
			/**
			 * Finalizamos y compramos las sessiones existente
			 * 
			 * @param e
			 */
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
		btnFinalizarYComprar.setForeground(Color.BLACK);
		btnFinalizarYComprar.setBounds(414, 556, 150, 33);
		panelDeResumen.add(btnFinalizarYComprar);

		JButton btnVolver = new JButton("Volver");
		btnVolver.addMouseListener(new MouseAdapter() {
			@Override
			/**
			 * Volvemos al panel de cine
			 * 
			 * @param e
			 */
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
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVolver.setForeground(Color.BLACK);
		btnVolver.setBounds(802, 90, 150, 33);
		panelDeResumen.add(btnVolver);

		textField = new JTextField();
		textField.setBounds(662, 390, 86, 33);
		panelDeResumen.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("PrecioTotal:");
		lblNewLabel.setForeground(new Color(255, 128, 0));
		lblNewLabel.setBounds(562, 390, 90, 33);
		panelDeResumen.add(lblNewLabel);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(662, 450, 86, 33);
		panelDeResumen.add(textField_1);

		JLabel lblPreciototaliva = new JLabel("Precio Descontado:");
		lblPreciototaliva.setForeground(new Color(255, 128, 0));
		lblPreciototaliva.setBounds(519, 450, 133, 33);
		panelDeResumen.add(lblPreciototaliva);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			/**
			 * Logeamos con nuestro usuario
			 * 
			 * @param e
			 */
			public void actionPerformed(ActionEvent e) {

				Session.getInstance().getPanelDeBienvenida().getPanelDeBienvenida().setVisible(false);
				Session.getInstance().getPanelDeCines().getPanelDeCines().setVisible(false);
				Session.getInstance().getPanelDePeliculas().getPanelDePeliculas().setVisible(false);
				Session.getInstance().getPanelDeLogin().getPanelDeLogin().setVisible(true);
				Session.getInstance().getPanelDeRegistro().getPanelDeRegistro().setVisible(false);
				Session.getInstance().getPanelDeResumen().getPanelDeResumen().setVisible(false);
				Session.getInstance().getPanelDeSesion().getPanelDeSesion().setVisible(false);

			}
		});
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setBounds(791, 519, 150, 33);
		panelDeResumen.add(btnLogin);

		JButton btnRegistro = new JButton("Registrar");
		btnRegistro.addMouseListener(new MouseAdapter() {
			@Override
			/**
			 * Registramos un nuevo usuario
			 */
			public void mouseClicked(MouseEvent e) {

				Session.getInstance().getPanelDeBienvenida().getPanelDeBienvenida().setVisible(false);
				Session.getInstance().getPanelDeCines().getPanelDeCines().setVisible(false);
				Session.getInstance().getPanelDePeliculas().getPanelDePeliculas().setVisible(false);
				Session.getInstance().getPanelDeLogin().getPanelDeLogin().setVisible(false);
				Session.getInstance().getPanelDeRegistro().getPanelDeRegistro().setVisible(true);
				Session.getInstance().getPanelDeResumen().getPanelDeResumen().setVisible(false);
				Session.getInstance().getPanelDeSesion().getPanelDeSesion().setVisible(false);
			}
		});
		btnRegistro.setForeground(Color.BLACK);
		btnRegistro.setBounds(791, 561, 150, 33);
		panelDeResumen.add(btnRegistro);
	}

	/**
	 * Metodo para que parezca las sesiones añadido
	 * 
	 * @param entradas el array de entradas
	 */
	public void displayComprasTabla(ArrayList<Entrada> entradas) {

		for (int i = 0; i < entradas.size(); i++) {

			String nombre = entradas.get(i).getSesion().getPelicula().getNombre();
			Date fecha = entradas.get(i).getSesion().getFecha();
			Time hora = entradas.get(i).getSesion().getHora();
			String nombreCine = entradas.get(i).getSesion().getSala().getCine().getNomCine();
			String nombreSala = entradas.get(i).getSesion().getSala().getNomSala();
			float precio = entradas.get(i).getSesion().getPrecioSesion();

			Object[] linea = { nombre, fecha, hora, nombreCine, nombreSala, precio };
			modeloCompra.addRow(linea);
		}

	}

	/**
	 * Metodo para calcular el precio total y el descuento
	 * 
	 * @param entradas el array de entradas
	 */
	public void calculoDePrecio(ArrayList<Entrada> entradas) {
		float precioTotal = 0;
		int numeroFila = tablaDeCompra.getRowCount();
		for (int i = 0; i < entradas.size(); i++) {
			float precio = entradas.get(i).getSesion().getPrecioSesion();
			precioTotal += precio;

			float precioDes = 0;
			if (numeroFila <= 2 && numeroFila > 1) {
				precioDes = (float) 0.2;
			} else if (numeroFila <= 3 && numeroFila > 1) {
				precioDes = (float) 0.3;
			} else if (numeroFila >= 4 && numeroFila > 1) {
				precioDes = (float) 0.4;
			} else if (numeroFila >= 5 && numeroFila <= 5) {
				precioDes = (float) 0.5;

			}
			float precioTotalDes = precioTotal - (precioTotal * precioDes);
			textField.setText(String.valueOf(precioTotal));
			textField_1.setText(String.valueOf(precioTotalDes));

			for (int j = 0; j < entradas.size(); j++) {
				Entrada entrada = entradas.get(j);
				entrada.setPrecioTotal(precioTotalDes);
				entrada.setPrecioFull(precioTotal);
			}

		}
	}

	/**
	 * vaciar campos de compra
	 */
	public void vaciarPrecio() {
		textField.setText(String.valueOf("0.0"));
		textField_1.setText(String.valueOf("0.0"));
	}

	/**
	 * vaciar la tabla de compra
	 */
	public void vaciarTablaCompra() {
		modeloCompra = (DefaultTableModel) this.tablaDeCompra.getModel();
		modeloCompra.setRowCount(0);
	}

	/**
	 * obtener a este panel
	 * 
	 * @return panelDeResumen
	 */
	public JPanel getPanelDeResumen() {
		return panelDeResumen;
	}

	/**
	 * obtener a este panel
	 * 
	 * @return panelDeResumen
	 */
	public JPanel inicializarPanelDeResumen() {
		return panelDeResumen;
	}
}
