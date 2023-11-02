import java.util.Scanner;

public class MatricesDinamicas{
  public static void main(String args[]){

   int counter = 1, increase = 0, rows = 0, columns = 0;
   Scanner In = new Scanner (System.in);

    System.out.println("");
    System.out.println(" Of how much by how much do you want to increase? [starting at one] ");
    increase = In.nextInt();

    System.out.print(" How many rows do you want to enter: ");
    rows = In.nextInt();


    System.out.println("");

    System.out.print(" How many rows do you want to enter: ");
    columns = In.nextInt();

     int numbers [][] = new int [rows][columns];

     for(int i = 0; i < rows; i++){
      for(int j = 0; j < columns; j++){
      numbers[i][j] = counter;
      counter += increase;
      System.out.print("[ " + numbers[i][j] + " ]");

   }
    System.out.println("");
  }
 }
}