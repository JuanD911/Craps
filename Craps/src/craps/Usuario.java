package craps;

public class Usuario {

    private int Saldo;

    private String Nombre, Contraseña;
//--------------CONSTRUCTOR---------
    public Usuario() {
    	Saldo = 100;
    }
//----------SET/GET------------------
    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

}
