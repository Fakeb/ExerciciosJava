
import javax.swing.JOptionPane;

public class Principal {

    
    public static void main(String[] args) {
        
        Produto produto = new Produto();
        
        produto.descricao =  JOptionPane.showInputDialog("Digite a descriçao do produto: ");
        
        produto.valor = (float)Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do produto: "));
        
        System.out.println("Produto: " + produto.descricao + " Valor: " + produto.valor);
        
    }
    
}
