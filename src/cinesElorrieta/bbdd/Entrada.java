
package cinesElorrieta.bbdd;

import java.io.Serializable;
import java.util.Date;

/**
 * El pojo de la entrada. obtiene los datos de la tabla entrada
 * 
 */
public class Entrada implements Serializable {

	private static final long serialVersionUID = 1L;
	private int CodEntrada = 0;
	private Sesion Sesion = null;
	private Cliente cliente = null;
	private Cine cine = null;
	private Sala sala = null;
	private Pelicula pelicula = null;
	private float precioTotal = 0;
	private float precioFull = 0;

	public Cine getCine() {
		return cine;
	}

	public void setCine(Cine cine) {
		this.cine = cine;
	}

	Date FechaCompra = new Date();

	public int getCodEntrada() {
		return CodEntrada;
	}

	public void setCodEntrada(int codEntrada) {
		CodEntrada = codEntrada;

	}

	public Sesion getSesion() {
		return Sesion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setSesion(Sesion Sesion) {
		this.Sesion = Sesion;
	}

	public float getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(float precioEntrada) {
		this.precioTotal = precioEntrada;
	}

	public Date getFechaCompra() {
		return FechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		FechaCompra = fechaCompra;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public float getPrecioFull() {
		return precioFull;
	}

	public void setPrecioFull(float precioFull) {
		this.precioFull = precioFull;
	}

	@Override
	public String toString() {
		return "Entrada [CodEntrada=" + CodEntrada + ", Sesion=" + Sesion + ", cliente=" + cliente + ", cine=" + cine
				+ ", sala=" + sala + ", pelicula=" + pelicula + ", precioTotal=" + precioTotal + ", precioFull="
				+ precioFull + ", FechaCompra=" + FechaCompra + "]";
	}

}