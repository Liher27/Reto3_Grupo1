package cinesElorrieta.logica;

import cinesElorrieta.vista.complementos.PanelDeBienvenida;
import cinesElorrieta.vista.complementos.PanelDeCines;
import cinesElorrieta.vista.complementos.PanelDePeliculas;
import cinesElorrieta.vista.complementos.PanelDeSesion;
import cinesElorrieta.vista.complementos.PanelDeLogin;
import cinesElorrieta.vista.complementos.PanelDeResumen;
import cinesElorrieta.vista.complementos.PanelDeRegistro;

public class Session {

	private static Session singletonSesion;
	
	public String code = null;

	public PanelDeBienvenida panelDeBienvenida = null;
	public PanelDeCines panelDeCines = null;
	public PanelDePeliculas panelDePeliculas = null;
	public PanelDeSesion panelDeSesion = null;
	public PanelDeLogin panelDeLogin = null;
	public PanelDeResumen panelDeResumen = null;
	public PanelDeRegistro PanelDeRegistro = null;
	// Una por panel

	public static Session getInstance() {
		if (null == singletonSesion) {
			singletonSesion = new Session();
		}
		return singletonSesion;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public PanelDeCines getPanelDeCines() {
		return panelDeCines;
	}

	public void setPanelDeCines(PanelDeCines panelDeCines) {
		this.panelDeCines = panelDeCines;
	}

	public PanelDeBienvenida getPanelDeBienvenida() {
		return panelDeBienvenida;
	}

	public void setPanelDeBienvenida(PanelDeBienvenida panelDeBienvenida) {
		this.panelDeBienvenida = panelDeBienvenida;
	}

	public PanelDePeliculas getPanelDePeliculas() {
		return panelDePeliculas;
	}

	public void setPanelDePeliculas(PanelDePeliculas panelDePeliculas) {
		this.panelDePeliculas = panelDePeliculas;
	}

	public PanelDeSesion getPanelDeSesion() {
		return panelDeSesion;
	}

	public void setPanelDeSesion(PanelDeSesion panelDeSesion) {
		this.panelDeSesion = panelDeSesion;
	}

	public PanelDeLogin getPanelDeLogin() {
		return panelDeLogin;
	}

	public void setPanelDeLogin(PanelDeLogin panelDeLogin) {
		this.panelDeLogin = panelDeLogin;
	}

	public PanelDeResumen getPanelDeResumen() {
		return panelDeResumen;
	}

	public void setPanelDeResumen(PanelDeResumen panelDeResumen) {
		this.panelDeResumen = panelDeResumen;
	}

	public PanelDeRegistro getPanelDeRegistro() {
		return PanelDeRegistro;
	}

	public void setPanelDeRegistro(PanelDeRegistro panelDeRegistro) {
		PanelDeRegistro = panelDeRegistro;
	}

	
}
