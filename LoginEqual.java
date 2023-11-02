import java.util.Scanner;

public class LoginEqual{
  public static void main(String args[]){

   String usuario = "", password = ""; 
    Scanner In = new Scanner(System.in);

   System.out.println(" Welcome to...");

   System.out.println("");

   System.out.println("******************************************************");
   System.out.println("******************************************************");
   System.out.println("******************* GERMO.NET :) *********************");
   System.out.println("******************************************************");
   System.out.println("******************************************************\n");

   //System.out.println("");

    System.out.print(" Enter your username: ");
     usuario = In.nextLine();
 
     System.out.println("");

     System.out.print(" Enter your password: ");
     password = In.nextLine();

      if(usuario.equals("germo24") && password.equals("german1314")){
       System.out.println(" Thanks, you are login correctly! ");
   }   else{
        System.out.println(" The username or password are incorrect ");
   }         
   
 }
}