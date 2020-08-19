package craps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lector {

    public static boolean verificarUsuario(String archivoTexto, String nombreRegistrado, String contraRegistrada) throws FileNotFoundException, IOException { // Metodo para verificar si el Usuario esta en el archivo
        boolean verificador = false; //creamos un booleano 
        String cadena;
        String[] cadena_split; // creamos un areglo tipo string 
        FileReader f = new FileReader(archivoTexto);
        BufferedReader b = new BufferedReader(f);
        while ((cadena = b.readLine()) != null) {//leer al archivo hasta la ultima linea 

            cadena_split = cadena.split("<>");

            if (nombreRegistrado.equals(cadena_split[0].toString()) && contraRegistrada.equals(cadena_split[1].toString())) {//validamos si se encuantra en el archivo 

                verificador = true;// es verdadero por que encontro al usuario  
                break;//rompemos  el ciclo

            } else {

                verificador = false; // es falso si no se encuentra el usuario 

            }

        }
        b.close();//cerramos el lector 
        return verificador; // retornamos el boolean 
    }

    public static boolean VerificarNombreRepetido(String archivoTexto, String nombreRegistrado) throws FileNotFoundException, IOException { //metodo que verifica si el nombre ya existe 
        boolean verificador = false; //creamos un boolean
        String cadena;
        String[] cadena_split; //creamos un arreglo 
        FileReader f = new FileReader(archivoTexto);
        BufferedReader b = new BufferedReader(f);
        while ((cadena = b.readLine()) != null) {//leer al archivo hasta la ultima linea

            cadena_split = cadena.split("<>");

            if (nombreRegistrado.equals(cadena_split[0].toString())) {//validamos si el nombre se encuantra en el archivo 

                verificador = true; //es verdadero por que encontro el nombre  
                break;

            } else {

                verificador = false;//es falso por que no encontro el nombre 

            }

        }
        b.close();//cerramos el lector 
        return verificador;// retornamos el boolean
    }

    public static int getPosicionUsuarioRegistrado(String archivoTexto, String nombreRegistrado, String contraRegistrada) throws FileNotFoundException, IOException {//Metodo para encontrar la posicion del usuario 
        int i = 0;//creamos una variable para guardar la posicion del usuario 
        String cadena;
        String[] cadena_split;//creamos un arreglo 
        FileReader f = new FileReader(archivoTexto);
        BufferedReader b = new BufferedReader(f);
        while ((cadena = b.readLine()) != null) {//leer al archivo hasta la ultima linea

            cadena_split = cadena.split("<>");

            if (nombreRegistrado.equals(cadena_split[0].toString()) && contraRegistrada.equals(cadena_split[1].toString())) {

                break;//Rompemos el ciclo cuando encuentre el usuario 

            } else {

                i++;//sumamos cada ves que no encuentre al usuario 

            }

        }
        b.close();
        return i;//retornamos la posicion 
    }

    public static void actualizarContenidoLista(String archivoTexto, Partida nuevaPartida) throws FileNotFoundException, IOException {//Metodo para actualizar el contenido 
        String cadena;
        String[] cadena_split;
        FileReader f = new FileReader(archivoTexto);
        BufferedReader b = new BufferedReader(f);
        while ((cadena = b.readLine()) != null) {//leer al archivo hasta la ultima linea

            cadena_split = cadena.split("<>");

            nuevaPartida.addUsuario(cadena_split[0], cadena_split[1], Integer.parseInt(cadena_split[2])); //Llamos al metodo addUsuario de la clase partida 
            
        }
        b.close(); //cerramos el lector 
    }

}
