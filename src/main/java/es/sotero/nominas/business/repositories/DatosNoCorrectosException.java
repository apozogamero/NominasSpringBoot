package es.sotero.nominas.business.repositories;

public class DatosNoCorrectosException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public DatosNoCorrectosException(String msg) {
		super(msg);
	}
}
