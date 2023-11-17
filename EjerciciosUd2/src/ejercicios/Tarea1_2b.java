package ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Tarea1_2b {

	public static void main(String[] args) {
		String linea = "";
		ArrayList<String> ahorcadoOrdenadoAlfabeticamente = new ArrayList<String>();
		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("ficheros\\ahorcadoOrdenado.txt"));
			
			File newFileAhorcadoOrdenadoAlfabeticamente = new File("ficheros\\ahorcadoOrdenadoAscendente.txt");
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(newFileAhorcadoOrdenadoAlfabeticamente, false));
			
			while ((linea = br.readLine())!=null) {
				ahorcadoOrdenadoAlfabeticamente.add(linea);
			}
			
			ahorcadoOrdenadoAlfabeticamente.sort(null);
			
			for (String palabras : ahorcadoOrdenadoAlfabeticamente) {
				bw.write(palabras + "\n");
				bw.flush();
			}
			
			br.close();
			bw.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
