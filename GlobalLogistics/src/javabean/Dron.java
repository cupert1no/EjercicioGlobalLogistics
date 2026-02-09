package javabean;

public class Dron extends Vehiculo implements Geolocalizable {

	private static final double CONSUMO_BATERIA_BASE = 0.05;

	public Dron(String matricula, double cargaActual, double capacidadMaxima) {
		super(matricula, cargaActual, capacidadMaxima);
		
	}
	
	@Override
	public double[] obtenerCoordenadas() {
		return new double[] {73.0123, -2.6042 };
	}

	@Override
	public double calculaCombustible(double distancia) {
		double consumoReal = CONSUMO_BATERIA_BASE;
		
		if(this.getCargaActual() > (this.getCapacidadMaxima()/2)) {
			consumoReal = CONSUMO_BATERIA_BASE * 2;
		}
		
		return distancia * consumoReal;
	}
	
}
