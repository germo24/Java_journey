package clases;

public class Operation_Imp extends Abstract {

    @Override

    public void Operation() {

        int result;

        if (limit <= 0) {

            System.out.println(" La suma de no es positiva o no posee impares ");

        } else {

            // Manera de realizrlo con bucle.
            /*
            for (int i = 1; i <= limit; i += 2) {

                result = result + i;

            }
             */
 /* 
  --------------------------------------------------------------------------------------------------------------------------------------------------------------------
  Para evitar usar double con los grupos o pares de números impares que podrían dar {0,5 pares} (que al pasar a Int perdería esos decimos de valor y modificaría el 
  resultado), en caso de ser par, lo veo como si fuera el número siguiente (le sumo 1) debido a que posee la misma cantidad de grupos de números impares pero sin un 
  resultado con decimales, acumulo la división por eso es entre 4 y no entre 2 (2*2 = 4) antes era entre 2 por que los grupos de números consecutivos equivalen a la 
  mitad del total (100 posee 50 grupos de pares e impares, así solo tiene 25 grupos exclusiamente de impares y 25 de pares) y por último en la multiplicación cada 
  par representa la suma del primer y último impar restante por lo que se expresa como aux_limit (último número impar) + 1 (el cual no se expresa ya que ,ya fue 
  sumado anteriormente en la estructura condicional y en caso de no pasar por a estructura condicional es equivalente ya que es la misma suma que si fuera el número 
  anterior). Resumo la operación de este modo. 
  --------------------------------------------------------------------------------------------------------------------------------------------------------------------      
 */
            int aux_limit = limit;

            if (limit % 2 != 0) {

                aux_limit++;

            }

            result = (aux_limit * aux_limit) / 4;

            System.out.println("*****************************************************************");
            System.out.println(" La suma de impares desde 0 a " + limit + " es " + result);
            System.out.println("*****************************************************************");

        }

    }
}
