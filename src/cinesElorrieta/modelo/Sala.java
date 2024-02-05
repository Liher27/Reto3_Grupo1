
package cinesElorrieta.modelo;

import java.io.Serializable;
import java.util.Objects;



public class Sala implements Serializable {

	@Override
	public int hashCode() {
		return Objects.hash(CodCine, CodSala, NomSala);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sala other = (Sala) obj;
		return CodCine == other.CodCine && CodSala == other.CodSala && Objects.equals(NomSala, other.NomSala);
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = -4693711428181363078L;
	private int CodSala;
	private String NomSala;
	private int CodCine;
	
	
	
	@Override
	public String toString() {
		return "Sala [CodSala=" + CodSala + ", NomSala=" + NomSala + ", CodCine=" + CodCine + "]";
	}
	public int getCodSala() {
		return CodSala;
	}
	public void setCodSala(int codSala) {
		CodSala = codSala;
	}
	public String getNomSala() {
		return NomSala;
	}
	public void setNomSala(String nomSala) {
		NomSala = nomSala;
	}
	public int getCodCine() {
		return CodCine;
	}
	public void setCodCine(int codCine) {
		CodCine = codCine;
	}
}

