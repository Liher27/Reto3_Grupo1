import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Prueba extends JFrame {
	
	private JPanel panelDeBienvenida = null;
	private JLabel lblBienvenida = null;
	private JLabel lblLogoCineElorrieta = null;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
public Prueba(ArrayList<JPanel> paneles) {
		
		panelDeBienvenida = new JPanel();
		panelDeBienvenida.setBounds(0, 0, 984, 611);
		panelDeBienvenida.setBackground(new Color(42, 26, 29));
		panelDeBienvenida.setLayout(null);
	}
	
	public JPanel inicializarPanelDeBienvenida() {
		return panelDeBienvenida;
	}	
}

