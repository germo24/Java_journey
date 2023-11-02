import java.util.Scanner;

public class NombresEqual{
  public static void main(String args[]){

   String nombre1 = "", nombre2 = "";
    Scanner In = new Scanner (System.in);

   System.out.print(" Dame el primer nombre: ");
    nombre1 = In.nextLine();

   System.out.println("");

   System.out.print(" Dame el segundo nombre: ");
    nombre2 = In.nextLine();

   System.out.println("");

    if(nombre1.equals(nombre2)){
     System.out.println("Los nombres son iguales");
  }  else{
      System.out.println("Los nombres distintos");
  }
 }
}