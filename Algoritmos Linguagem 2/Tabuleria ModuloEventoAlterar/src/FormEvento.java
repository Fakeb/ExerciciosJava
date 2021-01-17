// descrição, data, horário inicio, horário fim, valor, numero de ingressos, numero de ingressos restantes;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormEvento extends javax.swing.JFrame {
    
    DefaultTableModel model;
    Connection c;
    MySQL mysql;
    
    public FormEvento() {
        initComponents();
        model = (DefaultTableModel) jTable.getModel();
        mysql = new MySQL();
        
    }

    public void atualizar() {
        model.setRowCount(0);
        try {
            ResultSet rs = mysql.consultar("SELECT * FROM evento");
            if (rs != null) {
                while (rs.next()) {
                    model.addRow(new String[]{rs.getString("ID"), rs.getString("descricao"), rs.getString("data_evento"), rs.getString("hora_inicio"),
                        rs.getString("hora_fim"), rs.getString("valor"), rs.getString("numero_ingressos"), rs.getString("numero_ingressos_restantes"),
                        rs.getString("status")}
                    );
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO: " + ex, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrameConexao = new javax.swing.JFrame();
        jPanelSessao = new javax.swing.JPanel();
        jTextFieldHost = new javax.swing.JTextField();
        jLabelHost = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabelPorta = new javax.swing.JLabel();
        jTextFieldPorta = new javax.swing.JTextField();
        jLabelBanco = new javax.swing.JLabel();
        jTextFieldBanco = new javax.swing.JTextField();
        jButtonConectar = new javax.swing.JButton();
        jCB = new javax.swing.JComboBox<>();
        jBtnAlterar = new javax.swing.JButton();
        jLabelAlterar = new javax.swing.JLabel();
        jTFAlterar = new javax.swing.JTextField();
        jBtnConectar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabelSelecionar = new javax.swing.JLabel();
        jLabelConexao = new javax.swing.JLabel();

        jFrameConexao.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrameConexao.setTitle("Java MySQL - Conectar");
        jFrameConexao.setResizable(false);

        jPanelSessao.setBorder(javax.swing.BorderFactory.createTitledBorder("Sessão"));

        jTextFieldHost.setText("127.0.0.1");

        jLabelHost.setText("Host:");

        jLabelUsuario.setText("Usuário:");

        jTextFieldUsuario.setText("root");

        jLabelSenha.setText("Senha:");

        jPasswordFieldSenha.setText("usrlab");

        jLabelPorta.setText("Porta:");

        jTextFieldPorta.setText("3306");

        jLabelBanco.setText("Banco:");

        jTextFieldBanco.setText("tabuleria");

        javax.swing.GroupLayout jPanelSessaoLayout = new javax.swing.GroupLayout(jPanelSessao);
        jPanelSessao.setLayout(jPanelSessaoLayout);
        jPanelSessaoLayout.setHorizontalGroup(
            jPanelSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSessaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldBanco)
                    .addGroup(jPanelSessaoLayout.createSequentialGroup()
                        .addGroup(jPanelSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelHost)
                            .addComponent(jTextFieldHost, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPorta)
                            .addComponent(jTextFieldPorta)))
                    .addGroup(jPanelSessaoLayout.createSequentialGroup()
                        .addGroup(jPanelSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSessaoLayout.createSequentialGroup()
                                .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSessaoLayout.createSequentialGroup()
                                .addComponent(jLabelUsuario)
                                .addGap(116, 116, 116)))
                        .addGroup(jPanelSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelSessaoLayout.createSequentialGroup()
                                .addComponent(jLabelSenha)
                                .addGap(116, 116, 116))
                            .addComponent(jPasswordFieldSenha)))
                    .addComponent(jLabelBanco))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSessaoLayout.setVerticalGroup(
            jPanelSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSessaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelBanco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHost)
                    .addComponent(jLabelPorta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario)
                    .addComponent(jLabelSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
        );

        jButtonConectar.setText("Conectar");
        jButtonConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrameConexaoLayout = new javax.swing.GroupLayout(jFrameConexao.getContentPane());
        jFrameConexao.getContentPane().setLayout(jFrameConexaoLayout);
        jFrameConexaoLayout.setHorizontalGroup(
            jFrameConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameConexaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrameConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonConectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelSessao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jFrameConexaoLayout.setVerticalGroup(
            jFrameConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameConexaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 214, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConectar)
                .addGap(16, 16, 16))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Descrição", "Data", "Hora (Início)", "Hora (Fim)", "Valor", "Ingressos", "Ingressos Restantes" }));

        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jLabelAlterar.setText("Digite para alterar");

        jBtnConectar.setText("Conectar");
        jBtnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConectarActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição", "Data", "Hora (Início)", "Hora (Fim)", "Valor", "Ingressos", "Ingressos restantes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        jLabelSelecionar.setText("Selecione para alterar");

        jLabelConexao.setText("Conexão:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnConectar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTFAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBtnAlterar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelAlterar)
                                .addGap(50, 50, 50)
                                .addComponent(jLabelSelecionar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabelConexao)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAlterar)
                    .addComponent(jLabelSelecionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnConectar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelConexao)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConectarActionPerformed
        jFrameConexao.setVisible(true);
        jFrameConexao.setSize(380, 300);
        jFrameConexao.setLocationRelativeTo(null);
    }//GEN-LAST:event_jBtnConectarActionPerformed

    private void jButtonConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConectarActionPerformed
        Sessao sessao = new Sessao(jTextFieldBanco.getText(), jTextFieldHost.getText(), jTextFieldPorta.getText(), jTextFieldUsuario.getText(), jPasswordFieldSenha.getText());
        c = mysql.conectar(sessao);
        try {
            if (c.isValid(0)) {
                //jLabelStatusConexao.setText("Online");
                //jLabelStatusConexao.setForeground(Color.GREEN);
                jFrameConexao.dispose();
                atualizar();
                //desbloquear();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO: " + ex, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonConectarActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        //if (verificarErros("alterar") == false) {
            int id = Integer.parseInt((String) jTable.getValueAt(jTable.getSelectedRow(), 0));
            String query = "UPDATE tabuleria SET "+ jCB.getSelectedItem() +"='" + jTFAlterar.getText() + "WHERE id=" + id;
            int statusQuery = mysql.executeUpdate(query);
            if (statusQuery == 1) {
                atualizar();
                jTFAlterar.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "ERRO: Os dados não foram alterados.", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
            }
            atualizar();
        //}
    }//GEN-LAST:event_jBtnAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(FormEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnConectar;
    private javax.swing.JButton jButtonConectar;
    private javax.swing.JComboBox<String> jCB;
    private javax.swing.JFrame jFrameConexao;
    private javax.swing.JLabel jLabelAlterar;
    private javax.swing.JLabel jLabelBanco;
    private javax.swing.JLabel jLabelConexao;
    private javax.swing.JLabel jLabelHost;
    private javax.swing.JLabel jLabelPorta;
    private javax.swing.JLabel jLabelSelecionar;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelSessao;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFAlterar;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldBanco;
    private javax.swing.JTextField jTextFieldHost;
    private javax.swing.JTextField jTextFieldPorta;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
