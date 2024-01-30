package cinesElorrieta.modelo;

import java.io.Serializable;
import java.util.Objects;

public class Cine implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2701966326573605601L;
	private int CodCine;
	private String NomCine;
	private String DirCine;
	public int getCodCine() {
		return CodCine;
	}
	public void setCodCine(int codCine) {
		CodCine = codCine;
	}
	public String getNomCine() {
		return NomCine;
	}
	public void setNomCine(String nomCine) {
		NomCine = nomCine;
	}
	@Override
	public int hashCode() {
		return Objects.hash(CodCine, DirCine, NomCine);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cine other = (Cine) obj;
		return Objects.equals(CodCine, other.CodCine) && Objects.equals(DirCine, other.DirCine)
				&& Objects.equals(NomCine, other.NomCine);
	}
	@Override
	public String toString() {
		return "Cine [CodCine=" + CodCine + ", NomCine=" + NomCine + ", DirCine=" + DirCine + "]";
	}
	public String getDirCine() {
		return DirCine;
	}
	public void setDirCine(String dirCine) {
		DirCine = dirCine;
	}
}
