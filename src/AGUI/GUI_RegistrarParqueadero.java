/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AGUI;

import BLOGICA.Expresiones;
import BLOGICA.ManParqueadero;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class GUI_RegistrarParqueadero extends javax.swing.JFrame {

    ManParqueadero ObjManParq = new ManParqueadero();
    Parqueaderos ObjParq = new Parqueaderos();
    Expresiones ObjExp = new Expresiones();
        
    public GUI_RegistrarParqueadero() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNombreP = new javax.swing.JTextField();
        jTextFieldCalleP = new javax.swing.JTextField();
        jTextFieldCalleS = new javax.swing.JTextField();
        jTextFieldSector = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jSpinnerNPlazas = new javax.swing.JSpinner();
        jSpinnerTarifa = new javax.swing.JSpinner();
        jButtonConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Registrar Parqueadero");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 180, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 250, 50));

        jLabel2.setText("Nombre del Parqueadero:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel3.setText("Calle Principal:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel4.setText("Calle Secundaria:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jLabel5.setText("Sector:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        jLabel6.setText("Numero de Plazas:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jLabel7.setText("Tarifa:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        jTextFieldNombreP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombrePActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 170, -1));
        getContentPane().add(jTextFieldCalleP, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 170, -1));
        getContentPane().add(jTextFieldCalleS, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 170, -1));
        getContentPane().add(jTextFieldSector, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 170, -1));

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, -1));

        jSpinnerNPlazas.setName(""); // NOI18N
        getContentPane().add(jSpinnerNPlazas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));
        getContentPane().add(jSpinnerTarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldNombrePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombrePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombrePActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        int ok = 1;

        System.out.println("asdasdasd");
     
        if(this.jTextFieldNombreP != null){
            ok = 1;
            
            if(this.jTextFieldCalleP != null){
                ok = 1;
                
                if(this.jTextFieldCalleS!= null){
                    ok = 1;
                    
                    if(this.jTextFieldSector != null){
                        ok = 1;
                    }else{
                        ok = 0;
                        JOptionPane.showMessageDialog(null, "El campo Sector se encuentra vacio", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    ok = 0;
                    JOptionPane.showMessageDialog(null, "El campo Calle Secundaria se encuentra vacio", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                ok = 0;
                JOptionPane.showMessageDialog(null, "El campo Calle Principal se encuentra vacio", "ERROR", JOptionPane.ERROR_MESSAGE);
            } 
         }else{
            ok = 0;
            JOptionPane.showMessageDialog(null, "Ingrese un nombre para el parqueadero", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
     
        if(ok == 1){
            System.out.println(" chek ");
        }
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_RegistrarParqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_RegistrarParqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_RegistrarParqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_RegistrarParqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_RegistrarParqueadero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinnerNPlazas;
    private javax.swing.JSpinner jSpinnerTarifa;
    private javax.swing.JTextField jTextFieldCalleP;
    private javax.swing.JTextField jTextFieldCalleS;
    private javax.swing.JTextField jTextFieldNombreP;
    private javax.swing.JTextField jTextFieldSector;
    // End of variables declaration//GEN-END:variables
}
