package craps;

public class Main {

    public static void main(String[] args) {

        Dado Dado1 = new Dado();
        Dado Dado2 = new Dado();
        Partida nuevaPartida = new Partida();
        Datos gestorDatos = new Datos();
        Login login = new Login(nuevaPartida,gestorDatos,Dado1,Dado2);

    }

}
