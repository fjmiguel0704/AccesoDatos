package ejercicios;

import java.io.RandomAccessFile;

public class Tarea1_2c2 {

	public static void main(String[] args) {
		String ficheroA = "..\\EjerciciosUd2\\ficheros\\ficheroA.txt";
		String ficheroEA = "..\\EjerciciosUd2\\ficheros\\ficheroEA.txt";
		String caracter;
		
		try {
			RandomAccessFile fileA = new RandomAccessFile(ficheroA, "r");
			RandomAccessFile fileEA = new RandomAccessFile(ficheroEA, "rw");
			
			
			for (int i = (int) fileA.length()-3; i>=0; i-=3) {
				fileA.seek(i);
				caracter = fileA.readLine();
				fileEA.writeBytes(caracter + "\n");
			}
			
			fileA.close();
			fileEA.close();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}