import javax.swing.*;
import java.awt.event.*;

public class Campo extends JFrame implements ActionListener{

  private JLabel label1;
  private JButton boton1;
  private JTextField tfield1;

   public Campo(){
    setLayout(null);

     label1 = new JLabel ("Da un nombre a la interfaz:");
     label1.setBounds(5,1,170,80);
     add(label1);
  
     tfield1 = new JTextField("");
     tfield1.setBounds(10,60,250,25);
     add(tfield1);

     boton1 = new JButton ("Enviar");
     boton1.setBounds(210,100,75,25);
     add(boton1);
     boton1.addActionListener(this);
     
 }
      public void actionPerformed(ActionEvent e){
       if(e.getSource() == boton1){
        String texto = tfield1.getText();
        setTitle(texto);
    } 
  }
       public static void main(String args[]){
        Campo interfaz1 = new Campo();
         interfaz1.setBounds(0,0,350,200);
         interfaz1.setResizable(false);
         interfaz1.setLocationRelativeTo(null);
         interfaz1.setVisible(true);
 }
}