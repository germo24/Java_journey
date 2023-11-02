import java.util.Scanner;

public class LENGTHSUBSTRING{
  public static void main(String args[]){

   int num_characters = 0, desde = 0, hasta = 0, num_characters2 = 0, opciones = 0; 
   String palabra = "", palabra2 = "";
   Scanner In = new Scanner(System.in);

   System.out.print(" Por favor escriba una palabra o mas: ");
   palabra = In.nextLine();

   num_characters = palabra.length();

   System.out.println(" La cadena cadena " + palabra + " posee un total de " + num_characters + " caracteres");

   System.out.println(" Desea recortar caracteres de la palabra?");
   System.out.println("1- SI");
   System.out.println("2- NO");
   opciones = In.nextInt();

   System.out.println("");

    switch(opciones){
  
     case 1: 
      System.out.println(" Desde que caracter desea recortarla? ");
      desde = In.nextInt();

       System.out.println(" Hasta que caracter desea recortarla? ");
       hasta = In.nextInt();

        palabra2 = palabra.substring(desde, hasta);
        num_characters2 = palabra2.length();

        System.out.println(" La nueva palabra es " + palabra2 + " y tiene un total de " + num_characters2 + " caracteres");
   break;

     case 2:
      System.out.println(" Muchas gracias por su tiempo ");
   break;

     default:
      System.out.println(" La opcion seleccionada es inesxistente ");
  }
 }
}