import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Menu extends JFrame implements ActionListener{

  private JMenuBar menubar1;
  private JMenu menu1;
  private JMenuItem menuitem1,menuitem2,menuitem3;

   public Menu(){
    setLayout(null);
    setTitle(" Menu basico ");

     menubar1 = new JMenuBar();
     setJMenuBar(menubar1);

     menu1 = new JMenu("Opciones de Color");
     menubar1.add(menu1);

     menuitem1 = new JMenuItem("Rojo");
     menu1.add(menuitem1);
     menuitem1.addActionListener(this);

     menuitem2 = new JMenuItem("Verde");
     menu1.add(menuitem2);
     menuitem2.addActionListener(this);

     menuitem3 = new JMenuItem("Azul");
     menu1.add(menuitem3);
     menuitem3.addActionListener(this);

 }

     public void actionPerformed(ActionEvent e){

      Container fondo = this.getContentPane();

       if(e.getSource () == menuitem1){
        fondo.setBackground(new Color(255,0,0));
   }

       if(e.getSource () == menuitem2){
        fondo.setBackground(new Color(0,255,0));
   }

       if(e.getSource () == menuitem3){
        fondo.setBackground(new Color(0,0,255));
   }
 }

    public static void main(String args[]){

     Menu interfaz = new Menu();
      interfaz.setBounds(0,0,350,300);
      interfaz.setResizable(false);
      interfaz.setLocationRelativeTo(null);
      interfaz.setVisible(true);

 }
}