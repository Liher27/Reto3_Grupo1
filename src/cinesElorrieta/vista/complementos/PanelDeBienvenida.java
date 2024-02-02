package cinesElorrieta.vista.complementos;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PanelDeBienvenida {

	private JPanel panelDeBienvenida = null;
	private JButton jButtonPanel = null;
	
	public PanelDeBienvenida(ArrayList<JPanel> paneles) {
		
		panelDeBienvenida = new JPanel();
		panelDeBienvenida.setBounds(0, 0, 984, 611);
		panelDeBienvenida.setBackground(Color.red);

		jButtonPanel = new JButton("Panel 1");
		jButtonPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("GoTO -> Panel 2");
				panelDeBienvenida.setVisible(false);
				
				// Me falta la referencia panel2
				paneles.get(0).setVisible(false);
				paneles.get(1).setVisible(true);
				paneles.get(2).setVisible(false);
			}
		});
		jButtonPanel.setBounds(60, 60, 89, 23);
		panelDeBienvenida.add(jButtonPanel);
	
	}
	
	public JPanel inicializarPanelDeBienvenida() {
		return panelDeBienvenida;
	}


}
