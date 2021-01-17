
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Persistencia {
    
    public String salvar(){
        int i;
        
        try {
            File file = new File("Persistencia.txt");
  
            if (!file.exists()) {
                file.createNewFile();
            }
            
            try (PrintWriter persistencia = new PrintWriter (new FileWriter("Persistencia.txt", true))) {
                
                
                
                
                
                
                
                
                
                
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
        
        return "";
    }
    
}
