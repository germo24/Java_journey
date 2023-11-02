import.java.util.Scanner;

public clasS Interacciones{
  public static void main(String args[]){

   Scanner TecladoIn = new Scanner(System.in);
   String Nombre = "";
   int numerouno = 0, int numerodos = 0, int resultado = 0;

   System.out.println(" ¿Cuál es tu nombre? ");
   Nombre = TecladoIn.nextLine();

   System.out.println(" Dame el primer valor de tu suma ");
   numerouno = TecladoIn.nextInt();

   System.out.println(" Dame el segundo valor de tu suma ");
   numerodos = TecladoIn.nextInt();  

   resultado = numerouno + numerodos;
     System.out.println("Hola"+ Nombre + " El resultado de tu suma es : " + resultado);
 }
}