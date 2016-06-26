/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tela;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;


/**
 *
 * @author marcos
 */
public abstract class TelaPrincipal extends javax.swing.JFrame {


    /**
     * Creates new form TelaPrincipal
     * 
     */
    public TelaPrincipal() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoURL = new javax.swing.JTextField();
        btnIndex = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        campoPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        labelCount = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LuceneHTML");

        jLabel2.setText("URL:");

        campoURL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoURLActionPerformed(evt);
            }
        });

        btnIndex.setText("Index");
        btnIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndexActionPerformed(evt);
            }
        });

        jLabel3.setText("Search:");

        campoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisaActionPerformed(evt);
            }
        });
        campoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoPesquisaKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoPesquisaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoPesquisaKeyReleased(evt);
            }
        });

        btnPesquisar.setText("Search");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Filename", "Path"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setColumnSelectionAllowed(true);
        tabela.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabela);
        tabela.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setPreferredWidth(200);
            tabela.getColumnModel().getColumn(0).setMaxWidth(200);
        }

        labelCount.setText("HTML files found:");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoPesquisa)
                                    .addComponent(campoURL))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelCount)
                                .addGap(467, 467, 467)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIndex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIndex))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(labelCount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoURLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoURLActionPerformed
        index();
    }//GEN-LAST:event_campoURLActionPerformed

    abstract void index();
    
    private void btnIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndexActionPerformed
        index();
    }//GEN-LAST:event_btnIndexActionPerformed
    
    abstract void search();
    
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        search();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void campoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaActionPerformed
        if(campoPesquisa.getText().equals("")) return; 
        search();  
    }//GEN-LAST:event_campoPesquisaActionPerformed

    private void campoPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesquisaKeyPressed
        if (campoPesquisa.getText().equals("")) return;
        search();
    }//GEN-LAST:event_campoPesquisaKeyPressed

    private void campoPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesquisaKeyReleased
        if (campoPesquisa.getText().equals("")) return;
        search();
    }//GEN-LAST:event_campoPesquisaKeyReleased

    private void campoPesquisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesquisaKeyTyped
        if (campoPesquisa.getText().equals("")) return;
        search();    }//GEN-LAST:event_campoPesquisaKeyTyped

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        deleteIndex();
    }//GEN-LAST:event_btnDeleteActionPerformed

    abstract void deleteIndex();
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new TelaNegocio().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    public JTextField getCampoPesquisa() {
        return campoPesquisa;
    }

    public JTextField getCampoURL() {
        return campoURL;
    }

    public JLabel getLabelCount() {
        return labelCount;
    }

    public JTable getTabela() {
        return tabela;
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnIndex;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JTextField campoPesquisa;
    private javax.swing.JTextField campoURL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCount;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
