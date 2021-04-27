
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Aluno> listaBolha = new ArrayList();
        ArrayList<Aluno> listaSelecao = new ArrayList();
        ArrayList<Aluno> listaInsercao = new ArrayList();
        int qtd = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos numeros?"));
        
        Ordenacao.popularLista(listaBolha, qtd);
        listaSelecao.addAll(listaBolha);
        listaInsercao.addAll(listaBolha);
        
        Thread t1 = new Thread() {
            @Override
            public void run() {
                System.out.println("Ordenando com bolha.....");
                Ordenacao.bolha(listaBolha);
                System.out.println("Feito bolha.....");
            }
        };
        t1.start();
        
        Thread t2 = new Thread() {
            @Override
            public void run() {
                System.out.println("Ordenando com selecao.....");
                Ordenacao.selecao(listaSelecao);
                System.out.println("Feito selecao.....");
            }
        };
        t2.start();
        
        Thread t3 = new Thread() {
            @Override
            public void run() {
                System.out.println("Ordenando com insercao.....");
                Ordenacao.insercao(listaInsercao);
                System.out.println("Feito insercao.....");
            }
        };
        t3.start();
        
        //espera as threads terminarem
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       // Ordenacao.exibirLista(listaBolha,"bolha");
        //Ordenacao.exibirLista(listaSelecao,"selecao");
        //Ordenacao.exibirLista(listaInsercao,"insercao");
        System.exit(0);
    }
    
}
