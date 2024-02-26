
package cinesElorrieta.bbdd;

import java.io.Serializable;

/**
 * El pojo del Sala. obtiene los datos de la tabla Sala
 * 
 */

public class Sala implements Serializable {

	private static final long serialVersionUID = -4693711428181363078L;
	private int CodSala = 0;
	private String NomSala = null;
	private Cine cine = null;

	@Override
	public String toString() {
		return "Sala [CodSala=" + CodSala + ", NomSala=" + NomSala + ", cine=" + cine + "]";
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

	public Cine getCine() {
		return cine;
	}

	public void setCine(Cine cine) {
		this.cine = cine;
	}

}
