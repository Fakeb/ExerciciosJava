public class Controle {


    
    public String cadastrarFuncionarios(){
        
        
        
        
        
        
        
        
        return null;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void comprarBebida(String nome, float valor, int quantidade) {
        Bebidas bebida = new Bebidas(nome,valor,quantidade);

        boolean jaExiste = false;
        int posicao = 0;
        if(!(vetor[0] == null)){
            for(int i = 0; i<vetor.length ;i++){
                if(vetor[i].getNome().equals(bebida.getNome())){
                    jaExiste = true;
                    posicao = i;
                }
            }
        }
        if(jaExiste == false){
        vetor[quantidadeBebidasUnicas] = bebida;
        quantidadeBebidasUnicas++;
        }
        else{
            vetor[posicao].setQuantidade(vetor[posicao].getQuantidade()+bebida.getQuantidade());
        }
    }

    public Bebidas retirarBebida(String nome, int retirada) {
        
        for(int i = 0; i< quantidadeBebidasUnicas ;i++){
            if(vetor[i].getNome().equals(nome) && vetor[i].getQuantidade() >= retirada){
                Bebidas bebida = new Bebidas(vetor[i].getNome(),vetor[i].getValor(), retirada);
                vetor[i].setQuantidade(vetor[i].getQuantidade() - retirada);
                return bebida;
            }
                else if(vetor[i].getNome().equals(nome) && vetor[i].getQuantidade() < retirada){
                    Bebidas bebida = new Bebidas("Sem quantidade no estoque");
                    return bebida;
            }
        }

        Bebidas bebida2 = new Bebidas("Sem bebidas no estoque");
        return bebida2;
    }

    
    
    
    
    
}
