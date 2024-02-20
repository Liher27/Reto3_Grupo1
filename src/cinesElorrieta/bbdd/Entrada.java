
package cinesElorrieta.bbdd;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

public class Entrada implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int CodEntrada = 0;
	private int CodCine = 0;
	private int CodSesion = 0;
	private int CodSala = 0;
	private int CodPelicula = 0;
	private String DNI = null;
	private float precioEntrada = 0;
	private Date fecCompra = null;
	private Time horaCompra = null;
	
	@Override
	public String toString() {
		return "Entrada [CodEntrada=" + CodEntrada + ", CodCine=" + CodCine + ", CodSesion=" + CodSesion + ", CodSala="
				+ CodSala + ", CodPelicula=" + CodPelicula + ", DNI=" + DNI + ", precioEntrada=" + precioEntrada
				+ ", fecCompra=" + fecCompra + ", horaCompra=" + horaCompra + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(CodCine, CodEntrada, CodPelicula, CodSala, CodSesion, DNI, fecCompra, horaCompra,
				precioEntrada);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entrada other = (Entrada) obj;
		return CodCine == other.CodCine && CodEntrada == other.CodEntrada && CodPelicula == other.CodPelicula
				&& CodSala == other.CodSala && CodSesion == other.CodSesion && Objects.equals(DNI, other.DNI)
				&& Objects.equals(fecCompra, other.fecCompra) && Objects.equals(horaCompra, other.horaCompra)
				&& Float.floatToIntBits(precioEntrada) == Float.floatToIntBits(other.precioEntrada);
	}
	public int getCodEntrada() {
		return CodEntrada;
	}
	public void setCodEntrada(int codEntrada) {
		CodEntrada = codEntrada;
	}
	public int getCodCine() {
		return CodCine;
	}
	public void setCodCine(int codCine) {
		CodCine = codCine;
	}
	public int getCodSesion() {
		return CodSesion;
	}
	public void setCodSesion(int codSesion) {
		CodSesion = codSesion;
	}
	public int getCodSala() {
		return CodSala;
	}
	public void setCodSala(int codSala) {
		CodSala = codSala;
	}
	public int getCodPelicula() {
		return CodPelicula;
	}
	public void setCodPelicula(int codPelicula) {
		CodPelicula = codPelicula;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public float getPrecioEntrada() {
		return precioEntrada;
	}
	public void setPrecioEntrada(float precioEntrada) {
		this.precioEntrada = precioEntrada;
	}
	public Date getFecCompra() {
		return fecCompra;
	}
	public void setFecCompra(Date fecCompra) {
		this.fecCompra = fecCompra;
	}
	public Time getHoraCompra() {
		return horaCompra;
	}
	public void setHoraCompra(Time horaCompra) {
		this.horaCompra = horaCompra;
	}
	
}