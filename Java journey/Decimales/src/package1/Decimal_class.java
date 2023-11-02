package package1;

import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Decimal_class {

    public static void main(String[] args) {

        double numero = 2;
        double raiz = 0;

        raiz = Math.sqrt(numero);

        System.out.println(" Número: " + raiz);

        System.out.println("");

        System.out.println(" Con Coma ");

        System.out.println("");
        System.out.println("");
        

        // Método 1: Usando decimal format
        
        
        DecimalFormat df = new DecimalFormat("# . 00");

        System.out.println(" Número: " + df.format(raiz));

        // Signo de gato (#), un punto y los ceros indican los decimales, en etse caso, dos.
        
        
        
        // Método 2: Usando String format
        
        
        System.out.println(" Número: " + String.format("%.4f", raiz));

        // En String dentro SF. Signo de porcentaje (%), un punto y la cantidad de decimales a mostrar seguida de una f, una coma luego del String y la variable a mostrar
        
        
        
        
        System.out.println("");
        System.out.println("");

        System.out.println(" Con Punto ");

        System.out.println("");
        System.out.println("");

        // Método 3: Usando la clase Math round
        
        
        System.out.println(" Número: " + (double) Math.round(raiz * 10000) / 10000);

        /* Usamos un casting a double, ponemos la clase Math y el método round, dentro del método ponemos la variable y dentro de sus parentesis lo dividimos por un uno seguido de la cantidad
        *  de decimales ( 1d. * 10    2d.  * 100   3d.    * 1000  etc.) y fuera del parentesis lo dividimos por el mismo número.
         */
        
        
        
        // Método 4: Usando la clase Big Decimal (debemos importar la libreria BigDecinal y RoundingMode ubicadas en la libreria math de Java)
        
        
        BigDecimal bd = new BigDecimal(raiz);
        bd = bd.setScale(6, RoundingMode.HALF_UP);

        System.out.println(" Número: " + bd.doubleValue());

        /* Creamos un objeto de la clase Big Decimal e introducimos nuestro número para mandarlo, luego igualamos nuestro objeto con otro que use el método "setScale" en este
        *  introducimos la cantidad de dígitos a mostrar seguido de una coma y usando por último la clase RM con el método HALF_UP.
         */
        
        
    }

}
