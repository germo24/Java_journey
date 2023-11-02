import java.util.Scanner;

public class Combinacion{
  public static void main(String args[]){

   Scanner Teclado = new Scanner(System.in);
   int operacion = 0;
   int numerouno = 0;
   int numerodos = 0;
   int resultado = 0;
   
   System.out.println(" Vamos a relizar una operación, voy a necesitar que me des  números y luego eligiras una de las 4 opciones ");
   
   System.out.println(" Dame el primer número o valor : ");
    numerouno = Teclado.nextInt();

   System.out.println(" Dame el segundo número o valor : ");
    numerodos = Teclado.nextInt();  

   System.out.println(" ¿Que operacion desea realizar? ");
   System.out.println( " 1 - Suma " );
   System.out.println( " 2 - Resta " );
   System.out.println( " 3 - Multiplicación " );
   System.out.println( " 2 - Division " );

   operacion = Teclado.nextInt();

   if(operacion == 1){
       resultado = numerouno + numerodos;
       System.out.println("El valor de la suma es :  " + resultado);
   }  else if(operacion == 2){
       resultado = numerouno - numerodos;
       System.out.println("El valor de la resta es :  " + resultado);
   }  else if(operacion == 3){
       resultado = numerouno * numerodos;
       System.out.println("El valor de la multiplcacion es :  " + resultado);
   }  else if(operacion == 4){
       resultado = numerouno / numerodos;
       System.out.println("El valor de la division es :  " + resultado);
   }  else {
       System.out.println("La operación seleccionada es inexistente");
   }
 }
}


