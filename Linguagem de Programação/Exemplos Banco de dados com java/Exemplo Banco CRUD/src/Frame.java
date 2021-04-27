
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
        jLabel1 = new javax.swing.JLabel();
        jTextFieldBanco = new javax.swing.JTextField();
        jButtonConectar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabelStatus = new javax.swing.JLabel();
        jLabelStatusConexao = new javax.swing.JLabel();
        jButtonAbrirConectar = new javax.swing.JButton();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jPanelDados = new javax.swing.JPanel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelCargo = new javax.swing.JLabel();
        jTextFieldCargo = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jButtonDesconectar = new javax.swing.JButton();
        jLabelPesquisar = new javax.swing.JLabel();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();

        jFrameConexao.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrameConexao.setTitle("Java MySQL - Conectar");
        jFrameConexao.setResizable(false);

        jPanelSessao.setBorder(javax.swing.BorderFactory.createTitledBorder("Sessão"));

        jTextFieldHost.setText("192.168.0.11");

        jLabelHost.setText("Host:");

        jLabelUsuario.setText("Usuário:");

        jTextFieldUsuario.setText("admin");

        jLabelSenha.setText("Senha:");

        jPasswordFieldSenha.setText("admin");

        jLabelPorta.setText("Porta:");

        jTextFieldPorta.setText("3306");

        jLabel1.setText("Banco:");

        jTextFieldBanco.setText("aula03agenda");

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
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSessaoLayout.setVerticalGroup(
            jPanelSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSessaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
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
                "ID", "Nome", "Email", "Cargo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableMousePressed(evt);
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

        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.setEnabled(false);
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.setEnabled(false);
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jPanelDados.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        jTextFieldEmail.setEnabled(false);

        jLabelCargo.setText("Cargo:");

        jTextFieldCargo.setEnabled(false);

        jLabelNome.setText("Nome:");

        jTextFieldNome.setEnabled(false);

        jLabelEmail.setText("Email:");

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNome)
                            .addComponent(jLabelEmail)
                            .addComponent(jLabelCargo))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextFieldCargo)
                    .addComponent(jTextFieldNome)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addComponent(jLabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCargo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
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
                            .addComponent(jLabelPesquisar))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(jButtonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButtonAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        if (verificarErros("adicionar") == false) {
            String query = "INSERT INTO funcionario (nome, email, cargo) " + "values ('" + jTextFieldNome.getText() + "', '" + jTextFieldEmail.getText() + "', '" + jTextFieldCargo.getText() + "')";
            int statusQuery = mysql.executeUpdate(query);
            if (statusQuery == 1) {
                atualizar();
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "ERRO: Os dados não foram inseridos.", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        atualizar();
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMousePressed
        jTextFieldNome.setText((String) jTable.getValueAt(jTable.getSelectedRow(), 1));
        jTextFieldEmail.setText((String) jTable.getValueAt(jTable.getSelectedRow(), 2));
        jTextFieldCargo.setText((String) jTable.getValueAt(jTable.getSelectedRow(), 3));
    }//GEN-LAST:event_jTableMousePressed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        if (verificarErros("alterar") == false) {
            int id = Integer.parseInt((String) jTable.getValueAt(jTable.getSelectedRow(), 0));
            String query = "UPDATE funcionario SET nome='" + jTextFieldNome.getText() + "', " + "email='" + jTextFieldEmail.getText() + "', cargo='" + jTextFieldCargo.getText() + "'  " + "WHERE id=" + id;
            int statusQuery = mysql.executeUpdate(query);
            if (statusQuery == 1) {
                atualizar();
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "ERRO: Os dados não foram alterados.", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if (verificarErros("excluir") == false) {
            int id = Integer.parseInt((String) jTable.getValueAt(jTable.getSelectedRow(), 0));
            String query = "DELETE FROM Funcionario WHERE id=" + id;
            int statusQuery = mysql.executeUpdate(query);
            if (statusQuery == 1) {
                atualizar();
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "ERRO: Os dados não foram excluídos.", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

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
        if (verificarErros("pesquisar") == false) {
            try {
                String query = "SELECT * FROM funcionario WHERE nome like '" + jTextFieldPesquisar.getText() + "'";
                ResultSet rs = mysql.consultar(query);
                model.setRowCount(0);
                jTextFieldPesquisar.setText("");
                if (rs != null) {
                    while (rs.next()) {
                        model.addRow(new String[]{rs.getString("ID"), rs.getString("nome"), rs.getString("email"), rs.getString("cargo")});
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "ERRO: " + ex, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    public boolean verificarErros(String tipoErro) {
        boolean erro = false;

        switch (tipoErro) {
            case "adicionar": {
                if (jTextFieldNome.getText().isEmpty() || jTextFieldEmail.getText().isEmpty() || jTextFieldCargo.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "AVISO: Preencha todos os campos corretamente.", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
                    erro = true;
                } else {
                    try {
                        ResultSet rs = mysql.consultar("SELECT email FROM funcionario");
                        if (rs != null) {
                            while (rs.next()) {
                                if (rs.getString("email").equals(jTextFieldEmail.getText())) {
                                    JOptionPane.showMessageDialog(this, "AVISO: Email já cadastrado.", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
                                    erro = true;
                                }
                            }
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(this, "ERRO: " + ex, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
                    }
                }
                break;
            }
            case "alterar": {
                if (!jTable.isRowSelected(jTable.getSelectedRow())) {
                    JOptionPane.showMessageDialog(this, "AVISO: Selecione um campo na tabela.", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
                    erro = true;
                } else if (jTextFieldNome.getText().isEmpty() || jTextFieldEmail.getText().isEmpty() || jTextFieldCargo.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "AVISO: Preencha todos os campos corretamente.", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
                    erro = true;
                } else {
                    int id = Integer.parseInt((String) jTable.getValueAt(jTable.getSelectedRow(), 0));
                    try {
                        ResultSet rs = mysql.consultar("SELECT email FROM funcionario WHERE id!=" + id);
                        if (rs != null) {
                            while (rs.next()) {
                                if (rs.getString("email").equals(jTextFieldEmail.getText())) {
                                    JOptionPane.showMessageDialog(this, "AVISO: Email já cadastrado.", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
                                    erro = true;
                                }
                            }
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(this, "ERRO: " + ex, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
                    }
                }
                break;
            }
            case "excluir": {
                if (!jTable.isRowSelected(jTable.getSelectedRow())) {
                    JOptionPane.showMessageDialog(this, "AVISO: Selecione um campo na tabela.", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
                    erro = true;
                }
                break;
            }
            case "pesquisar": {
                if (jTextFieldPesquisar.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "AVISO: Preencha todos os campos corretamente.", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
                    erro = true;
                }
                break;
            }
        }
        return erro;
    }

    public void atualizar() {
        model.setRowCount(0);
        try {
            ResultSet rs = mysql.consultar("SELECT * FROM funcionario");
            if (rs != null) {
                while (rs.next()) {
                    model.addRow(new String[]{rs.getString("ID"), rs.getString("nome"), rs.getString("email"), rs.getString("cargo")});
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO: " + ex, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void limparCampos() {
        jTextFieldNome.setText("");
        jTextFieldEmail.setText("");
        jTextFieldCargo.setText("");
    }

    public void bloquear() {
        jTextFieldNome.setEnabled(false);
        jTextFieldEmail.setEnabled(false);
        jTextFieldCargo.setEnabled(false);
        jTextFieldPesquisar.setEnabled(false);
        jButtonAdicionar.setEnabled(false);
        jButtonAtualizar.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonPesquisar.setEnabled(false);
        jButtonAbrirConectar.setEnabled(true);
        jButtonDesconectar.setEnabled(false);
    }

    public void desbloquear() {
        jTextFieldNome.setEnabled(true);
        jTextFieldEmail.setEnabled(true);
        jTextFieldCargo.setEnabled(true);
        jTextFieldPesquisar.setEnabled(true);
        jButtonAdicionar.setEnabled(true);
        jButtonAtualizar.setEnabled(true);
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
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
    private javax.swing.JButton jButtonAbrirConectar;
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonConectar;
    private javax.swing.JButton jButtonDesconectar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JFrame jFrameConexao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCargo;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelHost;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPesquisar;
    private javax.swing.JLabel jLabelPorta;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelStatusConexao;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelSessao;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldBanco;
    private javax.swing.JTextField jTextFieldCargo;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldHost;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldPorta;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
