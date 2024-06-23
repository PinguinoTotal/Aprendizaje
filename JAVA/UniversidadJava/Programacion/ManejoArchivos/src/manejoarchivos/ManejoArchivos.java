package manejoarchivos;

import java.io.*;

public class ManejoArchivos {
    public static void crearArchivo(String nombreArchivo){
      File archivo = new File(nombreArchivo); //guardando el archivo en la memoria 
      try {
        PrintWriter salida = new PrintWriter(archivo);
        salida.close(); // cuando cerramos este bloque de codigo 
        //es cuando realmente se crea el archivo y se guarda
        System.out.println("Se ha creado el archivo ");
      } catch (FileNotFoundException e) {
        e.printStackTrace(System.out);
      }
    }

    public static void escirbirArchivo(String nombreArchivo, String contenido){
      File archivo = new File(nombreArchivo);  
      try {
        PrintWriter salida = new PrintWriter(archivo);
        //mandamos nuestra cadena a que se escriba en el archivo que acabamos de crear 
        salida.println(contenido);
        salida.close(); 
        System.out.println("Se ha escrito al archivo ");
      } catch (FileNotFoundException e) {
        e.printStackTrace(System.out);
      }
    }

    public static void anexarArchivo(String nombreArchivo, String contenido){
      File archivo = new File(nombreArchivo);  
      try {
        //con el true de este codigo decimos que se va a hacer append en el codigo
        PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
        salida.println(contenido);
        salida.close(); 
        System.out.println("Se ha anexado informacion al archivo ");
      } catch (FileNotFoundException e) {
        e.printStackTrace(System.out);
      } catch (IOException ex) {
        ex.printStackTrace(System.out);
      }
    }

    public static void leerArchivo(String nombreArchivo){
      var archivo = new File(nombreArchivo);
        try {
            //leer lineas completas del archivo
            var entrada = new BufferedReader(new FileReader(archivo));
            var lectura = entrada.readLine(); //este codigo solo lee una linea de lectura
            //por enede se utiliza un ciclo while apra que se pueda leer todo el texto
            while (lectura != null) {
              System.out.println("lectura = " + lectura);
              lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
          ex.printStackTrace(System.out);
        } catch (IOException ex) {
          ex.printStackTrace(System.out);
        }
    }
}
