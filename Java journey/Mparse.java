import javax.swing.*;
import java.awt.event.*;

public class Mparse extends JFrame implements ActionListener {

  private JLabel label1,label2,label3;
  private JTextField tfield1,tfield2;
  private JButton boton1;

   public Mparse(){
    setLayout(null);
    setTitle("Sumas");

     label1 = new JLabel("Valor 1: ");
     label1.setBounds(10,10,90,40);
     add(label1);

     label2 = new JLabel("Valor 2: ");
     label2.setBounds(10,60,90,40);
     add(label2);

     label3 = new JLabel("Resultado:");
     label3.setBounds(140,125,90,30);
     add(label3);

     tfield1 = new JTextField();
     tfield1.setBounds(60,20,150,25);
     add(tfield1);

     tfield2 = new JTextField();
     tfield2.setBounds(60,70,150,25);
     add(tfield2);

     boton1 = new JButton("Sumar");
     boton1.setBounds(10,125,75,25);
     add(boton1);
     boton1.addActionListener(this);

 }
     public void actionPerformed(ActionEvent e){
      if(e.getSource() == boton1){
      
      int valor1,valor2,resultado;
       valor1 = Integer.parseInt(tfield1.getText());
       valor2 = Integer.parseInt(tfield2.getText());
       resultado = valor1 + valor2;

        label3.setText("Resultado: " + resultado);
        tfield1.setText("");
        tfield2.setText("");

  }
 }

     public static void main(String args[]){
      Mparse interfaz = new Mparse();
       interfaz.setBounds(0,0,300,200);
       interfaz.setResizable(false);
       interfaz.setLocationRelativeTo(null);
       interfaz.setVisible(true);
 }
}