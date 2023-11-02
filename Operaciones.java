public class Operaciones{
  public static void main(String args[]){

   int operacion = 1;
   int numerouno = 8;
   int numerodos = 4;
   int resultado = 0;

   if(operacion == 1){
       resultado = numerouno + numerodos;
       System.out.println("El valor de la suma es :  " + resultado);
   }  else if(operacion == 2){
       resultado = numerouno - numerodos;
       System.out.println("El valor de la resta es :  " + resultado);
   }  else if(operacion == 3){
       resultado = numerouno * numerodos;
       System.out.println("El valor de la multiplcacion es :  " + resultado);
   }  else if(operacion == 4){
       resultado = numerouno / numerodos;
       System.out.println("El valor de la division es :  " + resultado);
   }  else {
       System.out.println("La operación seleccionada es inexistente");
   }
 }
}

   