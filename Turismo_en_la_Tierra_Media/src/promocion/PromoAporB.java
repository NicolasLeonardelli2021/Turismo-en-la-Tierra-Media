package promocion;

import java.util.List;

import enumeracion.TipoAtraccion;
import turismoTierraMedia.Atraccion;

public class PromoAporB extends Promocion {
	
	private Double costo;
	
	public PromoAporB( String nombre,List<Atraccion> misPromos, TipoAtraccion tipoDePromocion) {
		super(nombre, misPromos, tipoDePromocion);
		this.costo = this.setCosto(12.0);
	}
	
	
	
	public double setCosto(Double descuento) {
		double costo = 0;	
		for(int i = 0; i < super.misPromo.size(); i++) {
			costo+= super.misPromo.get(i).getcosto();
		}
				
		return (costo - descuento);
	}
	protected Double getCosto() {
		return costo;
	}
	
}