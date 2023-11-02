    package clases;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int opciones = 0;
        int nodotemporal = 0;
        Cola mensajero = new Cola();

        do {
            try {

                opciones = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "\n  Menu de Opciones   \n\n"
                        + "  1. Insertar un nodo \n"
                        + "  2. Eliminar el último nodo \n"
                        + "  3. Mostrar Nodos \n"
                        + "  4. Salir \n\n"));

                switch (opciones) {

                    case 1:

                        nodotemporal = Integer.parseInt(JOptionPane.showInputDialog(null, " Dame el valor a ingresar: ", " Introducción de Nodo ", JOptionPane.INFORMATION_MESSAGE));

                        mensajero.Insert(nodotemporal);
                        break;

                    case 2:

                        if (!mensajero.ColaVacia()) {

                            JOptionPane.showMessageDialog(null, " Se ha eliminado correctamente el nodo con valor " + mensajero.Extract());
                        } else {

                            JOptionPane.showMessageDialog(null, " No hay ningún nodo que eliminar ");

                        }

                        break;

                    case 3:

                        if (!mensajero.ColaVacia()) {

                            mensajero.ShowN();
                        } else {

                            JOptionPane.showMessageDialog(null, " No hay ningún nodo que mostrar ");

                        }

                        break;

                    case 4:

                        System.exit(0);

                        break;

                    default:

                        JOptionPane.showMessageDialog(null, "La opción seleccionada es inexistente, intente de nuevo ");

                        break;
                }

            } catch (NumberFormatException e) {
                
                JOptionPane.showMessageDialog(null, "Es imposible realizar esta acción, intentelo de nuevo ");

            }
        } while (opciones != 4);

    }
}
