package cinesElorrieta.vista.complementos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PanelDeCompra {

	private JPanel panelDeCompra;

	/**
	 * Create the frame.
	 * @param paneles 
	 */
	public PanelDeCompra(ArrayList<JPanel> paneles) {
		panelDeCompra = new JPanel();
		panelDeCompra.setBounds(0, 0, 984, 611);
		panelDeCompra.setBackground(new Color(42, 26, 29));
		panelDeCompra.setLayout(null);
		
		JLabel tituloPanelDeRegistro = new JLabel("Confirmar Compra");
		tituloPanelDeRegistro.setForeground(new Color(253, 185, 74));
		tituloPanelDeRegistro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		tituloPanelDeRegistro.setBounds(328, 32, 337, 64);
		panelDeCompra.add(tituloPanelDeRegistro);
		
		JButton jButtonSalirPanelDeCompra = new JButton("Salir");
		jButtonSalirPanelDeCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelDeCompra.setVisible(false);
				

				paneles.get(0).setVisible(true);
				paneles.get(1).setVisible(false);
				paneles.get(2).setVisible(false);
				paneles.get(3).setVisible(false);
				paneles.get(4).setVisible(false);
				paneles.get(5).setVisible(false);
				paneles.get(6).setVisible(false);
			}
		});
		jButtonSalirPanelDeCompra.setBounds(100, 556, 98, 33);
		panelDeCompra.add(jButtonSalirPanelDeCompra);
		
		JLabel lblLogoCineElorrieta = new JLabel("");
		lblLogoCineElorrieta.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoCineElorrieta.setBounds(33, 33, 90, 90);
		lblLogoCineElorrieta.setIcon(new ImageIcon("src/LogoCineElorrieta.png"));
		panelDeCompra.add(lblLogoCineElorrieta);

	}
	
	
	public JPanel incializarPanelDeCompra() {
		return panelDeCompra;
	}

}
