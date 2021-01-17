/*
4 bits
numero negativo
numero com virgula
exceder os 4 bits
0000 = 0
0001 = 1
0010 = 2 
0011 = 3 
0100 = 4
0101 = 5
0110 = 6
0111 = 7
1000 = 8
1001 = 9 
1010 = 10
1011 = 11
1100 = 12
1101 = 13
1110 = 14
1111 = 15
*/
import javax.swing.JOptionPane;

public class Principal {

    
    public static void main(String[] args) {
        
        String valor1 = valor();       
        String valor2 = valor();
        int conversao1 = conversao1(valor1);
        int conversao2 = conversao2(valor1);
        int resposta = calculo(conversao1, conversao2);
        
        String exibir = conversaoResposta(resposta);
        JOptionPane.showMessageDialog(null, "resposta " + exibir);
    }
    
    public static String valor(){
        String valor="";
        try{
            valor=JOptionPane.showInputDialog("Digite um valor em binário(4 bits): ");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Valor inválido. Tipo do erro: " + e);
            valor();
        }
        return valor;           
    }
    
    public static int conversao1(String valor1){
        
        int valordec=0;
        
        if(valor1.equals("0000")){valordec = 0;}
        if(valor1.equals("0001")){valordec = 1;}
        if(valor1.equals("0010")){valordec = 2;}
        if(valor1.equals("0011")){valordec = 3;}
        if(valor1.equals("0100")){valordec = 4;}
        if(valor1.equals("0101")){valordec = 5;}
        if(valor1.equals("0110")){valordec = 6;}
        if(valor1.equals("0111")){valordec = 7;}
        if(valor1.equals("1000")){valordec = 8;}
        if(valor1.equals("1001")){valordec = 9;}
        if(valor1.equals("1010")){valordec = 10;}
        if(valor1.equals("1011")){valordec = 11;}
        if(valor1.equals("1100")){valordec = 12;}
        if(valor1.equals("1101")){valordec = 13;}
        if(valor1.equals("1110")){valordec = 14;}
        if(valor1.equals("1111")){valordec = 15;}
       
        return valordec;
    }
    
    public static int conversao2(String valor2){
        
        int valordec=0;
        
        if(valor2.equals("0000")){valordec = 0;}
        if(valor2.equals("0001")){valordec = 1;}
        if(valor2.equals("0010")){valordec = 2;}
        if(valor2.equals("0011")){valordec = 3;}
        if(valor2.equals("0100")){valordec = 4;}
        if(valor2.equals("0101")){valordec = 5;}
        if(valor2.equals("0110")){valordec = 6;}
        if(valor2.equals("0111")){valordec = 7;}
        if(valor2.equals("1000")){valordec = 8;}
        if(valor2.equals("1001")){valordec = 9;}
        if(valor2.equals("1010")){valordec = 10;}
        if(valor2.equals("1011")){valordec = 11;}
        if(valor2.equals("1100")){valordec = 12;}
        if(valor2.equals("1101")){valordec = 13;}
        if(valor2.equals("1110")){valordec = 14;}
        if(valor2.equals("1111")){valordec = 15;}
       
        return valordec;
    }
    
    public static int calculo(int conversao1,int conversao2){
        
        int resultado=0;
        
        String op = JOptionPane.showInputDialog("Digite a operação: ");
        switch(op){
            case "-":{
                resultado = conversao1-conversao2;
                break;         
            }
            case "+":{
                resultado = conversao1+conversao2;
                break;
            }
            case "*":{
                resultado = conversao1*conversao2;
                break;
            }
            case "/":{
                resultado = conversao1/conversao2;
                break;
            }
            default:{
                JOptionPane.showMessageDialog(null,"Opção invalida");
                
            }            
        }
         
        return resultado;    
    }
    
    public static String conversaoResposta(int resposta){
        
        String valorbin="";
        
        if(resposta==0){valorbin = "0000";}
        if(resposta==1){valorbin = "0001";}
        if(resposta==2){valorbin = "0010";}
        if(resposta==3){valorbin = "0011";}
        if(resposta==4){valorbin = "0100";}
        if(resposta==5){valorbin = "0101";}
        if(resposta==6){valorbin = "0110";}
        if(resposta==7){valorbin = "0111";}
        if(resposta==8){valorbin = "1000";}
        if(resposta==9){valorbin = "1001";}
        if(resposta==10){valorbin = "1010";}
        if(resposta==11){valorbin = "1011";}
        if(resposta==12){valorbin = "1100";}
        if(resposta==13){valorbin = "1101";}
        if(resposta==14){valorbin = "1110";}
        if(resposta==15){valorbin = "1111";}
       
        return valorbin;
    }
}