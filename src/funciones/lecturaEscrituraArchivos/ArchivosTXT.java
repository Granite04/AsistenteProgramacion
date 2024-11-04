package funciones.lecturaEscrituraArchivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivosTXT {

	// Método para escribir y leer objetos en un archivo
	public static void main(String[] args) {
		// Crear algunos objetos Persona y agregarlos a un ArrayList
		ArrayList<Object> objetosLeidas = leerDeArchivo("personas.txt");
		if (!objetosLeidas.isEmpty()) {
			System.out.println("Personas leídas del archivo:");
			for (Object objeto : objetosLeidas) {
				System.out.println(objeto);
			}
		} else {
			System.out.println("No se pudieron leer personas del archivo.");
		}
		ArrayList<Object> personas = new ArrayList<>();
		personas.add(new Object());
		personas.add(new Object());
		personas.add(new Object());

		// Escribir el ArrayList de Persona en el archivo
		escribirEnArchivo("objetos.txt", objetosLeidas);

		System.out.println("Array personasLeidas: " + objetosLeidas);
		System.out.println("Array personas: " + personas);
	}

	@SuppressWarnings("unused")
	public static void escribirEnArchivo(String nombreArchivo, ArrayList<Object> objetos) {
		try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo))) {
			for (Object objeto : objetos) {
				escritor.write("objeto.getNombre() + ',' + objeto.getEdad()");
				escritor.newLine();
			}
			System.out.println("Personas escritas en el archivo " + nombreArchivo + " con éxito.");
		} catch (IOException e) {
			System.err.println("Error al escribir en el archivo: " + e.getMessage());
		}
	}

	@SuppressWarnings("unused")
	public static ArrayList<Object> leerDeArchivo(String nombreArchivo) {
		ArrayList<Object> personas = new ArrayList<>();
		try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
			String linea;
			while ((linea = lector.readLine()) != null) {
				String[] datos = linea.split(",");
				String dato1 = datos[0];
				int dato2 = Integer.parseInt(datos[1]);
				personas.add(new Object());
			}
		} catch (IOException e) {
			System.err.println("Error al leer el archivo: " + e.getMessage());
		}
		return personas;
	}

}
