package package1;
import java.util.Scanner;

public abstract class class1 {
    
    Scanner entrada = new Scanner(System.in);
    int aleatorio = 0;
    int tester = 0;
    int TF = 0;
    
    
    public void Número(){
    aleatorio = (int) (Math.random()* 100 + 1);

    System.out.println("¿ Desea probar random o consecutivo? ");
    System.out.println(" 1. Random ");
    System.out.println(" 2. Consecutivo ");
    TF = entrada.nextInt();
    
    switch(TF){
        
        case 1:
 
            Random mensajero1 = new Random();
            mensajero1.Averiguar();
            break;
            
         case 2:
 
            Consecutivo mensajero2 = new Consecutivo();
            mensajero2.Averiguar();
            break;
            
         default:
             System.out.println(" La opción sleccionada es invalida ");
        
    }
    }
    
    public abstract void Averiguar();
    
    
}
