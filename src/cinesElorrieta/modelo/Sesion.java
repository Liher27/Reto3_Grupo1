
package cinesElorrieta.modelo;

import java.io.Serializable;
import java.util.Objects;

public class Sesion implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4810240199663471824L;
	private int CodSesion;
	private String Fecha;
	private int hora;
	private int CodSala;
	private int PrecioSesion;
	private int CodPelicula;
	@Override
	public String toString() {
		return "Sesion [CodSesion=" + CodSesion + ", Fecha=" + Fecha + ", hora=" + hora + ", CodSala=" + CodSala
				+ ", PrecioSesion=" + PrecioSesion + ", CodPelicula=" + CodPelicula + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(CodPelicula, CodSala, CodSesion, Fecha, PrecioSesion, hora);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sesion other = (Sesion) obj;
		return CodPelicula == other.CodPelicula && CodSala == other.CodSala && CodSesion == other.CodSesion
				&& Objects.equals(Fecha, other.Fecha) && PrecioSesion == other.PrecioSesion && hora == other.hora;
	}
	public int getCodSesion() {
		return CodSesion;
	}
	public void setCodSesion(int codSesion) {
		CodSesion = codSesion;
	}
	public String getFecha() {
		return Fecha;
	}
	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getCodSala() {
		return CodSala;
	}
	public void setCodSala(int codSala) {
		CodSala = codSala;
	}
	public int getPrecioSesion() {
		return PrecioSesion;
	}
	public void setPrecioSesion(int precioSesion) {
		PrecioSesion = precioSesion;
	}
	public int getCodPelicula() {
		return CodPelicula;
	}
	public void setCodPelicula(int codPelicula) {
		CodPelicula = codPelicula;
	}
}

