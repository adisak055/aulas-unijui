/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aula.catavento;

import com.aula.pid.ExemploPID3;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author root
 */
public class JPID extends javax.swing.JFrame {
    private final ExemploPID3 exemploPID3;
    private final Serial serial;

    /**
     * Creates new form JPID
     */

    JPID(ExemploPID3 pid3, Serial serial) {
        this.serial = serial;
        if (pid3==null) {
            pid3 = new ExemploPID3(0, 0.1, 0);
        }
        this.exemploPID3 = pid3;
        
        initComponents();
        
        SpinnerNumberModel spinnerNumberModelP = new SpinnerNumberModel(exemploPID3.getP(), 0d, 2d, 0.01);
        SpinnerNumberModel spinnerNumberModelI = new SpinnerNumberModel(exemploPID3.getI(), 0d, 2d, 0.01);
        SpinnerNumberModel spinnerNumberModelD = new SpinnerNumberModel(exemploPID3.getD(), 0d, 2d, 0.01);
        SpinnerNumberModel spinnerNumberModeIdeal = new SpinnerNumberModel(exemploPID3.getIdeal(), 0d, 1024d, 1d);
        jSpinnerP.setModel(spinnerNumberModelP);
        jSpinnerI.setModel(spinnerNumberModelI);
        jSpinnerD.setModel(spinnerNumberModelD);
        jSpinnerIdeal.setModel(spinnerNumberModeIdeal);
    }
    
    public void atualizaValores(Double valorLido, Double error, Double sumErrors, Double ret) {
       jTextField_Lido.setText(valorLido.toString());
       jTextField_Erro.setText(error.toString());
       jTextField_SomaErros.setText(sumErrors.toString());
       jTextField_Retorno.setText(ret.toString());
    }
    public void addLog(String string) {
        jTextArea_log.append(string+"\n");
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
        jSpinnerP = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jSpinnerI = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jSpinnerD = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jSpinnerIdeal = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_Lido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Erro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_SomaErros = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField_Retorno = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_log = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros"));
        jPanel1.setLayout(new java.awt.GridLayout(0, 2));

        jLabel1.setText("P");
        jPanel1.add(jLabel1);

        jSpinnerP.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerPStateChanged(evt);
            }
        });
        jPanel1.add(jSpinnerP);

        jLabel3.setText("I");
        jPanel1.add(jLabel3);

        jSpinnerI.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerIStateChanged(evt);
            }
        });
        jPanel1.add(jSpinnerI);

        jLabel2.setText("D");
        jPanel1.add(jLabel2);

        jSpinnerD.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerDStateChanged(evt);
            }
        });
        jPanel1.add(jSpinnerD);

        jLabel9.setText("Ideal:");
        jPanel1.add(jLabel9);

        jSpinnerIdeal.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(512), null, null, Integer.valueOf(1)));
        jSpinnerIdeal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerIdealStateChanged(evt);
            }
        });
        jPanel1.add(jSpinnerIdeal);

        getContentPane().add(jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));
        jPanel2.setLayout(new java.awt.GridLayout(0, 2));

        jLabel5.setText("Valor Lido:");
        jPanel2.add(jLabel5);

        jTextField_Lido.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Lido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_LidoActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_Lido);

        jLabel6.setText("Erro:");
        jPanel2.add(jLabel6);

        jTextField_Erro.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Erro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ErroActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_Erro);

        jLabel7.setText("Soma de Erros:");
        jPanel2.add(jLabel7);

        jTextField_SomaErros.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_SomaErros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SomaErrosActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_SomaErros);

        jLabel8.setText("Retorno:");
        jPanel2.add(jLabel8);

        jTextField_Retorno.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_Retorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_RetornoActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_Retorno);

        getContentPane().add(jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Log"));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jTextArea_log.setColumns(20);
        jTextArea_log.setRows(5);
        jScrollPane1.setViewportView(jTextArea_log);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3);

        jMenu1.setText("Ações");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-717)/2, (screenSize.height-523)/2, 717, 523);
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinnerPStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerPStateChanged
        exemploPID3.setP((Double)jSpinnerP.getValue());
    }//GEN-LAST:event_jSpinnerPStateChanged

    private void jSpinnerIStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerIStateChanged
        exemploPID3.setI((Double)jSpinnerI.getValue());
    }//GEN-LAST:event_jSpinnerIStateChanged

    private void jSpinnerDStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerDStateChanged
        exemploPID3.setD((Double)jSpinnerD.getValue());
    }//GEN-LAST:event_jSpinnerDStateChanged

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTextField_LidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_LidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_LidoActionPerformed

    private void jTextField_ErroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ErroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ErroActionPerformed

    private void jTextField_SomaErrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SomaErrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SomaErrosActionPerformed

    private void jTextField_RetornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_RetornoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_RetornoActionPerformed

    private void jSpinnerIdealStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerIdealStateChanged
        exemploPID3.setIdeal((Double)jSpinnerIdeal.getValue());
    }//GEN-LAST:event_jSpinnerIdealStateChanged

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            FileUtils.gravaArquivo(new StringBuffer(jTextArea_log.getText()), "log/"+new Date().getTime()+".txt");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao Salvar Arquivo");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JPID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JPID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JPID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JPID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new JPID(new ExemploPID3(0d, 0.5, 0d), new Serial()).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerD;
    private javax.swing.JSpinner jSpinnerI;
    private javax.swing.JSpinner jSpinnerIdeal;
    private javax.swing.JSpinner jSpinnerP;
    private javax.swing.JTextArea jTextArea_log;
    private javax.swing.JTextField jTextField_Erro;
    private javax.swing.JTextField jTextField_Lido;
    private javax.swing.JTextField jTextField_Retorno;
    private javax.swing.JTextField jTextField_SomaErros;
    // End of variables declaration//GEN-END:variables

    

    
}
