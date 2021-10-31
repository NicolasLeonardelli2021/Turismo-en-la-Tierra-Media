package comparator;

import java.util.List;

public class Promo extends Sugerencia{

	public Promo(List<Sugerencia> promociones, String tipoSugerencia, double tiempoSugerencia, double costoSugerencia) {
		super(promociones, tipoSugerencia, tiempoSugerencia, costoSugerencia);
		
	}
	
	public boolean esPromo() {
		return true;
	}
	
	
}
