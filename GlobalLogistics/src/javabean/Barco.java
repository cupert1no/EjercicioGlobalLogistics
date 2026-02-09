package javabean;

public class Barco extends Vehiculo implements Geolocalizable {

	private static final double CONSUMO_POR_KM = 200.0;

	public Barco(String matricula, double cargaActual, double capacidadMaxima) {
		super(matricula, cargaActual, capacidadMaxima);
		
	}
	
	@Override
	public double[] obtenerCoordenadas() {
		return new double[] {36.0123, -5.6042 };
	}

	@Override
	public double calculaCombustible(double distancia) {
		return distancia * CONSUMO_POR_KM;
	}
	
	
}
