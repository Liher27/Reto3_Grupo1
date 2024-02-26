
package cinesElorrieta.bbdd;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Date;

public class Sesion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4810240199663471824L;
	private int CodSesion = 0;
	private Date Fecha = null;
	private Time hora = null;
	private Sala sala = null;
	private float PrecioSesion = 0;
	private Pelicula pelicula = null;

	public int getCodSesion() {
		return CodSesion;
	}

	public void setCodSesion(int codSesion) {
		CodSesion = codSesion;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public Time getHora() {
		return hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "Sesion [CodSesion=" + CodSesion + ", Fecha=" + Fecha + ", hora=" + hora + ", sala=" + sala
				+ ", PrecioSesion=" + PrecioSesion + ", pelicula=" + pelicula + "]";
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public float getPrecioSesion() {
		return PrecioSesion;
	}

	public void setPrecioSesion(float precioSesion) {
		PrecioSesion = precioSesion;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
}
