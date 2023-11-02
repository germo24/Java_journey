package package1;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {

        int valor1, valor2, resultado;
        Scanner entrada = new Scanner(System.in);
        
        try {

            System.out.println(" Realizaremos una división, introduzca dos números: ");
            System.out.println("");
            System.out.print(" Dame el primer valor: ");
            valor1 = entrada.nextInt();
            System.out.print(" Dame el segundo valor: ");
            valor2 = entrada.nextInt();

            resultado = valor1 / valor2;

            System.out.println(" El resultado es: " + resultado);

        } catch (Exception er) {

            System.out.println(" Se ha producido un error! \n " + er);
        } finally {

            System.out.println(" Operación concluida! ");

        }
    }
}
