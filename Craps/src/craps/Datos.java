package craps;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Datos {
	
    public void Escribir(String Texto) throws IOException { // Metodo que escribe en un archivo tipo txt

        File tempFile = new File("archivoTexto.txt");
        boolean exists = tempFile.exists(); // Comprobamos si el arhivo existe  

        if (!exists) {

            Escritor escritor = new Escritor();  //creamos un objeto tipo escritor

            escritor.escribeContenido("archivoTexto.txt", Texto); //Llamamos al metodo  escribircontenido de la clase Escritor 

        } else {

            Escritor escritor = new Escritor();  //creamos un objeto tipo escritor

            escritor.añadirContenido("archivoTexto.txt", Texto); //Llamamos al metodo  añadircontenido de la clase Escritor

        }

    }

    public boolean Leer(String nombreRegistrado, String contraRegistrada) { // Metodo que lee  un archivo tipo txt

        boolean verif = false; //creamos un boolean para verificar si existe el usuarioo 

        try {

            Lector lector = new Lector();//creamos un objeto tipo lector

            verif = lector.verificarUsuario("archivoTexto.txt", nombreRegistrado, contraRegistrada); //Llamamos al metodo  VerificarUsuario de la clase Lector

        } catch (FileNotFoundException e) {

            JOptionPane.showMessageDialog(null, "No hay archivo para leer", "Login", JOptionPane.ERROR_MESSAGE);//mostramos mensaje de error

        } catch (IOException ex) {

            JOptionPane.showMessageDialog(null, "Error", "Login", JOptionPane.ERROR_MESSAGE);//mostramos mensaje de error

        }
        return verif;//retornamos el booleano 
    }

    public boolean leerNombreRepetido(String nombreRegistrado) {//Metodo para saber si hay nombres repetidos

        boolean verif = false; //creamos un boolean para verificar si existe el usuarioo 

        try {

            Lector lector = new Lector(); //creamos un objeto tipo lector

            verif = lector.VerificarNombreRepetido("archivoTexto.txt", nombreRegistrado);//Llamamos al metodo  VerificarNombreRepetido de la clase Lector

        } catch (FileNotFoundException e) {

            JOptionPane.showMessageDialog(null, "No hay archivo para leer", "Login", JOptionPane.ERROR_MESSAGE);//mostramos mensaje de error

        } catch (IOException ex) {

            JOptionPane.showMessageDialog(null, "Error", "Login status", JOptionPane.ERROR_MESSAGE);//mostramos mensaje de error

        }
        return verif;//retornamos el booleano 
    }

    public int posicionUsuarioRegistrado(String nombreRegistrado, String contraRegistrada) {// Metodo para obtener la posicion del jugador

        int i = 0; // creamos una variable entrera para guardar la posicion del usuario 

        try {

            Lector lector = new Lector(); //creamos un objeto tipo lector

            i = lector.getPosicionUsuarioRegistrado("archivoTexto.txt", nombreRegistrado, contraRegistrada);//Llamamos al metodo  getPosicionUsuarioRegistrado de la clase Lector 

        } catch (IOException ex) {

            System.out.println("Eror");//mensaje de error

        }

        return i;
    }

    public static void verificarInicioDatosLista(Partida nuevaPartida) {//Metodo para erofocar los  dotos del usuario

        Lector lector = new Lector();//creamos un objeto tipo lector

        try {

            lector.actualizarContenidoLista("archivoTexto.txt", nuevaPartida);//Llamamos al metodo  actualizarContenidoLista de la clase Lector

        } catch (IOException ex) {
        	
        	System.out.println("Error");//mensaje de error
        }

    }

    public static void actualizarArchivoTxt(Partida nuevaPartida) {//Metodo para actualizar el archivo 

        try {

            FileWriter f = new FileWriter("archivoTexto.txt");  
            BufferedWriter bw = new BufferedWriter(f); //creamos un escritor de archivos

            for (int i = 0; i < nuevaPartida.getLstUsuarios().size(); i++) { //creamos un ciclo  para actualizar el archivo txt

                bw.write(nuevaPartida.getLstUsuarios().get(i).getNombre() + "<>" //Actualizamos el nombre
                        + nuevaPartida.getLstUsuarios().get(i).getContraseña() + "<>"//Aactualizamos  la contraseña 
                        + nuevaPartida.getLstUsuarios().get(i).getSaldo() + "<>\n" // Actualizamos el saldo 
                );

            }
            bw.close();//cerramos el escritor 

        } catch (IOException e) {

            System.out.println("Error");//mensaje de error

        }

    }

}
