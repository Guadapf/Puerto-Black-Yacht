package ar.edu.unlam.pb2.yacht;

public class NoAmarrasDisponiblesException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public NoAmarrasDisponiblesException(String mensaje) {
		super(mensaje);
	}

}
