
package cinesElorrieta.modelo;

import java.io.Serializable;
import java.util.Objects;

public class Entrada implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 780711960843237998L;
	private int CodPelicula;
	private String TituloPeliculaDeEntrada;
	private int horario;
	private String FechaCompra;
	private int Sala;
	private int PrecioEntradas;
	private String DNI;
	private int CodSesion;
	@Override
	public int hashCode() {
		return Objects.hash(CodPelicula, CodSesion, DNI, FechaCompra, PrecioEntradas, Sala, TituloPeliculaDeEntrada,
				horario);
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
		return CodPelicula == other.CodPelicula && CodSesion == other.CodSesion && Objects.equals(DNI, other.DNI)
				&& Objects.equals(FechaCompra, other.FechaCompra) && PrecioEntradas == other.PrecioEntradas
				&& Sala == other.Sala && Objects.equals(TituloPeliculaDeEntrada, other.TituloPeliculaDeEntrada)
				&& horario == other.horario;
	}
	@Override
	public String toString() {
		return "Entrada [CodPelicula=" + CodPelicula + ", TituloPeliculaDeEntrada=" + TituloPeliculaDeEntrada
				+ ", horario=" + horario + ", FechaCompra=" + FechaCompra + ", Sala=" + Sala + ", PrecioEntradas="
				+ PrecioEntradas + ", DNI=" + DNI + ", CodSesion=" + CodSesion + "]";
	}
	public int getCodPelicula() {
		return CodPelicula;
	}
	public void setCodPelicula(int codPelicula) {
		CodPelicula = codPelicula;
	}
	public String getTituloPeliculaDeEntrada() {
		return TituloPeliculaDeEntrada;
	}
	public void setTituloPeliculaDeEntrada(String tituloPeliculaDeEntrada) {
		TituloPeliculaDeEntrada = tituloPeliculaDeEntrada;
	}
	public int getHorario() {
		return horario;
	}
	public void setHorario(int horario) {
		this.horario = horario;
	}
	public String getFechaCompra() {
		return FechaCompra;
	}
	public void setFechaCompra(String fechaCompra) {
		FechaCompra = fechaCompra;
	}
	public int getSala() {
		return Sala;
	}
	public void setSala(int sala) {
		Sala = sala;
	}
	public int getPrecioEntradas() {
		return PrecioEntradas;
	}
	public void setPrecioEntradas(int precioEntradas) {
		PrecioEntradas = precioEntradas;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public int getCodSesion() {
		return CodSesion;
	}
	public void setCodSesion(int codSesion) {
		CodSesion = codSesion;
	}
	
}

