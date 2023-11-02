package clases;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Abstract {

    protected int options = 0;
    Scanner In = new Scanner(System.in);
    static int limit = 0;

    public void Ask() {

        try {

            System.out.println("--------------------------------------------------------------------------------------------------");
            System.out.println("------------------------ BIENVENIDO AL CALCULADOR DE SUMAS PARES O IMPARES -----------------------");
            System.out.println("--------------------------------------------------------------------------------------------------");
            System.out.println("");

            System.out.println(" Qué operación desea realizar? ");
            System.out.println(" 1. Suma de números pares ");
            System.out.println(" 2. Suma de números impares ");
            System.out.println(" 3. Salir ");
            options = In.nextInt();
            System.out.println("");

            if (options > 0 && options < 3) {

                System.out.println(" Hasta que número abarcará la suma? ");
                limit = In.nextInt();
                System.out.println("");
                
            }
            
            switch (options) {

                case 1:

                    Operation_Par messengerP = new Operation_Par();
                    messengerP.Operation();

                    break;

                case 2:

                    Operation_Imp messengerI = new Operation_Imp();
                    messengerI.Operation();

                    break;

                case 3:
                    System.exit(0);
                    break;

                default:

                    System.out.println(" La opción seleccionada es inválida, intenta nuevamente. ");
                    break;

            }

        } catch (InputMismatchException e) {

            System.err.println(" Opción inválida, prueba de nuevo ");
        }
    }

    public abstract void Operation();
}
