package turismoTierraMedia;

import enumeracion.TipoAtraccion;

public class Usuario {

	private TipoAtraccion atraccionPreferida;
	private String nombreUsuario;
	private double presupuesto;
	private double tiempoDisponible;
	
	public Usuario(TipoAtraccion atraccionPreferida, String nombreUsuario, double presupuesto, double tiempoDisponible) {
		this.atraccionPreferida = atraccionPreferida;
		this.nombreUsuario = nombreUsuario;
		this.presupuesto = presupuesto;
		this.tiempoDisponible = tiempoDisponible;
	}
	
	public String getNombre() {
		return this.nombreUsuario;
	}
	public TipoAtraccion getAtraccionPreferida() {
		return this.atraccionPreferida;
	}
	
	public double getPresupuesto() {
		return this.presupuesto;
	}
	
	public double getTiempoDisponible() {
		return this.tiempoDisponible;
	}
	
	public boolean estaBienPrecio(double costo) {
		return costo <= presupuesto;
	}
	
	public boolean estaBienDuracion(double tiempoDuracion) {
		return tiempoDuracion <= tiempoDisponible;
	}
	
	public boolean estaBienAtracciones(TipoAtraccion tiposAtraccion) {
		return tiposAtraccion.contains(getAtraccionPreferida());
	}
	
	
	@Override
	public String toString() {
		return "Usuario [atraccionPreferida=" + atraccionPreferida + ", nombreUsuario=" + nombreUsuario
				+ ", presupuesto=" + presupuesto + ", tiempoDisponible=" + tiempoDisponible + "]";
	}

	
	
	
}
