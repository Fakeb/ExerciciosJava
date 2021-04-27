package morse;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;


/**
 * Classe que codifica a tradução de morse para binário
 * @author Mirkos
 */
public class Morse {
    
    /**
     * Imprime um valor
     */
    public void imprime(){
        System.out.println("Bom dia!");
    }
 
    
    public void converte(int[] vetor, int nrSimbolos, PrintWriter out){ // 46 = 0 \ 45 = 1 \ 32 = espaço
        if(nrSimbolos==1){
            if(vetor[0]==46){System.out.println("00100");out.printf("00100\n");}  // 46 = . 0 E
            
            if(vetor[0]==45){System.out.println("10100");out.printf("10100\n");}  // 45 = - 1 T
            
            if(vetor[0]==32){System.out.println("Espaço em Branco.");}
        }        
        if(nrSimbolos==2){
            if(vetor[0]==46 && vetor[1]==46){System.out.println("01000");out.printf("01000\n");}//.. 00 I
            if(vetor[0]==46 && vetor[1]==45){System.out.println("00000");out.printf("00000\n");}//.- 01 A
            if(vetor[0]==45 && vetor[1]==45){System.out.println("01100");out.printf("01100\n");}//-- 11 M
            if(vetor[0]==45 && vetor[1]==46){System.out.println("01101");out.printf("01101\n");}//-. 10 N
        }
        if(nrSimbolos==3){
            if(vetor[0]==46 && vetor[1]==46 && vetor[2]==46){System.out.println("01000");out.printf("01000\n");}//... 000 S 
            if(vetor[0]==46 && vetor[1]==46 && vetor[2]==45){System.out.println("00000");out.printf("00000\n");}//..- 001 U
            if(vetor[0]==46 && vetor[1]==45 && vetor[2]==46){System.out.println("01100");out.printf("01100\n");}//.-. 010 R
            if(vetor[0]==46 && vetor[1]==45 && vetor[2]==45){System.out.println("01101");out.printf("01101\n");}//.-- 011 W
            
            if(vetor[0]==45 && vetor[1]==46 && vetor[2]==46){System.out.println("00011");out.printf("00011\n");}//-.. 100 D
            if(vetor[0]==45 && vetor[1]==46 && vetor[2]==45){System.out.println("01010");out.printf("01010\n");}//-.- 101 K
            if(vetor[0]==45 && vetor[1]==45 && vetor[2]==46){System.out.println("00110");out.printf("00110\n");}//--. 110 G
            if(vetor[0]==45 && vetor[1]==45 && vetor[2]==45){System.out.println("01111");out.printf("01111\n");}//--- 111 O
       
        }
        if(nrSimbolos==4){
            if(vetor[0]==46 && vetor[1]==46 && vetor[2]==46 && vetor[2]==46){System.out.println("00111");out.printf("00111\n");}//.... 0000 H
            if(vetor[0]==46 && vetor[1]==46 && vetor[2]==46 && vetor[2]==45){System.out.println("10111");out.printf("10111\n");}//...- 0001 V
            if(vetor[0]==46 && vetor[1]==46 && vetor[2]==45 && vetor[2]==46){System.out.println("00101");out.printf("00101\n");}//..-. 0010 F
                                                                                                                                //..-- 0011
            if(vetor[0]==46 && vetor[1]==45 && vetor[2]==46 && vetor[2]==46){System.out.println("01011");out.printf("01011\n");}//.-.. 0100 L
                                                                                                                                //.-.- 0101
            if(vetor[0]==46 && vetor[1]==45 && vetor[2]==45 && vetor[2]==46){System.out.println("10000");out.printf("10000\n");}//.--. 0110 P
            if(vetor[0]==46 && vetor[1]==45 && vetor[2]==45 && vetor[2]==45){System.out.println("01001");out.printf("01001\n");}//.--- 0111 J
            if(vetor[0]==45 && vetor[1]==46 && vetor[2]==46 && vetor[2]==46){System.out.println("00001");out.printf("00001\n");}//-... 1000 B
            if(vetor[0]==45 && vetor[1]==46 && vetor[2]==46 && vetor[2]==45){System.out.println("11000");out.printf("11000\n");}//-..- 1001 X
            if(vetor[0]==45 && vetor[1]==46 && vetor[2]==45 && vetor[2]==46){System.out.println("00010");out.printf("00010\n");}//-.-. 1010 C
            if(vetor[0]==45 && vetor[1]==46 && vetor[2]==45 && vetor[2]==45){System.out.println("11001");out.printf("11001\n");}//-.-- 1011 Y
            if(vetor[0]==45 && vetor[1]==45 && vetor[2]==46 && vetor[2]==46){System.out.println("11010");out.printf("11010\n");}//--.. 1100 Z
            if(vetor[0]==45 && vetor[1]==45 && vetor[2]==46 && vetor[2]==45){System.out.println("10001");out.printf("10001\n");}//--.- 1101 Q          
            
        }
        
    }
    
    public static void main(String[] args) {
        
        String nomeArquivo = "entrada.txt";
        //"Tenta" abrir o arquivo
                //Morse é a classe que está sendo instanciada
        //morse é o objeto em memória
        Morse morse = new Morse();
        int[] valor = new int[4];
        int indice=0;
        //morse.imprime();
        try{
            FileReader leitor = new FileReader(new File(nomeArquivo));
            FileWriter escritor = new FileWriter(nomeArquivo+".out");
            PrintWriter gravador = new PrintWriter(escritor);
            //enquanto o leitor estiver com conteúdo válido no arquivo
            while(leitor.ready()){
                int data = leitor.read();
                if(data==32){//espaço em branco
                    morse.converte(valor,indice,gravador);
                    indice = 0;
                }else{
                    valor[indice]=data;
                    indice++;
                }               
                
            }
            
            escritor.close();
            leitor.close();

            
        }catch(Exception e){
            System.out.println("Exceção: "+e.getMessage());
        }
        

        
    }
    
}
