package lector;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import enumeracion.TipoAtraccion;
import turismoTierraMedia.Atraccion;


public class LectorAtraccion {

	public List<Atraccion> crearAtraccion() throws SQLException {
		List<Atraccion> atracciones = new ArrayList<Atraccion>();
		
		String url = "jdbc:sqlite:C:\\Users\\Nico\\git\\TP01_TurismoEnTierraMedia1\\TurismoEnTierraMedia_TP01_AP/baseDatos.db";
		Connection coneccion  = DriverManager.getConnection(url);
		
		String sql = "SELECT nombre,costo, tiempo, cupo,tipo From Atraccion a join Tipo t on a.tipo_id = t.id";
		PreparedStatement statement = coneccion.prepareStatement(sql);
		
		ResultSet resultados = statement.executeQuery();
		
				while(resultados.next()) {
					//int id = resultados.getInt("id");
					String nombre = resultados.getString("nombre");
					TipoAtraccion tipo = TipoAtraccion.valueOf(resultados.getString("tipo"));
					double costo = resultados.getDouble("costo");
					double tiempo = resultados.getDouble("tiempo");
					int cupo = resultados.getInt("cupo");
					
					atracciones.add(new Atraccion(tipo,nombre,costo,tiempo,cupo));
				}
				
				
			
		
				
		return atracciones;
	}
		
}
