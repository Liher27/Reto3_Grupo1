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

public class PanelDeCines{

	private JPanel panelDeCines;



	/**
	 * Create the frame.
	 */
	public PanelDeCines(ArrayList<JPanel> paneles) {
		panelDeCines = new JPanel();
		panelDeCines.setBounds(0, 0, 984, 611);
		panelDeCines.setLayout(null);
		GestorDeCine gestorDeCine = new GestorDeCine();
		List<String> cines = gestorDeCine.getNameOfCines();
		
		JComboBox<String> ComboBoxCines = new JComboBox<String>(new Vector<String>(cines));
		ComboBoxCines.setBounds(59, 174, 115, 22);
		panelDeCines.add(ComboBoxCines);

		JLabel imgCine = new JLabel("");
		imgCine.setBounds(295, 113, 257, 202);
		panelDeCines.add(imgCine);

		JButton btnNewButton = new JButton("Continuar");
		btnNewButton.setBounds(59, 336, 115, 31);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelDeCines.add(btnNewButton);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setBounds(382, 336, 115, 31);
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		panelDeCines.add(btnFinalizar);
			
	}
	
	/**
	 * It returns the earlier created pannel in order to be used in the "PanelPrincipal" class.
	 * @return
	 */
	public JPanel inicializarPanelDeCines() {
		return panelDeCines;
	}
}
