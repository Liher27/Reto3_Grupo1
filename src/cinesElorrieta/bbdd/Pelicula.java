
package cinesElorrieta.bbdd;

import java.io.Serializable;
import java.util.Objects;

public class Pelicula implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6693431869498851496L;
	private int CodPelicula = 0;
	private String Nombre = null;
	private String Genero = null;
	private int Duracion = 0;
	private  float Precio = 0;

	
	/**
	 * Constructor base  prueba
	 */
	
	
	public Pelicula() {

	}
	public int getCodPelicula() {
		return CodPelicula;
	}

	public void setCodPelicula(int codPelicula) {
		CodPelicula = codPelicula;
	}
	public String getNombre() {
		return Nombre;
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



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public float getPrecio() {
		return Precio;
	}
	public void setPrecio(float precio) {
		Precio = precio;
	}
	@Override
	public int hashCode() {
		return Objects.hash(CodPelicula, Duracion, Genero, Nombre, Precio);
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
		return CodPelicula == other.CodPelicula && Duracion == other.Duracion && Objects.equals(Genero, other.Genero)
				&& Objects.equals(Nombre, other.Nombre)
				&& Float.floatToIntBits(Precio) == Float.floatToIntBits(other.Precio);
	}
	@Override
	public String toString() {
		return "Pelicula [CodPelicula=" + CodPelicula + ", Nombre=" + Nombre + ", Genero=" + Genero + ", Duracion="
				+ Duracion + ", Precio=" + Precio + "]";
	}
	
	
}

	
