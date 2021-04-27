public class Principal {

    public static void main(String[] args){
        Estoque estoque = new Estoque();
        estoque.comprarBebida("Corote", 5.99f, 30);
        Freezer freezer = new Freezer();
        freezer.adicionarBebida(estoque.retirarBebida("Corote", 10));
        Bebidas vetor[] = freezer.getVetor();
        System.out.println(vetor[0].getNome()+" "+vetor[0].getQuantidade()+" "+vetor[0].getValor());

    }
    
    
    
    
}