
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MySQL {
    
    Connection c;

    public Connection conectar(Sessao sessao) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            c = DriverManager.getConnection("jdbc:mysql://" + sessao.getHost() + ":" + sessao.getPorta() + "/" + sessao.getBanco() + "?useTimezone=true&serverTimezone=UTC", sessao.getUsuario(), sessao.getSenha());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
        return c;
    }
    
    public ResultSet consultar(String query) {
        Statement st;
        ResultSet rs = null;
        try {
            st = c.createStatement();
            rs = st.executeQuery(query);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO: " + ex, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }
    
    public int executeUpdate(String query) {
        Statement st;
        int statusQuery = 0;
        try {
            st = c.createStatement();
            statusQuery = st.executeUpdate(query);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO: " + ex, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
        return statusQuery;
    }
}
