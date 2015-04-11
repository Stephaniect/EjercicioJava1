package ejerciciojava1;

import java.util.*;
import java.io.*;

public class EjercicioJava1 {

    public int uno = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0;

    public static void main(String[] args) {
        try {
            File archivo;
            FileReader leer;
            BufferedReader bfleer;
            String linea;
            MapaHash mapa = new MapaHash();
            HashMap<String, Integer> archivoMapa = new HashMap<String, Integer>();
            Scanner sc = new Scanner(System.in);
            archivoMapa.put("MAL", 0);
            archivoMapa.put("REGULAR", 0);
            archivoMapa.put("ACEPTABLE", 0);
            archivoMapa.put("BUENO", 0);
            archivoMapa.put("EXCELENTE", 0);
            System.out.println("¡Buen Dia! , Escriba la ruta del archivo : ");
            String ruta = sc.nextLine();         
            archivo = new File(ruta);
            if (archivo.exists()){
            leer = new FileReader(archivo);
            bfleer = new BufferedReader(leer);
            while ((linea = bfleer.readLine()) != null) {
                archivoMapa = mapa.convertido(linea, archivoMapa);
            }
            mapa.imprimir(archivoMapa);    
            }else
                 throw new Exception("El archivo no existe o la ruta no es correcta");
                        
        } catch (Exception exception) {
            System.out.println("Error " + exception.getMessage());
        }
    }

}
