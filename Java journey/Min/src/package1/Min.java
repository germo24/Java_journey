package package1;

public class Min {

    public static void main(String[] args) {

        int num1, num2, ContadorR = 0, ContadorC = 0, i = 0;

        do {

            num1 = (int) (Math.random() * 100 + 1);

            do {

                num2 = (int) (Math.random() * 100 + 1);

                i += 1;

            } while (num1 != num2);
            System.out.println(" TOTAL RANDOM: " + i);

            System.out.println(" TOTAL CONSECUTIVO: " + num1);

            if (num1 > i) {

                ContadorR += 1;

            } else {

                ContadorC += 1;

            }
        } while (ContadorR == 25 | ContadorC == 25);

        if (ContadorR > ContadorC) {

            System.out.println(" Gano Random ");

        } else {

            System.out.println(" Gano Consecutivo");

        }
    }

}
