package package1;

public class Random extends class1 {

    int contador = 0;

    @Override
    public void Averiguar() {

        do {

            tester = (int) (Math.random() * 100 + 1);

            System.out.println(aleatorio);
            System.out.println(tester);

            contador =+ 1;

        } while (aleatorio == tester);

        System.out.println(" Intentos totales: " + contador);
    }
}
