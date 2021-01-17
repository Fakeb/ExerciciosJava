/*
Avaliação 1:
Projeto: implementar uma aplicação gráfica, em java, para realizar o gerenciamento de vagas(entrada/saida) em um estacionamento.

Requisitos: - controle de entrada/saida(e/s);
            - Ocupação/liberação de vagas de acordo com e/s;
            - Persistencia de dados (Arquivos);
            - Informação p/ controle e/s: plava do veículo, tipo do veículo, Hora e/s, vaga ocupada/desocupada;
            - Valor - Hora de e/s;
 */
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class FormGaragem extends javax.swing.JFrame {
    
    Arquivo arquivo = new Arquivo();
    int progresso=0;
    
    public FormGaragem() {
        initComponents();
        setLocationRelativeTo(null);
        int i;
        /*
        for (i = 1; i <= 20; i++) { // preencher numeros as vagas e de "nada" o resto da tabela --> Exception in thread "AWT-EventQueue-0" java.lang.NullPointerException
            jTable1.setValueAt(i, i-1 , 0);
            jTable1.setValueAt("", i-1 , 1);
            jTable1.setValueAt("", i-1 , 2);
            jTable1.setValueAt("", i-1 , 3);
        }  
        */
        File file = new File("BancoDeDados.txt"); 
        
        if (file.exists()) { // ler o arquivo
            for (i = 1; i <= 20; i++) {                 
                
                Vagas vaga = arquivo.leitura(file,Integer.toString(i));
                jTable1.setValueAt(vaga.getPlaca(), i - 1, 1);
                jTable1.setValueAt(vaga.getData(), i - 1, 2);
                jTable1.setValueAt(vaga.getVeiculo(), i - 1, 3);
                
            }
        } 
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTFPlaca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPBVagas = new javax.swing.JProgressBar();
        jCBVeiculo = new javax.swing.JComboBox<>();
        jBtnCadastrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jBtnRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento da Garagem");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Vagas", "Placa", "Horario", "Veículo"
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

        jLabel1.setText("Placa (7 Caracteres)");

        jTFPlaca.setToolTipText("ABC1R23");

        jLabel2.setText("Veículo");

        jPBVagas.setMaximum(20);

        jCBVeiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carro", "Moto" }));

        jBtnCadastrar.setText("Cadastrar");
        jBtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastrarActionPerformed(evt);
            }
        });

        jLabel3.setText("Para apagar alguma vaga basta clicar em cima dela");

        jBtnRemover.setText("Remover");
        jBtnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPBVagas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jBtnCadastrar)
                            .addComponent(jTFPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel3))
                            .addComponent(jBtnRemover))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnCadastrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnRemover)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jPBVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jBtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadastrarActionPerformed
        int i;
        jPBVagas.setVisible(true);
        jPBVagas.setStringPainted(true);
        add(jPBVagas);
        String placa=jTFPlaca.getText(); // variavel nao sendo usada por enquanto, serveria para evitar os caracteres invalidos
        placa = placa.replaceAll("[^A-Za-z0-9]+", ""); // negar os caracteres invalidos        
        if(jTable1.isRowSelected(jTable1.getSelectedRow())){ //selecionar placa        
            if(placa.length()==7){ //numero de caracteres == 7
                if((jCBVeiculo.getSelectedIndex()!=-1)){// nada selecionado em veiculo             
                    if((!jTable1.getSelectionModel().isSelectionEmpty())){ // vaga ocupada jTable1.getValueAt(jTable1.getSelectedRow(),1).toString().equals("")                       
                        
                        
                        for(i=1;i<=20;i++){ // percorrer a tabela 
                            String aux = jTable1.getValueAt(i-1, 1).toString();
                            System.out.println(aux);
                            if(!aux.equals(placa)){ // comparar placas repetidas                                                                                                  
                                adicionar();
                            }
                            else{ // comparar placas repetidas
                                JOptionPane.showMessageDialog(null,"Essa Placa ja foi Cadastrada!! :)");
                                 
                            }
                        } 
                        
                    }
                    else{ // vaga ocupada
                       JOptionPane.showMessageDialog(null,"Vaga ocupada, apague ela ou selecione outra!! :) ");
                    }      
                }
                else{// nada selecionado em veiculo
                    JOptionPane.showMessageDialog(null,"Selecione algum item em Veiculo!! :) ");
                }       
            }        
            else{// numero de caracteres == 7
                JOptionPane.showMessageDialog(null,"Numero de caracteres invalido!! :) ");
            }
        }
        else{// selecionar placa
            JOptionPane.showMessageDialog(null,"Seleciona uma Vaga para fazer o cadastro!! :)");     
        }     
    }//GEN-LAST:event_jBtnCadastrarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed

    }//GEN-LAST:event_jTable1KeyPressed

    private void jBtnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRemoverActionPerformed
        if(jTable1.getValueAt(jTable1.getSelectedRow(),1).toString().contains("")){
            remover();
        }
    }//GEN-LAST:event_jBtnRemoverActionPerformed

    private void remover(){
        
        int remover = JOptionPane.showConfirmDialog(this, "Deseja remover a vaga?", "Mensagem de confirmação", JOptionPane.YES_NO_OPTION); // caixa de dialogo para remoção sim ou não
 
        if((remover == JOptionPane.YES_OPTION)) { // remover 
            jTable1.setValueAt("", jTable1.getSelectedRow(), 1);
            jTable1.setValueAt("", jTable1.getSelectedRow(), 2);
            jTable1.setValueAt("", jTable1.getSelectedRow(), 3);
            progresso--;
            jPBVagas.setValue(progresso);
        }

    }
    private void adicionar(){
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        dateFormat.format(date);
        
        jTable1.setValueAt(jTFPlaca.getText(), jTable1.getSelectedRow() , 1); // placa
        jTable1.setValueAt(dateFormat.format(date), jTable1.getSelectedRow(), 2);
        jTable1.setValueAt(jCBVeiculo.getSelectedItem(), jTable1.getSelectedRow(), 3);
        arquivo.salvar(jTFPlaca.getText(),dateFormat.format(date),jCBVeiculo.getSelectedItem().toString(),jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString(),jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        jTFPlaca.setText("");
        jCBVeiculo.setSelectedIndex(-1);
        //progresso++;
        //jPBVagas.setValue(progresso);  
        
    }
   
    
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
            java.util.logging.Logger.getLogger(FormGaragem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormGaragem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormGaragem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormGaragem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormGaragem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCadastrar;
    private javax.swing.JButton jBtnRemover;
    private javax.swing.JComboBox<String> jCBVeiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jPBVagas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFPlaca;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
