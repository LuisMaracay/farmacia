/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

/**
 *
 * @author Luis Maracay
 */
public class ventana2 extends javax.swing.JFrame{

    public double totalg;
    public int totalvendidos;
    public int medvendidos;
    public int medreguladosvendidos;
    public int mednoreguladosvendidos;
    public int utilesvendidos;
    public double totalgeneralvendido;
    public double totalmedvendido;
    public double totalutilesvendido;
    public int totalclientes;

    /**
     * Creates new form ventana2
     */
    public ventana2 () {
        initComponents();
        setLocationRelativeTo(null);
        
        
    ventana1 cont1= new ventana1();
    
    totalvendidos = cont1.totalvendidos;
    totalgeneralvendido = cont1.totalgeneralvendido;
    medvendidos = cont1.medvendidos;
    totalmedvendido = cont1.totalmedvendido;
    medreguladosvendidos = cont1.medreguladosvendidos;
    mednoreguladosvendidos = cont1.mednoreguladosvendidos;
    utilesvendidos = cont1.utilesvendidos;
    totalutilesvendido = cont1.totalutilesvendido;
    totalclientes = cont1.totalclientes;
    
jTextArearegistro.setText("Productos vendidos: "+ totalvendidos+"\n"+
        "Total de ventas Bs: "+totalgeneralvendido+"\n"+"Medicamentos vendidos: "
        +medvendidos+"\n"+"Medicamentos regulados vendidos: "+medreguladosvendidos+
        "\n"+"Medicamentos no regulados vendidos: "+mednoreguladosvendidos+"\n"+
        "Venta de medicamentos Bs: "+totalmedvendido+"\n"+"Utiles vendidos: "
        +utilesvendidos+"\n"+"Venta de utiles Bs: "+totalutilesvendido+
        "\n"+"Total general de ventas Bs: "+totalgeneralvendido+"\n"+"Clientes atendidos: "
        +totalclientes);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArearegistro = new javax.swing.JTextArea();
        jButtoncerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(379, 308));
        setPreferredSize(new java.awt.Dimension(300, 308));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jTextArearegistro.setColumns(20);
        jTextArearegistro.setRows(5);
        jScrollPane1.setViewportView(jTextArearegistro);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 319;
        gridBagConstraints.ipady = 186;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 19);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        jButtoncerrar.setText("Cerrar");
        jButtoncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncerrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 160, 11, 0);
        getContentPane().add(jButtoncerrar, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Total de registros");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 104, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtoncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncerrarActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButtoncerrarActionPerformed

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
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtoncerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea jTextArearegistro;
    // End of variables declaration//GEN-END:variables
}
