package craps;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Partida {

    private List<Usuario> lstUsuarios = null; //creamos una lista de usuarios 

    private int NumeroJugadores = 0;
//---------COSTRUCTOR-------------
    public Partida() {

        if (lstUsuarios == null) { //validamos si la lista de usuarios en nula 

            lstUsuarios = new ArrayList<>(); //instanciamos  la lista de usuario 

        }

    }
//-------------SET/GET--------------------
    public int getNumeroJugadores() {
        return NumeroJugadores;
    }

    public void setNumeroJugadores(int NumeroJugadores) {
        this.NumeroJugadores = NumeroJugadores;
    }

    public List<Usuario> getLstUsuarios() {
        return lstUsuarios;
    }

    public void addUsuario(Usuario usuario) {
        lstUsuarios.add(usuario);
    }
//----------------METODOS--------------
    public void addUsuario(String nombre, String contra) { //Metodo para agregar usuarios
        Usuario nuevoUsuario = new Usuario();//cremos un objeto tipo usuario 
        nuevoUsuario.setNombre(nombre);
        nuevoUsuario.setContraseña(contra);
        lstUsuarios.add(nuevoUsuario);//agregammos a la lista el usuario    
    }

    public void addUsuario(String nombre, String contra, int Saldo) {//sobre escribimos el metodo agragandole el saldo 
        Usuario nuevoUsuario = new Usuario();//creamos un onheto tipo usuario 
        nuevoUsuario.setNombre(nombre);
        nuevoUsuario.setContraseña(contra);
        nuevoUsuario.setSaldo(Saldo);
        lstUsuarios.add(nuevoUsuario);//agragamos a la lista el usuario 
    }

    public void VerifDatos() { // metodo paraaverificar los datos del usuario 

        for (int i = 0; i < lstUsuarios.size(); i++) { // recorremos la lista con este fro 

            System.out.println("NOMBRE: " + getLstUsuarios().get(i).getNombre() + "\n" + "CONTRASEÃ±A: " + getLstUsuarios().get(i).getContraseña() + "\n" + "SALDO: " + getLstUsuarios().get(i).getSaldo() + "\n");

        }

    }

    public int VerifTiroDadosRonda1(Dado dado1, Dado dado2, int posicionUsuario, int apuestaHecha) { //Metodo para el juego

        int valor1 = dado1.tirarDado();//el valor del primer dado

        int valor2 = dado1.tirarDado();//el valor del segundo dado 

        int suma = valor1 + valor2; 
///---------------VALIDACION DEL NUMERO OBTENIDO AL LANZAR LOS DADOS-------------------- 
        if (suma == 7 || suma == 11) {

            JOptionPane.showMessageDialog(null, "Su valor total es: " + suma + "\nGana esta ronda", "Ronda", JOptionPane.INFORMATION_MESSAGE);
            this.lstUsuarios.get(posicionUsuario).setSaldo(this.lstUsuarios.get(posicionUsuario).getSaldo() + apuestaHecha);//actualizamos el saldo en la lista de usuarios

            return suma;

        } else {

            if (suma == 2 || suma == 3 || suma == 12) {

                JOptionPane.showMessageDialog(null, "Su valor total es: " + suma + "\nPerdio esta ronda", "Ronda", JOptionPane.INFORMATION_MESSAGE);
                this.lstUsuarios.get(posicionUsuario).setSaldo(this.lstUsuarios.get(posicionUsuario).getSaldo() - apuestaHecha);//actualizamos el saldo en la lista de usuarios  

                return suma;

            } else {

                JOptionPane.showMessageDialog(null, "Su valor total es: " + suma + "\nEntra a etapa 2", "Ronda", JOptionPane.INFORMATION_MESSAGE);

                return suma;

            }

        }

    }

    public boolean VerifTiroDadosRonda2(Dado dado1, Dado dado2, int posicionUsuario, int apuestaHecha, int punto, boolean verificador) {

        int valor1 = dado1.tirarDado();//el valor del primer dado

        int valor2 = dado2.tirarDado();//el valor del segundo dado

        int suma = valor1 + valor2;

        if (suma == 7) {

            JOptionPane.showMessageDialog(null, "Su valor total es: " + suma + "\nPerdio esta ronda", "Ronda", JOptionPane.INFORMATION_MESSAGE);
            this.lstUsuarios.get(posicionUsuario).setSaldo(this.lstUsuarios.get(posicionUsuario).getSaldo() - apuestaHecha);//actualizamos el saldo en la lista de usuarios

            return true;

        } else {

            if (suma == punto) {

                JOptionPane.showMessageDialog(null, "Su valor total es: " + suma + "\nGano esta ronda", "Ronda", JOptionPane.INFORMATION_MESSAGE);
                this.lstUsuarios.get(posicionUsuario).setSaldo(this.lstUsuarios.get(posicionUsuario).getSaldo() + apuestaHecha);//actualizamos el saldo en la lista de usuarios

                return true;

            } else {

                JOptionPane.showMessageDialog(null, "Su valor total es: " + suma + "\nSigua tirando", "Ronda", JOptionPane.INFORMATION_MESSAGE);

                return false;
            }

        }

    }

    public void VerificarSaldo(int apuestaHecha, int posicionUsuario) throws SaldoInsuficiente, SaldoCero {//Metodo para verificar el saldo 

        if (lstUsuarios.get(posicionUsuario).getSaldo() == 0) {

            throw new SaldoCero("SALDO NULO -> NO JUEGA");//mensaje de error

        }

        if (apuestaHecha > lstUsuarios.get(posicionUsuario).getSaldo()) {

            throw new SaldoInsuficiente("EXCEDE SALDO"); //mensaje de error

        }

    }
    
    public void VerificarSaldo(int posicionUsuario) throws SaldoCero {//Metodo para verificar el saldo
        
        if (lstUsuarios.get(posicionUsuario).getSaldo() == 0) {

            throw new SaldoCero("SALDO NULO -> NO JUEGA");//mensaje de error

        }
        
    }

}
