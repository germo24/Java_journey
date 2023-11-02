import javax.swing.*;

public class Formulario extends JFrame{
  private JLabel label1;

  public Formulario(){
   setLayout(null);
   label1 = new JLabel(" HOLA BORIS");
   label1.setBounds(0,0,300,400);
   add(label1);

 }
    public static void main(String args[]){
    Formulario formulario1 = new Formulario();
    formulario1.setBounds(20,10,300,500);
    formulario1.setVisible(true);

  }
}