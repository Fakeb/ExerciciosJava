import javax.swing.JOptionPane;

public class Controle{

    public void cadastroEvento(BancoDeDados bancodedados) {
                 
        bancodedados.nomeEvento=JOptionPane.showInputDialog("Digite o nome: ");
        bancodedados.dataEvento=JOptionPane.showInputDialog("Digite o data(dia/mês/ano): ");
        
    }

    public void cadastroFuncionarios(BancoDeDados bancodedados) {
       
        int i,quantidade=0;
        
        try{           
            quantidade=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de funcionarios: "));                 
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Digite uma quantidade numérica :)");
        }
               
        for(i=0;i<quantidade;i++){
            bancodedados.nomeFuncionarios.add(JOptionPane.showInputDialog("Digite o nome: "));            
            bancodedados.barFuncionarios.add(JOptionPane.showInputDialog("Digite o nome do bar: "));
        }
        
    }

    public void cadastroBebidas(BancoDeDados bancodedados){
        
        int i,quantidade=0;
        
        try{           
            quantidade=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Bebidas: "));                 
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Digite uma quantidade numérica :)");
        }
        
        for(i=0;i<quantidade;i++){
            bancodedados.nomeBebidas.add(JOptionPane.showInputDialog("Digite o nome da bebida: "));
        }
    }
    
    public void cadastroCigarros(BancoDeDados bancodedados){
        
        int i,quantidade=0;
        
        try{           
            quantidade=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Cigarros: "));                 
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Digite uma quantidade numérica :)");
        }
        
        for(i=0;i<quantidade;i++){
            bancodedados.nomeCigarros.add(JOptionPane.showInputDialog("Digite o nome do cigarro: "));
        }
        
    }
    
    public void contagemBarVip(BancoDeDados bancodedados) {
              
        int i;
        
        for(i=0;i<bancodedados.nomeBebidas.size();i++){           
            bancodedados.quantidadeBebidasBarVip.add(JOptionPane.showInputDialog("Bebida: " + bancodedados.nomeBebidas.get(i) + "\nDigite a quantidade: "));
        }
        
    }

    public void contagemBarPista(BancoDeDados bancodedados) {

        int i;
        
        for(i=0;i<bancodedados.nomeBebidas.size();i++){           
            bancodedados.quantidadeBebidasBarPista.add(JOptionPane.showInputDialog("Bebida: " + bancodedados.nomeBebidas.get(i) + "\nDigite a quantidade: "));
        }
        
    }

    public void contagemBarFora(BancoDeDados bancodedados) {
         
        int i;
        
        for(i=0;i<bancodedados.nomeBebidas.size();i++){           
            bancodedados.quantidadeBebidasBarFora.add(JOptionPane.showInputDialog("Bebida: " + bancodedados.nomeBebidas.get(i) + "\nDigite a quantidade: "));           
        }
        for(i=0;i<bancodedados.nomeCigarros.size();i++){           
            bancodedados.quantidadeCigarrosBarFora.add(JOptionPane.showInputDialog("Cigarro: " + bancodedados.nomeCigarros.get(i) + "\nDigite a quantidade: "));         
        }
          
    }

    public void contagemEstoque(BancoDeDados bancodedados) {
                
        int i;
        
        for(i=0;i<bancodedados.nomeBebidas.size();i++){           
            bancodedados.quantidadeBebidasEstoque.add(JOptionPane.showInputDialog("Bebida: " + bancodedados.nomeBebidas.get(i) + "\nDigite a quantidade: "));           
        }
        for(i=0;i<bancodedados.nomeCigarros.size();i++){           
            bancodedados.quantidadeCigarrosEstoque.add(JOptionPane.showInputDialog("Cigarro: " + bancodedados.nomeCigarros.get(i) + "\nDigite a quantidade: "));         
        }
        
    }
    
    public void exibirEvento(BancoDeDados bancodedados){
                
        JOptionPane.showMessageDialog(null,"Nome do Evento: "+bancodedados.nomeEvento + "  / Data: " +bancodedados.dataEvento);
               
    }
      
    public void exibirFuncionarios(BancoDeDados bancodedados){
                   
        int i;
        
        for(i=0;i<bancodedados.nomeFuncionarios.size();i++){
            JOptionPane.showMessageDialog(null,"Nome: "+bancodedados.nomeFuncionarios.get(i) + " / Bar: " +bancodedados.barFuncionarios.get(i));
        }  
        
    }
    
    public void exibirBebidas(BancoDeDados bancodedados){
        
        int i;
        JOptionPane.showMessageDialog(null,"Bebidas: ");
        for(i=0;i<bancodedados.nomeBebidas.size();i++){
            JOptionPane.showMessageDialog(null,bancodedados.nomeBebidas.get(i));
        } 
    }
    
    public void exibirCigarros(BancoDeDados bancodedados){
        
        int i;
        JOptionPane.showMessageDialog(null,"Cigarros: ");
        for(i=0;i<bancodedados.nomeCigarros.size();i++){
            JOptionPane.showMessageDialog(null,bancodedados.nomeCigarros.get(i));
        } 
    }
    
    public void exibirContagens(BancoDeDados bancodedados){
        
        int i;
        
        JOptionPane.showMessageDialog(null,"Bebidas BarVip:");
        for(i=0;i<bancodedados.quantidadeBebidasBarVip.size();i++){
            JOptionPane.showMessageDialog(null,bancodedados.nomeBebidas.get(i) + ": " + bancodedados.quantidadeBebidasBarVip.get(i));
        }
        
        JOptionPane.showMessageDialog(null,"Bebidas BarPista:");
        for(i=0;i<bancodedados.quantidadeBebidasBarPista.size();i++){
            JOptionPane.showMessageDialog(null,bancodedados.nomeBebidas.get(i) + ": " + bancodedados.quantidadeBebidasBarPista.get(i));
        }
        
        JOptionPane.showMessageDialog(null,"Bebidas BarFora:");
        for(i=0;i<bancodedados.quantidadeBebidasBarFora.size();i++){
            JOptionPane.showMessageDialog(null,bancodedados.nomeBebidas.get(i) + ": " + bancodedados.quantidadeBebidasBarFora.get(i));
        }
        
        JOptionPane.showMessageDialog(null,"Bebidas Estoque:");
        for(i=0;i<bancodedados.quantidadeBebidasEstoque.size();i++){
            JOptionPane.showMessageDialog(null,bancodedados.nomeBebidas.get(i) + ": " + bancodedados.quantidadeBebidasEstoque.get(i));
        }
        
        JOptionPane.showMessageDialog(null,"Cigarros BarFora:");
        for(i=0;i<bancodedados.quantidadeCigarrosBarFora.size();i++){
            JOptionPane.showMessageDialog(null,bancodedados.nomeCigarros.get(i) + ": " + bancodedados.quantidadeCigarrosBarFora.get(i));
        }
        
        JOptionPane.showMessageDialog(null,"Cigarros Estoque:");
        for(i=0;i<bancodedados.quantidadeCigarrosEstoque.size();i++){
            JOptionPane.showMessageDialog(null,bancodedados.nomeCigarros.get(i) + ": " + bancodedados.quantidadeCigarrosEstoque.get(i));
        }
              
    }
       
}
