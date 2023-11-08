package dominio;

public class Tren  extends MedioTransporte{

	

	private Integer cantidadDeVagones;
	private Integer cantidadDePasajeros;
	private Double longitud;
	private Double latitud;
	private Integer velocidadMaxima;
	
	
	public Tren(Integer cantidadDeVagones, Integer cantidadDePasajeros, Integer velocidadMaxima, Double latitud, Double longitud) {
		super(null, cantidadDePasajeros, velocidadMaxima, latitud, longitud);	
		this.cantidadDeVagones = cantidadDeVagones;
		this.cantidadDePasajeros = cantidadDePasajeros;
		this.velocidadMaxima = velocidadMaxima;
		this.longitud = longitud;
		this.latitud = latitud;
		
	}

	public Integer getCantidadDeVagones() {
		return cantidadDeVagones;
	}

	public void setCantidadDeVagones(Integer cantidadDeVagones) {
		this.cantidadDeVagones = cantidadDeVagones;
	}

	public Integer getCantidadDePasajeros() {
		return cantidadDePasajeros;
	}

	public void setCantidadDePasajeros(Integer cantidadDePasajeros) {
		this.cantidadDePasajeros = cantidadDePasajeros;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}


}
