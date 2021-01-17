import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;


public class FormPesquisa extends javax.swing.JFrame {

    
    StyledDocument styledDocument = new DefaultStyledDocument();
    
    public FormPesquisa() {
        initComponents();      
    }
    
    public void PesquisaSimples(){
        
        int inicio, fim, contador = 0;
        String texto = jTPTexto.getText().toLowerCase(); // mudar o texto para letras minusculas
        String palavra = jTFPesquisa.getText().toLowerCase(); // mudar a pesquisa para letras minusculas
        
        jTAResultado.setText(""); // zerar a caixa de resultado
        
        inicio = texto.indexOf(palavra); // inicio recebe a primeira ocorrencia da palavra
        fim = (inicio + palavra.length()) - 1; // fim recebe inicio mais o tamanho da palavra -1 <-- ajustar a palavra
        while (inicio != -1) { // laço de repetiçao até inicio ser diferente de -1 porque é o que o indexof retorna ao nao achar nada ( percorrer o texto)
            contador++; // somar numero
            jTAResultado.setText(jTAResultado.getText() + contador+ "ª: [" + inicio + ", " + fim + "]" + "\n"); // printando na caixa de resultado as posiçoes das palavras encontradas
            inicio = texto.indexOf(palavra, inicio + 1); // inicio recebe a ocorrencia da palavra descartando a que ja passou +1 <-- ajustar a palavra
            fim = (inicio + palavra.length()) - 1; // fim recebe inicio mais o tamanho da palavra -1 <-- ajustar a palavra
        }
        jTAResultado.setText("A palavra \"" + palavra + "\" aparece " + contador + " vezes.\n" + "As posições em que aparecem:\n" + jTAResultado.getText()); // printando na caixa de resultado o numero de ocorrencias das palavras
        
    }
    
    public void PesquisaAvançada(){
        
        int inicio, fim, contador = 0;
        String texto = jTPTexto.getText().toLowerCase(); // mudar o texto para letras minusculas
        String palavra = jTFPesquisa.getText().toLowerCase(); // mudar a pesquisa para letras minusculas
        
        jTAResultado.setText(""); // zerar a caixa de resultado
        
        inicio = texto.indexOf(palavra); // inicio recebe a primeira ocorrencia da palavra
        fim = (inicio + palavra.length()) - 1; // fim recebe inicio mais o tamanho da palavra -1 <-- ajustar a palavra
        while (inicio != -1) { // laço de repetiçao até inicio ser diferente de -1 porque é o que o indexof retorna ao nao achar nada ( percorrer o texto)
            contador++; // somar numero
            pintarTexto(inicio, palavra.length(),Color.YELLOW); // pintar a palavra 
            jTAResultado.setText(jTAResultado.getText() + contador+ "ª: [" + inicio + ", " + fim + "]" + "\n"); // printando na caixa de resultado as posiçoes das palavras encontradas
            inicio = texto.indexOf(palavra, inicio + 1); // inicio recebe a ocorrencia da palavra descartando a que ja passou +1 <-- ajustar a palavra
            fim = (inicio + palavra.length()) - 1; // fim recebe inicio mais o tamanho da palavra -1 <-- ajustar a palavra
        }
        jTAResultado.setText("A palavra \"" + palavra + "\" aparece " + contador + " vezes.\n" + "As posições em que aparecem:\n" + jTAResultado.getText()); // printando na caixa de resultado o numero de ocorrencias das palavras
        
    }
    
    
    public void pintarTexto(int posicao, int tamanho,Color cor) {
        SimpleAttributeSet style = new SimpleAttributeSet();
        StyleConstants.setBackground(style, cor);
        styledDocument.setCharacterAttributes(posicao, tamanho, style, false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTPTexto = new javax.swing.JTextPane(styledDocument);
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAResultado = new javax.swing.JTextArea();
        jTFPesquisa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCBPesquisa = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pesquisa de Palavras");

        jTPTexto.setText("Texto teste");
        jTPTexto.setToolTipText("Digite o texto desejado.");
        jScrollPane1.setViewportView(jTPTexto);

        jTAResultado.setColumns(20);
        jTAResultado.setRows(5);
        jTAResultado.setToolTipText("Resultado da pesquisa.");
        jScrollPane2.setViewportView(jTAResultado);

        jTFPesquisa.setToolTipText("Digite a palavra desejada, selecione a pesquisa e pressione enter.");
        jTFPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFPesquisaKeyReleased(evt);
            }
        });

        jLabel1.setText("Texto");
        jLabel1.setToolTipText("");

        jLabel2.setText("Resultado");

        jCBPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Simples", "Avançado" }));
        jCBPesquisa.setToolTipText("Selecione o tipo de pesquisa.");

        jLabel3.setText("Selecione a pesquisa e digite a palavra desejada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jTFPesquisa)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPesquisaKeyReleased
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER)&&(jCBPesquisa.getSelectedIndex()==0)) { // pesquisa simples selecionada
            pintarTexto(0, jTPTexto.getText().length(), Color.WHITE);
            if (jTFPesquisa.getText().length() > 0) {  // se apertar enter e nao tiver nada digitado no text field
                
                PesquisaSimples();
            }
            else{
                JOptionPane.showMessageDialog(null, "Digite algo para se pesquisado.", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
            }       
        }

        if (jCBPesquisa.getSelectedIndex()==1) { // pesquisa avançada selecionada
            pintarTexto(0, jTPTexto.getText().length(), Color.WHITE);
            if (jTFPesquisa.getText().length() > 0) {  // se apertar enter e nao tiver nada digitado no text field
                
                PesquisaAvançada();
                
            }            
        }
         
    }//GEN-LAST:event_jTFPesquisaKeyReleased

    
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
            java.util.logging.Logger.getLogger(FormPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPesquisa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCBPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTAResultado;
    private javax.swing.JTextField jTFPesquisa;
    private javax.swing.JTextPane jTPTexto;
    // End of variables declaration//GEN-END:variables
}
