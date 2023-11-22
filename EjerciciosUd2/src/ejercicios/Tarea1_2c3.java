package ejercicios;

import java.io.RandomAccessFile;

public class Tarea1_2c3 {

	public static void main(String[] args) {
		String ficheroA = "..\\EjerciciosUd2\\ficheros\\ficheroA.txt";
		String ficheroEANumeros = "..\\EjerciciosUd2\\ficheros\\ficheroEANumeros.txt";
		String caracter;
		
		try {
			RandomAccessFile fileA = new RandomAccessFile(ficheroA, "r");
			RandomAccessFile fileEANumber = new RandomAccessFile(ficheroEANumeros, "rw");
			
			
			for (int i = (int) fileA.length()-4; i>=0; i-=4) {
				fileA.seek(i);
				caracter = fileA.readLine();
				fileEANumber.writeBytes(caracter + "\n");
			}
			
			fileA.close();
			fileEANumber.close();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
