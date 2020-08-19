package craps;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Escritor {

    public static void escribeContenido(String archivoTexto, String texto) throws FileNotFoundException, IOException {//Metodo para esccribir en un archivo txt

        FileWriter f = new FileWriter(archivoTexto);
        BufferedWriter bw = new BufferedWriter(f);
        bw.write(texto + '\n'); //a�ade el texto
        bw.close();

    }

    public static void a�adirContenido(String archivoTexto, String texto) throws FileNotFoundException, IOException {//Metodo para a�adir contenido en un archivo txt

        FileWriter f = new FileWriter(archivoTexto, true);
        BufferedWriter bw = new BufferedWriter(f);
        bw.write(texto);//a�ade el texto
        bw.write('\n');
        bw.close();

    }
}
