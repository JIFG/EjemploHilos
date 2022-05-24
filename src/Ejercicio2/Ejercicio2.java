/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import Menu.Menu;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author MARCELA GARCIA REVIL
 */
public class Ejercicio2 extends javax.swing.JFrame {
HilosFuego h1;
    public Ejercicio2() {
        initComponents();
         h1= new HilosFuego();
        setLocationRelativeTo(null);
        jLabel2.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        miboton2 = new componentes.Miboton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        miboton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesINT/atras.png"))); // NOI18N
        miboton2.setContentAreaFilled(false);
        miboton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesINT/atras2.png"))); // NOI18N
        miboton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miboton2ActionPerformed(evt);
            }
        });
        jPanel1.add(miboton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 130, 100));

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ejercicio2/Alarma.png"))); // NOI18N
        jToggleButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Ejercicio2/Alarma2.png"))); // NOI18N
        jToggleButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Ejercicio2/Alarma.png"))); // NOI18N
        jToggleButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Ejercicio2/Alarma2.png"))); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 100, 140));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ejercicio2/pared2.jpg"))); // NOI18N
        jLabel4.setText(" ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 450));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 153));
        jLabel3.setText("Alarma Incendios");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 390, 70));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 220, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ejercicio2/Fondo22.png"))); // NOI18N
        jLabel2.setText(" ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        try {
        jLabel1.setText("¡¡Fuego¡¡");
        if(jToggleButton1.isSelected()){
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel2.setVisible(true);
        h1.resume();
        h1.start();
        }else{
        h1.suspend();
        jLabel1.setText("");
        jLabel2.setVisible(false);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void miboton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miboton2ActionPerformed
    Menu m=new Menu();
    m.setVisible(true);
    dispose();
    }//GEN-LAST:event_miboton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private componentes.Miboton miboton2;
    // End of variables declaration//GEN-END:variables
}
