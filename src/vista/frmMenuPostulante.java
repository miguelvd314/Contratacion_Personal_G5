/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;

/**
 *
 * @author Max
 */
public class frmMenuPostulante extends javax.swing.JFrame {

    /** Creates new form frmMenuPostulante */
    public frmMenuPostulante() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnVacante = new javax.swing.JButton();
        btnEstado = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnPostular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENU DEL POSTULANTE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 40, 350, 35);

        btnVacante.setFont(new java.awt.Font("Arial Black", 3, 10)); // NOI18N
        btnVacante.setForeground(new java.awt.Color(51, 0, 51));
        btnVacante.setText("VACANTES");
        getContentPane().add(btnVacante);
        btnVacante.setBounds(140, 130, 130, 23);

        btnEstado.setFont(new java.awt.Font("Arial Black", 3, 10)); // NOI18N
        btnEstado.setForeground(new java.awt.Color(51, 51, 0));
        btnEstado.setText("ESTADO");
        getContentPane().add(btnEstado);
        btnEstado.setBounds(140, 210, 130, 23);

        btnSalir.setFont(new java.awt.Font("Arial Black", 3, 10)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(51, 51, 0));
        btnSalir.setText("SALIR");
        getContentPane().add(btnSalir);
        btnSalir.setBounds(160, 320, 90, 25);

        btnPostular.setFont(new java.awt.Font("Arial Black", 3, 10)); // NOI18N
        btnPostular.setForeground(new java.awt.Color(51, 0, 51));
        btnPostular.setText("POSTULAR");
        btnPostular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostularActionPerformed(evt);
            }
        });
        getContentPane().add(btnPostular);
        btnPostular.setBounds(140, 170, 130, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoRegistrar.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 400, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPostularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPostularActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenuPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuPostulante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEstado;
    public javax.swing.JButton btnPostular;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnVacante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

}
