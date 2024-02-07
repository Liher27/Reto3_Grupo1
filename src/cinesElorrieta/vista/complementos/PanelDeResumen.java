package cinesElorrieta.vista.complementos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelDeResumen {

	private JPanel panelDeResumen;

	/**
	 * Create the frame
	 * @param paneles 
	 */
	public PanelDeResumen(ArrayList<JPanel> paneles) {
		
		panelDeResumen = new JPanel();
		panelDeResumen.setBounds(0, 0, 984, 611);
		panelDeResumen.setBackground(new Color(42, 26, 29));
		panelDeResumen.setLayout(null);
		
		JLabel tituloPanelDeRegistro = new JLabel("Resumen de la compra");
		tituloPanelDeRegistro.setForeground(new Color(253, 185, 74));
		tituloPanelDeRegistro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		tituloPanelDeRegistro.setBounds(328, 32, 400, 64);
		panelDeResumen.add(tituloPanelDeRegistro);
		
		JButton btnVolverPanelDeResumen = new JButton("Bienvenida");
		btnVolverPanelDeResumen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelDeResumen.setVisible(false);
			 
				paneles.get(0).setVisible(true);
				paneles.get(1).setVisible(false);
				paneles.get(2).setVisible(false);
				paneles.get(3).setVisible(false);
			}
		});
		btnVolverPanelDeResumen.setForeground(new Color(0, 0, 0));
		btnVolverPanelDeResumen.setBounds(35, 577, 89, 23);
		panelDeResumen.add(btnVolverPanelDeResumen);
		
		JButton btnIrARegistroPanelDeResumen = new JButton("Resumen");
		btnIrARegistroPanelDeResumen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelDeResumen.setVisible(false);
				
				paneles.get(0).setVisible(false);
				paneles.get(1).setVisible(false);
				paneles.get(2).setVisible(false);
				paneles.get(3).setVisible(false);
				paneles.get(4).setVisible(true);
			}
		});
		btnIrARegistroPanelDeResumen.setForeground(new Color(0, 0, 0));
		btnIrARegistroPanelDeResumen.setBounds(849, 577, 101, 23);
		panelDeResumen.add(btnIrARegistroPanelDeResumen);
	}
	
	public JPanel inicializarPanelDePeliculas() {
		return panelDeResumen;
	}

}
