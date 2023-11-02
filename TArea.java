import javax.swing.*;

public class TArea extends JFrame{

  private JLabel label1;
  private JTextArea textarea1;

   public TArea(){
    setLayout(null);

     label1 = new JLabel("Anota lo que quieras");
     label1.setBounds(10,10,180,60);
     add(label1);

     textarea1 = new JTextArea();
     textarea1.setBounds(10,30,210,150):
     add(textarea1);
 }
      public static void main(String args[]){
       TArea interfaz1 = new TArea();
        interfaz1.setBounds(0,0,450,350);
        interfaz1.setResizable(false);
        interfaz1.setLocationRelativeTo(null);
        interfaz1.setVisible(true);
  }
}