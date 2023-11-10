package ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;

public class Tarea1_2 {
	public static void main(String[] args) {
		String lineaFichero = "";
		String palabrasFichero = "";
		int posInicioPalabra = 0;
		int posFinalPalabra = 5;
		
		try {
			BufferedReader leerFichero = new BufferedReader(new FileReader("src\\ejercicios\\ahorcado.txt"));

			while ((lineaFichero = leerFichero.readLine()) != null) {
				for (int i = 0; i<=lineaFichero.length(); i++) {
					
				}
			}
			
			System.out.println(palabrasFichero);
				
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}