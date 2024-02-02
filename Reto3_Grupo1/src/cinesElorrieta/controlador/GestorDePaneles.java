package cinesElorrieta.controlador;

import javax.swing.JPanel;

public class GestorDePaneles {

	
		public static  void cambiarPanel(JPanel panelSiguiente, JPanel panelAnterior) {
			panelSiguiente.setVisible(true);
			panelAnterior.setVisible(false);
		}

		/**
		 * It hides the current panel and shows again to introduce new films.
		 * 
		 * @param panelOcultar The panel will not be visible.
		 * @param panelMostrar The panel will be visible.
		 */
		private void actualizarPanel(JPanel panelOcultar, JPanel panelMostrar) {
			panelOcultar.setVisible(false);
			panelMostrar.setVisible(true);
		
	}

}
