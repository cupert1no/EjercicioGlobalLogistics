package javabean;

public abstract class Vehiculo implements Geolocalizable {
	
	private final String matricula;
	private double cargaActual;
	private double capacidadMaxima;
	private static int contadorFlota = 0;
	
	
	public Vehiculo(String matricula, double cargaActual, double capacidadMaxima) {
		super();
		
		if (matricula == null || !matricula.matches("^[A-Z]{4}[0-9]{3}$")) {
            throw new IllegalArgumentException("Formato de matrícula inválido. Use 4 letras y 3 números (Ej: ABCD123).");
        }
		
		this.matricula = matricula;
		this.cargaActual = 0;
		this.capacidadMaxima = capacidadMaxima;
		
		contadorFlota++;
	}
	
	
	public abstract double calculaCombustible(double distancia);


	public double getCargaActual() {
		return cargaActual;
	}


	public void setCargaActual(double cargaActual) {
		this.cargaActual = cargaActual;
	}


	public double getCapacidadMaxima() {
		return capacidadMaxima;
	}


	public void setCapacidadMaxima(double capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}


	public static int getContadorFlota() {
		return contadorFlota;
	}

	public String getMatricula() {
		return matricula;
	}
	
	

}
