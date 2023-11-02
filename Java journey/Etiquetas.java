import javax.swing.*;

public class Etiquetas extends JFrame{

  private JLabel label1;
  private JLabel label2;

   public Etiquetas(){
   setLayout(null);
   label1 = new JLabel(" Hola ");
   label1.setBounds(10,20,300,30);
   add(label1);
   label2 = new JLabel(" qué tal ");
   label2.setBounds(10,100,300,90);
   add(label2);

 }
 
   public static void main(String args[]){
   Etiquetas formulario1 = new Etiquetas();
   formulario1.setBounds(0,0,300,250);
   formulario1.setVisible(true);
   formulario1.setLocationRelativeTo(null);
   formulario1.setResizable(false);

 
 }
}
