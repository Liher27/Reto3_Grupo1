package cinesElorrieta.logica;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;

import cinesElorrieta.bbdd.Entrada;

/**
 * 
 *
 * @author yifei liher y iñigo
 * 
 *         La clase para gestionar las entradas
 */
public class GestorDeEntrada {

	/**
	 * El metodo para generar fichero de factura
	 * 
	 * @param entradas EL array donde se guarda las entradas
	 */
	public void crearTicket(ArrayList<Entrada> entradas) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\in1dm3-v\\Desktop\\ticket.txt"))) {

			for (int i = 0; i < entradas.size(); i++) {
				String datos = "------------------------------------\n" + "Nombre del Usuario:"
						+ entradas.get(0).getCliente().getNombre() + "\n" + "Nombre de la Pelicula: "
						+ entradas.get(i).getSesion().getPelicula().getNombre() + "\n" + "Nombre de la Sala: "
						+ entradas.get(i).getSesion().getSala().getNomSala() + "\n" + "Fecha de emisión: "
						+ entradas.get(i).getSesion().getFecha() + "\n" + "Hora de emision: "
						+ entradas.get(i).getSesion().getHora() + "\n" + "Precio de la entrada: "
						+ entradas.get(i).getSesion().getPrecioSesion() + "\n" + "Nombre del cine: "
						+ entradas.get(i).getSesion().getSala().getCine().getNomCine() + "\n" + "Fecha de impresión: "
						+ entradas.get(i).getFechaCompra() + "\n" + "------------------------------------" + "\n";
				bw.write(datos);

			}
			float total = entradas.get(0).getPrecioFull();
			float totaldes = entradas.get(0).getPrecioTotal();
			float des = total - totaldes;

			bw.write("Precio Total:" + entradas.get(0).getPrecioTotal() + "\n");
			bw.write("Descuento:" + des);
		} catch (IOException e) {
			// Handle the exception
			System.err.println("Error writing to ticket.txt: " + e.getMessage());
		}

	}

}
