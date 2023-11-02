package package1;
    
public class Suma_Resta {

    public static void main(String[] args) {

        int M_uno[][] = new int[3][3];
        int M_dos[][] = new int[3][3];
        int M_resultado[][] = new int[3][3];
        
        // LLenado random de la matriz uno y dos

        for (int i = 0; i < M_resultado.length; i++) {
            for (int j = 0; j < M_resultado.length; j++) {

                M_uno[i][j] = (int) (Math.random() * 5 + 1);
                M_dos[i][j] = (int) (Math.random() * 5 + 1);

            }
        }
        
        // Operación a realizar e impresión de las 3 matrices

        for (int i = 0; i < M_resultado.length; i++) {
            for (int j = 0; j < M_uno.length; j++) {

                M_resultado[i][j] = M_uno[i][j] + M_dos[i][j];

                System.out.print(" [ " + M_uno[i][j] + " ] ");

            }

            if (i == 1) {

                System.out.print("   +   ");

            } else {

                System.out.print("       ");
            }

            for (int j = 0; j < M_dos.length; j++) {

                System.out.print(" [ " + M_dos[i][j] + " ] ");

            }

            if (i == 1) {

                System.out.print("   =   ");

            } else {

                System.out.print("       ");

            }
            for (int j = 0; j < M_resultado.length; j++) {

                System.out.print(" [ " + M_resultado[i][j] + " ] ");
            }

            System.out.println(" ");

        }

    }
}
