
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class MySQL {

    public Connection c;

    public Connection conectar(String IP, String porta, String nomeBanco, String usuario, String senha) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            c = DriverManager.getConnection("jdbc:mysql://" + IP + ":" + porta + "/" + nomeBanco + "?useTimeZone=true&serverTimezone=UTC&user=" + usuario + "&password=" + senha);
            System.out.println("Conectado!");
        } catch (Exception e) {
            System.out.println("e: " + e);
        }
        return c;
    }

    public ResultSet consultar(String query) {
        ResultSet rs = null;
        try {
            Statement st = (Statement) c.createStatement();
            rs = st.executeQuery(query);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        return rs;
    }

    public int executeQuery(String query) {
        int resultado = 0;
        try {
            Statement st = (Statement) c.createStatement();
            resultado = st.executeUpdate(query);
            System.out.println(resultado);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        return resultado;
    }
    
 
}
