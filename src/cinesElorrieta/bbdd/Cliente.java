
package cinesElorrieta.bbdd;

import java.io.Serializable;
import java.util.Objects;

public class Cliente implements Serializable {

	/**
	 * El pojo del Cliente. obtiene los datos de la tabla Cliente
	 * 
	 */
	private static final long serialVersionUID = 1927772374547100928L;
	private String DNI;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String sexo;
	private String contrasena;

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(DNI, apellido1, apellido2, contrasena, nombre, sexo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(DNI, other.DNI) && Objects.equals(apellido1, other.apellido1)
				&& Objects.equals(apellido2, other.apellido2) && Objects.equals(contrasena, other.contrasena)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(sexo, other.sexo);
	}

	@Override
	public String toString() {
		return "Cliente [DNI=" + DNI + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", sexo=" + sexo + ", contrasena=" + contrasena + "]";
	}
}
