package package1;

public class Multiplicación_División {

    public static void main(String[] args) {

        int M_uno[][] = new int[5][3];
        int M_dos[][] = new int[3][4];
        int M_resultado[][] = new int[5][4];

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

        // Calculo de Matriz resultado.
        System.out.println("--------------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < M_uno.length; i++) {

            for (int k = 0; k < M_dos[0].length; k++) {

                for (int j = 0; j < M_uno[0].length; j++) {

                    int temp_var = M_uno[i][j] * M_dos[j][k];

                    M_resultado[i][k] = temp_var + M_resultado[i][k];
                }
            }

        }

        // Impresión de matrices.
        
        if(M_dos.length >= M_uno.length){
            
        for (int j = 0; j < M_dos.length; j++) {

            if (j < M_uno.length) {

                for (int i = 0; i < M_uno[0].length; i++) {

                    System.out.print(" [ " + M_uno[j][i] + " ] ");
                }

                if (j == 1) {

                    System.out.print("   +    ");

                } else {

                    System.out.print("        ");

                }

            } else {

                switch (M_dos[0].length) {
                    case 1:
                        System.out.print("    \t \t \t \t    ");
                        break;
                    case 2:
                        System.out.print("    \t \t \t \t    ");
                        break;
                    case 3:
                        System.out.print("    \t \t \t \t    ");
                        break;
                    default:
                        System.out.print("\t \t \t \t");
                        break;
                }
            }
            
            for (int k = 0; k < M_dos[0].length; k++) {

                System.out.print(" [ " + M_dos[j][k] + " ] ");

            }

            if (j == 1) {

                System.out.print("   =    ");

            } else {

                System.out.print("        ");

            }
            
            if(j < M_resultado.length){
                
            
             for (int k = 0; k < M_resultado[0].length; k++) {
            
            System.out.print(" [ " + M_resultado[j][k] + " ] ");
                
             }
    }

            System.out.println("");
        }
            
        }
        
        else{
            
        for (int j = 0; j < M_uno.length; j++) {

          for (int k = 0; k < M_uno[0].length; k++) {

                System.out.print(" [ " + M_uno[j][k] + " ] ");

            }

            if (j == 1) {

                System.out.print("   +    ");

            } else {

                System.out.print("        ");

            }
                 
            if (j < M_dos.length) {

                for (int i = 0; i < M_dos[0].length; i++) {

                    System.out.print(" [ " + M_dos[j][i] + " ] ");
                }

                if (j == 1) {

                    System.out.print("   =    ");

                } else {

                    System.out.print("        ");

                }

            } else {

                switch (M_uno[0].length) {
                    
                    case 1:
                        System.out.print("    \t \t \t \t    ");
                        break;
                    case 2:
                        System.out.print("    \t \t \t \t    ");
                        break;
                    case 3:
                        System.out.print("    \t \t \t \t    ");
                        break;
                    default:
                        System.out.print("\t \t \t \t");
                        break;
                }
            }
            
            if(j < M_resultado.length){
                
            
             for (int k = 0; k < M_resultado[0].length; k++) {
            
            System.out.print(" [ " + M_resultado[j][k] + " ] ");
                
             }
    }

            System.out.println("");
        }
            
        }
        
        
        
        
        
        
        }
    }


