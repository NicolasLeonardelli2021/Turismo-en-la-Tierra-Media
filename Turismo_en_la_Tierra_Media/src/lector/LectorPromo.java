package lector;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;

import enumeracion.TipoAtraccion;
import promocion.PromoAbsoluta;
import promocion.PromoAporB;
import promocion.PromoPorcentual;
import promocion.Promocion;
import turismoTierraMedia.Atraccion;

public class LectorPromo {
		
	public List<Promocion> crearPromociones() throws SQLException {
		List<Promocion> promociones = new ArrayList<Promocion>();
		//List<LectorPromo> promo = new ArrayList<LectorPromo>();
		List<Atraccion> porcentual = new ArrayList<Atraccion>();
		List<Atraccion> absoluta = new ArrayList<Atraccion>();
		List<Atraccion> axb = new ArrayList<Atraccion>();
		
		String url = "jdbc:sqlite:C:\\Users\\Nico\\git\\TP01_TurismoEnTierraMedia1\\TurismoEnTierraMedia_TP01_AP/baseDatos.db";
		Connection coneccion  = DriverManager.getConnection(url);
		
		String sql = "Select p.nombre as nombrePromo,p.tipo as tipoPromo, a.nombre as nombreAtraccion, a.costo,a.tiempo,a.cupo,t.tipo From Promociones p join Pack_Promo pp on p.id = pp.promo join atraccion a on pp.atraccion = a.id join Tipo t on a.tipo_id = t.id";
		PreparedStatement statement = coneccion.prepareStatement(sql);
		
		ResultSet resultados = statement.executeQuery();
		
				while(resultados.next()) {
					
					String tipoPromo = resultados.getString("tipoPromo");
					TipoAtraccion tipo = TipoAtraccion.valueOf(resultados.getString("tipo"));
					Atraccion atraccion =  new Atraccion(tipo,resultados.getString("nombreAtraccion"),resultados.getDouble("costo"),
														resultados.getDouble("tiempo"),resultados.getInt("cupo"));
				
						switch(tipoPromo) {
						case "PORCENTUAL": 
							porcentual.add(atraccion);
						break;
						case "ABSOLUTA":
							absoluta.add(atraccion);
						break;
						case "AXB":
							axb.add(atraccion);
						break;
						}
				}
							promociones.add(new PromoPorcentual("pack Aventura",porcentual,TipoAtraccion.AVENTURA));
							promociones.add(new PromoAporB("pack Paisaje",axb,TipoAtraccion.PAISAJE));
							promociones.add(new PromoAbsoluta("pack Degustacion",absoluta,TipoAtraccion.DEGUSTACION));
							
		
		return promociones;
	}

	
}
		

