import java.util.Scanner;

public class SistemaVacacional{
  public static void main(String args[]){

   int clave = 0;
   int antiguedad = 0;
   String Nombre = "";
   Scanner In = new Scanner(System.in);

   System.out.println("*********************************************************");
   System.out.println("*********************************************************");
   System.out.println("******Bienvenido al sistema vacacional de Coca Cola******");
   System.out.println("*********************************************************");
   System.out.println("*********************************************************");
   System.out.println("");
   System.out.println(" Hola,  �Cu�l es tu nombre?");
   Nombre = In.nextLine();
   System.out.println("");
   System.out.println("Ahora, dime a que clave o zona perteneces ? ");
   clave = In.nextInt();
   System.out.println("");

   if(clave == 1){
    System.out.println("� Cu�l es tu antiguedad en a�o/s ?");
    antiguedad = In.nextInt();
    System.out.println("");

   if(antiguedad <= 1){
    System.out.println(" El trabajador " + Nombre + " tiene un total de 5 d�as de vacaciones ");

   } else if(antiguedad > 1 && antiguedad <= 6){
     System.out.println(" El trabajador " + Nombre + " tiene un total de 10 d�as de vacaciones ");

   } else if(antiguedad >= 7){
     System.out.println(" El trabajador " + Nombre + " tiene un total de 15 d�as de vacaciones ");

   } 
 
  }  else if(clave == 2){
      System.out.println("� Cu�l es tu antiguedad en a�o/s ?");
      antiguedad = In.nextInt();
      System.out.println("");
     
      if(antiguedad <= 1){
      System.out.println(" El trabajador " + Nombre + " tiene un total de 6 d�as de vacaciones ");
  
   }  else if(antiguedad >= 2 && antiguedad <= 6){
      System.out.println(" El trabajador " + Nombre + " tiene un total de 11 d�as de vacaciones ");

   }  else if(antiguedad >= 7){
      System.out.println(" El trabajador " + Nombre + " tiene un total de 16 d�as de vacaciones ");

   } 

  }  else if(clave == 3){
      System.out.println("� Cu�l es tu antiguedad en a�o/s ?");
      antiguedad = In.nextInt();
      System.out.println("");

      if(antiguedad <= 1){
       System.out.println(" El trabajador " + Nombre + " tiene un total de 7 d�as de vacaciones ");

   } else if(antiguedad >= 2 && antiguedad <= 6){
      System.out.println(" El trabajador " + Nombre + " tiene un total de 12 d�as de vacaciones ");

   } else if(antiguedad >= 7){
      System.out.println(" El trabajador " + Nombre + " tiene un total de 17 d�as de vacaciones ");

   }

  } else{
     System.out.println(" La clave o c�digo seleccionada es inexistente ");

  }
   
   
 }
}