package cinesElorrieta.logica;

import cinesElorrieta.vista.complementos.*;

public class Session {

	private PanelDeBienvenida panelDeBienvenida = null;
	private PanelDeCines panelDeCines = null;
	private PanelDePeliculas panelDePeliculas = null;
	private PanelDeSesion panelDeSesion = null;
	private PanelDeLogin panelDeLogin = null;
	private PanelDeRegistro panelDeRegistro = null;
	private PanelDeResumen panelDeResumen = null;

	private static Session singletonSesion;

	public String code = null;

	public static Session getInstance() {
		if (null == singletonSesion) {
			singletonSesion = new Session();
		}
		return singletonSesion;
	}

	public PanelDeBienvenida getPanelDeBienvenida() {
		return panelDeBienvenida;
	}

	public void setPanelDeBienvenida(PanelDeBienvenida panelDeBienvenida) {
		this.panelDeBienvenida = panelDeBienvenida;
	}

	public PanelDeCines getPanelDeCines() {
		return panelDeCines;
	}

	public void setPanelDeCines(PanelDeCines panelDeCines) {
		this.panelDeCines = panelDeCines;
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

	public PanelDeRegistro getPanelDeRegistro() {
		return panelDeRegistro;
	}

	public void setPanelDeRegistro(PanelDeRegistro panelDeRegistro) {
		this.panelDeRegistro = panelDeRegistro;
	}

	public PanelDeResumen getPanelDeResumen() {
		return panelDeResumen;
	}

	public void setPanelDeResumen(PanelDeResumen panelDeResumen) {
		this.panelDeResumen = panelDeResumen;
	}
}