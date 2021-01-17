
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class FormAruna extends javax.swing.JFrame {

    DefaultTableModel modelTabelaPrincipal;
    DefaultTableModel modelTabelaContagem;
    DefaultTableModel modelTabelaVendas;
    Connection c;
    MySQL mysql;

    public FormAruna() {
        initComponents();
        modelTabelaPrincipal = (DefaultTableModel) jTablePrincipal.getModel();
        modelTabelaContagem = (DefaultTableModel) jTableContagem.getModel();
        modelTabelaVendas = (DefaultTableModel) jTableVendas.getModel();
        mysql = new MySQL();
        jLabelConexao.setForeground(Color.RED);
        setLocationRelativeTo(null);
    }
    
    public void atualizar() {
        // atualizar tabela com estoque
        
        modelTabelaPrincipal.setRowCount(0);
        modelTabelaContagem.setRowCount(0);
        modelTabelaVendas.setRowCount(0);
        try {
            ResultSet rs = mysql.consultar("SELECT * FROM contagem");
            if (rs != null) {
                while (rs.next()) {                     
                    
                    modelTabelaPrincipal.addRow(new Object[]{rs.getString("bebidas"),rs.getInt("barVip"),rs.getInt("barPista"),rs.getInt("barFora"),rs.getInt("estoque"),
                        (rs.getInt("barVip")+rs.getInt("barPista")+rs.getInt("barFora")+rs.getInt("estoque"))});
                    
                    modelTabelaContagem.addRow(new Object[]{rs.getString("bebidas"),rs.getInt("barVip"),rs.getInt("barPista"),rs.getInt("barFora"),rs.getInt("estoque"),
                        (rs.getInt("barVip")+rs.getInt("barPista")+rs.getInt("barFora")+rs.getInt("estoque"))});
                    
                    modelTabelaVendas.addRow(new Object[]{rs.getString("bebidas"),(rs.getInt("barVip")+rs.getInt("barPista")+rs.getInt("barFora")+rs.getInt("estoque"))});
                    
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO: " + ex, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
    }
     
    public void inserirCBAdicionar(){
           
        jCBBebidasAdicionar.removeAllItems(); // limpar Combo Box
        
        try { // popular combo box 
            ResultSet rs = mysql.consultar("select bebidas from contagem");
            if (rs != null) {
                while (rs.next()) {
                    jCBBebidasAdicionar.addItem(rs.getString("bebidas"));                       
                }
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FormContagem = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableContagem = new javax.swing.JTable();
        jTFBarVipContagem = new javax.swing.JTextField();
        jTFBarPistaContagem = new javax.swing.JTextField();
        jTFBarForaContagem = new javax.swing.JTextField();
        jTFEstoqueContagem = new javax.swing.JTextField();
        jLabelBarVipContagem = new javax.swing.JLabel();
        jLabelBarPistaContagem = new javax.swing.JLabel();
        jLabelBarForaContagem = new javax.swing.JLabel();
        jLabelEstoqueContagem = new javax.swing.JLabel();
        jBtnAdicionarContagem = new javax.swing.JButton();
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
        FormAdicionar = new javax.swing.JFrame();
        jTFBebidaAdicionar = new javax.swing.JTextField();
        jLabelBebidaAdicionar = new javax.swing.JLabel();
        jCBBebidasAdicionar = new javax.swing.JComboBox<>();
        jLabelAlterarBebidasAdicionar = new javax.swing.JLabel();
        jBtnEditarAdicionar = new javax.swing.JButton();
        jBtnAdicionarAdicionar = new javax.swing.JButton();
        FormVendas = new javax.swing.JFrame();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableVendas = new javax.swing.JTable();
        jTFVendasVendas = new javax.swing.JTextField();
        jLabelVendasVendas = new javax.swing.JLabel();
        jBtnConfirmarVendas = new javax.swing.JButton();
        jBtnAtualizarVendas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePrincipal = new javax.swing.JTable();
        jBtnAdicionar = new javax.swing.JButton();
        jBtnContagem = new javax.swing.JButton();
        jBtnVendas = new javax.swing.JButton();
        jBtnConectar = new javax.swing.JButton();
        jLabelConexao = new javax.swing.JLabel();
        jLabelConect = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jTableContagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bebidas", "BarVip", "BarPista", "BarFora", "Estoque"
            }
        ));
        jScrollPane2.setViewportView(jTableContagem);

        jLabelBarVipContagem.setText("BarVip");

        jLabelBarPistaContagem.setText("BarPista");

        jLabelBarForaContagem.setText("BarFora");

        jLabelEstoqueContagem.setText("Estoque");

        jBtnAdicionarContagem.setText("Adicionar");
        jBtnAdicionarContagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAdicionarContagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FormContagemLayout = new javax.swing.GroupLayout(FormContagem.getContentPane());
        FormContagem.getContentPane().setLayout(FormContagemLayout);
        FormContagemLayout.setHorizontalGroup(
            FormContagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormContagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(FormContagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormContagemLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(FormContagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFBarVipContagem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelBarVipContagem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormContagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelBarPistaContagem)
                            .addComponent(jTFBarPistaContagem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormContagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFBarForaContagem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelBarForaContagem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormContagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEstoqueContagem)
                            .addComponent(jTFEstoqueContagem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FormContagemLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jBtnAdicionarContagem)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        FormContagemLayout.setVerticalGroup(
            FormContagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormContagemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FormContagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FormContagemLayout.createSequentialGroup()
                        .addGroup(FormContagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBarVipContagem)
                            .addComponent(jLabelBarPistaContagem)
                            .addComponent(jLabelBarForaContagem)
                            .addComponent(jLabelEstoqueContagem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormContagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFBarVipContagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFBarPistaContagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFBarForaContagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFEstoqueContagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(153, 153, 153)
                        .addComponent(jBtnAdicionarContagem)))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        jFrameConexao.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrameConexao.setTitle("Java MySQL - Conectar");
        jFrameConexao.setResizable(false);

        jPanelSessao.setBorder(javax.swing.BorderFactory.createTitledBorder("Sessão"));

        jTextFieldHost.setText("localhost");

        jLabelHost.setText("Host:");

        jLabelUsuario.setText("Usuário:");

        jTextFieldUsuario.setText("root");

        jLabelSenha.setText("Senha:");

        jPasswordFieldSenha.setText("Fakeb");

        jLabelPorta.setText("Porta:");

        jTextFieldPorta.setText("3306");

        jLabel1.setText("Banco:");

        jTextFieldBanco.setText("ArunaBanco");

        jButtonConectar.setText("Conectar");
        jButtonConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSessaoLayout = new javax.swing.GroupLayout(jPanelSessao);
        jPanelSessao.setLayout(jPanelSessaoLayout);
        jPanelSessaoLayout.setHorizontalGroup(
            jPanelSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSessaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSessaoLayout.createSequentialGroup()
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
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButtonConectar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConectar)
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout jFrameConexaoLayout = new javax.swing.GroupLayout(jFrameConexao.getContentPane());
        jFrameConexao.getContentPane().setLayout(jFrameConexaoLayout);
        jFrameConexaoLayout.setHorizontalGroup(
            jFrameConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameConexaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelSessao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jFrameConexaoLayout.setVerticalGroup(
            jFrameConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameConexaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelSessao, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabelBebidaAdicionar.setText("Bebida");

        jLabelAlterarBebidasAdicionar.setText("Alterar Bebida");

        jBtnEditarAdicionar.setText("Editar");
        jBtnEditarAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarAdicionarActionPerformed(evt);
            }
        });

        jBtnAdicionarAdicionar.setText("Adicionar");
        jBtnAdicionarAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAdicionarAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FormAdicionarLayout = new javax.swing.GroupLayout(FormAdicionar.getContentPane());
        FormAdicionar.getContentPane().setLayout(FormAdicionarLayout);
        FormAdicionarLayout.setHorizontalGroup(
            FormAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormAdicionarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FormAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBebidaAdicionar)
                    .addGroup(FormAdicionarLayout.createSequentialGroup()
                        .addComponent(jTFBebidaAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jBtnEditarAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnAdicionarAdicionar)))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(FormAdicionarLayout.createSequentialGroup()
                .addGroup(FormAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormAdicionarLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabelAlterarBebidasAdicionar))
                    .addComponent(jCBBebidasAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        FormAdicionarLayout.setVerticalGroup(
            FormAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormAdicionarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelBebidaAdicionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFBebidaAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAdicionarAdicionar)
                    .addComponent(jBtnEditarAdicionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAlterarBebidasAdicionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCBBebidasAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jTableVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bebidas", "Total", "Vendas", "Estoque Atual"
            }
        ));
        jScrollPane5.setViewportView(jTableVendas);

        jLabelVendasVendas.setText("Vendas:");

        jBtnConfirmarVendas.setText("Confirmar");
        jBtnConfirmarVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarVendasActionPerformed(evt);
            }
        });

        jBtnAtualizarVendas.setText("Atualizar");
        jBtnAtualizarVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAtualizarVendasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FormVendasLayout = new javax.swing.GroupLayout(FormVendas.getContentPane());
        FormVendas.getContentPane().setLayout(FormVendasLayout);
        FormVendasLayout.setHorizontalGroup(
            FormVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FormVendasLayout.createSequentialGroup()
                        .addComponent(jLabelVendasVendas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFVendasVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FormVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jBtnAtualizarVendas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnConfirmarVendas, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        FormVendasLayout.setVerticalGroup(
            FormVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FormVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormVendasLayout.createSequentialGroup()
                        .addGroup(FormVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFVendasVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelVendasVendas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnConfirmarVendas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnAtualizarVendas)
                        .addGap(0, 210, Short.MAX_VALUE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aruna Controle Estoque");

        jTablePrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bebidas", "BarVip", "BarPista", "BarFora", "Estoque", "Total", "Total C Vendas"
            }
        ));
        jScrollPane1.setViewportView(jTablePrincipal);

        jBtnAdicionar.setText("Adicionar");
        jBtnAdicionar.setToolTipText("Alteração dos itens da tabela");
        jBtnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAdicionarActionPerformed(evt);
            }
        });

        jBtnContagem.setText("Contagem");
        jBtnContagem.setToolTipText("Controle de contagem");
        jBtnContagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnContagemActionPerformed(evt);
            }
        });

        jBtnVendas.setText("Vendas");
        jBtnVendas.setToolTipText("Controle de vendas");
        jBtnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVendasActionPerformed(evt);
            }
        });

        jBtnConectar.setText("Conectar");
        jBtnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConectarActionPerformed(evt);
            }
        });

        jLabelConexao.setText("Offline");

        jLabelConect.setText("Conexão:");

        jLabel2.setText("Estoque Atual");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabelConect)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelConexao))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jBtnVendas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnAdicionar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnConectar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnContagem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnContagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnVendas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnConectar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConect)
                    .addComponent(jLabelConexao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAdicionarActionPerformed
        //abrir quadro de adicionar bebidas
       
        inserirCBAdicionar(); // metodo de adicionar bebidas no combo box

        FormAdicionar.setVisible(true);
        FormAdicionar.setSize(350,300);
        FormAdicionar.setLocationRelativeTo(null);
    }//GEN-LAST:event_jBtnAdicionarActionPerformed

    private void jBtnContagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnContagemActionPerformed
       //abrir quadro de contagem
       
       atualizar();
       
       FormContagem.setVisible(true);
       FormContagem.setSize(780,340);
       FormContagem.setLocationRelativeTo(null);
    }//GEN-LAST:event_jBtnContagemActionPerformed

    private void jBtnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVendasActionPerformed
        //abrir quadro de vendas

        atualizar();
        FormVendas.setVisible(true);
        FormVendas.setSize(500,350);
        FormVendas.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_jBtnVendasActionPerformed

    private void jButtonConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConectarActionPerformed
        //conectar ao banco de dados
        
        String senha = new String(jPasswordFieldSenha.getPassword());
        Sessao sessao = new Sessao(jTextFieldBanco.getText(), jTextFieldHost.getText(), jTextFieldPorta.getText(), jTextFieldUsuario.getText(), senha);
        c = mysql.conectar(sessao);
        try {
            if (c != null) {
                if (!c.isClosed()) {
                    jLabelConexao.setText("Online");
                    jLabelConexao.setForeground(Color.GREEN);
                    jFrameConexao.dispose();
                    atualizar(); // atualizar lista de itens do banco
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }        
    }//GEN-LAST:event_jButtonConectarActionPerformed

    private void jBtnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConectarActionPerformed
        // abrir Conexao de banco de dados
        
        jFrameConexao.setVisible(true);
        jFrameConexao.setSize(400, 350);
        jFrameConexao.setLocationRelativeTo(null);
    }//GEN-LAST:event_jBtnConectarActionPerformed

    private void jBtnAdicionarAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAdicionarAdicionarActionPerformed
        //adicionar bebidas
        
        String query = "INSERT INTO contagem (bebidas) "
                + "values ('" + jTFBebidaAdicionar.getText() + "')";
        int retorno = mysql.executeUpdate(query);
        if (retorno == 1) {
            jTFBebidaAdicionar.getText();
            JOptionPane.showMessageDialog(this, "Dados inseridos no banco de dados!");
        } else {
            JOptionPane.showMessageDialog(this, "Houve um problema durante a tentativa de inserção");
        }
        
        inserirCBAdicionar();
        atualizar();
        
    }//GEN-LAST:event_jBtnAdicionarAdicionarActionPerformed

    private void jBtnEditarAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarAdicionarActionPerformed
        //alterar bebidas

        String query = "UPDATE contagem SET bebidas ='" + jTFBebidaAdicionar.getText() + "' WHERE bebidas = '"+jCBBebidasAdicionar.getSelectedItem()+"'"  ;
        int statusQuery = mysql.executeUpdate(query);
        if (statusQuery == 1) {
            atualizar();
            inserirCBAdicionar();
            
        } else {
            JOptionPane.showMessageDialog(this, "ERRO: Os dados não foram alterados.", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
             
    }//GEN-LAST:event_jBtnEditarAdicionarActionPerformed

    private void jBtnAdicionarContagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAdicionarContagemActionPerformed
             
        if(jTableContagem.isRowSelected(jTableContagem.getSelectedRow())){
            String query = "UPDATE contagem SET barVip ='" + jTFBarVipContagem.getText() + "', barPista ='"+ jTFBarPistaContagem.getText() +"', barFora ='" + jTFBarForaContagem.getText() +
                    "', estoque ='" + jTFEstoqueContagem.getText() + "' WHERE bebidas = '"+jTableContagem.getValueAt(jTableContagem.getSelectedRow(), 0)+"'";
            int statusQuery = mysql.executeUpdate(query);
            if (statusQuery == 1) {
                atualizar();
                
            } else {
                JOptionPane.showMessageDialog(this, "ERRO: Os dados não foram alterados.", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_jBtnAdicionarContagemActionPerformed

    private void jBtnConfirmarVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarVendasActionPerformed
        
        modelTabelaVendas.setValueAt(jTFVendasVendas.getText(), jTableVendas.getSelectedRow(),2 );
        
        String totalp = modelTabelaVendas.getValueAt(jTableVendas.getSelectedRow(), 1).toString();
        int totalPint = Integer.parseInt(totalp);
        String totalv = modelTabelaVendas.getValueAt(jTableVendas.getSelectedRow(), 2).toString();
        int totalVint = Integer.parseInt(totalv);       
        int total = totalPint-totalVint;
       
        modelTabelaVendas.setValueAt(total, jTableVendas.getSelectedRow(),3 );   
        
 
    }//GEN-LAST:event_jBtnConfirmarVendasActionPerformed

    private void jBtnAtualizarVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAtualizarVendasActionPerformed

        for(int i=0;i<jTableVendas.getRowCount();i++){
            modelTabelaPrincipal.setValueAt(jTableVendas.getValueAt(i, 3), i, 6);
        }        
        
        FormVendas.dispose();  
        
    }//GEN-LAST:event_jBtnAtualizarVendasActionPerformed
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormAruna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAruna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAruna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAruna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAruna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame FormAdicionar;
    private javax.swing.JFrame FormContagem;
    private javax.swing.JFrame FormVendas;
    private javax.swing.JButton jBtnAdicionar;
    private javax.swing.JButton jBtnAdicionarAdicionar;
    private javax.swing.JButton jBtnAdicionarContagem;
    private javax.swing.JButton jBtnAtualizarVendas;
    private javax.swing.JButton jBtnConectar;
    private javax.swing.JButton jBtnConfirmarVendas;
    private javax.swing.JButton jBtnContagem;
    private javax.swing.JButton jBtnEditarAdicionar;
    private javax.swing.JButton jBtnVendas;
    private javax.swing.JButton jButtonConectar;
    private javax.swing.JComboBox<String> jCBBebidasAdicionar;
    private javax.swing.JFrame jFrameConexao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAlterarBebidasAdicionar;
    private javax.swing.JLabel jLabelBarForaContagem;
    private javax.swing.JLabel jLabelBarPistaContagem;
    private javax.swing.JLabel jLabelBarVipContagem;
    private javax.swing.JLabel jLabelBebidaAdicionar;
    private javax.swing.JLabel jLabelConect;
    private javax.swing.JLabel jLabelConexao;
    private javax.swing.JLabel jLabelEstoqueContagem;
    private javax.swing.JLabel jLabelHost;
    private javax.swing.JLabel jLabelPorta;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JLabel jLabelVendasVendas;
    private javax.swing.JPanel jPanelSessao;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTFBarForaContagem;
    private javax.swing.JTextField jTFBarPistaContagem;
    private javax.swing.JTextField jTFBarVipContagem;
    private javax.swing.JTextField jTFBebidaAdicionar;
    private javax.swing.JTextField jTFEstoqueContagem;
    private javax.swing.JTextField jTFVendasVendas;
    private javax.swing.JTable jTableContagem;
    private javax.swing.JTable jTablePrincipal;
    private javax.swing.JTable jTableVendas;
    private javax.swing.JTextField jTextFieldBanco;
    private javax.swing.JTextField jTextFieldHost;
    private javax.swing.JTextField jTextFieldPorta;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables

    
}
