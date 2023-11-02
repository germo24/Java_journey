import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RGB extends JFrame implements ActionListener{

  private JLabel label1, label2, label3;
  private JComboBox combo1,combo2,combo3;
  private JButton boton1;

   public RGB(){
    setLayout(null);

     label1 = new JLabel("Rojo:");
     label1.setBounds(20,20,90,30);
     add(label1);

     combo1 = new JComboBox();
     combo1.setBounds(160,15,120,40);
     for(int i = 0; i <= 255; i++){
     
      combo1.addItem(String.valueOf(i));
  }
      add(combo1);

     label2 = new JLabel("Verde:");
     label2.setBounds(20,80,90,30);
     add(label2);

     combo2 = new JComboBox();
     combo2.setBounds(160,75,120,40);
     for(int i = 0; i <= 255; i++){
     
      combo2.addItem(String.valueOf(i));
  }
      add(combo2);

     label3 = new JLabel("Azul:");
     label3.setBounds(20,140,90,30);
     add(label3);

     combo3 = new JComboBox();
     combo3.setBounds(160,135,120,40);
     for(int i = 0; i <= 255; i++){
     
      combo3.addItem(String.valueOf(i));
  }
      add(combo3);

      boton1 = new JButton("Cambiar color");
      boton1.setBounds(20,190,120,40);
      add(boton1);
      boton1.addActionListener(this);

 }
       public void actionPerformed(ActionEvent e){
        if(e.getSource () == boton1){

         String cadena1 = combo1.getSelectedItem().toString();
         String cadena2 = combo2.getSelectedItem().toString();
         String cadena3 = combo3.getSelectedItem().toString();

          int rojo = Integer.parseInt(cadena1);
          int verde = Integer.parseInt(cadena2);
          int azul = Integer.parseInt(cadena3);

           Color color1 = new Color(rojo,verde,azul); 
           boton1.setBackground(color1);

  }
 }

       public static void main(String args[]){
        RGB interfaz = new RGB();
         interfaz.setBounds(0,0,325,300);
         interfaz.setResizable(false);
         interfaz.setLocationRelativeTo(null);
         interfaz.setVisible(true);

 }
}