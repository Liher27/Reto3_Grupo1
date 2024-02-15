package cinesElorrieta.logica;

public class Session {

	private static Session singletonSesion;
	
	public String code = null;

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
}