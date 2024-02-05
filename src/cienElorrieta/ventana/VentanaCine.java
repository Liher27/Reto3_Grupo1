package cienElorrieta.ventana;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import cinesElorrieta.modelo.Cine;
import cinesElorrieta.controlador.GestorDeCine;

public class VentanaCine extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField NombreCine1;
	private JTextField NombreCine2;
	private JTextField NombreCine3;
	private JTextField NombreCine4;

	/**
	 * Create the panel.
	 */
	public VentanaCine() {
		Cine newcine = new Cine();
		setLayout(null);
		
		JLabel cine1 = new JLabel("New label");
		cine1.setBounds(42, 24, 286, 156);
		add(cine1);
		
		JLabel cine2 = new JLabel("New label");
		cine2.setBounds(674, 24, 286, 156);
		add(cine2);
		
		JLabel cine3 = new JLabel("New label");
		cine3.setBounds(42, 326, 286, 156);
		add(cine3);
		
		JLabel cine4 = new JLabel("New label");
		cine4.setBounds(652, 326, 286, 156);
		add(cine4);
		
		NombreCine1 = new JTextField(newcine.getNomCine());
		NombreCine1.setBounds(42, 206, 86, 20);
		add(NombreCine1);
		NombreCine1.setColumns(10);
		
		NombreCine2 = new JTextField();
		NombreCine2.setColumns(10);
		NombreCine2.setBounds(674, 206, 86, 20);
		add(NombreCine2);
		
		NombreCine3 = new JTextField();
		NombreCine3.setColumns(10);
		NombreCine3.setBounds(42, 517, 86, 20);
		add(NombreCine3);
		
		NombreCine4 = new JTextField();
		NombreCine4.setColumns(10);
		NombreCine4.setBounds(642, 517, 86, 20);
		add(NombreCine4);

	}
}
