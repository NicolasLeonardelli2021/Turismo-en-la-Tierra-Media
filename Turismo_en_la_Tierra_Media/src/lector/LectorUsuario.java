package lector;

import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import enumeracion.TipoAtraccion;
import turismoTierraMedia.Usuario;

public class LectorUsuario {

	
	public List<Usuario> leerUsuario() throws SQLException {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		String url = "jdbc:sqlite:C:\\Users\\Nico\\git\\TP01_TurismoEnTierraMedia1\\TurismoEnTierraMedia_TP01_AP/baseDatos.db";
		Connection coneccion  = DriverManager.getConnection(url);
		
		String sql = "SELECT nombre,tipo as preferencia,presupuesto,tiempo From Usuario u join Tipo t on u.preferencia = t.id";
		PreparedStatement statement = coneccion.prepareStatement(sql);
		
		ResultSet resultados = statement.executeQuery();
		
				while(resultados.next()) {
					//int id = resultados.getInt("id");
					String nombre = resultados.getString("nombre");
					TipoAtraccion preferencia = TipoAtraccion.valueOf(resultados.getString("preferencia"));
					double presupuesto = resultados.getDouble("presupuesto");
					double tiempo = resultados.getDouble("tiempo");
					
					usuarios.add(new Usuario(preferencia,nombre,presupuesto,tiempo));
				}
				
				
			
		
				
		return usuarios;
	}
}

	
