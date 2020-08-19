package craps;

public class Main {

    public static void main(String[] args) {

        Dado Dado1 = new Dado();
        Dado Dado2 = new Dado();
        Partida nuevaPartida = new Partida();
        Datos gestorDatos = new Datos();
        VistaRegistro vistaRegistro = new VistaRegistro(nuevaPartida,gestorDatos,Dado1,Dado2);

    }

}
