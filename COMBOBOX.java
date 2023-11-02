import javax.swing.*;
import java.awt.event.*;

public class COMBOBOX extends JFrame implements ItemListener{

  private JComboBox combo1;
 
   public COMBOBOX(){
    setLayout(null);
     
     combo1 = new JComboBox();
     combo1.setBounds(50,80,100,30);
     add(combo1);
     combo1.addItem("rojo");
     combo1.addItem("azul");
     combo1.addItem("verde");
     combo1.addItem("amarillo");
     combo1.addItemListener(this);

 }
      public void itemStateChanged(ItemEvent e){
       if(e.getSource () == combo1){
        String seleccion = combo1.getSelectedItem().toString();
        setTitle(seleccion);

   }
  }
     public static void main(String args[]){
      COMBOBOX interfaz = new COMBOBOX();
       interfaz.setBounds(0,0,250,200);
       interfaz.setResizable(false);
       interfaz.setLocationRelativeTo(null);
       interfaz.setVisible(true);
 }
}