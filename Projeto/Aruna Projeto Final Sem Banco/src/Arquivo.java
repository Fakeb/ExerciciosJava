import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Arquivo{

    public void salvar(BancoDeDados bancodedados, ControleFinal controlefinal) {   
        
        int i;
        
        try {
            File file = new File("BancoDeDados.txt");
            
            if (!file.exists()) {
                file.createNewFile();
            }
            
            try (PrintWriter arquivo = new PrintWriter (new FileWriter("BancoDeDados.txt", true))) {
                
                if(bancodedados.nomeEvento!=null){ // se nome evento nao existir ele nao registra
                    arquivo.println(bancodedados.nomeEvento +"  "+ bancodedados.dataEvento);
                }
                
                if(bancodedados.nomeFuncionarios!=null){ // registro de funcionarios
                    for(i=0;i<bancodedados.nomeFuncionarios.size();i++){ 
                        arquivo.println("Nome: " + bancodedados.nomeFuncionarios.get(i) + " /Bar: " + bancodedados.barFuncionarios.get(i));
                    }
                }
                
                if(bancodedados.nomeBebidas!=null){ // registro bebidas
                    for(i=0;i<bancodedados.nomeBebidas.size();i++){                                  
                        arquivo.println("Bebida: " + bancodedados.nomeBebidas.get(i));                                       
                    }
                }
                
                if(bancodedados.nomeCigarros!=null){ // registro cigarros
                    for(i=0;i<bancodedados.nomeCigarros.size();i++){ 
                        arquivo.println("Cigarro: " + bancodedados.nomeCigarros.get(i));
                    }
                }
                
                if(bancodedados.quantidadeBebidasBarVip!=null){ // registro contagens bebidas
                    for(i=0;i<bancodedados.nomeBebidas.size();i++){                               
                        arquivo.println("Contagem BebidaBar Vip: " + bancodedados.nomeBebidas.get(i) +": "+ bancodedados.quantidadeBebidasBarVip.get(i));                                      
                    }
                }
                if(bancodedados.quantidadeBebidasBarPista!=null){ // registro contagens bebidas
                    for(i=0;i<bancodedados.nomeBebidas.size();i++){                               
                        arquivo.println("Contagem BebidaBar Pista: " + bancodedados.nomeBebidas.get(i) +": "+ bancodedados.quantidadeBebidasBarPista.get(i));                                      
                    }
                }
                if(bancodedados.quantidadeBebidasBarFora!=null){ // registro contagens bebidas
                    for(i=0;i<bancodedados.nomeBebidas.size();i++){                               
                        arquivo.println("Contagem BebidaBar Fora: " + bancodedados.nomeBebidas.get(i) +": "+ bancodedados.quantidadeBebidasBarFora.get(i));                                      
                    }
                }
                if(bancodedados.quantidadeBebidasEstoque!=null){ // registro contagens bebidas
                    for(i=0;i<bancodedados.nomeBebidas.size();i++){                               
                        arquivo.println("Contagem BebidaBar Estoque: " + bancodedados.nomeBebidas.get(i) +": "+ bancodedados.quantidadeBebidasEstoque.get(i));                                      
                    }
                }
                            
                if(bancodedados.quantidadeCigarrosBarFora!=null){ // registro contagens cigarros
                    for(i=0;i<bancodedados.nomeCigarros.size();i++){                      
                        arquivo.println("Contagem Cigarro BarFora: " + bancodedados.nomeCigarros.get(i) +": "+ bancodedados.quantidadeCigarrosBarFora.get(i));                                       
                    } 
                }
                
                if(bancodedados.quantidadeCigarrosEstoque!=null){ // registro contagens cigarros
                    for(i=0;i<bancodedados.nomeCigarros.size();i++){                      
                        arquivo.println("Contagem Cigarro Estoque: " + bancodedados.nomeCigarros.get(i) +": "+ bancodedados.quantidadeCigarrosEstoque.get(i));
                        
                    } 
                }
                
                if(controlefinal.quantidadeBebidas!=null){ // registro contagens finais bebidas
                    for(i=0;i<bancodedados.nomeBebidas.size();i++){           
                        arquivo.println(bancodedados.nomeBebidas.get(i)+": "+controlefinal.quantidadeBebidas.get(i));
                    }
                }
                
                if(controlefinal.quantidadeCigarros!=null){ // registro contagens finais cigarros
                    for(i=0;i<bancodedados.nomeCigarros.size();i++){           
                        arquivo.println(bancodedados.nomeCigarros.get(i)+": "+controlefinal.quantidadeCigarros.get(i));
                    }
                }
                
                
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }        
    }
       
}
