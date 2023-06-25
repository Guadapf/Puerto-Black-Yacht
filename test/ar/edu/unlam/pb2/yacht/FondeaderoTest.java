package ar.edu.unlam.pb2.yacht;

import static org.junit.Assert.*;

import org.junit.Test;

public class FondeaderoTest {

	@Test
	public void queSePuedaAmarrarElYate() throws NoAmarrasDisponiblesException {
		Yate yate = new Motor("AZ1", "Adres Borgeat", 18.87, 5.15, 119.0, 37, 5500.0, 5959, "2 × motores diésel MAN RK2805", 9000, 23.0, 6500.0);
		Fondeadero fon = new Fondeadero(5);
		
		fon.amarrarYate(yate);
		
		assertEquals(1, fon.obtenerCantidadDeYatesAmarrados(), 0.01);
	}
	
	@Test (expected = NoAmarrasDisponiblesException.class)
	public void queTireExcepcionAlIntentarAmarrarElYate() throws Exception{
		Fondeadero fon = new Fondeadero(5);
		
		for(Integer i=0; i<6;i++) {
			Yate yate = new Vela("XXR", "Sebastián Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85.0, 133.0);
			fon.amarrarYate(yate);
		}
	}
	
	@Test
	public void queSeDesamarreElYate() throws NoAmarrasDisponiblesException {
		Yate yate = new Motor("AZ1", "Adres Borgeat", 18.87, 5.15, 119.0, 37, 5500.0, 5959, "2 × motores diésel MAN RK2805", 9000, 23.0, 6500.0);
		Fondeadero fon = new Fondeadero(5);
		
		fon.amarrarYate(yate);
		fon.desamarrarYate(yate);
		
		assertEquals(0, fon.obtenerCantidadDeYatesAmarrados(), 0.01);
	}
	
	@Test
	public void queSeDevuelvaElTotalDeYatesAmarrados() throws NoAmarrasDisponiblesException {
		Fondeadero fon = new Fondeadero(5);
		
		for(Integer i=0;i<3;i++) {
			Yate yate = new Motor("AZ1", "Adres Borgeat", 18.87, 5.15, 119.0, 37, 5500.0, 5959, "2 × motores diésel MAN RK2805", 9000, 23.0, 6500.0);
			fon.amarrarYate(yate);
		}
		
		Integer valorEsperado = 3;
		Integer valorObtenido = fon.obtenerCantidadDeYatesAmarrados();
		assertEquals(valorEsperado, valorObtenido, 0.01);
	}
	
	@Test
	public void queSeObtengaLaCantidadDeAmarrasDisponibles() throws NoAmarrasDisponiblesException{
		Yate yate = new Vela("XXR", "Sebastián Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85.0, 133.0);
		Fondeadero fon = new Fondeadero(5);
		
		fon.amarrarYate(yate);
		
		Integer valorEsperado = 4;
		Integer valorObtenido = fon.obtenerCantidadDeAmarrasDisponibles();
		
		assertEquals(valorEsperado, valorObtenido, 0.01);
	}
	
	@Test
	public void queSeObtengaElPrecioDelAmarre() {
		Yate yate = new Vela("XXR", "Sebastián Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85.0, 133.0);
		Fondeadero fon = new Fondeadero(5);
		
		Double valorEsperado = 11000.0;
		Double valorObtenido = fon.obtenerPrecioDeAmarre(yate);
		
		assertEquals(valorEsperado, valorObtenido, 0.01);
	}
	
	@Test
	public void queSeObtengaLaRecaudacionTotal() throws NoAmarrasDisponiblesException {
		Yate yateV = new Vela("XXR", "Sebastián Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85.0, 133.0);
		Yate yateM = new Motor("AZ1", "Adres Borgeat", 18.87, 5.15, 119.0, 37, 5500.0, 5959, "2 × motores diésel MAN RK2805", 9000, 23.0, 6500.0);
		Fondeadero fon = new Fondeadero(5);
		
		fon.amarrarYate(yateM);
		fon.amarrarYate(yateV);
		
		Double valorEsperado = 24000.0;
		Double valorObtenido = fon.obtenerRecaudacionTotal();
		
		assertEquals(valorEsperado, valorObtenido, 0.01);
	}

}
