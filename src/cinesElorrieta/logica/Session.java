package cinesElorrieta.logica;

import cinesElorrieta.vista.complementos.*;

/**
 * El singleton que nos permita conseguir los varaibles de otro panel y hacer
 * cambio de paneles
 */
public class Session {

	private PanelDeBienvenida panelDeBienvenida = null;
	private PanelDeCines panelDeCines = null;
	private PanelDePeliculas panelDePeliculas = null;
	private PanelDeSesion panelDeSesion = null;
	private PanelDeLogin panelDeLogin = null;
	private PanelDeRegistro panelDeRegistro = null;

	private PanelDeResumen panelDeResumen = null;
	private PanelDeTicket panelDeTicket = null;

	private static Session singletonSesion;
	/**
	 * codigo de pelicula
	 */
	public String code = null;

	/**
	 * Utilizar este metodo para iniciarlizar y nos devuelve el contenido que lleva
	 * 
	 * @return singletonSesion
	 */
	public static Session getInstance() {
		if (null == singletonSesion) {
			singletonSesion = new Session();
		}
		return singletonSesion;
	}

	/**
	 * obtiene panelDeBienvenida
	 * 
	 * @return panelDeBienvenida
	 */
	public PanelDeBienvenida getPanelDeBienvenida() {
		return panelDeBienvenida;
	}

	/**
	 * setaer panelDeBienvenida
	 * 
	 * @param panelDeBienvenida panelDeBienvenida
	 */
	public void setPanelDeBienvenida(PanelDeBienvenida panelDeBienvenida) {
		this.panelDeBienvenida = panelDeBienvenida;
	}

	/**
	 * obtiene panelDeCines
	 * 
	 * @return panelDeCines
	 */
	public PanelDeCines getPanelDeCines() {
		return panelDeCines;
	}

	/**
	 * setaer panelDeCines
	 * 
	 * @param panelDeCines panelDeCines
	 */
	public void setPanelDeCines(PanelDeCines panelDeCines) {
		this.panelDeCines = panelDeCines;
	}

	/**
	 * obtiene panelDePeliculas
	 * 
	 * @return panelDePeliculas
	 */
	public PanelDePeliculas getPanelDePeliculas() {
		return panelDePeliculas;
	}

	/**
	 * setaer panelDePeliculas
	 * 
	 * @param panelDePeliculas panelDePeliculas
	 */
	public void setPanelDePeliculas(PanelDePeliculas panelDePeliculas) {
		this.panelDePeliculas = panelDePeliculas;
	}

	/**
	 * obtiene panelDeSesion
	 * 
	 * @return panelDeSesion
	 */
	public PanelDeSesion getPanelDeSesion() {
		return panelDeSesion;
	}

	/**
	 * setaer panelDeSesion
	 * 
	 * @param panelDeSesion panelDeSesion
	 */
	public void setPanelDeSesion(PanelDeSesion panelDeSesion) {
		this.panelDeSesion = panelDeSesion;
	}

	/**
	 * obtiene panelDeLogin
	 * 
	 * @return panelDeLogin
	 */
	public PanelDeLogin getPanelDeLogin() {
		return panelDeLogin;
	}

	/**
	 * setaer panelDeLogin
	 * 
	 * @param panelDeLogin panelDeLogin
	 */
	public void setPanelDeLogin(PanelDeLogin panelDeLogin) {
		this.panelDeLogin = panelDeLogin;
	}

	/**
	 * obtiene panelDeRegistro
	 * 
	 * @return panelDeRegistro
	 */
	public PanelDeRegistro getPanelDeRegistro() {
		return panelDeRegistro;
	}

	/**
	 * setaer panelDeRegistro
	 * 
	 * @param panelDeRegistro panelDeRegistro
	 */
	public void setPanelDeRegistro(PanelDeRegistro panelDeRegistro) {
		this.panelDeRegistro = panelDeRegistro;
	}

	/**
	 * obtiene panelDeResumen
	 * 
	 * @return panelDeResumen
	 */
	public PanelDeResumen getPanelDeResumen() {
		return panelDeResumen;
	}

	/**
	 * setaer panelDeResumen
	 * 
	 * @param panelDeResumen panelDeResumen
	 */
	public void setPanelDeResumen(PanelDeResumen panelDeResumen) {
		this.panelDeResumen = panelDeResumen;
	}

	/**
	 * obtiene panelDeTicket
	 * 
	 * @return panelDeTicket
	 */
	public PanelDeTicket getPanelDeTicket() {
		return panelDeTicket;
	}

	/**
	 * setaer panelDeTicket
	 * 
	 * @param panelDeTicket panelDeTicket
	 */
	public void setPanelDeTicket(PanelDeTicket panelDeTicket) {
		this.panelDeTicket = panelDeTicket;
	}
}