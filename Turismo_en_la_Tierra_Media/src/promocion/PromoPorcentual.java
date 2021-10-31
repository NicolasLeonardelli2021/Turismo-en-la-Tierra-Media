package promocion;


import java.util.List;

import enumeracion.TipoAtraccion;
import turismoTierraMedia.Atraccion;

public class PromoPorcentual extends Promocion{
	private Double costo;
	
	public PromoPorcentual( String nombre,List<Atraccion> misPromos, TipoAtraccion tipoDePromocion) {
		super(nombre, misPromos, tipoDePromocion);
		this.costo = setCosto();
	}
	
	
	
	public double setCosto() {
		double costo = 0;	
		for(int i = 0; i < super.misPromo.size(); i++) {
			costo+= super.misPromo.get(i).getcosto();
		}	
				
		return (costo - costo * 0.20);
	}


	protected Double getCosto() {
		return costo;
	}
	
	
}

