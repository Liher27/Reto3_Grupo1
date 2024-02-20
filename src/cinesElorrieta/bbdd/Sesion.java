
package cinesElorrieta.bbdd;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Date;
import java.util.Objects;

public class Sesion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4810240199663471824L;
	private int CodSesion = 0;
	private Date Fecha = null;
	private Time hora = null;
	private int CodSala = 0;
	private float PrecioSesion = 0;
	private int CodPelicula = 0;

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

	public int getCodSala() {
		return CodSala;
	}

	public void setCodSala(int codSala) {
		CodSala = codSala;
	}

	public float getPrecioSesion() {
		return PrecioSesion;
	}

	public void setPrecioSesion(float precioSesion) {
		PrecioSesion = precioSesion;
	}

	public int getCodPelicula() {
		return CodPelicula;
	}

	public void setCodPelicula(int codPelicula) {
		CodPelicula = codPelicula;
	}
}
