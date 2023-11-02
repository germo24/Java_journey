/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 *
 * @author Germo
 */
public class Barras extends javax.swing.JFrame {

    /**
     * Creates new form Barras
     */
    public Barras() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle(" Gráfico de Barras ");
        this.getContentPane().setBackground(new Color(213,233,255));
        tfield1.setBackground(new Color(220, 220, 225));
        tfield2.setBackground(new Color(220, 220, 225));
        tfield3.setBackground(new Color(220, 220, 225));
        boton1.setBackground(new Color(255, 255, 255));

    }

    boolean bandera = false;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        tfield2 = new javax.swing.JTextField();
        tfield3 = new javax.swing.JTextField();
        tfield1 = new javax.swing.JTextField();
        boton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setText("Perros:");

        label2.setText("Gatos:");

        label3.setText("Otros:");

        tfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfield1ActionPerformed(evt);
            }
        });

        boton1.setText("Graficar");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2)
                            .addComponent(label3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfield3)
                            .addComponent(tfield2, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(label1)
                        .addGap(18, 18, 18)
                        .addComponent(tfield1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(416, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1)
                    .addComponent(tfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2)
                    .addComponent(tfield2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label3)
                            .addComponent(tfield3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton1)
                        .addGap(34, 34, 34))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfield1ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed

        bandera = true;
        repaint();
    }//GEN-LAST:event_boton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Barras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Barras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Barras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Barras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Barras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JTextField tfield1;
    private javax.swing.JTextField tfield2;
    private javax.swing.JTextField tfield3;
    // End of variables declaration//GEN-END:variables

    public int ValorReferencial(int valor1, int valor2, int valor3) {

        if (valor1 >= valor2 && valor1 >= valor3) {

            return valor1;

        } else if (valor2 >= valor1 && valor2 >= valor3) {

            return valor2;

        } else {

            return valor3;

        }

    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);

        //g.setColor(new Color(0, 100, 255));
        g.setColor(new Color(35, 34, 33));
        g.fillRect(125, 50, 4, 300);
        g.fillRect(125, 350, 350, 4);

        try {

            if (bandera == true) {

                String Svalor1 = tfield1.getText();
                String Svalor2 = tfield2.getText();
                String Svalor3 = tfield3.getText();

                int valor1 = Integer.parseInt(Svalor1);
                int valor2 = Integer.parseInt(Svalor2);
                int valor3 = Integer.parseInt(Svalor3);

                int Rvalue = ValorReferencial(valor1, valor2, valor3);
                int total = valor1 + valor2 + valor3;

                int long_valor1 = (valor1 * 250) / Rvalue;
                int long_valor2 = (valor2 * 250) / Rvalue;
                int long_valor3 = (valor3 * 250) / Rvalue;
                
                float Fvalor1 = valor1;
                float Fvalor2 = valor2;
                float Fvalor3 = valor3;
                float Ftotal = total;

                float Pvalor1 = (Fvalor1 * 100) / Ftotal;
                float Pvalor2 = (Fvalor2 * 100) / Ftotal;
                float Pvalor3 = (Fvalor3 * 100) / Ftotal;

                g.setColor(new Color(0, 100, 255));
                g.fillRoundRect(128, 170, long_valor1, 40, 4, 9);
                g.setColor(new Color(0, 100, 255));
                g.fillRect(30, 90, 20, 20);
                g.drawString( (double) Math.round(Pvalor1 * 10) / 10  + " % ", 60, 105);

                g.setColor(new Color(30, 255, 190));
                g.fillRoundRect(128, 230, long_valor2, 40, 4, 9);
                g.fillRect(30, 130, 20, 20);
                g.drawString( (double) Math.round(Pvalor2 * 10) / 10 + " % ", 60, 145);

                g.setColor(new Color(255, 190, 30));
                g.fillRoundRect(128, 290, long_valor3, 40, 4, 9);
                g.fillRect(30, 170, 20, 20);
                g.drawString( (double) Math.round(Pvalor3 * 10) / 10 + " % ", 60, 185);

            }
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, " Ingresa correctamente los datos para continuar", " Error!", JOptionPane.WARNING_MESSAGE);

        }
    }

}
