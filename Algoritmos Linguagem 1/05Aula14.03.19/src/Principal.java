
import javax.swing.JOptionPane;


public class Principal {

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao sistema");
        login();
        System.out.println(conf());
    }
    public static void login(){
        /*/
        String login = JOptionPane.showInputDialog("Digite o nome: ");        
        int senha = Integer.parseInt(JOptionPane.showInputDialog( login + " Digite a senha: ")); >> String senha = JOptionPane.showInputDialog("Digite a senha: ");
        
        if(senha == 123){ >> if(senha.equals("123")) ou if(!senha.equals("123))
            System.out.println("Você está logado como root");
        }
        else{
            System.out.println("Senha incorreta");
        }
        /*/
        System.out.println("Você está logado como root");
    }
    public static String conf(){
        return "Menu de opções p/ root: \n\t1-gerenciasr contas\n\t2-restaurar bkp";
    }
}
