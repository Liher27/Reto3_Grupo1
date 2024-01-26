package cinesElorrieta.modelo;

import java.util.Objects;

public class Pelicula {

	private String Nombre = null;
	private String Genero = null;
	private int Duracion = 0;
	private String Fecha = null;
	private String Hora = null;

	/**
	 * Constructor base  prueba
	 */
	public Pelicula() {

	}

	public String getNombre() {
		return Nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Duracion, Fecha, Genero, Hora, Nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		return Duracion == other.Duracion && Objects.equals(Fecha, other.Fecha) && Objects.equals(Genero, other.Genero)
				&& Objects.equals(Hora, other.Hora) && Objects.equals(Nombre, other.Nombre);
	}

	@Override
	public String toString() {
		return "Cine_pojo [Nombre=" + Nombre + ", Genero=" + Genero + ", Duracion=" + Duracion + ", Fecha=" + Fecha
				+ ", Hora=" + Hora + "]";
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public int getDuracion() {
		return Duracion;
	}

	public void setDuracion(int duracion) {
		Duracion = duracion;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public String getHora() {
		return Hora;
	}

	public void setHora(String hora) {
		Hora = hora;
	}
}