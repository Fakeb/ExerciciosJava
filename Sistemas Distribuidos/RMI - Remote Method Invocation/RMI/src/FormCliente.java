// Rafael Meneses

import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class FormCliente extends javax.swing.JFrame {
    ArrayList<String> historico;
    IChat chat;
    public FormCliente() {
        initComponents();    
        historico = new ArrayList<>();
    }
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaChat = new javax.swing.JTextArea();
        jTextFieldIP = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldDigitar = new javax.swing.JTextField();
        jButtonConectar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextAreaChat.setColumns(20);
        jTextAreaChat.setRows(5);
        jScrollPane1.setViewportView(jTextAreaChat);

        jTextFieldIP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldIP.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "IP"));

        jTextFieldNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldNome.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Nome"));

        jTextFieldDigitar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldDigitarKeyPressed(evt);
            }
        });

        jButtonConectar.setText("Conectar");
        jButtonConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jTextFieldIP, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonConectar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                            .addComponent(jTextFieldDigitar, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonConectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldDigitar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }

    private void jButtonConectarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            chat = (IChat) Naming.lookup("rmi://" + jTextFieldIP.getText() + "/Chat");
            for (int i = 0; i < chat.getHistoricoMensagens().size(); i++) {
                String mensagens = (String) chat.getHistoricoMensagens().get(i);
                jTextAreaChat.append(mensagens + "\n");
                historico.add(mensagens);
            }         
        } catch (MalformedURLException | NotBoundException | RemoteException ex) {
            System.err.println("Erro :)");
        } 
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {      
                        if (chat.getHistoricoMensagens().size() > historico.size()) {
                            jTextAreaChat.setText("");
                            historico.clear();    
                            for (Iterator<String> iterator = chat.getHistoricoMensagens().iterator(); iterator.hasNext();) {
                                String aux = iterator.next();
                                jTextAreaChat.append(aux + "\n");
                                historico.add(aux);                       
                            }                          
                        }                 
                    } catch (Exception e) {
                        System.err.println("Erro :)");
                    }
                }
            }
        }.start(); 
    }

    private void jTextFieldDigitarKeyPressed(java.awt.event.KeyEvent evt) {
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
    
            try {
                chat.lerMensagem("- " + jTextFieldNome.getText() + ": " + jTextFieldDigitar.getText());
                jTextFieldDigitar.setText("");
            } catch (RemoteException ex) {
                System.err.println("Erro :)");
            }
        }        
    }

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCliente().setVisible(true);
            }
        });
    }

    
    private javax.swing.JButton jButtonConectar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaChat;
    private javax.swing.JTextField jTextFieldDigitar;
    private javax.swing.JTextField jTextFieldIP;
    private javax.swing.JTextField jTextFieldNome;
    
}
