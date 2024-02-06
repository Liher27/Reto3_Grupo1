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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class PanelDeBienvenida {

	private JPanel panelDeBienvenida = null;
	private JLabel lblBienvenida = null;
	private JLabel lblLogoCineElorrieta = null;
	
	
	public PanelDeBienvenida(ArrayList<JPanel> paneles) {
		
		
		panelDeBienvenida = new JPanel();
		panelDeBienvenida.setBounds(0, 0, 984, 611);
		panelDeBienvenida.setBackground(new Color(42, 26, 29));
		//hola
		
		
		lblBienvenida = new JLabel("");
		lblBienvenida.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenida.setBounds(0, 0, 984 , 611);
		
		lblBienvenida.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
		System.out.println("GoTO -> Panel 2");
		panelDeBienvenida.setVisible(false);
		
		paneles.get(0).setVisible(false);
		paneles.get(1).setVisible(true);
		paneles.get(2).setVisible(false);
			}
	});
		panelDeBienvenida.setLayout(null);
		lblBienvenida.setIcon(new ImageIcon("src/ImagenBienvenida.png"));
		panelDeBienvenida.add(lblBienvenida);
		
		lblLogoCineElorrieta = new JLabel("");
		lblLogoCineElorrieta.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoCineElorrieta.setBounds(33, 33, 90, 90);
		lblLogoCineElorrieta.setIcon(new ImageIcon("src/LogoCineElorrieta.png"));
		panelDeBienvenida.add(lblLogoCineElorrieta);
	}
	
	public JPanel inicializarPanelDeBienvenida() {
		return panelDeBienvenida;
	}}



