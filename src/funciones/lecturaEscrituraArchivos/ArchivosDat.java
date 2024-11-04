package funciones.lecturaEscrituraArchivos;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class ArchivosDat {
	
	private static File file;
	
	public static void fitxategiakSortu() {
		file = new File("file.dat");
	}
	
	public static void guardarFile(String user, String pass) {
        try (FileOutputStream finout = new FileOutputStream(file, false); // Abrir en modo de escritura (vaciar contenido) si quieres añadir datos, cambia a true
             DataOutputStream fit = new DataOutputStream(finout)) {

            // Escribir los datos en el formato "user;pass"
            String datos = user + ";" + pass;
            fit.writeUTF(datos); // Escribe

        } catch (IOException e) {
            e.printStackTrace(); // Manejo de excepciones
        }
    }

	public static String[] leerFile() {
	    String[] datos = new String[2];
	    try (BufferedReader buffer = new BufferedReader(new FileReader(file))) {
	        String line = buffer.readLine(); // Leer la primera línea
	        if (line != null) {
	            System.out.println(line);
	            // Separar usando el delimitador ";" y limpiar espacios
	            String[] partes = line.split(";");
	            if (partes.length >= 2) {
	                datos[0] = partes[0].trim(); // Eliminar espacios en blanco
	                datos[1] = partes[1].trim(); // Eliminar espacios en blanco

	                // Eliminar símbolos no deseados (solo dejar letras, números y algunos caracteres permitidos)
	                datos[0] = datos[0].replaceAll("[^\\w.-]", ""); // Solo letras, números, guiones y puntos
	                datos[1] = datos[1].replaceAll("[^\\w.-]", ""); // Solo letras, números, guiones y puntos
	            }
	        }
	    } catch (IOException e) {
	        e.printStackTrace(); // Manejo de excepciones
	    }
	    return datos;
	}
	
}
