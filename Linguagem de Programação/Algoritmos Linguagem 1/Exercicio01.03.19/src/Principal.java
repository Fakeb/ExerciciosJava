
import javax.swing.JOptionPane;

/* desenvolver uma aplicaçao em java para:
-solicitar, ao usuario, um numero inteiro e positivo;
-realizar o calculo do fatorial de tal numero;
-armazenar, em um vetor, os cinco poximos numeros pares apos o resultado obtido com o calculo;
-exibir, na tela, o numero lido, o numero resultante do calculo fatorial e o conteudo do vetor;
*/

public class Principal {

    public static void main(String[] args) {
        int i = 1;
        int fat = 1;
        int vet[] = new int[5];
        String num = JOptionPane.showInputDialog("Digite o numero:");
        int numI = Integer.parseInt(num);
        
        for (i = 1; i <= numI; i++) {
            fat=fat*i;
        }
        
        for (i = 0; i <= 5; i++) {
            vet[i]= 05;
        }
        
        JOptionPane.showMessageDialog(null,"Resultado do fatorial:" + fat);
        
        for (i = 0; i < 5; i++) {
            JOptionPane.showMessageDialog(null,"Proximos cinco numeros pares:" + vet[i]);
            
        }
    }
    
}
