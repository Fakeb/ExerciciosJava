import javax.swing.JOptionPane;
public class Principal {
    
    public static Vinho vinho;
    
    public static void main(String[] args) {
        
        vinho = new Vinho();
        cadastrarProduto();
        
        System.out.println("\nNome: " + vinho.nome + "\nDescrição: " + vinho.descricao + "\nValor: " + vinho.valor + "\nCódigo: " + vinho.codigo + "\nVolume: " 
                + vinho.volume + "\nÍndice de ABV: " + vinho.ABV +
                "\nTipo de uva: " + vinho.tipoUva );      
        
    }
    public static void cadastrarProduto() {
        
        vinho.nome=JOptionPane.showInputDialog("Nome do vinho:");
        vinho.descricao=JOptionPane.showInputDialog("Descrição do vinho:");
        vinho.valor=Float.parseFloat(JOptionPane.showInputDialog("Valor do vinho:"));
        vinho.codigo=JOptionPane.showInputDialog("Código do vinho:");
        vinho.volume=Integer.parseInt(JOptionPane.showInputDialog("Volume do vinho:"));
        vinho.ABV=Float.parseFloat(JOptionPane.showInputDialog("Índice de ABV do vinho:"));
        vinho.tipoUva=JOptionPane.showInputDialog("Tipo da uva do vinho:");
        
    }
}
