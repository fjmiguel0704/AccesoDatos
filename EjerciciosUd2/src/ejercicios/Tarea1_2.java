package ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

public class Tarea1_2 {
	public static void main(String[] args) {
		String lineaFicheroAhorcadoOrdenado = "";
		String palabrasFicheroAhorcadoOrdenado = "";
		
		try {
			BufferedReader leerFicheroAhorcado = new BufferedReader(new FileReader("src\\ejercicios\\ahorcado.txt"));
			lineaFicheroAhorcadoOrdenado = leerFicheroAhorcado.readLine();
			
			File newFileAhorcadoOrdenado = new File("ficheros\\ahorcadoOrdenado.txt");
			
				for (int i = 0; i<=lineaFicheroAhorcadoOrdenado.length(); i+=5) {
					palabrasFicheroAhorcadoOrdenado = lineaFicheroAhorcadoOrdenado.substring(i, i+5);				
					BufferedWriter bw = new BufferedWriter(new FileWriter(newFileAhorcadoOrdenado, true));
					bw.write(palabrasFicheroAhorcadoOrdenado + "\n");
					bw.flush();
				}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}