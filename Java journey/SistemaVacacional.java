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
   System.out.println(" Hola,  ¿Cuál es tu nombre?");
   Nombre = In.nextLine();
   System.out.println("");
   System.out.println("Ahora, dime a que clave o zona perteneces ? ");
   clave = In.nextInt();
   System.out.println("");

   if(clave == 1){
    System.out.println("¿ Cuál es tu antiguedad en año/s ?");
    antiguedad = In.nextInt();
    System.out.println("");

   if(antiguedad <= 1){
    System.out.println(" El trabajador " + Nombre + " tiene un total de 5 días de vacaciones ");

   } else if(antiguedad > 1 && antiguedad <= 6){
     System.out.println(" El trabajador " + Nombre + " tiene un total de 10 días de vacaciones ");

   } else if(antiguedad >= 7){
     System.out.println(" El trabajador " + Nombre + " tiene un total de 15 días de vacaciones ");

   } 
 
  }  else if(clave == 2){
      System.out.println("¿ Cuál es tu antiguedad en año/s ?");
      antiguedad = In.nextInt();
      System.out.println("");
     
      if(antiguedad <= 1){
      System.out.println(" El trabajador " + Nombre + " tiene un total de 6 días de vacaciones ");
  
   }  else if(antiguedad >= 2 && antiguedad <= 6){
      System.out.println(" El trabajador " + Nombre + " tiene un total de 11 días de vacaciones ");

   }  else if(antiguedad >= 7){
      System.out.println(" El trabajador " + Nombre + " tiene un total de 16 días de vacaciones ");

   } 

  }  else if(clave == 3){
      System.out.println("¿ Cuál es tu antiguedad en año/s ?");
      antiguedad = In.nextInt();
      System.out.println("");

      if(antiguedad <= 1){
       System.out.println(" El trabajador " + Nombre + " tiene un total de 7 días de vacaciones ");

   } else if(antiguedad >= 2 && antiguedad <= 6){
      System.out.println(" El trabajador " + Nombre + " tiene un total de 12 días de vacaciones ");

   } else if(antiguedad >= 7){
      System.out.println(" El trabajador " + Nombre + " tiene un total de 17 días de vacaciones ");

   }

  } else{
     System.out.println(" La clave o código seleccionada es inexistente ");

  }
   
   
 }
}