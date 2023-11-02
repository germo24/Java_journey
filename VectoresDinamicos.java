import java.util.Scanner;
public class VectoresDinamicos{
  public static void main(String args[]){

   int longitud = 0;
   Scanner In = new Scanner (System.in);

    System.out.println("");
    System.out.println(" How many positions or numbers you want to enter? ");
    longitud = In.nextInt();

    int numeros[] = new int[longitud];

    for(int i = 0; i < numeros.length; i++){
     System.out.println(" Enter the value N# " + (i +1));
     numeros[i] = In.nextInt();

     System.out.println("");
   }
     for(int i = 0; i < numeros.length; i++){
      System.out.println(" Value N# " + (i +1) + " is " + numeros[i]);
  }
 }
}