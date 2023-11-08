package dominio;

public class Bicicleta extends MedioTransporte{


	private Double latitud;
	private Double longitud;

	public Bicicleta(Double latitud, Double longitud) {
		super(null, null, null, latitud, longitud);
		this.latitud = latitud;
		this.longitud = longitud;
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

}
