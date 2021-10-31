package itinerario;

import java.util.ArrayList;

import turismoTierraMedia.Atraccion;

public class Itinerario {

	private ArrayList<Atraccion> visitas;  
	private double costoTotal;
	private double tiempoTotal;
	
	public Itinerario(ArrayList<Atraccion> visitas, double costoTotal, double tiempoTotal) {
		this.visitas = visitas;
		this.costoTotal = this.setCosto(visitas);
		this.tiempoTotal = this.setTiempo(visitas);
	}

	@Override
	public String toString() {
		return "Itinerario [ " + this.visitas + "Costo Total: " + this.costoTotal + " de oro, Tiempo Total: " + this.tiempoTotal + "]";
	}
	
	private double setCosto(ArrayList<Atraccion> visitas) {
		double costoTotal = 0;
		
		//falta completar
		
		return costoTotal;
	}
	
	
	private double setTiempo(ArrayList<Atraccion> visitas) {
		double tiempoTotal = 0;
		
		//falta completar
		
		return tiempoTotal;		
	}

	
	
	
	
}
