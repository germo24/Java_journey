import javax.swing.*;
import java.awt.event.*;

  public class SPane extends JFrame{

   private JTextArea textarea1;
   private JScrollPane scrollpane1;

    public SPane(){
     setLayout(null);
      textarea1 = new JTextArea();
      scrollpane1 = new JScrollPane(textarea1);
      scrollpane1.setBounds(10,10,300,250);
      add(scrollpane1);
 }

       public static void main(String args[]){
        SPane interfaz1 = new SPane();
        interfaz1.setBounds(0,0,400,300);
        interfaz1.setResizable(false);
        interfaz1.setLocationRelativeTo(null);
        interfaz1.setVisible(true);
 }
}
   