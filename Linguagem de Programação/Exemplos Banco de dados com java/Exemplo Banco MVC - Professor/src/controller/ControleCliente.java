package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Cliente;

public class ControleCliente {
    
    Conector conector;
    PreparedStatement prepareds;
    ResultSet rset;

    public ControleCliente() {
        
        this.conector = new Conector();
        
    }
        
    public int executeQuery(String query) {
        int resultado = 0;
        
        try {
            conector.conectar();
            
            Statement st = (Statement) conector.getConnection().createStatement();
            resultado = st.executeUpdate(query);
            System.out.println(resultado);
            
            conector.desconectar();          
        } catch (SQLException e) {
            System.out.println("Exception: " + e);
        }
        return resultado;
    }
    
    public void update(Cliente cliente){
        
        try {
            conector.conectar();
            
            prepareds = conector.getConnection().prepareStatement("UPDATE cliente SET NOME = ?, CPF = ?, TELEFONE = ?, CIDADE = ?, UF = ? , STATUS = ? where ID_CLIENTE = ? limit 1");
            prepareds.setString(1, cliente.getNome());
            prepareds.setString(2, cliente.getCPF());
            prepareds.setString(3, cliente.getTelefone());
            prepareds.setString(4, cliente.getCidade());
            prepareds.setString(5, cliente.getUF());
            prepareds.setInt(6, cliente.getStatus());
            prepareds.setInt(7, cliente.getId());
            
            prepareds.executeUpdate();
            
            conector.desconectar();
            
            JOptionPane.showMessageDialog(null, "Alteração concluída!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao alterar cliente\n" + ex.getMessage());
        }
        
        
    }
    
    public void insert(Cliente cliente) {
        try {
            conector.conectar();
            System.out.println("INSERT INTO cliente VALUES (null, ?, ?, ?, ?, ?, 1)");
            prepareds = conector.getConnection().prepareStatement("INSERT INTO cliente VALUES (null, ?, ?, ?, ?, ?, 1)");
            prepareds.setString(1, cliente.getNome());
            prepareds.setString(2, cliente.getCPF());
            prepareds.setString(3, cliente.getTelefone());
            prepareds.setString(4, cliente.getCidade());
            prepareds.setString(5, cliente.getUF());
            prepareds.execute();
            
            conector.desconectar();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar cliente.\n" + e);
        }
    }
    
    public void delete (int id){
        try{
            conector.conectar();
            
            prepareds = conector.getConnection().prepareStatement("UPDATE cliente SET STATUS = 0 where ID_CLIENTE = ? limit 1");
            prepareds.setInt(1, id);
            
            prepareds.execute();
            
            conector.desconectar();
            
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha ao exlcuir cliente.\n" + e);
        }
        
    }
    
    public ArrayList select(String campo, String pesquisa) { 
        ArrayList conteudoTabela = new ArrayList();
        
        try {
           conector.conectar();
           
           prepareds = conector.getConnection().prepareStatement("SELECT * FROM cliente WHERE " + campo + " LIKE '%" + pesquisa
            + "%'");
           rset = prepareds.executeQuery();
           
           if(rset != null) {
               while(rset.next()) {
                   Object[] linhas = new Object[] {rset.getInt("ID_CLIENTE"), rset.getString("NOME"),rset.getString("CPF"),rset.getString("TELEFONE"),rset.getString("CIDADE"),rset.getString("UF"),rset.getInt("STATUS")};
                   conteudoTabela.add(linhas);
               }
           }
           
           conector.desconectar();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return conteudoTabela;
    }
    
}
