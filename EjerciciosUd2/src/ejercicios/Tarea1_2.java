package ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;

public class Tarea1_2 {
	public static void main(String[] args) {
		String lineaFichero = "";
		String palabrasFichero = "";
		int posInicioPalabra = 0;
		int posFinalPalabra = 5;
		String longitudFichero = "";
		
		try {
			BufferedReader leerFichero = new BufferedReader(new FileReader("src\\ejercicios\\ahorcado.txt"));
			lineaFichero = leerFichero.readLine();
			longitudFichero = lineaFichero;
			System.out.println(longitudFichero.length());
			while ((lineaFichero = leerFichero.readLine()) != null &&posFinalPalabra!=longitudFichero.length()) {
				palabrasFichero += lineaFichero + "\n";
				palabrasFichero = palabrasFichero.substring(posInicioPalabra, posFinalPalabra);
				posInicioPalabra+=5;
				posFinalPalabra+=5;
			}
			
			System.out.println(palabrasFichero);
				
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
