/*
    na soma nao pode exceder 4 bits
    na subtração nao pode ter numero negativo
    na multiplicaçao nao pode exceder 4 bits
    na divisao nao pode fraçao, e nem por 0
*/
import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {       
        getCalcular();
    }
    public static void getMenu() {
        
        String calc = JOptionPane.showInputDialog("Digite 'C' para calcular ou 'S' para sair: ");
        switch(calc){
            case "c":
            case "C":{
                getCalcular();
                break;       
            }
            case "s":
            case "S":{               
                break;            
            }
            default:{
                JOptionPane.showMessageDialog(null,"Opção invalida");
                getMenu();
            }       
        }
    }
    public static void getCalcular(){
        double valor1 = getValor();
        double valor2 = getValor();
        double resultado = getOperacao(valor1, valor2);
        exibirResultado (resultado);
        getMenu();
    }
    public static double getValor(){
        double valor=0;   
           
        valor=Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
        
        if((valor != 1)&&(valor != 0)){
            JOptionPane.showMessageDialog(null, "Valor invalido");
            getValor();
        }

      
        return valor;
    }
    public static double getOperacao(double v1,double v2){
        
        double resultado = 0;
        String op = JOptionPane.showInputDialog("Digite a operação: ");
        switch(op){
            case "-":{
                resultado = v1-v2;
                break;         
            }
            case "+":{
                resultado = v1+v2;
                break;
            }
            case "*":{
                resultado = v1*v2;
                break;
            }
            case "/":{
                resultado = v1/v2;
                break;
            }
            default:{
                JOptionPane.showMessageDialog(null,"Opção invalida");               
            }
        }
        return resultado;
    }
    public static void exibirResultado (double resultado){
        JOptionPane.showMessageDialog(null,"Resultado: " + resultado);
        
    }
}
