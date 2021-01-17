package view;

import controller.Conector;
import controller.ControleCliente;
import controller.DBConfig;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.Cliente;
import model.ModeloTabela;


public class MainFrame extends javax.swing.JFrame {

    static void listarClientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    ControleCliente controleCliente;
    Cliente cliente = new Cliente();
    ArrayList conteudoTabela = new ArrayList();

    public JTable getjTableCampos() {
        return jTableCampos;
    }
    
    public MainFrame() {
        initComponents();  
        //Coloque as configurações padrao do banco de dados aqui
        DBConfig.setValues("localhost", "3306", "projeto_bkp", "root", "");
        
        listarClientes("Nome","");
    }
    
    public void gerarTabela() {
        String[] titulos = {"ID", "Nome","CPF","Telefone","Cidade","UF","Status"};
        ModeloTabela mt = new ModeloTabela(conteudoTabela, titulos);
        
        jTableCampos.setModel(mt);
        jTableCampos.getColumnModel().getColumn(0).setPreferredWidth(10);
        jTableCampos.getColumnModel().getColumn(1).setPreferredWidth(130);
        jTableCampos.getColumnModel().getColumn(2).setPreferredWidth(80);
        jTableCampos.getColumnModel().getColumn(3).setPreferredWidth(50);
        jTableCampos.getColumnModel().getColumn(4).setPreferredWidth(100);
        jTableCampos.getColumnModel().getColumn(5).setPreferredWidth(10);
        jTableCampos.getColumnModel().getColumn(6).setPreferredWidth(20);
    }
    
    public void listarClientes(String campo, String pesquisa) {
        controleCliente = new ControleCliente();
        conteudoTabela = new ArrayList();
        conteudoTabela = controleCliente.select(campo, pesquisa);
        gerarTabela();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldPesquisa = new javax.swing.JTextField();
        jComboBoxSelecionarPesquisa = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCampos = new javax.swing.JTable();
        jButtonInserir = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonBanco = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Serviço Cliente");
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jTextFieldPesquisa.setToolTipText("Digite sua pesquisa aqui");
        jTextFieldPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPesquisaKeyReleased(evt);
            }
        });

        jComboBoxSelecionarPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Cidade", "UF", "Status", " " }));
        jComboBoxSelecionarPesquisa.setToolTipText("Escolha o filtro para pesquisar");

        jTableCampos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Cidade", "Estado", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTableCampos);

        jButtonInserir.setText("Inserir");
        jButtonInserir.setToolTipText("");
        jButtonInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInserirActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonBanco.setText("Configurar Banco de Dados");
        jButtonBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBancoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addComponent(jTextFieldPesquisa))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxSelecionarPesquisa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonBanco)
                                .addGap(0, 26, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonAlterar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonInserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSelecionarPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBancoActionPerformed
        BancoFrame banco = new BancoFrame();
        banco.setVisible(true);
    }//GEN-LAST:event_jButtonBancoActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        
        int linhaSelecionada = jTableCampos.getSelectedRow();
        
        cliente.setId((int)jTableCampos.getValueAt(linhaSelecionada, 0));
        cliente.setNome(jTableCampos.getValueAt(linhaSelecionada, 1).toString());
        cliente.setCPF(jTableCampos.getValueAt(linhaSelecionada, 2).toString());
        cliente.setTelefone(jTableCampos.getValueAt(linhaSelecionada, 3).toString());
        cliente.setCidade(jTableCampos.getValueAt(linhaSelecionada, 4).toString());    
        cliente.setUF(jTableCampos.getValueAt(linhaSelecionada, 5).toString());
        cliente.setStatus((int)jTableCampos.getValueAt(linhaSelecionada, 6));
        
        TelaDados dados = new TelaDados("Alterar",cliente);
        
        dados.setVisible(true);
        conteudoTabela.clear();
        //gerarTabela();
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserirActionPerformed
        TelaDados dados = new TelaDados("Cadastrar", cliente);
        dados.setVisible(true);
        conteudoTabela.clear();
        //gerarTabela();
    }//GEN-LAST:event_jButtonInserirActionPerformed

    private void jTextFieldPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaKeyReleased
        
        listarClientes(jComboBoxSelecionarPesquisa.getSelectedItem().toString(), jTextFieldPesquisa.getText());
        
    }//GEN-LAST:event_jTextFieldPesquisaKeyReleased

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
       if(JOptionPane.showConfirmDialog(null, "Você realmente quer excluir?", "", JOptionPane.YES_OPTION )== 0) {
           controleCliente.delete((int) jTableCampos.getValueAt(jTableCampos.getSelectedRow(), 0));
       }
       conteudoTabela.clear();
       //gerarTabela();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
       listarClientes(jComboBoxSelecionarPesquisa.getSelectedItem().toString(), "");
    }//GEN-LAST:event_formWindowGainedFocus

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonBanco;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonInserir;
    private javax.swing.JComboBox<String> jComboBoxSelecionarPesquisa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCampos;
    private javax.swing.JTextField jTextFieldPesquisa;
    // End of variables declaration//GEN-END:variables

}
