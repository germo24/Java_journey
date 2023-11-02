import javax.swing.event.*;
import javax.swing.*;

public class RadioBoton extends JFrame implements ChangeListener{

  private JRadioButton radio1,radio2,radio3;
  private ButtonGroup bg1;
  private JLabel label1;

   public RadioBoton(){
    setLayout(null);

     label1 = new JLabel(" What do you prefer? ");
     label1.setBounds(5,10,150,50);
     add(label1);

     bg1 = new ButtonGroup();

     radio1 = new JRadioButton(" 400 * 350");
     radio1.setBounds(10,50,90,30);
     radio1.addChangeListener(this);
     add(radio1);
     bg1.add(radio1);

     radio2 = new JRadioButton(" 450 * 400");
     radio2.setBounds(10,80,90,30);
     radio2.addChangeListener(this);
     add(radio2);
     bg1.add(radio2);

     radio3 = new JRadioButton(" 500 * 450");
     radio3.setBounds(10,110,90,30);
     radio3.addChangeListener(this);
     add(radio3);
     bg1.add(radio3);
 }

      public void stateChanged(ChangeEvent e){

       if(radio1.isSelected()){
        setSize(400,350);
  }
       if(radio2.isSelected()){
        setSize(450,400);
  }
       if(radio3.isSelected()){
        setSize(500,450);
  }
 }

      public static void main(String args[]){
       RadioBoton interfaz = new RadioBoton();
        interfaz.setBounds(0,0,350,300);
        interfaz.setResizable(false);
        interfaz.setLocationRelativeTo(null);
        interfaz.setVisible(true);

 }
}