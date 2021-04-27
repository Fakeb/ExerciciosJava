 public class Bebidas {

    private String nome;

    private float valor;

    private int quantidade;

    private Freezer freezer;

    public Bebidas(String nome) {
        this.nome=nome;
    }

    public Bebidas(String nome, float valor, int quantidade) {
        this.nome=nome;
        this.valor=valor;
        this.quantidade=quantidade;
    }

    public String getNome() {
        return nome;
    }

    public float getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}