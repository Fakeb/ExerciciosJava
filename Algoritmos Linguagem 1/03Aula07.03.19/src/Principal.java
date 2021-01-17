
import javax.swing.JOptionPane;

/*
1 - desenvolver uma aplicação para ranking/classificação de atletas(nomes e notas);
    -solicitar nomes e notas
    -classificar os atletas(da maior nota para a menor)
    -exibir a classificação
*/
public class Principal {

    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog("Digite o numero de atletas:");
        int numI = Integer.parseInt(num);
        solicitarNomes(numI);
    }
    public static void solicitarNomes(int numI){
        
        int vetor[] = new int[numI];
        int i;
        for(i=0;i<=numI;i++){
        
        
        }
        
    }
    
}
