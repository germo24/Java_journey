package clases;

import javax.swing.JOptionPane;

public class Pila {

    private Nodo UltimoValor;
    int size = 0;
    String ListaValores = "";

    public Pila() {

        UltimoValor = null;
        size = 0;

    }

    // Método para saber si la pila está vacía.
    public boolean PilaVacia() {
        return UltimoValor == null;

    }

    // Método para insertar nodos en la pila.
    public void InsertarNodo(int nodo) {

        Nodo nuevo_nodo = new Nodo(nodo);
        nuevo_nodo.siguiente = UltimoValor;
        UltimoValor = nuevo_nodo;

        size++;

    }

    // Método para eliminar un nodo de la pila.
    public int EliminarNodo() {
        
        int auxiliar = UltimoValor.informacion;
        UltimoValor = UltimoValor.siguiente;
        size--;
        return auxiliar;
        
    }
    
    // Método para mostrar último valor ingresado.
    
    public int MostrarUltimoValor(){
    
    return UltimoValor.informacion;
    
    }
    
    //Método para conocer el tamaño de la pila;
    
    public int TamañoPila(){
    
    return size;
    
    }
    
    // Método para vaciar Pila.
    
    public void VaciarPila(){
    
    while(!PilaVacia()){
    
    EliminarNodo();
    
     }
    }
    
    // Método para mostrar el contenido de la pila.
    
    public void MostrarValores(){
    
    Nodo recorrido = UltimoValor;
    
    while(recorrido != null){
    
    ListaValores += recorrido.informacion + "\n";
            
    recorrido = recorrido.siguiente;
    }
    
        JOptionPane.showMessageDialog(null, ListaValores);
    ListaValores = "";
    
    }
    
    
}
