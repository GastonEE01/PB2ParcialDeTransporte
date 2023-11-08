package dominio;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Mapa {

	private String localidad;
	private Set <MedioTransporte> medioTransportes;
	private Integer cantidadDeVehiculos;
	
	public Mapa(String localidad) {
		this.localidad = localidad;
		this.medioTransportes = new HashSet<MedioTransporte>();
		this.cantidadDeVehiculos = 0;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Set<MedioTransporte> getMedioTransportes() {
		return medioTransportes;
	}

	public void setMedioTransportes(Set<MedioTransporte> medioTransportes) {
		this.medioTransportes = medioTransportes;
	}

	public void agregarVehiculo(MedioTransporte medioTransporte) {
	    if(medioTransporte instanceof Auto || medioTransporte instanceof Moto || medioTransporte instanceof  Bicicleta || medioTransporte instanceof Tren) {
	        this.medioTransportes.add(medioTransporte);
	        this.cantidadDeVehiculos++;
	    }
	}

	/*public boolean verCoordenadasSiSonIguales(MedioTransporte medioTransporte) {
		MedioTransporte auto = null;
		for(MedioTransporte coordenadas : this.medioTransportes) {
			if(coordenadas instanceof Auto) {
				auto = coordenadas;
				if(coordenadas.getLatitud().equals(auto.getLatitud()) || coordenadas.getLongitud().equals(auto.getLongitud())) {	
					return true;
				}
			}
	    }
		return false;

	}
	*/
	
	public boolean verCoordenadasSiSonIguales(MedioTransporte medioTransporte) {
	    MedioTransporte auto = null;
	    for(MedioTransporte coordenadas : this.medioTransportes) {
	        System.out.println("Tipo de medio de transporte: " + coordenadas.getClass().getSimpleName());
	        if(coordenadas instanceof Auto || coordenadas instanceof Moto) {
	            auto = coordenadas;
	            System.out.println("Comparando coordenadas: (" + coordenadas.getLatitud() + ", " + coordenadas.getLongitud() + ") con las de Auto: (" + auto.getLatitud() + ", " + auto.getLongitud() + ")");
	        }
	    }
	    return false;
	}

	
	public Integer getCantidadDeVehiculos() {
		return cantidadDeVehiculos;
	}

	public void setCantidadDeVehiculos(Integer cantidadDeVehiculos) {
		this.cantidadDeVehiculos = cantidadDeVehiculos;
	}

	public boolean hayCoalicion() throws ColitionException {
		for(MedioTransporte medios : this.medioTransportes) {
			if(medios.getDetectarCoalicion()) {
	            throw new ColitionException("Si hay coalicion ");
			}
		}
		return false;
	}


	
	

}
