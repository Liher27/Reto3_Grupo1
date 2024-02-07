package cienElorrieta.ventana;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cinesElorrieta.logica.GestorDeCine;

public class PanelCine extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panelDeCines;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelCine frame = new PanelCine();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PanelCine() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 1000);
		panelDeCines = new JPanel();
		panelDeCines.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panelDeCines);
		
		GestorDeCine gestorDeCine = new GestorDeCine();

		List<String> cines = gestorDeCine.getNameOfCines();

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

				

			}

		});

		btnNewButton.setBounds(59, 336, 115, 31);

		panelDeCines.add(btnNewButton);

		

		JButton btnFinalizar = new JButton("Finalizar");

		btnFinalizar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				PanelCine panelCine = new PanelCine();

				panelCine.setVisible(false);

			}

		});

		btnFinalizar.setBounds(382, 336, 115, 31);

		panelDeCines.add(btnFinalizar);
	}

}
