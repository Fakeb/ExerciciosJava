
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usrlab06
 */
public class FormPessoa extends javax.swing.JFrame {

    /**
     * Creates new form FormPessoa
     */
    public FormPessoa() {
        
        Pessoa pessoa = new Pessoa();
        
        initComponents(); // os componentes do projeto
      //getContentPane().setBackground(Color.BLACK); // cor
      //setExtendedState(MAXIMIZED_BOTH); // iniciar em tela cheia
        setLocationRelativeTo(null); // iniciar centralizado
      //jLabelNome.setText("Nome: Rafael");
      //jLabelNome.setText(jLabelNome.getText()+ " Rafael");
        jLabelNome.setText(jLabelNome.getText()+ pessoa.getNome());
        jLabelEnd.setText(jLabelEnd.getText()+ pessoa.getEndereço());
        jLabelTel.setText(jLabelTel.getText()+ pessoa.getTelefone());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNome = new javax.swing.JLabel();
        jLabelEnd = new javax.swing.JLabel();
        jLabelTel = new javax.swing.JLabel();
        jLabelNome2 = new javax.swing.JLabel();
        jBtnCadastrar = new javax.swing.JButton();
        jTFNome2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pessoa");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jLabelNome.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(102, 0, 102));
        jLabelNome.setText("Nome: ");

        jLabelEnd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelEnd.setText("Endereço: ");

        jLabelTel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelTel.setForeground(new java.awt.Color(0, 51, 255));
        jLabelTel.setText("Telefone: ");

        jLabelNome2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelNome2.setText("Digite o nome:");

        jBtnCadastrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jBtnCadastrar.setText("olar");
        jBtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastrarActionPerformed(evt);
            }
        });

        jTFNome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNome2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCadastrar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNome2)
                        .addGap(18, 18, 18)
                        .addComponent(jTFNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelTel)
                    .addComponent(jLabelNome))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTel)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome2)
                    .addComponent(jTFNome2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnCadastrar)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadastrarActionPerformed
        // TODO add your handling code here:
        
        jLabelNome.setText("Nome: ");        
        jLabelNome.setText(jLabelNome.getText() + jTFNome2.getText());
        
        if(jTFNome2.getText().isEmpty()){ // ((iTFNome.getText().length>1)&&(jTFNome.getText().charAt(o)!=''))
            JOptionPane.showMessageDialog(this, "digitou nada seu cara de pau");
            Color minhaCor = new Color(235, 35, 70);
            jTFNome2.setBackground(minhaCor);
            jLabelNome2.setForeground(Color.red);
            //jLabelNome2.setText(jLabelNome2.getText() + "*" );
            jLabelNome2.setText("Digite o nome:*");
        }
        else{
            JOptionPane.showMessageDialog(this, "O " + jTFNome2.getText() + " foi cadastrado" , "Mensagem aleatoria sem motivo algum", JOptionPane.INFORMATION_MESSAGE);
            jTFNome2.setText("");
            jTFNome2.setBackground(Color.WHITE);
            jTFNome2.setForeground(Color.BLACK);
            jLabelNome2.setText("Digite o nome:");
        }
        
            
            
        
        
        
    }//GEN-LAST:event_jBtnCadastrarActionPerformed

    private void jTFNome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNome2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNome2ActionPerformed

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
            java.util.logging.Logger.getLogger(FormPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCadastrar;
    private javax.swing.JLabel jLabelEnd;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNome2;
    private javax.swing.JLabel jLabelTel;
    private javax.swing.JTextField jTFNome2;
    // End of variables declaration//GEN-END:variables
}
