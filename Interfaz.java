import javax.swing.*;

public class Interfaz extends JFrame{
  private JLabel label1;

   public Interfaz(){
   setLayout(null);
   label1 = new JLabel(" Interfaz Básica ");
   label1.setBounds(10,20,300,400);
   add(label1);

 }

   public static void main(String args[]){
     Interfaz formulario1 = new Interfaz();
     formulario1.setBounds(0,0,400,300);
     formulario1.setVisible(true);

 }
}
