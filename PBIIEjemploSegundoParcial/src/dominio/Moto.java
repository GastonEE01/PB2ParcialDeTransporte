package dominio;

public class Moto  extends MedioTransporte{

	private String patente;
	private static final Integer cantidadMaximaDePasajeros = 2;
	private Integer velocidadMaxima;
	private Double latitud;
	private Double longitud;

	public Moto(String patente,Integer velocidadMaxima, Double latitud,Double  longitud) {
		super(patente, cantidadMaximaDePasajeros, velocidadMaxima, latitud, longitud);
		this.patente = patente;
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

	public Integer getCAPACIDA_MAXIMA_DE_PASAJEROS() {
		return this.cantidadMaximaDePasajeros;
	}

	@Override
	public void actualizarCoordenadas(Double nuevaLatitud, Double nuevaLongitud) throws ColitionException {
	    super.actualizarCoordenadas(nuevaLatitud, nuevaLongitud);
	}

	
	@Override
	public String toString() {
		return "Moto [patente=" + patente + ", velocidadMaxima=" + velocidadMaxima + ", latitud=" + latitud
				+ ", longitud=" + longitud + "]";
	}

}
