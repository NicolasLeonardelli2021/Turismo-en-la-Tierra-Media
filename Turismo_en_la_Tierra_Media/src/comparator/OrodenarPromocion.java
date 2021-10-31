package comparator;

import java.util.Comparator;

import enumeracion.TipoAtraccion;
import turismoTierraMedia.Usuario;

public class OrodenarPromocion implements Comparator <Sugerencia> {

	private TipoAtraccion tipo;
	
	public OrodenarPromocion(Usuario usuario) {
		this.tipo= tipo;
	}
	
	public int compare(Sugerencia s1, Sugerencia s2) {
		
		if (s1.tipoSugerecia == this.tipo && s2.tipoSugerecia == this.tipo) {
			if (s1.esPromo() && s2.esPromo()){
				return compararPromo(s1, s2);
			}
		}else if(s1.tipoSugerecia != this.tipo && s2.tipoSugerecia != this.tipo) {
			if (s1.esPromo() && s2.esPromo()) {
				return comparar(s1, s2);
			}else if(!s1.esPromo() && !s2.esPromo()){}
				return comparar(s1, s2);
			}else {
				return -Boolean.compare(s1.esPromo(), s2.esPromo());
			}
		}else {
			if(s1.tipoSugerecia == this.tipo) return -1;
			return 1;
		}
	
	
	public int compararPromo(Sugerencia s1, Sugerencia s2) {
		if (s1.esPromo() && s2.esPromo()) {
			return comparar(s1, s2);
		}else {
			return -Boolean.compare(s1.esPromo(), s2.esPromo());
		}
	}
	
	
	public int comparar(Sugerencia s1, Sugerencia s2) {
		if (Integer.compare(s1.costoSugerencia, s2.costoSugerencia) == 0) {
			return -Integer.compare(s1.tiempoSugerencia, s2.tiempoSugerencia);
		}else {
			return -Integer.compare(s1.costoSugerecia, s2.costoSugerecia);
		}
	}
	
}
*/
