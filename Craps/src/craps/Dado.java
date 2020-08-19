package craps;

import java.util.ArrayList;
import java.util.List;

public class Dado {
//--------COSTRUTOR
    public Dado() {

        Cara Cara1 = new Cara();  // Creamos objetos tipo cara 
        Cara Cara2 = new Cara();
        Cara Cara3 = new Cara();
        Cara Cara4 = new Cara();
        Cara Cara5 = new Cara();
        Cara Cara6 = new Cara();

        Cara1.setValue(1);  // la asignamos  valores al objeto cara  
        Cara2.setValue(2);
        Cara3.setValue(3);
        Cara4.setValue(4);
        Cara5.setValue(5);
        Cara6.setValue(6);

        Caras.add(Cara1);  //Agragamos las caras 
        Caras.add(Cara2);
        Caras.add(Cara3);
        Caras.add(Cara4);
        Caras.add(Cara5);
        Caras.add(Cara6);

    }

    private List<Cara> Caras = new ArrayList(); // Creamos un arreglo con el valor de las caras 
    
    public int tirarDado(){
        
        int max = 6;
        int min = 1;
        int range = max - min + 1;

        int rand = (int) (Math.random() * range) + min;//Codigo que muestra un numero aleatorio de 1-6
        
        return rand; //retorna un numero aleatoria del 1-6
        
    }

}
