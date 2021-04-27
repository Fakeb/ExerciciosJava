
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Frame extends javax.swing.JFrame {

    DefaultTableModel model;

    Connection c;
    MySQL mysql;

    public Frame() {
        initComponents();
        setLocationRelativeTo(null);
        model = (DefaultTableModel) jTable.getModel();
        mysql = new MySQL();
        jRadioDescricao.setSelected(true);
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
        buttonGroupTipoPesquisa = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabelStatus = new javax.swing.JLabel();
        jLabelStatusConexao = new javax.swing.JLabel();
        jButtonAbrirConectar = new javax.swing.JButton();
        jButtonDesconectar = new javax.swing.JButton();
        jLabelPesquisar = new javax.swing.JLabel();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jLabelTipoPesquisa = new javax.swing.JLabel();
        jRadioDescricao = new javax.swing.JRadioButton();
        jRadioData = new javax.swing.JRadioButton();
        jRadioValor = new javax.swing.JRadioButton();

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
                    .addComponent(jPanelSessao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonConectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jFrameConexaoLayout.setVerticalGroup(
            jFrameConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameConexaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConectar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java MySQL");
        setResizable(false);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição", "Data", "Hora (Início)", "Hora (Fim)", "Valor", "Ingressos", "Ingressos restantes", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        jLabelStatus.setText("Status da conexão:");

        jLabelStatusConexao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelStatusConexao.setForeground(new java.awt.Color(255, 0, 0));
        jLabelStatusConexao.setText("Offline");

        jButtonAbrirConectar.setText("Conectar");
        jButtonAbrirConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirConectarActionPerformed(evt);
            }
        });

        jButtonDesconectar.setText("Desconectar");
        jButtonDesconectar.setEnabled(false);
        jButtonDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesconectarActionPerformed(evt);
            }
        });

        jLabelPesquisar.setText("Pesquise um nome no banco:");

        jTextFieldPesquisar.setEnabled(false);

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.setEnabled(false);
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.setEnabled(false);
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jLabelTipoPesquisa.setText("Pesquisar por:");

        buttonGroupTipoPesquisa.add(jRadioDescricao);
        jRadioDescricao.setText("Descrição");
        jRadioDescricao.setEnabled(false);

        buttonGroupTipoPesquisa.add(jRadioData);
        jRadioData.setText("Data");
        jRadioData.setEnabled(false);

        buttonGroupTipoPesquisa.add(jRadioValor);
        jRadioValor.setText("Valor");
        jRadioValor.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelStatus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelStatusConexao))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAbrirConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDesconectar))
                            .addComponent(jLabelPesquisar)
                            .addComponent(jLabelTipoPesquisa)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioDescricao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioValor)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar)
                    .addComponent(jButtonAtualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTipoPesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioDescricao)
                    .addComponent(jRadioData)
                    .addComponent(jRadioValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelStatus)
                    .addComponent(jLabelStatusConexao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAbrirConectar)
                    .addComponent(jButtonDesconectar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAbrirConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirConectarActionPerformed
        jFrameConexao.setVisible(true);
        jFrameConexao.setSize(363, 266);
        jFrameConexao.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonAbrirConectarActionPerformed

    private void jButtonConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConectarActionPerformed
        Sessao sessao = new Sessao(jTextFieldBanco.getText(), jTextFieldHost.getText(), jTextFieldPorta.getText(), jTextFieldUsuario.getText(), jPasswordFieldSenha.getText());
        c = mysql.conectar(sessao);
        try {
            if (c.isValid(0)) {
                jLabelStatusConexao.setText("Online");
                jLabelStatusConexao.setForeground(Color.GREEN);
                jFrameConexao.dispose();
                atualizar();
                desbloquear();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO: " + ex, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonConectarActionPerformed

    private void jButtonDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesconectarActionPerformed
        try {
            c.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO: " + ex, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
        jLabelStatusConexao.setText("Offline");
        jLabelStatusConexao.setForeground(Color.RED);
        bloquear();
        model.setRowCount(0);
    }//GEN-LAST:event_jButtonDesconectarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        String tipoPesquisa = "";

        if (jRadioDescricao.isSelected()) {
            tipoPesquisa = "descricao";
        } else if (jRadioData.isSelected()) {
            tipoPesquisa = "data_evento";
        } else if (jRadioValor.isSelected()) {
            tipoPesquisa = "valor";
        }

        if (verificarErros() == false) {
            try {
                String query = "SELECT * FROM evento WHERE " + tipoPesquisa + " like '" + jTextFieldPesquisar.getText() + "%'";
                ResultSet rs = mysql.consultar(query);
                model.setRowCount(0);
                jTextFieldPesquisar.setText("");
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
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        atualizar();
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    public boolean verificarErros() {
        boolean erro = false;

        if (jTextFieldPesquisar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos corretamente.", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
            erro = true;
        }
        return erro;
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

    public void bloquear() {
        jTextFieldPesquisar.setEnabled(false);
        jButtonAtualizar.setEnabled(false);
        jButtonPesquisar.setEnabled(false);
        jRadioDescricao.setEnabled(false);
        jRadioData.setEnabled(false);
        jRadioValor.setEnabled(false);
        jButtonAbrirConectar.setEnabled(true);
        jButtonDesconectar.setEnabled(false);
    }

    public void desbloquear() {
        jTextFieldPesquisar.setEnabled(true);
        jButtonAtualizar.setEnabled(true);
        jRadioDescricao.setEnabled(true);
        jRadioData.setEnabled(true);
        jRadioValor.setEnabled(true);
        jButtonPesquisar.setEnabled(true);
        jButtonAbrirConectar.setEnabled(false);
        jButtonDesconectar.setEnabled(true);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupTipoPesquisa;
    private javax.swing.JButton jButtonAbrirConectar;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonConectar;
    private javax.swing.JButton jButtonDesconectar;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JFrame jFrameConexao;
    private javax.swing.JLabel jLabelBanco;
    private javax.swing.JLabel jLabelHost;
    private javax.swing.JLabel jLabelPesquisar;
    private javax.swing.JLabel jLabelPorta;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelStatusConexao;
    private javax.swing.JLabel jLabelTipoPesquisa;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelSessao;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JRadioButton jRadioData;
    private javax.swing.JRadioButton jRadioDescricao;
    private javax.swing.JRadioButton jRadioValor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldBanco;
    private javax.swing.JTextField jTextFieldHost;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldPorta;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
