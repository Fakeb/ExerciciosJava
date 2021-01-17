
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControleFinal implements InterfaceControleFinal{
    
    ArrayList<Integer> quantidadeBebidas = new ArrayList();
    ArrayList<Integer> quantidadeCigarros = new ArrayList();
    
    @Override
    public void juntar(BancoDeDados bancodedados){
        
        int i;
        if(bancodedados.nomeBebidas!=null){      
            for(i=0;i<bancodedados.nomeBebidas.size();i++){   
                if(bancodedados.quantidadeBebidasBarVip!=null){
                    quantidadeBebidas.add(Integer.parseInt(bancodedados.quantidadeBebidasBarVip.get(i))); // + Integer.parseInt(bancodedados.quantidadeBebidasBarPista.get(i)) + Integer.parseInt(bancodedados.quantidadeBebidasBarFora.get(i)) + Integer.parseInt(bancodedados.quantidadeBebidasEstoque.get(i)));                   
                }
                if(bancodedados.quantidadeBebidasBarPista!=null){
                    quantidadeBebidas.add(+Integer.parseInt(bancodedados.quantidadeBebidasBarPista.get(i)));
                }
                if(bancodedados.quantidadeBebidasBarFora!=null){
                    quantidadeBebidas.add(Integer.parseInt(bancodedados.quantidadeBebidasBarFora.get(i)));
                }
                if(bancodedados.quantidadeBebidasEstoque!=null){
                    quantidadeBebidas.add(Integer.parseInt(bancodedados.quantidadeBebidasEstoque.get(i)));
                }
                
            }
        }
        if(bancodedados.nomeCigarros!=null){
            for(i=0;i<bancodedados.nomeCigarros.size();i++){           
                quantidadeCigarros.add(Integer.parseInt(bancodedados.quantidadeCigarrosBarFora.get(i)) + Integer.parseInt(bancodedados.quantidadeCigarrosEstoque.get(i)));                 
            }
        }
        contagensFinais(bancodedados);
        
    }
    
    @Override
    public void contagensFinais(BancoDeDados bancodedados){
        
        int i;
        
        for(i=0;i<bancodedados.nomeBebidas.size();i++){           
            JOptionPane.showMessageDialog(null,bancodedados.nomeBebidas.get(i)+": "+quantidadeBebidas.get(i));
        }
        for(i=0;i<bancodedados.nomeCigarros.size();i++){           
            JOptionPane.showMessageDialog(null,bancodedados.nomeCigarros.get(i)+": "+quantidadeCigarros.get(i));
        }
              
    }
    
}
