package package1;
import java.util.Scanner;

public abstract class clase_logica {
    
    Scanner entrada = new Scanner(System.in);
    String nombre, nombrelimpio, apellido, apellidolimpio;
    
    public void Datos(){
    
    System.out.println(" Dame el nombre de la persona: ");
    nombre = entrada.nextLine();
    
    System.out.println(" Dame su apellido: ");
    apellido = entrada.nextLine();
    
    nombrelimpio = nombre.toLowerCase().trim();
    nombrelimpio = nombrelimpio.substring(0, 1);
    
    apellidolimpio = apellido.toLowerCase().trim();
    
    Funcion();
    
   }    

           public abstract void Funcion();
}
