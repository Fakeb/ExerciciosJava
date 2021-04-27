public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(){
    }
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        
    }
    public void exibirInformacoes(String endereco){
        System.out.println("nome: " + nome + "idade: " + idade + " endereco: " + endereco);
        
    }
    public void exibirInformacao(){
        System.out.println("nome: " + nome + "idade: " + idade);
    }
    
    
    
}
