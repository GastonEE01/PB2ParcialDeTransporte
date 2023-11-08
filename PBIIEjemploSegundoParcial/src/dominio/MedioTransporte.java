package dominio;

public abstract class MedioTransporte  {

	private String patente;
	private Integer cantidadMaximaDePasajeros;
	private Integer velocidadMaxima;
	private Double latitud;
	private Double longitud;
	private Boolean detectarCoalicion;

	public MedioTransporte(String patente,Integer cantidadMaximaDePasajeros, Integer velocidadMaxima, Double latitud,Double  longitud) {
		this.patente = patente;
		this.cantidadMaximaDePasajeros = cantidadMaximaDePasajeros;
		this.velocidadMaxima = velocidadMaxima;
		this.latitud = latitud;
		this.longitud = longitud;
		this.detectarCoalicion = false;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Integer getCantidadMaximaDePasajeros() {
		return cantidadMaximaDePasajeros;
	}

	public void setCantidadMaximaDePasajeros(Integer cantidadMaximaDePasajeros) {
		this.cantidadMaximaDePasajeros = cantidadMaximaDePasajeros;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public Boolean getDetectarCoalicion() {
		return detectarCoalicion;
	}

   /* public void actualizarCoordenadas(Double nuevaLatitud, Double nuevaLongitud) throws ColitionException {
        if (nuevaLatitud.equals(latitud) && nuevaLongitud.equals(longitud)) {
            detectarCoalicion = true;
            throw new ColitionException("Se detectó una colisión en las coordenadas (" + nuevaLongitud + ", " + nuevaLatitud + ")");
        }

        // Si no hay colisión, actualiza las coordenadas
        latitud = nuevaLatitud;
        longitud = nuevaLongitud;
    }
*/
	
	public void actualizarCoordenadas(Double nuevaLatitud, Double nuevaLongitud) throws ColitionException {
	    
		// Usar una pequeña tolerancia (0.000001) para comparar las coordenadas
	    if (Math.abs(nuevaLatitud - latitud) < 0.000001 && Math.abs(nuevaLongitud - longitud) < 0.000001) {
	        detectarCoalicion = true;
	        throw new ColitionException("Se detectó una colisión en las coordenadas (" + nuevaLongitud + ", " + nuevaLatitud + ")");
	    }

	    // Si no hay colisión, actualiza las coordenadas
	    latitud = nuevaLatitud;
	    longitud = nuevaLongitud;
	}
	

	
	
	
}
