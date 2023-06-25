package ar.edu.unlam.pb2.yacht;

import java.util.LinkedList;

public class Fondeadero {
	
	private Integer cantMaxAmarras;
	private LinkedList<Yate> yatesAmarrados= new LinkedList<Yate>();
	private Double recaudacionTotal;
	
	public Fondeadero(Integer cantMaxAmarras) {
		this.cantMaxAmarras = cantMaxAmarras;
		this.recaudacionTotal = 0.0;
	}
	
	public void amarrarYate(Yate yate) throws NoAmarrasDisponiblesException{
		if(this.yatesAmarrados.size() < this.cantMaxAmarras) {
			this.yatesAmarrados.add(yate);
			this.recaudacionTotal += yate.obtenerPrecioAmarra();
		}else {
			throw new NoAmarrasDisponiblesException("No hay amarras disponibles");
		}
	}
	
	public void desamarrarYate(Yate yate) {
		this.yatesAmarrados.remove(yate);
		this.recaudacionTotal -= yate.obtenerPrecioAmarra();
	}
	
	public Integer obtenerCantidadDeYatesAmarrados() {
		return this.yatesAmarrados.size();
	}
	
	public Integer obtenerCantidadDeAmarrasDisponibles(){
		return (this.cantMaxAmarras - this.yatesAmarrados.size());
	}
	
	public Double obtenerPrecioDeAmarre(Yate yate) {
		return yate.obtenerPrecioAmarra();
	}
	
	public Double obtenerRecaudacionTotal() {
		return this.recaudacionTotal;
	}

}
