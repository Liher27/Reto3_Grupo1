package cinesElorrieta.vista.complementos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import cinesElorrieta.logica.GestorDeCine;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelDeCines{

	private JPanel panelDeCines;



	/**
	 * Create the frame.
	 */
	public PanelDeCines(ArrayList<JPanel> paneles) {
		panelDeCines = new JPanel();
		panelDeCines.setBackground(new Color(42, 26, 29));
		panelDeCines.setBounds(0, 0, 984, 611);
		panelDeCines.setLayout(null);
		GestorDeCine gestorDeCine = new GestorDeCine();
		List<String> cines = gestorDeCine.getNameOfCines();
		
		JComboBox<String> ComboBoxCines = new JComboBox<String>(new Vector<String>(cines));
		ComboBoxCines.setBounds(84, 278, 311, 31);
		panelDeCines.add(ComboBoxCines);

		JLabel imgCinePanelDeCines = new JLabel("");
		imgCinePanelDeCines.setBounds(555, 153, 257, 282);
		panelDeCines.add(imgCinePanelDeCines);

		JButton btnContinuarPanelDeCines = new JButton("Continuar");
		btnContinuarPanelDeCines.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelDeCines.setVisible(false);
				 
				paneles.get(0).setVisible(false);
				paneles.get(1).setVisible(false);
				paneles.get(2).setVisible(true);
			}
		});
		btnContinuarPanelDeCines.setBounds(849, 577, 101, 23);
		panelDeCines.add(btnContinuarPanelDeCines);
		
		JButton btnVolverPanelDeCines = new JButton("Volver");
		btnVolverPanelDeCines.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelDeCines.setVisible(false);
				 
				paneles.get(0).setVisible(true);
				paneles.get(1).setVisible(false);
				paneles.get(2).setVisible(false);
			}
		});
		btnVolverPanelDeCines.setBounds(35, 577, 89, 23);
		panelDeCines.add(btnVolverPanelDeCines);
		
		JLabel lblSeleccionDeCinePanelDeCines = new JLabel("Por favor, escoje uno de nuestros cines:");
		lblSeleccionDeCinePanelDeCines.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSeleccionDeCinePanelDeCines.setForeground(new Color(253, 185, 74));
		lblSeleccionDeCinePanelDeCines.setBounds(84, 221, 311, 31);
		panelDeCines.add(lblSeleccionDeCinePanelDeCines);
		
		JLabel lblTituloPanelDeCines = new JLabel("Selección de cines");
		lblTituloPanelDeCines.setForeground(new Color(253, 185, 74));
		lblTituloPanelDeCines.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		lblTituloPanelDeCines.setBounds(328, 32, 337, 64);
		panelDeCines.add(lblTituloPanelDeCines);
			
	}
	
	/**
	 * It returns the earlier created pannel in order to be used in the "PanelPrincipal" class.
	 * @return
	 */
	public JPanel inicializarPanelDeCines() {
		return panelDeCines;
	}
}