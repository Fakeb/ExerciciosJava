
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        aValor();
        
    }
    public static void aValor(){
        
        int valor[] = new int [4] ; 
        for (int i = 0; i < 4; i++){
                             
            valor[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));

            if((valor[i] != 1)&&(valor[i] !=0)){
                JOptionPane.showMessageDialog(null, "Valor invalido");
                aValor();
            }
            else{
                JOptionPane.showMessageDialog(null,"valor: " + valor[i]);
            }
        }
        JOptionPane.showMessageDialog(null,"valor: " + valor[0] + valor[1] + valor[2] + valor[3]);
        
        
    }
    
}
