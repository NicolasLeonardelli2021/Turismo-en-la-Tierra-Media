package turismoTierraMedia;

import enumeracion.TipoAtraccion;

public class Atraccion implements Comparable<Atraccion>{

	private TipoAtraccion tipoAtraccion;
	private String nombreAtraccion;
	private double costo;
	private double tiempoDuracion;
	private int cupoDisponible;
	
	public Atraccion(TipoAtraccion tipoAtraccion, String nombreAtraccion, double costo, double tiempoDuracion, int cupoDisponible) {
		this.tipoAtraccion = tipoAtraccion;
		this.nombreAtraccion = nombreAtraccion;
		this.costo = costo;
		this.tiempoDuracion = tiempoDuracion;
		this.cupoDisponible = cupoDisponible;
	}
	
	public TipoAtraccion getTipoAtraccion() {
		return this.tipoAtraccion;
	}
	
	public double getTiempoDuracion() {
		return this.tiempoDuracion;
	}
	
	public int getCupoDisponible() {
		return this.cupoDisponible;
	}
	
		public void ocuparCupoAtraccion() {
		this.cupoDisponible--;
	}
	
	
	public double getcosto() {
		return this.costo;
	}
	
	
	public boolean hayCupo() {
		return this.cupoDisponible > 0;
	}
	
	public String nombreAtraccion() {
		return this.nombreAtraccion;
	}

	public boolean esPromo() {
		return false;
	}
	
	@Override
	public String toString() {
		return "\n * " +nombreAtraccion ;
	}

	@Override
	public int compareTo(Atraccion o) {
		if (this.costo > o.getcosto()) {
            return -1;
        }
        if (this.costo < o.getcosto()) {
            return 1;
        }
        
		return 0;
	}
	
	
}
