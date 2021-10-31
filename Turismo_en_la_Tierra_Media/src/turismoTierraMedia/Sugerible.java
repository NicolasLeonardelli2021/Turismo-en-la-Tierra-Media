package turismoTierraMedia;

import java.util.List;
import enumeracion.TipoAtraccion;

public interface Sugerible {

	public String nombreAtraccion();
	
	public boolean esPromo();
	
	public Atraccion tipoAtraccion();
	
	public double cuantoCuesta();
	
	public double duracionAtraccion();
	
	public boolean hayCupo();
	
	public void ocuparCupoAtraccion(); 
	
	public List<TipoAtraccion> getListaTiposAtraccion();
	
}
