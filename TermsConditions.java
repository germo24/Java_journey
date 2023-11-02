import javax.swing.event.*;
import java.awt.event.*;
import javax.swing.*;

public class TermsConditions extends JFrame implements ActionListener,ChangeListener{

  private JLabel label1;
  private JCheckBox check1;
  private JButton boton1;

   public TermsConditions(){
    setLayout(null);

     label1 = new JLabel(" Do you accept the terms and conditions? ");
     label1.setBounds(5,10,260,90);
     add(label1);

     check1 = new JCheckBox(" Yes, I accept ");
     check1.setBounds(10,90,120,40);
     add(check1);
     check1.addChangeListener(this);

     boton1 = new JButton(" Continue ");
     boton1.setBounds(150,120,90,30);
     add(boton1);
     boton1.setEnabled(false);
     boton1.addActionListener(this);
 }

      public void stateChanged(ChangeEvent e){

       if(check1.isSelected() == true){
        boton1.setEnabled(true);
  }
       else{
        boton1.setEnabled(false);

  }
 }

      public void actionPerformed(ActionEvent e){

       if(e.getSource() == boton1){
        System.exit(0);
  }
 }

      public static void main(String args[]){
       TermsConditions interfaz = new TermsConditions();
        interfaz.setBounds(0,0,300,250);
        interfaz.setResizable(false);
        interfaz.setLocationRelativeTo(null);
        interfaz.setVisible(true);

 }
}