import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Arquivo{

    public void salvar(String placa, String data, String veiculo,String vaga,String nVaga) {   
        
        try {
            File file = new File("BancoDeDados.txt"); //cria o arquivo
            
            if (!file.exists()) { // se nao existe cria arquivo
                file.createNewFile();
            }
            
            try (PrintWriter arquivo = new PrintWriter (new FileWriter("BancoDeDados.txt", true))) { // escreve
                
                arquivo.println("Vaga"+nVaga+"_Placa: "+placa+";");
                arquivo.println("Vaga"+nVaga+"_Data: "+data+";");
                arquivo.println("Vaga"+nVaga+"_Veiculo: "+veiculo+";\n");   
         
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }        
    }
        
    public Vagas leitura(File file, String nVaga) {
        
        Vagas vagas = new Vagas();
        
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();              
                if(nVaga.length()==1){ //se tem mais de 1 numero em vagas 
                    if (linha.contains("Vaga"+nVaga+"_Placa:")) {
                        vagas.setPlaca(linha.substring(13, linha.lastIndexOf(";")));             
                    }
                    if (linha.contains("Vaga"+nVaga+"_Data:")) {
                        vagas.setData(linha.substring(11, linha.lastIndexOf(";")));
                    }
                    if (linha.contains("Vaga"+nVaga+"_Veiculo:")) {
                        vagas.setVeiculo(linha.substring(15, linha.lastIndexOf(";")));
                    }
                }
                else { // else if(i.length()==2) 
                    if (linha.contains("Vaga"+nVaga+"_Placa:")) {
                        vagas.setPlaca(linha.substring(14, linha.lastIndexOf(";")));             
                    }
                    if (linha.contains("Vaga"+nVaga+"_Data:")) {
                        vagas.setData(linha.substring(12, linha.lastIndexOf(";")));
                    }
                    if (linha.contains("Vaga"+nVaga+"_Veiculo:")) {
                        vagas.setVeiculo(linha.substring(16, linha.lastIndexOf(";")));
                    }
                }
                            
            }
            scanner.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
        return vagas;
    }
    
}