import javax.swing.event.*;
import javax.swing.*;

public class Checkbox extends JFrame implements ChangeListener{

  private JCheckBox check1,check2,check3;

   public Checkbox(){
    setLayout(null);

     check1 = new JCheckBox("English");
     check1.setBounds(10,20,90,30);
     check1.addChangeListener(this);
     add(check1);

     check2 = new JCheckBox("Spanish");
     check2.setBounds(10,60,90,30);
     check2.addChangeListener(this);
     add(check2);

     check3 = new JCheckBox("French");
     check3.setBounds(10,100,90,30);
     check3.addChangeListener(this);
     add(check3);

 }
      public void stateChanged(ChangeEvent e){

      String cadena = "";

       if(check1.isSelected() == true){
        cadena = cadena + "English-";
  }
       if(check2.isSelected() == true){
        cadena = cadena + "Spanish-";
  }
       if(check3.isSelected() == true){
        cadena = cadena + "French-";
  }
        setTitle(cadena);
 }
      public static void main(String args[]){
       Checkbox interfaz = new Checkbox();
        interfaz.setBounds(0,0,400,350);
        interfaz.setResizable(false);
        interfaz.setLocationRelativeTo(null);
        interfaz.setVisible(true);
 }
}