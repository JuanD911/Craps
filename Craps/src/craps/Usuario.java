package craps;

public class Usuario {

    private int Saldo;

    private String Nombre, Contrase�a;
//--------------CONSTRUCTOR---------
    public Usuario() {
    	Saldo = 100;
    }
//----------SET/GET------------------
    public String getContrase�a() {
        return Contrase�a;
    }

    public void setContrase�a(String Contrase�a) {
        this.Contrase�a = Contrase�a;
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
