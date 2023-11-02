import javax.swing.*;
import java.awt.event.*;

public class Prueba extends JFrame implements ActionListener{

  private JLabel label1;
  private JTextField tfield1;
  private JTextArea tarea1;
  private JButton boton1;
  private JScrollPane spane1;

  String texto = "";

   public Prueba(){
    setTitle("Libreta");
    setLayout(null);
     
     label1 = new JLabel("Introduce texto para pasarlo a la libreta:");
     label1.setBounds(5,0,300,100);
     add(label1);

     tfield1 = new JTextField();
     tfield1.setBounds(10,70,280,30);
     add(tfield1);

    tarea1 = new JTextArea();
    spane1 = new JScrollPane(tarea1);
    spane1.setBounds(10,110,250,190);
    add(spane1);

    boton1 = new JButton("Enviar");
    boton1.setBounds(290,280,75,25);
    add(boton1);
    boton1.addActionListener(this);

  }

     public void actionPerformed(ActionEvent e){
      if(e.getSource () == boton1){
       texto += tfield1.getText() + "\n";
       tarea1.setText(texto);
       tfield1.setText("");
    }
   } 

      public static void main(String args[]){
       Prueba interfaz1 = new Prueba();
        interfaz1.setBounds(0,0,400,350);
        interfaz1.setResizable(false);
        interfaz1.setLocationRelativeTo(null);
        interfaz1.setVisible(true);
 }
}