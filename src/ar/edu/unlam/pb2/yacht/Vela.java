package ar.edu.unlam.pb2.yacht;

public class Vela extends Yate{
	
	private Double alturaMastil;
	private Double supVelicaMayor;
	private Double superficieTotal;

	public Vela(String nombre, String duenio, Double manga, Double calado, Double eslora, Integer tripulacion,
			Double peso, Double alturaMastil, Double supVelicaMayor, Double superficieTotal) {
		super(nombre, duenio, manga, calado, eslora, tripulacion, peso);
		this.alturaMastil = alturaMastil;
		this.supVelicaMayor = supVelicaMayor;
		this.superficieTotal = superficieTotal;
	}
	
	@Override
	protected Double obtenerPrecioAmarra() {
		if(this.eslora <= 20) {
			return 11000.0;
		}else {
			return 12000.0;
		}
	}
	

}
