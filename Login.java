import java.util.Scanner;

public class Login{
  public static void main(String args[]){

    String usuario = "", password = ""; int opciones = 0;
    Scanner In = new Scanner(System.in);

     System.out.println(" Welcome to...");

   System.out.println("");

   System.out.println("******************************************************");
   System.out.println("******************************************************");
   System.out.println("******************* GERMO.NET :) *********************");
   System.out.println("******************************************************");
   System.out.println("******************************************************");

   System.out.println("");

   System.out.println(" Do you want to log in? ");
   System.out.println(" 1- Yes ");
   System.out.println(" 2- No ");
   opciones = In.nextInt();
   In.nextLine();


   System.out.println("");

    switch(opciones){
 
    case 1:
    System.out.print(" Enter your username: ");
     
     usuario = In.nextLine();
 
     System.out.println("");

     System.out.print(" Enter your password: ");
     password = In.nextLine();

      if(usuario.equals("germo") && password.equals("german")){
       System.out.println(" Thanks, you are login correctly! ");
   }   else {
        System.out.println(" The username or password are incorrect ");
         
   }  break;    

      case 2:
       System.out.println(" Thank you, for visiting us ");
      
      break;

       default:
       System.out.println("The option selected is not- existent");   
  }
 }
}