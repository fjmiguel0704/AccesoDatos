package ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

public class Tarea1_2 {
	public static void main(String[] args) {
		String lineaFichero = "";
		String palabrasFichero = "";
		
		try {
			BufferedReader leerFichero = new BufferedReader(new FileReader("src\\ejercicios\\ahorcado.txt"));

			while ((lineaFichero = leerFichero.readLine()) != null) {
				for (int i = 0; i<=lineaFichero.length(); i++) {
					palabrasFichero = lineaFichero.substring(i, i+5);
					i+=4;
					File newFile = new File("ficheros\\ahorcadoOrdenado.txt");
					BufferedWriter bw = new BufferedWriter(new FileWriter(newFile, true));
					bw.write(palabrasFichero + "\n");
					bw.flush();
				}
			}

				
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}