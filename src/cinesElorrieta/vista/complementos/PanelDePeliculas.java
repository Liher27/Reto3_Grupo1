package cinesElorrieta.vista.complementos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelDePeliculas {

	private JPanel panelDePeliculas;

	/**
	 * Launch the application.
	 */
	public PanelDePeliculas(ArrayList<JPanel> paneles) {

		panelDePeliculas = new JPanel();
		panelDePeliculas.setBounds(0, 0, 984, 611);
		panelDePeliculas.setBackground(new Color(42, 26, 29));
		panelDePeliculas.setLayout(null);
		
		
		JLabel tituloPanelDeRegistro = new JLabel("Selección de peliculas");
		tituloPanelDeRegistro.setForeground(new Color(253, 185, 74));
		tituloPanelDeRegistro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		tituloPanelDeRegistro.setBounds(328, 32, 337, 64);
		panelDePeliculas.add(tituloPanelDeRegistro);
		
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
		btnVolverPanelDePeliculas.setBounds(35, 577, 89, 23);
		panelDePeliculas.add(btnVolverPanelDePeliculas);
		
		JButton btnContinuarPanelDePeliculas = new JButton("Continuar");
		btnContinuarPanelDePeliculas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelDePeliculas.setVisible(false);
				
				paneles.get(0).setVisible(false);
				paneles.get(1).setVisible(false);
				paneles.get(2).setVisible(false);
				paneles.get(3).setVisible(false);
				paneles.get(4).setVisible(true);
			}
		});
		btnContinuarPanelDePeliculas.setForeground(new Color(0, 0, 0));
		btnContinuarPanelDePeliculas.setBounds(849, 577, 101, 23);
		panelDePeliculas.add(btnContinuarPanelDePeliculas);
	}
	
	/**
	 * It returns the earlier created pannel in order to be used in the "PanelPrincipal" class.
	 * @return
	 */
	public JPanel inicializarPanelDePeliculas() {
		return panelDePeliculas;
	}

}
