package package1;

public class Hilos_I implements Runnable {

    int parametro;

    @Override

    public void run() {

        for (int i = 0; i <= parametro; i++) {

            System.out.println(i);
        }

        System.out.println();
    }

    public Hilos_I(int parametro) {
        this.parametro = parametro;
    }
}
