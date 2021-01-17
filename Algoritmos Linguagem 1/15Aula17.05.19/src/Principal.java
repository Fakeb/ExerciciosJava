import Persistência.Arquivo;    // import Persistência.*; // para importar todas classes de Persistência;

public class Principal {

    private static String email;
    private static int matricula;
    
    public static void main(String[] args) {
        
        email = "r@r.com";
        System.out.println(email);
        matricula = 12345;
        System.out.println(matricula);
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Pedro");
        System.out.println(pessoa.getNome());
        Arquivo arquivo = new Arquivo();
        arquivo.gravar();
    }
    
}
