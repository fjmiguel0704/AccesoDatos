package ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Tarea1_2b {

	public static void main(String[] args) {
		String lineaFicheroAhorcadoOrdenadoAscendente = "";
		String palabrasFicheroAhorcadoOrdenadoAscendente = "";
		
		
		try {
			BufferedReader leerFicheroAhorcadoOrdenado = new BufferedReader(new FileReader("ficheros\\ahorcadoOrdenado.txt"));
			lineaFicheroAhorcadoOrdenadoAscendente = leerFicheroAhorcadoOrdenado.readLine();
			
			File newFileAhorcadoOrdenadoAscendente = new File("ficheros\\ahorcadoOrdenadoAscendente.txt");
			
			while ((lineaFicheroAhorcadoOrdenadoAscendente = leerFicheroAhorcadoOrdenado.readLine())!=null) {
				
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
