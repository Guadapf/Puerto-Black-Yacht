package ar.edu.unlam.pb2.yacht;

public class Motor extends Yate{
	
	private Integer desplazamiento;
	private String propulsion;
	private Integer potencia;
	private Double velocidad;
	private Double autonomia;

	public Motor(String nombre, String duenio, Double manga, Double calado, Double eslora, Integer tripulacion,
			Double peso, Integer desplazamiento, String propulsion, Integer potencia, Double velocidad, Double autonomia) {
		super(nombre, duenio, manga, calado, eslora, tripulacion, peso);
		this.desplazamiento = desplazamiento;
		this.propulsion = propulsion;
		this.potencia = potencia;
		this.velocidad = velocidad;
		this.autonomia = autonomia;
	}

	@Override
	protected Double obtenerPrecioAmarra() {
		if(this.eslora <= 20) {
			return 11000.0;
		}else {
			return 13000.0;
		}
	}
	
	

}
