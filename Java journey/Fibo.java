public class Fibo{
  public static void main(String args[]){

   int a = 0, b = 1, c = 0, i = 0;

   do{
    if(i < 15){
     System.out.print(a + ",");

    }  else{
        System.out.print(a);
    }
     c = a + b;
     a = b;
     b = c;

       i++;

  }while(i <= 15)
 }
}