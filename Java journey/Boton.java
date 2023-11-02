import javax.swing.*;
import java.awt.event.*;

public class Boton extends JFrame implements ActionListener{

  JButton boton1;
   public Boton(){
    setLayout(null);
    boton1 = new JButton (" Exit ");
    boton1.setBounds(300,220,70,25);
    add(boton1);
    boton1.addActionListener(this);

 }

   public void actionPerformed(ActionEvent evento){
    if(evento.getSource() == boton1){
     System.exit(0);
  }
 }
    public static void main(String args[]){
     Boton interfaz1 = new Boton();
     interfaz1.setBounds(0,0,400,300);
     interfaz1.setVisible(true);
     interfaz1.setLocationRelativeTo(null);
     interfaz1.setResizable(false);

 }
}