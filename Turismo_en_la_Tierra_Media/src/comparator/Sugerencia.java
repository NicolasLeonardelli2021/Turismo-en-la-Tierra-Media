package comparator;

import java.util.ArrayList;
import java.util.List;
import turismoTierraMedia.Usuario;

public class Sugerencia {

	private List<Sugerencia> promociones;
	private String tipoSugerencia;
	private double tiempoSugerencia;
	private double costoSugerencia;
	
	public Sugerencia(List<Sugerencia> promociones, String tipoSugerencia, double tiempoSugerencia, double costoSugerencia) {
		this.promociones = promociones;
		this.tipoSugerencia = tipoSugerencia;
		this.tiempoSugerencia = tiempoSugerencia;
		this.costoSugerencia = costoSugerencia;
	}
	
	public List<Sugerencia> getSugerencias(Usuario usuario){
		List<Sugerencia> sugerencias = new ArrayList<Sugerencia>();
		
		for (Sugerencia sugerencia : this.promociones) {
			if(usuario.estaBienPrecio(usuario.getPresupuesto()) && usuario.estaBienDuracion(usuario.getTiempoDisponible()) && usuario.estaBienAtracciones(usuario.getAtraccionPreferida())){
				sugerencias.add(sugerencia);
		}
	}
		return sugerencias;
	}
	
	public boolean esPromo() {
		return false;
	}

	
}