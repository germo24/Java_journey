import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class SubMenu extends JFrame implements ActionListener{

  private JMenuBar menubar1;
  private JMenu menu1,menu2,menu3;
  private JMenuItem menuitem1,menuitem2,menuitem3,menuitem4,menuitem5,menuitem6;

   public SubMenu(){
    setLayout(null);

     menubar1 = new JMenuBar();
     setJMenuBar(menubar1);

     menu1 = new JMenu("Opciones");
     menubar1.add(menu1);

     menu2 = new JMenu("Longitud de la ventana");
     menu1.add(menu2);

     menu3 = new JMenu("Color");
     menu1.add(menu3);

     menuitem1 = new JMenuItem("300 * 250");
     menu2.add(menuitem1);
     menuitem1.addActionListener(this);

     menuitem2 = new JMenuItem("350 * 300");
     menu2.add(menuitem2);
     menuitem2.addActionListener(this);

     menuitem3 = new JMenuItem("400 * 350");
     menu2.add(menuitem3);
     menuitem3.addActionListener(this);

     menuitem4 = new JMenuItem("Rojo");
     menu3.add(menuitem4);
     menuitem4.addActionListener(this);

     menuitem5 = new JMenuItem("Verde");
     menu3.add(menuitem5);
     menuitem5.addActionListener(this);

     menuitem6 = new JMenuItem("Azul");
     menu3.add(menuitem6);
     menuitem6.addActionListener(this);
 }

      public void actionPerformed(ActionEvent e){

        if(e.getSource () == menuitem1){
         setSize(300,250);
  }

        if(e.getSource () == menuitem2){
         setSize(350,300);
  }
        if(e.getSource () == menuitem3){
         setSize(400,350);
  }
        if(e.getSource () == menuitem4){
         getContentPane().setBackground(new Color(255,0,0));
  }
        if(e.getSource () == menuitem5){
         getContentPane().setBackground(new Color(0,255,0));
  }
        if(e.getSource () == menuitem6){
         getContentPane().setBackground(new Color(0,0,255));
  }
 }

     public static void main(String args[]){
      SubMenu interfaz = new SubMenu();
       interfaz.setBounds(0,0,300,300);
       interfaz.setResizable(false);
       interfaz.setLocationRelativeTo(null);
       interfaz.setVisible(true);

 }
}