package suma;

public class Suma {

    private int vUno, vDos, Resultado;

    public Suma(int ValorUno, int ValorDos) {

        this.vUno = ValorUno;
        this.vDos = ValorDos;

    }

    public void Procedimiento() {

        Resultado = vUno + vDos;
    }

    public void Imprimir() {

        Procedimiento();

        System.out.println(" El resultado de la suma es: " + Resultado); //Invocamos al método Procedimiento a modo de ejemplificación, ya que la variable resultado es local.

    }
}
