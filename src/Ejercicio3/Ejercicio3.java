package Ejercicio3;

import Menu.Menu;
import java.awt.Color;
/**
 *
 * @author isaac
 */
public class Ejercicio3 extends javax.swing.JFrame {
    public Ejercicio3() {
        this.setTitle("Ejercicio 3");
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        miboton1 = new componentes.Miboton();
        miboton2 = new componentes.Miboton();
        jScrollPane4 = new javax.swing.JScrollPane();
        Lista4 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        Lista3 = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        Lista2 = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        Area = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        miboton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesINT/playXL.png"))); // NOI18N
        miboton1.setText(" ");
        miboton1.setContentAreaFilled(false);
        miboton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesINT/Play.png"))); // NOI18N
        miboton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miboton1ActionPerformed(evt);
            }
        });
        getContentPane().add(miboton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 180, 140));

        miboton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesINT/atras.png"))); // NOI18N
        miboton2.setContentAreaFilled(false);
        miboton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesINT/atras2.png"))); // NOI18N
        miboton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miboton2ActionPerformed(evt);
            }
        });
        getContentPane().add(miboton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(711, 420, 130, 80));

        Lista4.setBackground(new java.awt.Color(0, 0, 0));
        Lista4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lista4.setForeground(new java.awt.Color(51, 255, 51));
        jScrollPane4.setViewportView(Lista4);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 210, 306));

        Lista3.setBackground(new java.awt.Color(0, 0, 0));
        Lista3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lista3.setForeground(new java.awt.Color(51, 255, 102));
        jScrollPane2.setViewportView(Lista3);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 230, 306));

        Lista2.setBackground(new java.awt.Color(0, 0, 0));
        Lista2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lista2.setForeground(new java.awt.Color(51, 255, 102));
        jScrollPane3.setViewportView(Lista2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 230, 306));

        Area.setEditable(false);
        Area.setBackground(new java.awt.Color(0, 0, 0));
        Area.setColumns(20);
        Area.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Area.setForeground(new java.awt.Color(51, 255, 51));
        Area.setLineWrap(true);
        Area.setRows(5);
        jScrollPane5.setViewportView(Area);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 210, 306));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ejercicio3/FondoH.jpg"))); // NOI18N
        jLabel1.setText("Iniciar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miboton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miboton1ActionPerformed
     Ejercicio3.Area.setText("");
     MostrarH h1=new MostrarH("Subhilo1");
     MostrarH h2=new MostrarH("Subhilo2");
     MostrarH h3=new MostrarH("Subhilo3");
     MostrarH h4=new MostrarH("Subhilo4");
     MostrarH h5=new MostrarH("Subhilo5");
     
     Thread hilo1= new Thread(h1);
     Thread hilo2= new Thread(h2);
     Thread hilo3= new Thread(h3);
     Thread hilo4= new Thread(h4);
     Thread hilo5= new Thread(h5);
     
     h1.Hilo.setPriority(Thread.MAX_PRIORITY);
     hilo1.start();
     h2.Hilo.setPriority(Thread.MIN_PRIORITY);
     hilo2.start();
     h3.Hilo.setPriority(Thread.MAX_PRIORITY);
     hilo3.start();
     h4.Hilo.setPriority(Thread.NORM_PRIORITY);
     hilo4.start();
     h5.Hilo.setPriority(Thread.MIN_PRIORITY);
     hilo5.start();
        
     
      
    }//GEN-LAST:event_miboton1ActionPerformed

    private void miboton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miboton2ActionPerformed
    Menu m=new Menu();
    m.setVisible(true);
    dispose();
    }//GEN-LAST:event_miboton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea Area;
    public static javax.swing.JList Lista2;
    public static javax.swing.JList Lista3;
    public static javax.swing.JList Lista4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private componentes.Miboton miboton1;
    private componentes.Miboton miboton2;
    // End of variables declaration//GEN-END:variables
}
