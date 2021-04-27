import java.awt.Color;
import java.util.HashSet;
import java.util.Set;

public class Main extends javax.swing.JFrame {
    
    public Set<Integer> pressionados = new HashSet<>();
    
    public Main() {
        
        initComponents();
        
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    controle();
                    try {
                        sleep(15);
                    } catch (InterruptedException ex) {
                        System.out.println(ex);  
                    }
                }
            }
        }.start();
        
    }

    public void controle(){
         
        for (Integer c : pressionados) {
            
            Logica logica1 = new Logica(c, jogadorUm, jogadorDois, fruta);
            logica1.start();
            
        }
        
    }
    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fruta = new javax.swing.JButton();
        jogadorUm = new javax.swing.JButton();
        jogadorDois = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Fruta - Rafael Meneses e Guilherme Kuhn");
        setBounds(new java.awt.Rectangle(0, 0, 800, 600));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        jPanel1.setFocusCycleRoot(true);
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPanel1KeyReleased(evt);
            }
        });

        fruta.setForeground(new java.awt.Color(153, 0, 153));
        fruta.setText("fruta"); // NOI18N
        fruta.setFocusPainted(false);
        fruta.setFocusable(false);

        jogadorUm.setForeground(new java.awt.Color(38, 97, 156));
        jogadorUm.setText("P1");
        jogadorUm.setFocusPainted(false);
        jogadorUm.setFocusable(false);

        jogadorDois.setForeground(new java.awt.Color(200, 0, 0));
        jogadorDois.setText("P2");
        jogadorDois.setFocusPainted(false);
        jogadorDois.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jogadorUm))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jogadorDois)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(fruta)
                .addContainerGap(237, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jogadorUm)
                .addGap(151, 151, 151)
                .addComponent(fruta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(jogadorDois)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    private void formKeyPressed(java.awt.event.KeyEvent evt) {
        
        pressionados.add(evt.getKeyCode());
        
    }

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {

    }

    private void jPanel1KeyReleased(java.awt.event.KeyEvent evt) {
        
    }

    private void formKeyReleased(java.awt.event.KeyEvent evt) {
       
        pressionados.remove(evt.getKeyCode());
        
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
        
    }

    
    private javax.swing.JButton fruta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jogadorDois;
    private javax.swing.JButton jogadorUm;
    
}
