package turismoTierraMedia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java.util.Scanner;

import comparator.Sugerencia;

import lector.LectorAtraccion;
import lector.LectorPromo;
import lector.LectorUsuario;
import promocion.Promocion;
import java.io.IOException;

public class Parque {
	
	private static List<Usuario> usuarios;
	private static List<Sugerencia> sugerencias = new ArrayList<Sugerencia>();
	private static List<Atraccion> atracciones = new ArrayList<Atraccion>();
	private static List<Promocion> promos = new ArrayList<Promocion>();

	public static void main(String[] args) throws SQLException {
		Scanner leer = new Scanner(System.in);
		Parque parque = new Parque();
		
		LectorUsuario lector = new LectorUsuario();
		usuarios = lector.leerUsuario();
		
		LectorAtraccion lectorA = new LectorAtraccion();
		atracciones = lectorA.crearAtraccion();
		
		LectorPromo lectorB = new LectorPromo();
		promos = lectorB.crearPromociones();
		
		
		//LectorPr
		// TITULO
		
		System.out.println("TURISMO EN LA TIERRA MEDIA");
		
		// MENU 1
		
		int opcion = 1;
		while(opcion != 0) {
			System.out.println("Elija un usuario");
			for(int i = 1; i<= usuarios.size();i++){
				System.out.println("("+i+")" + usuarios.get(i-1).getNombre());
			}
			
		System.out.println("(0) Salir");	
		opcion= leer.nextInt();
		
		// MENU 2
		
		int opcion2 = 1;
		while (opcion2 != 0 && opcion !=0) {
			System.out.println("USUARIO: " + usuarios.get(opcion - 1).getNombre() + " | ATRACCIO PREFERIDA: "
					+ usuarios.get(opcion -1).getAtraccionPreferida()+ " | PRESUPUESTO: " + usuarios.get(opcion -1).getPresupuesto()
					+ " | TIEMPO DISPONIBLE: " + usuarios.get(opcion -1).getTiempoDisponible());
			
			System.out.println("PROMOCIONES ");
			for(int i = 1; i<= promos.size();i++){
				System.out.println("("+i+")" + promos.get(i-1).toString());
						
			}
			
			
			
			System.out.println("Elija una Atraccion");
			
			List<Atraccion> lstAtraccion = atracciones;
	        Collections.sort(lstAtraccion);
	        
	        for(int i = 1; i<= lstAtraccion.size();i++){
				System.out.println("("+i+")" + lstAtraccion.get(i-1).nombreAtraccion()
								+"---" +" $ " + lstAtraccion.get(i-1).getcosto()
								+"---" + lstAtraccion.get(i-1).getTiempoDuracion() + "hs"
								+"---" + lstAtraccion.get(i-1).getCupoDisponible() + "Cupos");
			}
	        
	        opcion2 = leer.nextInt();
		}
		
		}
		
		
		
		
	}
}

