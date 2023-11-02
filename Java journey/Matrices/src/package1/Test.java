package package1;

public class Test {

    public static void main(String[] args) {

        int M_uno[][] = new int[2][3];
        int M_dos[][] = new int[3][3];
        int M_resultado[][] = new int[2][3];
        int temp_var = 0;

        // LLenado de las matrices
        for (int i = 0; i < M_uno.length; i++) {
            for (int j = 0; j < M_uno[0].length; j++) {

                M_uno[i][j] = (int) (Math.random() * 5 + 1);

            }

        }

        for (int i = 0; i < M_dos.length; i++) {
            for (int j = 0; j < M_dos[0].length; j++) {

                M_dos[i][j] = (int) (Math.random() * 5 + 1);

            }
        }

        for (int i = 0; i < M_uno.length; i++) {

            for (int k = 0; k < M_dos[0].length; k++) {

                for (int j = 0; j < M_uno[0].length; j++) {

                    temp_var = M_uno[i][j] * M_dos[j][k];

                    M_resultado[i][k] = temp_var + M_resultado[i][k];
                }
            }

        }

        for (int i = 0; i < M_uno.length; i++) {

            for (int j = 0; j < M_uno[0].length; j++) {
                
                System.out.print(" [ " + M_uno[i][j] + " ] ");
            

            for (int k = 0; k < M_dos[0].length; k++) {

                System.out.print(" [ " + M_dos[j][k] + " ] ");

            }

            if (i == M_uno.length / 2) {

                System.out.print("    +    ");

            } else {

                System.out.print("        ");

            }

        }
        System.out.println("");
    }
}
}
