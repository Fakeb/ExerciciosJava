/*
Solicitar nomes e notas; Classificar e exibir (nomes e notas) do maior para o menor. Utilizar métodos!
*/
import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) { 
        
        String nome[] = new String[100];
        double nota[] = new double[100];
        
        int Npessoas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de atletas: "));
        
        for(int i=0; i < Npessoas; i++ ){
            nome[i] = JOptionPane.showInputDialog("Digite o nome do atleta: ");
            nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do atleta: "));
        }   
        
        String empilhar = Ordenar(nome,nota,Npessoas); 
        JOptionPane.showMessageDialog(null, "Ordem decrescente dos atletas:\n" + empilhar);
        
    }   
    public static String Ordenar(String nome[],double nota[],int Npessoas){
        
        double aux;
        String aux2, empilhar = "";
        
        for (int i = 0; i < Npessoas; i++) {
            for (int j = i + 1; j < Npessoas; j++) {

                if (nota[i] > nota[j]) {
                     aux = nota[i];
                     nota[i] = nota[j];
                     nota[j] = aux;

                     aux2 = nome[i];
                     nome[i] = nome[j];
                     nome[j] = aux2;
                }
            }
            
            empilhar = nome[i] + "  --->  " + nota[i] + "\n" + empilhar;
            
        } 
        return empilhar;
    }
}