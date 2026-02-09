package javabean;

public interface Geolocalizable {
	
	double[] obtenerCoordenadas();
	
	default void imprimirUbicacion() {
        double[] coords = obtenerCoordenadas();
        System.out.println("Ubicación actual: Latitud " + coords[0] + ", Longitud " + coords[1]);
    }

}
