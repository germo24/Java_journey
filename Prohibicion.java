import javax.swing.*;

public class Prohibicion extends JFrame{

  public Prohibicion(){
   setLayout(null);
 }
   
   public static void main(String args[]){
    Prohibicion inter1 = new Prohibicion();
    inter1.setBounds(0,0,400,550); 
// La altura fijada es arriba a la izquierda, pero es luego cancelada por el método "setLocationRelativeTo(null)"
    inter1.setVisible(true);
    inter1.setLocationRelativeTo(null);
    inter1.setResizable(false);
// Prohibimos al usauario redimensionar la interfaz

 }
}