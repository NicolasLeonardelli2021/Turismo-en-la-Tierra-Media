package promocion;


import java.util.List;

import enumeracion.TipoAtraccion;
import turismoTierraMedia.Atraccion;

public class PromoAbsoluta extends Promocion{
private Double costo = 36.0;
	
	public PromoAbsoluta( String nombre,List<Atraccion> misPromos, TipoAtraccion tipoDePromocion) {
		super(nombre, misPromos, tipoDePromocion);
		
	}
	
	protected Double getCosto() {
		return costo;
	}
	
}
