package cinesElorrieta.vista.complementos;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import cinesElorrieta.logica.GestorDeCine;



public class Prueba extends JFrame {



	private static final long serialVersionUID = 1L;

	private JPanel panelDeCines;


	public Prueba(ArrayList<JPanel> paneles) {

		GestorDeCine gestorDeCine = new GestorDeCine();
		List<String> cines = gestorDeCine.getNameOfCines();

		panelDeCines = new JPanel();
		panelDeCines.setBorder(new EmptyBorder(0, 0, 984, 611));

		setContentPane(panelDeCines);
		panelDeCines.setLayout(null);

		JComboBox<String> ComboBoxCines = new JComboBox<String>(new Vector<String>(cines));
		ComboBoxCines.setBounds(59, 174, 115, 22);
		panelDeCines.add(ComboBoxCines);

		JLabel imgCine = new JLabel("");
		imgCine.setBounds(295, 113, 257, 202);

		panelDeCines.add(imgCine);

		JButton btnNewButton = new JButton("Continuar");
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

//				panelDeCines.setVisible(false);
//				
//				paneles.get(0).setVisible(false);
//				paneles.get(1).setVisible(false);
//				paneles.get(2).setVisible(false);
//				paneles.get(3).setVisible(true);

			}

		});

		btnNewButton.setBounds(59, 336, 115, 31);
		panelDeCines.add(btnNewButton);

		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

	panelDeCines.setVisible(false);
				
				paneles.get(0).setVisible(false);
				paneles.get(1).setVisible(false);
				paneles.get(2).setVisible(true);
				paneles.get(3).setVisible(false);
			}

		});

		btnFinalizar.setBounds(382, 336, 115, 31);
		panelDeCines.add(btnFinalizar);

	}

	public JPanel inicializarPanelDeCines() {
		return panelDeCines;
	}

}