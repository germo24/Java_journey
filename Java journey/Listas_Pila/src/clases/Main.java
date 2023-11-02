package clases;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        
        int opcion = 0;
        int nodotemporal = 0;
        Pila pila = new Pila();
        

        
        do {
                    
            try {
                
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        " Menu de Opciones  \t \n\n"
                        + "   1. Insertar un nodo  \t \n"
                        + "   2. Eliminar un nodo  \t \n"
                        + "   3. La pila se encuentra vacia?  \t \n"
                        + "   4. Cuál es el último valor ingresado?  \t \n"
                        + "   5. Cuántos nodos posee la pila?  \t \n"
                        + "   6. Vaciar Pila  \t \n"
                        + "   7. Mostrar Pila  \t \n"
                        + "   8. Salir  \t \n\n"));
                
                switch (opcion) {
                    
                    case 1:
                        
                        nodotemporal = Integer.parseInt(JOptionPane.showInputDialog(null,
                                " Por favor ingresar el valor a guardar en el nodo: "));
                        
                        pila.InsertarNodo(nodotemporal);
                        
                        break;
                    
                    case 2:
                        
                        if (!pila.PilaVacia()) {
                            
                            JOptionPane.showMessageDialog(null, " Se ha eliminado un nodo con el valor de: " + pila.EliminarNodo());
                            
                        } else {
                            
                            JOptionPane.showMessageDialog(null, " La pila está vacía y no hay nada que eliminar ");
                            
                        }
                        
                        break;
                    
                    case 3:
                        
                        if (!pila.PilaVacia()) {
                            
                            JOptionPane.showMessageDialog(null, " La pila no está vacía ");
                            
                        } else {
                            
                            JOptionPane.showMessageDialog(null, " La pila está vacía ");
                            
                        }
                        break;
                    
                    case 4:
                        
                        if (!pila.PilaVacia()) {
                            
                            JOptionPane.showMessageDialog(null, " El último valor de la pila es " + pila.MostrarUltimoValor());
                            
                        } else {
                            
                            JOptionPane.showMessageDialog(null, " La Pila ya se encuentra vacía y, por tanto, no existe un último valor");
                            
                        }
                        
                        break;
                    
                    case 5:
                        
                        JOptionPane.showMessageDialog(null, " La pila posee " + pila.TamañoPila() + " nodos ");
                        break;
                    
                    case 6:
                        
                        if (!pila.PilaVacia()) {
                            
                            pila.VaciarPila();
                            
                            JOptionPane.showMessageDialog(null, " La pila se ha vaciado correctamente");
                            
                        } else {
                            
                            JOptionPane.showMessageDialog(null, " La Pila ya se encuentra vacía ");
                            
                        }
                        break;
                    
                    case 7:
                        
                        pila.MostrarValores();
                        break;
                    
                    case 8:
                        
                        opcion = 8;
                        break;
                    
                    default:
                        
                        JOptionPane.showMessageDialog(null, " Opcion inválida intentelo de nuevo ");
                        break;
                    
                }
                
            } catch (NumberFormatException e) {
                
            }
            
        } while (opcion != 8);
    }
}
