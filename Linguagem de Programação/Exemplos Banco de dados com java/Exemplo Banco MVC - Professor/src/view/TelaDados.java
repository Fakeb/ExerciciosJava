package view;

import controller.ControleCliente;
import model.Cliente;

public class TelaDados extends javax.swing.JFrame {

    private Cliente cliente;
    private ControleCliente controleCliente;
    
    public TelaDados(String acaoBotao, Cliente cliente) {
        initComponents();
        this.cliente = cliente;
        botaoSalvar.setText(acaoBotao);   
        camposCliente();
    }

    private TelaDados() {
        
    }
    
    public void camposCliente(){
        controleCliente = new ControleCliente();

        if(botaoSalvar.getText().equals("Cadastrar")) {
            
            jCheckBoxStatus.setVisible(false);
            jLabelStatus.setVisible(false);

        } else {
            
            jTFNome.setText(cliente.getNome());
            jTFCPF.setText(cliente.getCPF());
            jTFTelefone.setText(cliente.getTelefone());
            jTFCidade.setText(cliente.getCidade());
            jTFUF.setText(cliente.getUF());
            
            if(cliente.getStatus()==1){
                jCheckBoxStatus.setSelected(true);
            } else{
                jCheckBoxStatus.setSelected(false);
            }
            
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jTFCPF = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jTFCidade = new javax.swing.JTextField();
        jLabelUF = new javax.swing.JLabel();
        jTFUF = new javax.swing.JTextField();
        botaoSalvar = new javax.swing.JButton();
        jLabelStatus = new javax.swing.JLabel();
        jCheckBoxStatus = new javax.swing.JCheckBox();
        jLabelTelefone = new javax.swing.JLabel();
        jTFTelefone = new javax.swing.JTextField();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DADOS DO CLIENTE");
        setResizable(false);

        jLabelCPF.setText("CPF");

        jLabelNome.setText("Nome");

        jLabelCidade.setText("Cidade");

        jLabelUF.setText("UF");

        botaoSalvar.setText("Salvar");
        botaoSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botaoSalvarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botaoSalvarMouseReleased(evt);
            }
        });
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        jLabelStatus.setText("Status");

        jCheckBoxStatus.setSelected(true);

        jLabelTelefone.setText("Telefone");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCidade)
                            .addComponent(jLabelCPF)
                            .addComponent(jLabelNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNome)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFCidade)
                                    .addComponent(jTFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabelTelefone)
                                        .addGap(7, 7, 7))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabelUF)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFUF)
                                    .addComponent(jTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCPF)
                    .addComponent(jLabelUF)
                    .addComponent(jTFUF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCidade)
                    .addComponent(jLabelTelefone)
                    .addComponent(jTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxStatus)
                            .addComponent(jLabelStatus))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSalvarMousePressed
          
    }//GEN-LAST:event_botaoSalvarMousePressed

    private void botaoSalvarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSalvarMouseReleased
        //System.out.println("Cheguei aqui");
        
        controleCliente = new ControleCliente();
        
        cliente.setNome(jTFNome.getText());
        cliente.setCPF(jTFCPF.getText());
        cliente.setTelefone(jTFTelefone.getText());
        cliente.setCidade(jTFCidade.getText());
        cliente.setUF(jTFUF.getText());
            
        //System.out.println("Cheguei nesse lugar");
        if(botaoSalvar.getText().equals("Cadastrar")) {
            
            cliente.setStatus(1);
            controleCliente.insert(cliente);

            dispose();
        } else{
            
            if(jCheckBoxStatus.isSelected()==true){
                cliente.setStatus(1);
            } else{
                cliente.setStatus(0);
            }
            controleCliente.update(cliente);
        }
        
        
    }//GEN-LAST:event_botaoSalvarMouseReleased

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        
    }//GEN-LAST:event_botaoSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JCheckBox jCheckBoxStatus;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelUF;
    private javax.swing.JTextField jTFCPF;
    private javax.swing.JTextField jTFCidade;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFTelefone;
    private javax.swing.JTextField jTFUF;
    // End of variables declaration//GEN-END:variables
}
