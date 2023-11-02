package clases;

public class Serie {

    public void esPrimo(int limit) {

        int counter = 2;
        int bandera = 0;

        if (limit < 2) {

            System.out.println(" No existen primos menores que 2");

        } else {

            do {

                for (int i = 2; i < counter; i++) {

                    if (counter % i == 0 & counter != 2) {

                        bandera++;
                        break;
                    }
                }
            
                if (bandera == 0) {

                    System.out.print(counter + ", ");

                }

                bandera = 0;
                counter++;

            } while (counter <= limit);

            System.out.println("");
        }
    }
}
