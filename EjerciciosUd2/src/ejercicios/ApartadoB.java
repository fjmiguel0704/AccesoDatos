package ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ApartadoB {
	public static void main(String[] args) {
		try {
			String directorio = "C:\\Users\\fjmiguel\\Documents\\2DAM\\AccesoDatos\\Tema2\\Ejercicios_Unidad2";
			String rutaCarpeta = "";
			String lineaFichero = "";	
			String nombresDirectorios = "";
			
			BufferedReader fichero = new BufferedReader(new FileReader("C:\\Users\\fjmiguel\\Documents\\2DAM\\AccesoDatos\\Tema2\\Ejercicios_Unidad2\\ficheros\\fichero.txt"));
			
			while ((lineaFichero = fichero.readLine()) !=null) {
				nombresDirectorios=lineaFichero.trim();
				
				rutaCarpeta = directorio + "\\" + nombresDirectorios;
				
				String htmlEstructura = "";
				htmlEstructura+= "<html>" + "\n";
				htmlEstructura+= "<head>" + "\n";
				htmlEstructura+= "<title>" + nombresDirectorios + "</title>" + "\n";
				htmlEstructura+= "</head>" + "\n";
				htmlEstructura+= "<body>" + "\n";
				htmlEstructura+= "<h1>" + rutaCarpeta + "</h1>" + "\n";
				htmlEstructura+= "<h3>" + "Autor: Fernando José" + "</h3>" + "\n";
				htmlEstructura+= "</body>" + "\n";
				htmlEstructura+= "</html>";
				
				File ficheroHtml = new File(rutaCarpeta + "\\index.html");
				FileWriter bw = new FileWriter(ficheroHtml, false);
				
				bw.write(htmlEstructura);
				bw.close();

			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
