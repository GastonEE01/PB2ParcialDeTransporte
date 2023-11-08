package dominio;

public class Auto extends MedioTransporte{

	private String patente;
	private Integer cantidadMaximaDePasajeros;
	private Integer velocidadMaxima;
	private Double latitud;
	private Double longitud;
	
	public Auto(String patente, Integer cantidadMaximaDePasajeros, Integer velocidadMaxima, Double latitud,
			Double longitud) {
		super(patente, cantidadMaximaDePasajeros, velocidadMaxima, latitud, longitud);
		this.patente = patente;
		this.cantidadMaximaDePasajeros = cantidadMaximaDePasajeros;
		this.velocidadMaxima = velocidadMaxima;
		this.latitud = latitud;
		this.longitud = longitud;
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


	@Override
	public String toString() {
		return "Auto [patente=" + patente + ", cantidadMaximaDePasajeros=" + cantidadMaximaDePasajeros
				+ ", velocidadMaxima=" + velocidadMaxima + ", latitud=" + latitud + ", longitud=" + longitud + "]";
	}


	@Override
	public void actualizarCoordenadas(Double nuevaLatitud, Double nuevaLongitud) throws ColitionException {
		super.actualizarCoordenadas(nuevaLatitud, nuevaLongitud);
	}


	
  
}
