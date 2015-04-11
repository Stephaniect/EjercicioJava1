package ejerciciojava1;

import java.util.*;
import java.io.*;

public class MapaHash {

    public HashMap<String, Integer> convertido(String linea, HashMap<String, Integer> archivoMapa) {
        try {
            String numero[] = linea.split("\\.");
            int aux = Integer.parseInt(numero[0]);
            if (aux == 1) {
                Integer uno = archivoMapa.get("MAL");
                archivoMapa.put("MAL", uno + 1);
            } else if (aux == 2) {
                Integer dos = archivoMapa.get("REGULAR");
                archivoMapa.put("REGULAR", dos + 1);
            } else if (aux == 3) {
                Integer tres = archivoMapa.get("ACEPTABLE");
                archivoMapa.put("ACEPTABLE", tres + 1);
            } else if (aux == 4) {
                Integer cuatro = archivoMapa.get("BUENO");
                archivoMapa.put("BUENO", cuatro + 1);
            } else if (aux == 5) {
                Integer cinco = archivoMapa.get("EXCELENTE");
                archivoMapa.put("EXCELENTE", cinco + 1);
            }
            return archivoMapa;
        } catch (Exception exception) {
            System.out.println("Error Convirtiendo  " + exception.getMessage());
            return null;
        }

    }

    public void imprimir(HashMap<String, Integer> archivoMapa) {
        System.out.println("Resultado de análisis de archivo: Salida.txt");
        Iterator it = archivoMapa.keySet().iterator();
        System.out.println(">> MAL  =>  " + archivoMapa.get("MAL") + " Registros");
        System.out.println(">> REGULAR  =>  " + archivoMapa.get("REGULAR") + " Registros");
        System.out.println(">> ACEPTABLE  =>  " + archivoMapa.get("ACEPTABLE") + " Registros");
        System.out.println(">> BUENO  =>  " + archivoMapa.get("BUENO") + " Registros");
        System.out.println(">> EXCELENTE  =>  " + archivoMapa.get("EXCELENTE") + " Registros");
    }
}
