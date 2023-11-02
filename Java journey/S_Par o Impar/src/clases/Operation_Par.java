package clases;

public class Operation_Par extends Abstract {

    @Override

    public void Operation() {

        int result;

        if (limit <= 0) {

            System.out.println(limit);
            System.out.println(" La suma no es positiva o no tiene pares ");

        } else {

            // Manera de realizrlo con bucle.
            /*
            
        for(int i = 0; i <= limit; i += 2){
        
            result = result + i;
   
        }
             */
 /* 
  --------------------------------------------------------------------------------------------------------------------------------------------------------------------
  Para evitar usar double con los grupos o pares de números pares que podrían dar {0,5 pares} (que al pasar a Int perdería esos decimos de valor y modificaría el 
  resultado), en caso de ser impar, lo veo como si fuera el número anterior (le resto 1) debido a que posee la misma cantidad de grupos de números pares pero sin un 
  resultado con decimales, acumulo la división por eso es entre 4 y no entre 2 (2*2 = 4) antes era entre 2 por que los grupos de números consecutivos equivalen a la 
  mitad del total (100 posee 50 grupos de pares e impares, así solo tiene 25 grupos exclusiamente de pares y 25 de impares) y por último en la multiplicación cada par
  representa la suma del primer y último par restante por lo que se expresa como limit (último número) + 2 (primer número par). Resumo la operación de este modo. 
  --------------------------------------------------------------------------------------------------------------------------------------------------------------------      
 */
            int aux_limit = limit;

            if (limit % 2 != 0) {

                aux_limit--;

            }

            result = aux_limit * (aux_limit + 2) / 4;

            System.out.println("*********************************************************");
            System.out.println(" La suma de pares desde 0 a " + limit + " es " + result);
            System.out.println("*********************************************************");

        }

    }
}
