// Gerar, até 10 cartões com 6 dezenas em cada cartão. 
// Requisito: uma vez sorteada uma dezena em um cartão, ela jamais poderá estar presente em outro cartão.

import java.util.Random;
import javax.swing.JOptionPane;

public class Principal {

  
    public static void main(String[] args) {
        
        int cartoes[] = gerarCartoes(); 
        exibirCartoes(cartoes);
    }   
    public static int[] gerarCartoes(){
        
        int numeros[] = new int [60];
        int aux;
        
        Random aleatorio = new Random();
        
        for (int i=0;i<60;i++){           
            do{
                aux=0;
                numeros[i]=aleatorio.nextInt(100);           
                for (int j=0;j<i;j++){
                    if(numeros[i]==numeros[j]){
                        aux=1;
                    }  
                }    
            }while(aux==1);
       }
       return numeros;
    }
    public static void exibirCartoes(int numeros[]){
        
        int contador = 1;
        String exibir = "";

        for (int i = 0; i < 60; i++) {
            exibir = exibir + contador + "º Cartela:\n" + numeros[i] + "  -  " + numeros[i + 1] + "  -  " + numeros[i + 2] + "  -  " + numeros[i + 3] + "  -  " + numeros[i + 4] + "  -  " + numeros[i + 5] + "\n";

            i = i + 5;
            contador++;
        }

        JOptionPane.showMessageDialog(null, "As cartelas foram geradas:\n" + exibir);       
    }      
}

