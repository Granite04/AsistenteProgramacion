package funciones.lecturaEscrituraArchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ArchivosExeJar {
	
	// Método para obtener la ruta del directorio donde se encuentra el .jar o el .exe
    public static String obtenerDirectorioActual() {
        String rutaDirectorio = null;
        try {
            // Obtiene la ubicación del archivo .jar o .exe
            String rutaArchivo = ArchivosExeJar.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
            
            // Si la aplicación se ejecuta desde un archivo .jar
            if (rutaArchivo.endsWith(".jar")) {
                rutaDirectorio = new File(rutaArchivo).getParentFile().getPath();
            }
            // Si la aplicación se ejecuta desde un archivo .exe
            else if (rutaArchivo.endsWith(".exe")) {
                rutaDirectorio = new File(rutaArchivo).getParent();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rutaDirectorio;
    }
	
 // Función para crear un archivo en el directorio actual
    public static void crearArchivo(String nombreArchivo) {
        try {
            String rutaDirectorio = ArchivosExeJar.obtenerDirectorioActual();
            File archivo = new File(rutaDirectorio, nombreArchivo);
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe.");
                JOptionPane.showMessageDialog(null, "El archivo ya existe", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al crear el archivo.");
            e.printStackTrace();
        }
    }

    // Función para escribir en un archivo en el directorio actual
    public static void escribirArchivo(String nombreArchivo, String contenido) {
        try {
            String rutaDirectorio = ArchivosExeJar.obtenerDirectorioActual();
            FileWriter escritor = new FileWriter(new File(rutaDirectorio, nombreArchivo));
            escritor.write(contenido);
            escritor.close();
            System.out.println("Se escribió en el archivo correctamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo.");
            e.printStackTrace();
        }
    }

    // Función para leer desde un archivo en el directorio actual
    public static void leerArchivo(String nombreArchivo) {
        try {
            String rutaDirectorio = ArchivosExeJar.obtenerDirectorioActual();
            BufferedReader lector = new BufferedReader(new FileReader(new File(rutaDirectorio, nombreArchivo)));
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
            lector.close();
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo.");
            e.printStackTrace();
        }
    }

    // Función para borrar un archivo en el directorio actual
    public static void borrarArchivo(String nombreArchivo) {
        try {
            String rutaDirectorio = ArchivosExeJar.obtenerDirectorioActual();
            File archivo = new File(rutaDirectorio, nombreArchivo);
            if (archivo.delete()) {
                System.out.println("El archivo ha sido borrado.");
            } else {
                System.out.println("No se pudo borrar el archivo.");
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al borrar el archivo.");
            e.printStackTrace();
        }
    }
	
}
