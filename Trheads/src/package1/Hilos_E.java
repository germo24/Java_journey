package package1;

public class Hilos_E extends Thread {

    int parametro;

    @Override

    public void run() {

        for (int i = 1; i <= parametro; i++) {

            System.out.println(i + this.getName());

            try {

                Hilos_E.sleep(1000);
            } catch (InterruptedException e) {

                System.out.println(" Error en método sleep" + e);
            }
        }
        System.out.println("");
    }

    public void ValorCondicion(int PMain) {
        this.parametro = PMain;
    }

    public Hilos_E(String NameHilo) {
        super(NameHilo);
    }
}
