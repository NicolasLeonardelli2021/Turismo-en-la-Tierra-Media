package promocion;


import java.util.List;

import enumeracion.TipoAtraccion;
import turismoTierraMedia.Atraccion;


public abstract class Promocion {
	protected String nombre;
	protected List<Atraccion> misPromo;
	protected final double duracionPromedio;
	protected final TipoAtraccion tipoDePromocion;
	
	
	public Promocion(String nombre,List<Atraccion> misPromo, TipoAtraccion tipoDePromocion) {
		//super();
		this.nombre = nombre;
		this.misPromo = misPromo;
		this.duracionPromedio = this.setDuracion();
		this.tipoDePromocion = tipoDePromocion;
		
		
	}

	protected double setDuracion() {
		double duracionTotal = 0.0;
		for(int i = 0; i <= misPromo.size()-1; i++) {
			duracionTotal+= misPromo.get(i).getTiempoDuracion();
		}
		
		return duracionTotal;
	}
	
	

	protected String getNombre() {
		return nombre;
	}


	protected double getDuracionPromedio() {
		return duracionPromedio;
	}

	protected TipoAtraccion getTipoDePromocion() {
		return tipoDePromocion;
	}

	@Override
	public String toString() {
		return "--" + this.nombre + ", Duracion Promedio=" + this.duracionPromedio + ", tipo De Promocion="
				+ tipoDePromocion + "\n INCLUYE: " + misPromo ;
	} 
	
	
}
