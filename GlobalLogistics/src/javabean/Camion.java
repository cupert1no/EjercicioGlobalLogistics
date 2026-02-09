package javabean;

public class Camion extends Vehiculo {

	private int numeroEjes;
	private static final double CONSUMO_POR_KM = 0.45;
	public Camion(String matricula, double cargaActual, double capacidadMaxima, int numeroEjes) {
		super(matricula, cargaActual, capacidadMaxima);
		this.numeroEjes = numeroEjes;
	}

	@Override
	public double[] obtenerCoordenadas() {
		return new double[] {40.416775, -3.703790 };
	}

	@Override
	public double calculaCombustible(double distancia) {
		return distancia * CONSUMO_POR_KM;
	}

	public int getNumeroEjes() {
		return numeroEjes;
	}

	public void setNumeroEjes(int numeroEjes) {
		this.numeroEjes = numeroEjes;
	}
	
	
	
}
