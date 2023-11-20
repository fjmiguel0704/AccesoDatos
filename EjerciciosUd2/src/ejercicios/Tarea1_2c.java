package ejercicios;

import java.io.RandomAccessFile;

public class Tarea1_2c {

	public static void main(String[] args) {
		String ficheroA = "..\\EjerciciosUd2\\ficheros\\ficheroA.txt";
		String ficheroVariasA = "..\\EjerciciosUd2\\ficheros\\ficheroVariasA.txt";
		String caracter;

		try {
			RandomAccessFile fileA = new RandomAccessFile(ficheroA, "r");
			RandomAccessFile fileVariousA = new RandomAccessFile(ficheroVariasA, "rw");
			
			fileA.seek(0);
			caracter = fileA.readLine();
			
			for (int i = 0; i<5; i++) {
				fileVariousA.writeBytes(caracter);
			}
			
			fileA.close();
			fileVariousA.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}