/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author mavd_
 */
public class frmCrearVacante extends javax.swing.JFrame {

    /**
     * Creates new form frmUsuario
     */
    public frmCrearVacante() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtSalario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtNumeroVacante = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CuadroTxtDescripcion = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaVacantes = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        BtnActualizar = new javax.swing.JButton();
        BtnAtras = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CREACION VACANTE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 20, 340, 35);

        jLabel2.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRE:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 110, 69, 18);

        TxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(TxtNombre);
        TxtNombre.setBounds(280, 110, 192, 22);

        jLabel3.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CODIGO:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 70, 64, 18);
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(280, 70, 192, 22);

        jLabel4.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SALARIO:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(180, 150, 71, 18);
        getContentPane().add(TxtSalario);
        TxtSalario.setBounds(280, 150, 192, 22);

        jLabel5.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NUMERO VACANTES:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 190, 156, 18);
        getContentPane().add(TxtNumeroVacante);
        TxtNumeroVacante.setBounds(280, 190, 192, 22);

        jLabel6.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DESCRIPCION VACANTE :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 230, 190, 18);

        CuadroTxtDescripcion.setColumns(20);
        CuadroTxtDescripcion.setRows(5);
        jScrollPane1.setViewportView(CuadroTxtDescripcion);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(280, 230, 263, 50);

        TablaVacantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(TablaVacantes);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 310, 690, 70);

        btnAgregar.setText("AGREGAR");
        getContentPane().add(btnAgregar);
        btnAgregar.setBounds(530, 30, 120, 25);

        BtnEliminar.setText("ELIMINAR");
        getContentPane().add(BtnEliminar);
        BtnEliminar.setBounds(530, 70, 120, 25);

        BtnEditar.setText("EDITAR");
        getContentPane().add(BtnEditar);
        BtnEditar.setBounds(530, 110, 120, 25);

        BtnActualizar.setText("ACTUALIZAR");
        getContentPane().add(BtnActualizar);
        BtnActualizar.setBounds(530, 150, 120, 25);

        BtnAtras.setText("ATRAS");
        getContentPane().add(BtnAtras);
        BtnAtras.setBounds(530, 190, 120, 25);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoRegistrar.jpg"))); // NOI18N
        jLabel7.setText("CANCELAR");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, -10, 710, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreActionPerformed

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
            java.util.logging.Logger.getLogger(frmCrearVacante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCrearVacante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCrearVacante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCrearVacante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCrearVacante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnActualizar;
    public javax.swing.JButton BtnAtras;
    public javax.swing.JButton BtnEditar;
    public javax.swing.JButton BtnEliminar;
    public javax.swing.JTextArea CuadroTxtDescripcion;
    public javax.swing.JTable TablaVacantes;
    public javax.swing.JTextField TxtNombre;
    public javax.swing.JTextField TxtNumeroVacante;
    public javax.swing.JTextField TxtSalario;
    public javax.swing.JButton btnAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    public javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
