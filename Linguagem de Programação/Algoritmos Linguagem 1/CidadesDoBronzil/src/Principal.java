// leitura de arquivo em java
// ler, colocar na memoria
// pedir o estado e mostrar todas cidades

import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;
 
public class Principal {
 
    public static void main(String[] args){
        
        int contagem=lerArquivo(); // contagem recebe o retorno de lerARquivo     
        String matriz[][] = popularMatriz(contagem);  // matriz recebe retorno do método, matriz vai receber o tamanho do metodo ([][])
                    
        System.out.println(consultarMagrao(contagem, matriz)); // Mostrar o retorno empilhar
        

    }
    public static int lerArquivo(){
        
        int nlinha=0;
        
        File arquivo=new File("cidades_e_estados.sql"); // criar o arquivo\puxar arquivo
            try{ // tentar
                Scanner escanear = new Scanner(arquivo); // ler o arquivo
                while(escanear.hasNextLine()){ // rodar o while enquanto tiver linha
                    String linha = escanear.nextLine(); // armazenar a linha na String linha
                    
                    if((linha.contains("INSERT"))&&(linha.contains("tb_cidades"))){ // se a linha tiver "instert" e "tb_cidades"                        
                        nlinha++; // contar as linhas que entraram no if
                    }                    
                }
            }catch(Exception e){ // execessão erro
                JOptionPane.showMessageDialog(null,"Erro"+e); // mostrar erro
            }  
        return nlinha; // retornar numero de linhas
    }
    public static String[][] popularMatriz(int contagem){
       
        String matriz[][]= new String[2][contagem]; // criar matriz com duas colunas e o numero de linhas da contagem(numero de cidades)
        int i=0;
        File arquivo=new File("cidades_e_estados.sql"); // criar o arquivo\puxar arquivo
            try{ // tentar
                Scanner escanear = new Scanner(arquivo); // ler o arquivo
                while(i<contagem){ // rodar o while enquanto tiver linha
                    String linha = escanear.nextLine(); // armazenar a linha na String linha
                    
                    if((linha.contains("INSERT"))&&(linha.contains("tb_cidades"))){ // se a linha tiver "instert" e "tb_cidades"                        
                        matriz[0][i] = linha.substring(44, 46); // matriz na coluna 0 vai recebe os caracteres do arquivo a partir do caracter 44 até o 46
                        matriz[1][i] = linha.substring(50, linha.lastIndexOf("'")); // matriz na coluna 1 vai recebe os caracteres do arquivo a partir do caracter 50 até encontrar a '
                        i++; // se ele entrar no if, continuar contando(executando o while)
                    }                   
                }
            }catch(Exception e){ // execessão erro
                JOptionPane.showMessageDialog(null,"Erro"+e); // mostrar erro
            }
        return matriz; // retornar a matriz
    }
    public static String consultarMagrao(int contagem, String[][] matriz){
        
        String estado = JOptionPane.showInputDialog("Digite o estado:"); // solicitar estado pro magrao
        String empilhar = "";
        
        for (int i=0;i<contagem;i++){ // for que percorre todas as linhas úteis
            
            if (matriz[0][i].equals(estado)) { // SE matriz for igual a "estado", continuar percorrendo as linhas dos estados
                empilhar = empilhar + matriz[1][i] + "\n"; // empilhar o conteudo na string
            }            
        }       
        return empilhar;       
    }
}