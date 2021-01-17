/*
1-implementar uma aplicaçao java para:
    ->exibir um menu com as opçoes de:
        -ler dois valores;
        -permitir a escolha de qual operaçao aritmetica sera realizada(+,-,*,/);
        -exibir o resultado do calculo escolhido;
        -aplicaçao em loop ate que uma opçao de SAIR seja escolhida;
*/
import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {
        
        String calc = JOptionPane.showInputDialog("Digite 'c' para calcular ou 's' para sair: ");
        switch(calc){
            case "c":{
                getCalcular();
                break;       
            }
            case "s":{               
                break;            
            }
            default:{
                JOptionPane.showMessageDialog(null,"Opção invalida");
            }       
        }
    }
    public static void getCalcular(){
        double valor1 = getValor();
        double valor2 = getValor();
        double resultado = getOperacao(valor1, valor2);
        exibirResultado (resultado);
    }
    public static double getValor(){
        double valor;
        valor=Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
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
