
import javax.swing.JOptionPane;

/*
1- Funçoes matematicas
    A)-criar uma aplicaçao para:
        -ler dois valores reais
        -exibir os proximos inteiros deles(arredondamento superior)
        -exibir os inteiros anteriores deles(arredondamento inferior)
        -exibir o maior e o menor valor lido
    match 
    B)-gerar 3 numeros inteiros de forma aleatoria (1 até 100) 
    
*/
public class Principal {

    
    public static void main(String[] args) {
        
        double valor[] = lerValor();
        arredondarValor(valor);
        
    }
    public static double[] lerValor(){
        double valor[]= new double[100];
        for (int i = 0; i < 2; i++) {            
            valor[i]=Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));           
        }
            
        return valor;
    }
    public static void arredondarValor(double valor[]){
        JOptionPane.showMessageDialog(null,
            Math.ceil(valor[0])
            + Math.floor(valor[0])
            + Math.ceil(valor[1])
            + Math.floor(valor[1])
            + Math.max(valor[0],valor[1])
                    
        );
    }
    
    
}
