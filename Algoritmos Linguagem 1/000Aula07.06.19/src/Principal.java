import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        while(true){
            try{
                int v1=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 1: "));
                int v2=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 2: "));
                int resultado=v1/v2;
                JOptionPane.showMessageDialog(null, "resultado da divisao:" + resultado);
            }
            catch(ArithmeticException e){
                JOptionPane.showMessageDialog(null, "exeção gerada" + e);
                JOptionPane.showMessageDialog(null, "Mensagem amigavel: erro de divisao por zero, repita a operaçao");
            }
            catch(InputMismatchException e){ // tipo de dados incompativeis
                JOptionPane.showMessageDialog(null, "exeção gerada" + e);
            }
            catch(ArrayIndexOutOfBoundsException e){ // erro na indexaçao de vetor
                JOptionPane.showMessageDialog(null, "exeção gerada" + e);
            }
            catch(NullPointerException e){ // tentando acessar um objeto que ja foi retirado da memoria(pelo lixeiro)
                JOptionPane.showMessageDialog(null, "exeção gerada" + e);
            }
        }

    }
    
}
