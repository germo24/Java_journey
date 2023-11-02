package practica;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int option = 0;
        Queue messenger = new Queue();
        String Temp_node = "";

        do {
            try{

            option = Integer.parseInt(JOptionPane.showInputDialog(null, "\n  Option Menu \n\n"
                    + " 1. Insert node (words) \n"
                    + " 2. Delete first node \n"
                    + " 3. Show nodes \n"
                    + " 4. Exit \n\n\n"));

            switch (option) {

                case 1:

                    Temp_node = JOptionPane.showInputDialog(null, " Insert the node: ");

                    if (!Temp_node.trim().equals("")) {

                        messenger.Insert(Temp_node);
                    } else {

                        JOptionPane.showMessageDialog(null, " You are not inserting anything, try again. ", "", JOptionPane.INFORMATION_MESSAGE);

                    }
                    break;

                case 2:

                    if (!messenger.EmptyQueue()) {

                        JOptionPane.showMessageDialog(null, " Node has been successfully extracted: " + messenger.Extract());

                    } else {

                        JOptionPane.showMessageDialog(null, " There is nothing to delete. ", "", JOptionPane.INFORMATION_MESSAGE);

                    }

                    break;

                case 3:

                    messenger.ShowN();

                    break;

                case 4:

                    System.exit(0);

                    break;

                default:

                    JOptionPane.showMessageDialog(null, " The selected option does not exist. ", " Error ", JOptionPane.WARNING_MESSAGE);

                    break;

            }
            } catch(NumberFormatException e){
            
            JOptionPane.showMessageDialog(null, " The selected option does not exist. ", " Error ", JOptionPane.WARNING_MESSAGE);
            
            }

        } while (option != 4);

    }
}
