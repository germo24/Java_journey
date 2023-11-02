package clases;

public class Fibo {

    public int Fibo(int n) {

        if (n <= 1) {

            return n;

        } else {

            return Fibo(n - 2) + Fibo(n - 1);

        }

    }

    public void Print(int n) {

        System.out.print(Fibo(n));

    }

    public int FiboNR(int n) {

            int a = 0;
            int b = 1;
            int c = 0;
            
            
            for(int i = 1; i < n; i++){
            
            c = a + b; 
            a = b;
            b = c;
            
            }
            
            return a;
        }


       public void PrintNR(int n) {

        System.out.print(FiboNR(n));

    }
    
}
