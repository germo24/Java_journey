package practica;

import javax.swing.JOptionPane;

public class Queue {

    Node Fnodo;
    Node Lnodo;
    String Chain = "";

    public Queue() {

        Fnodo = null;
        Lnodo = null;

    }

    public boolean EmptyQueue() {
        return Fnodo == null;

    }

    public void Insert(String text) {

        Node newN = new Node(text);
        newN.next = null;

        if (EmptyQueue()) {

            Fnodo = newN;
            Lnodo = newN;

        } else {

            Lnodo.next = newN;
            Lnodo = newN;

        }
    }

    public String Extract() {

        String temp = Fnodo.data;

        if (!EmptyQueue()) {

            if (Fnodo == Lnodo) {

                Fnodo = null;
                Lnodo = null;

            } else {

                Fnodo = Fnodo.next;

            }

        } 
        
        return temp;

    }

    public void ShowN() {

        String cleanchain = "";
        Node imitator = Fnodo;

        if (!EmptyQueue()) {

            while (imitator != null) {

                Chain += imitator.data + " ";
                imitator = imitator.next;

            }

            String ChainV[] = Chain.split(" ");

            for(int i = ChainV.length - 1; i >= 0; i--){
            
                cleanchain += "\n " + ChainV[i];
            
            
            }
            
            JOptionPane.showMessageDialog(null," The inserted string is: \n" + cleanchain);
        }
        else{
        
        JOptionPane.showMessageDialog(null, " The string is empty there is nothing to show. ");
        }

        Chain = "";
    }
}
