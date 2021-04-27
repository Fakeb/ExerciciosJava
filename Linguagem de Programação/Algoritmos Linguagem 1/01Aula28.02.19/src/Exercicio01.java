
import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String[] args) { //psvm-tab
        /*System.out.println("eu sou a classe exercicio 1");
        char c='a';
        String s="ola";
        int i=1;
        float f=(float)2.5;
        */
        
        String nome = JOptionPane.showInputDialog("Digite o seu nome:");
        JOptionPane.showMessageDialog(null,"Bem-vindo ao sistema " + nome + " AAAAA");
        
        JOptionPane.showMessageDialog(null,"Bem-vindo ao sistema" + JOptionPane.showInputDialog("Digite seu nome:"));
    }
    
}
