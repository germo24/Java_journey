package package1;

public class Main_Class {

    public static void main(String[] args) {

        /*  // Thread with "implements Runnable".
        Thread hilo1 = new Thread(new Hilos_I(3));
        Thread hilo2 = new Thread(new Hilos_I(5));
        Thread hilo3 = new Thread(new Hilos_I(10));

        hilo1.start();
        hilo2.start();
        hilo3.start();
         */
        // Thread with "extends Thread class" and getName() method.
        Hilos_E hilo4 = new Hilos_E(" Hilo 4");
        Hilos_E hilo5 = new Hilos_E(" Hilo 5");
        Hilos_E hilo6 = new Hilos_E(" Hilo 6");

        hilo4.ValorCondicion(5);
        hilo5.ValorCondicion(3);
        hilo6.ValorCondicion(10);

        hilo4.start();

        try {

            hilo4.sleep(3000);

        } catch (InterruptedException e) {

            System.out.println(" Error en método sleep" + e);

        }

        hilo5.start();

        hilo6.start();

    }
}
