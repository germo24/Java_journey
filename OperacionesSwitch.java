import java.util.Scanner;

public class OperacionesSwitch{
  public static void main(String args[]){
   
   int numerouno = 0;
   int numerodos = 0;   
   Scanner In = new Scanner(System.in);
   int opciones = 0;
   int resultado = 0; 

   System.out.println(" Vas a seleccionar 2 numeros y luego la operacion que deseas realizar ");
 System.out.println("");
    System.out.println(" Seleccione el primer numero: ");
    numerouno = In.nextInt();
     System.out.println(" Seleccione el segundo numero: ");
     numerodos = In.nextInt();
      System.out.println(" Seleccionaras la operacion que deseas realizar:");
      System.out.println("1- Suma");
      System.out.println("2- Resta");
      System.out.println("3- Multiplicacion");
      System.out.println("4- Division");
      opciones = In.nextInt();
 System.out.println("");

   switch(opciones)
   {

    case 1: resultado = ( numerouno + numerodos );
    System.out.println(" El resultado de la operacion es: " + resultado);
    break;

    case 2: resultado = ( numerouno - numerodos );
    System.out.println(" El resultado de la operacion es: " + resultado);
    break;

    case 3: resultado = ( numerouno * numerodos );
    System.out.println(" El resultado de la operacion es: " + resultado);
    break;

    case 4: resultado = ( numerouno / numerodos );
    System.out.println(" El resultado de la operacion es: " + resultado);
    break;

    default: System.out.println(" La opcion seleccionada es inexistente ");


  }
 }
}