package cinesElorrieta.bbdd;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

public class SessionesSeleccionada implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2983546704704566088L;
	private String nomCine;
	private String nombrePeli = null;
	private Date Fecha = null;
	private Time hora = null;
	private float precio = 0;
	private String nombreSala =null;
	public String getNomCine() {
		return nomCine;
	}
	public void setNomCine(String nomCine) {
		this.nomCine = nomCine;
	}
	public String getNombrePeli() {
		return nombrePeli;
	}
	@Override
	public String toString() {
		return "SessionesSeleccionada [nomCine=" + nomCine + ", nombrePeli=" + nombrePeli + ", Fecha=" + Fecha
				+ ", hora=" + hora + ", precio=" + precio + ", nombreSala=" + nombreSala + "]";
	}
	public void setNombrePeli(String nombrePeli) {
		this.nombrePeli = nombrePeli;
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
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String getNombreSala() {
		return nombreSala;
	}
	public void setNombreSala(String nombreSala) {
		this.nombreSala = nombreSala;
	}
	
}
