//create user 'convidado'@'%' IDENTIFIED by '12345';
//GRANT ALL PRIVILEGES ON aula03agenda.* TO 'convidado'@'%';
//FLUSH PRIVILEGES;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormFuncionario extends javax.swing.JFrame {

    private Connection c;
    public MySQL mysql;

    DefaultTableModel model;

    public FormFuncionario() {
        initComponents();
        mysql = new MySQL();
        //c = mysql.conectar("localhost", "3306", "aula03agenda", "root", "usrlab");
        c = mysql.conectar("172.25.1.17", "3306", "aula03agenda", "convidado", "12345");
        model = (DefaultTableModel) jTable1.getModel();
        listarTodos();

    }

    public void listarTodos() {
        try {
            ResultSet rs = mysql.consultar("select * from funcionario");
            if (rs != null) {
                while (rs.next()) {
                    model.addRow(new String[]{rs.getString("ID"), rs.getString("nome"), rs.getString("email"), rs.getString("cargo")});

                }
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }

    public void consultar(String nomeConsultar) {
        try {
            String query = "select * from Funcionario where nome like '" + nomeConsultar + "'";
            ResultSet rs = mysql.consultar(query);

            if (rs != null) {
                while (rs.next()) {
                    model.addRow(new String[]{rs.getString("ID"), rs.getString("nome"),
                        rs.getString("email"), rs.getString("cargo")});
                }
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }

    public void inserir() {
        String query = "INSERT INTO Funcionario (nome, email, cargo) "
                + "values ('" + jTextNome.getText() + "', '" + jTextEmail.getText() + "', '" + jTextCargo.getText() + "')";
        int retorno = mysql.executeQuery(query);
        if (retorno == 1) {
            jTextNome.setText("");
            jTextEmail.setText("");
            jTextCargo.setText("");
            JOptionPane.showMessageDialog(this, "Dados inseridos no banco de dados!");
        } else {
            JOptionPane.showMessageDialog(this, "Houve um problema durante a tentativa de inserção");
        }
    }

    public void alterar(int id) {
        String query = "UPDATE Funcionario SET nome='" + jTextNome.getText() + "', "
                + "email='" + jTextEmail.getText() + "', cargo='" + jTextCargo.getText() + "'  "
                + "WHERE id=" + id;
        int retorno = mysql.executeQuery(query);
        if (retorno == 1) {
            jTextNome.setText("");
            jTextEmail.setText("");
            jTextCargo.setText("");
            jTextID.setText("");
            JOptionPane.showMessageDialog(this, "Dados alterados com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Houve um problema durante a tentativa de alteração!");
        }

    }

    public void excluir(int id) {
        String query = "DELETE FROM Funcionario WHERE id=" + id;
        int retorno = mysql.executeQuery(query);
        if (retorno == 1) {
            jTextNome.setText("");
            jTextEmail.setText("");
            jTextCargo.setText("");
            jTextID.setText("");
            JOptionPane.showMessageDialog(this, "Dados excluídos com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Houve um problema durante a tentativa de exclusão!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTFNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextNome = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        jTextCargo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonInserir = new javax.swing.JButton();
        jTextID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Módulo de Funcionários");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 0, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Email", "Cargo"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 200, 510, 145));

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 166, -1, -1));
        getContentPane().add(jTFNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 167, 141, -1));

        jLabel4.setText("Insira um nome para consulta");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 146, -1, -1));

        jButton2.setText("Listar todos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 100, -1));
        getContentPane().add(jTextNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 86, 98, -1));
        getContentPane().add(jTextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 86, 157, -1));
        getContentPane().add(jTextCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 86, 150, -1));

        jLabel5.setText("Nome");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 67, -1, -1));

        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 67, -1, -1));

        jLabel7.setText("Cargo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 67, -1, -1));

        jButtonInserir.setText("Inserir");
        jButtonInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInserirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInserir, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 100, -1));

        jTextID.setEditable(false);
        jTextID.setEnabled(false);
        getContentPane().add(jTextID, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 86, 38, -1));

        jLabel8.setText("ID");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 67, -1, -1));

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 100, -1));

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        model.setNumRows(0);
        consultar(jTFNome.getText());
        //consultar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        model.setNumRows(0);
        listarTodos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserirActionPerformed
        inserir();
    }//GEN-LAST:event_jButtonInserirActionPerformed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed

    }//GEN-LAST:event_jTable1KeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int linha = jTable1.getSelectedRow();
        jTextID.setText(jTable1.getValueAt(linha, 0) + "");
        jTextNome.setText(jTable1.getValueAt(linha, 1) + "");
        jTextEmail.setText(jTable1.getValueAt(linha, 2) + "");
        jTextCargo.setText(jTable1.getValueAt(linha, 3) + "");
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        alterar(Integer.parseInt(jTextID.getText()));
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        excluir(Integer.parseInt(jTextID.getText()));
    }//GEN-LAST:event_jButtonExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(FormFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonInserir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextCargo;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextNome;
    // End of variables declaration//GEN-END:variables
}
