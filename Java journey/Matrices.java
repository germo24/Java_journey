public class Matrices{
  public static void main(String args[]){

   int numeros[][] = new int [2][3];
   String nombres[][] = new String [4][2];

    numeros[0][0] = 1;
    numeros[0][1] = 2;
    numeros[0][2] = 3;
    numeros[1][0] = 3;
    numeros[1][1] = 2;
    numeros[1][2] = 1;

     nombres [0][0] = "Juan";
     nombres [0][1] = "Pedro";
     nombres [1][0] = "Maria";
     nombres [1][1] = "Elisa";
     nombres [2][0] = "Elisa";
     nombres [2][1] = "Maria";
     nombres [3][0] = "Pedro";
     nombres [3][1] = "Juan";
     
     System.out.println("");
     System.out.println(" Numeros");
     System.out.println("");
     
      System.out.print(" [ " + numeros [0][0] + " ] ");
      System.out.print(" [ " + numeros [0][1] + " ] ");
      System.out.println(" [ " + numeros [0][2] + " ] ");
      System.out.print(" [ " + numeros [1][0] + " ] ");
      System.out.print(" [ " + numeros [1][1] + " ] ");
      System.out.println(" [ " + numeros [1][2] + " ] ");

       System.out.println("");
       System.out.println(" Nombres ");
       System.out.println("");
     
      System.out.print(" [ " + nombres [0][0] + " ] ");
      System.out.println(" [ " + nombres [0][1] + " ] ");
      System.out.print(" [ " + nombres [1][0] + " ] ");
      System.out.println(" [ " + nombres [1][1] + " ] ");
      System.out.print(" [ " + nombres [2][0] + " ] ");
      System.out.println(" [ " + nombres [2][1] + " ] ");
      System.out.print(" [ " + nombres [3][0] + " ] ");
      System.out.print(" [ " + nombres [3][1] + " ] ");
      

 }
}