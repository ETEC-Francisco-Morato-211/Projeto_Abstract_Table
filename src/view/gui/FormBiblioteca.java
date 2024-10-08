/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.gui;

import controller.DaoBiblioteca;
import javax.swing.JOptionPane;
import model.design.Biblioteca;
import view.modelo.TabelaBiblioteca;

/**
 *
 * @author User
 */
public class FormBiblioteca extends javax.swing.JFrame {
    //Objeto de modelo de tabela
    TabelaBiblioteca modelo = new TabelaBiblioteca();
    DaoBiblioteca dBiblioteca = new DaoBiblioteca();
    

    /**
     * Creates new form FormBiblioteca
     */
    public FormBiblioteca() {
        initComponents();
        tblBiblioteca.setModel(modelo);
        this.LerTAbela();
        
    }
    
    private void LerTAbela(){
        
        modelo.LimparTabela();
       
        
        for (Biblioteca b: dBiblioteca.read()){
            modelo.addRow(b);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBiblioteca = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBiblioteca = new javax.swing.JTable();
        btnGravarb = new javax.swing.JButton();
        btnLimparb = new javax.swing.JButton();
        btnAlterarb = new javax.swing.JButton();
        btnExcluirb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de informação ");

        lblNome.setText("Nome");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblCodigo.setText("Código");

        tblBiblioteca.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblBiblioteca);

        btnGravarb.setText("Gravar ");
        btnGravarb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarbActionPerformed(evt);
            }
        });

        btnLimparb.setText("Limpar ");
        btnLimparb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparbActionPerformed(evt);
            }
        });

        btnAlterarb.setText("Alterar");
        btnAlterarb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlterarbMouseClicked(evt);
            }
        });
        btnAlterarb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarbActionPerformed(evt);
            }
        });

        btnExcluirb.setText("Excluir");
        btnExcluirb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBibliotecaLayout = new javax.swing.GroupLayout(pnlBiblioteca);
        pnlBiblioteca.setLayout(pnlBibliotecaLayout);
        pnlBibliotecaLayout.setHorizontalGroup(
            pnlBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBibliotecaLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(pnlBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBibliotecaLayout.createSequentialGroup()
                        .addGroup(pnlBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBibliotecaLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(lblNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNome))
                            .addGroup(pnlBibliotecaLayout.createSequentialGroup()
                                .addComponent(btnGravarb)
                                .addGap(36, 36, 36)
                                .addComponent(btnLimparb)))
                        .addGroup(pnlBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBibliotecaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAlterarb)
                                .addGap(32, 32, 32)
                                .addComponent(btnExcluirb))
                            .addGroup(pnlBibliotecaLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(lblCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(22, 22, 22))
        );
        pnlBibliotecaLayout.setVerticalGroup(
            pnlBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBibliotecaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pnlBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(pnlBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravarb)
                    .addComponent(btnLimparb)
                    .addComponent(btnAlterarb)
                    .addComponent(btnExcluirb))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBiblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBiblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarbActionPerformed
        // TODO add your handling code here:
        int linha = tblBiblioteca.getSelectedRow();
        
        if(linha != -1){
            dBiblioteca.update(new Biblioteca(txtNome.getText(), Integer.parseInt(txtCodigo.getText())));
            //modelo.setValueAt(txtNome.getText(), linha, 0);
           // modelo.setValueAt(txtNome.getText(), linha, 1);
            
            
            
        }
        
        this.btnLimparbActionPerformed(evt);
        this.LerTAbela();
        
    }//GEN-LAST:event_btnAlterarbActionPerformed

    private void btnExcluirbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirbActionPerformed
        // TODO add your handling code here:
         int linha = tblBiblioteca.getSelectedRow();
         
       if (linha != -1) {
           if(JOptionPane.showConfirmDialog(this, "Deseja excluir essa informação?", "Atenção!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE)== JOptionPane.YES_OPTION){
               dBiblioteca.delete(new Biblioteca(txtNome.getText(), Integer.parseInt(txtCodigo.getText())));
               
           }
           // modelo.removeRow(linha);
           
       }
       
       this.btnLimparbActionPerformed(evt);
       this.LerTAbela();
    }//GEN-LAST:event_btnExcluirbActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnGravarbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarbActionPerformed
        // TODO add your handling code here:
        try{
            dBiblioteca.create(new Biblioteca(txtNome.getText(), Integer.parseInt(txtCodigo.getText())));
            
            
            //modelo.addRow(
                   /// new Biblioteca(txtNome.getText(), Integer.parseInt(txtCodigo.getText()))

           // );
        }catch (NumberFormatException e){
        JOptionPane.showMessageDialog(this, "ERRO" + e.getMessage(), "Não foi possivel realizar essa ação", JOptionPane.ERROR_MESSAGE);
    }
        //limpar a tela
        this.btnLimparbActionPerformed(evt);
    }//GEN-LAST:event_btnGravarbActionPerformed

    private void btnLimparbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparbActionPerformed
        // TODO add your handling code here:
        txtNome.setText(null);
        txtCodigo.setText(null);
        txtNome.requestFocus();
        
    }//GEN-LAST:event_btnLimparbActionPerformed

    private void btnAlterarbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarbMouseClicked
        // TODO add your handling code here:
        int linha = tblBiblioteca.getSelectedRow();
        
        if(linha != -1){
            txtNome.setText(String.valueOf(modelo.getValueAt(linha, 0)));
            txtCodigo.setText(String.valueOf(modelo.getValueAt(linha, 1)));
        }
    }//GEN-LAST:event_btnAlterarbMouseClicked

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
            java.util.logging.Logger.getLogger(FormBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBiblioteca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarb;
    private javax.swing.JButton btnExcluirb;
    private javax.swing.JButton btnGravarb;
    private javax.swing.JButton btnLimparb;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JPanel pnlBiblioteca;
    private javax.swing.JTable tblBiblioteca;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
