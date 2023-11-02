import java.util.Scanner;

public class Mate{

  public static void main(String args[]){
 
   Scanner In = new Scanner(System.in);   
   int resto;
   int numero;

    System.out.println(" Introduce un numero y te dare sus divisores: ");
    numero = In.nextInt();

     System.out.println(" Sus divisores son: ");

      for(int i = 1; i <= numero; i++){
       resto = numero % i;
       if(resto == 0){
        System.out.println(i);
   }
  }
 }
}