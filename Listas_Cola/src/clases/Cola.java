package clases;

import javax.swing.JOptionPane;

public class Cola {

    Nodo PointerF, PointerL;
    int info;
    String Cadena;

    public Cola() {

        PointerF = null;
        PointerL = null;
        Cadena = "";

    }

    public boolean ColaVacia() {

        return PointerF == null;

    }

    public void Insert(int info) {

        Nodo Nnodo = new Nodo(info);
        Nnodo.next = null;

        if (ColaVacia()) {

            PointerF = Nnodo;
            PointerL = Nnodo;
            
        } else {

            PointerL.next = Nnodo;
            PointerL = Nnodo;

        }

    }

    public int Extract() {

        int temp = PointerF.value;

        if (!ColaVacia()) {

            if (PointerF == PointerL) {

                PointerF = null;
                PointerL = null;

            } else {

                PointerF = PointerF.next;

            }
            return temp;
        } else {

            return Integer.MAX_VALUE;

        }

    }

    
    public void ShowN() {

        Nodo recorrido = PointerF;
        String CadenaInv = "";

        while (recorrido != null) {

            Cadena += recorrido.value + " ";
            recorrido = recorrido.next;

        }

        String CadenaV[] = Cadena.split(" ");

        for (int i = CadenaV.length - 1; i >= 0; i--) {

            CadenaInv += CadenaV[i] + " ";

        }

        JOptionPane.showMessageDialog(null, CadenaInv);

        Cadena = "";

    }

}
