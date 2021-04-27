
public class Sessao {
    
    private String banco;
    private String host;
    private String porta;
    private String usuario;
    private String senha;

    public Sessao(String banco, String host, String porta, String usuario, String senha) {
        this.banco = banco;
        this.host = host;
        this.porta = porta;
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
