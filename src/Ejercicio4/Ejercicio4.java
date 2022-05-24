package Ejercicio4;

import Menu.Menu;

/**
 *
 * @author isaac
 */
public class Ejercicio4 extends javax.swing.JFrame {

    public Ejercicio4() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        miboton2 = new componentes.Miboton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesINT/Play.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesINT/play 2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 80, 80));

        miboton2.setBorder(null);
        miboton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesINT/atras.png"))); // NOI18N
        miboton2.setContentAreaFilled(false);
        miboton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesINT/atras2.png"))); // NOI18N
        miboton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miboton2ActionPerformed(evt);
            }
        });
        jPanel1.add(miboton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 410, -1, 80));

        Lista.setBackground(new java.awt.Color(0, 0, 0));
        Lista.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lista.setForeground(new java.awt.Color(153, 255, 153));
        jScrollPane1.setViewportView(Lista);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 594, 370));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ejercicio4/FondoH.jpg"))); // NOI18N
        jLabel1.setText(" ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
     MostrarT h1=new MostrarT("SubHilo1");
     MostrarT h2=new MostrarT("SubHilo2");
     MostrarT h3=new MostrarT("SubHilo3");
     MostrarT h4=new MostrarT("SubHilo4");
     
     Thread hilo1= new Thread(h1);
     Thread hilo2= new Thread(h2);
     Thread hilo3= new Thread(h3);
     Thread hilo4= new Thread(h4);
     
     h1.Hilo.setPriority(Thread.MAX_PRIORITY);
     hilo1.start();
     h2.Hilo.setPriority(Thread.MIN_PRIORITY);
     hilo2.start();
     h3.Hilo.setPriority(Thread.MIN_PRIORITY);
     hilo3.start();
     h4.Hilo.setPriority(Thread.NORM_PRIORITY);
     hilo4.start();
     
        try {
            h1.Hilo.join();
            h2.Hilo.join();
            h1.Hilo.join();
            h2.Hilo.join();
        } catch (Exception e) {
            System.out.println("Errorr"+e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void miboton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miboton2ActionPerformed
    Menu m=new Menu();
    m.setVisible(true);
    dispose();
    }//GEN-LAST:event_miboton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JList Lista;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private componentes.Miboton miboton2;
    // End of variables declaration//GEN-END:variables
}
