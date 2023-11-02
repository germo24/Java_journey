package clases;

public class Factorial {

    public int Factorial(int n) {

        if (n == 0) {

            return 1;

        } else {

            return n * Factorial(n - 1);
        }

    }

    public void Print(int n) {

        System.out.print(Factorial(n));

    }

    public int FactorialNR(int n) {

        int resultado = 1;

        for (int i = 1; i <= n; i++) {

            resultado = resultado * i;

        }

        return resultado;

    }

    public void PrintNR(int n) {

        System.out.print(FactorialNR(n));

    }
}
