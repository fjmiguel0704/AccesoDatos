package ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ApartadoA {
	public static void main(String[] args) {
		
		try {
			String directorio = "C:\\Users\\fjmiguel\\Documents\\2DAM\\AccesoDatos\\Tema2\\Ejercicios_Unidad2";
			String directCreados = "";
			String nombresDirectorios = "";
			
			BufferedReader fichero = new BufferedReader(new FileReader("C:\\Users\\fjmiguel\\Documents\\2DAM\\AccesoDatos\\Tema2\\Ejercicios_Unidad2\\ficheros\\fichero.txt"));
			
			while ((nombresDirectorios = fichero.readLine()) !=null) {
				directCreados = directorio + "\\" + nombresDirectorios;
				boolean exito = (new File (directCreados).mkdirs());
				
				if (exito) {
					System.out.println("Directorios: " + directCreados + " creados");
				} else {
					System.out.println("No se ha podido crear: " + directCreados);
				}
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
