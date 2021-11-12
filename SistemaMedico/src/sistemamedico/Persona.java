package sistemamedico;

import java.util.Date;

/**
 *
 * @author eli
 */
public class Persona {

	protected String usuario;
	protected String clave;
	protected String nombre;
	protected String apellido;
	protected String direccion;
	protected Date fechaNac;

	public boolean login() {
            return false;
	}

	public boolean logOut() {
            return false;
	}

}