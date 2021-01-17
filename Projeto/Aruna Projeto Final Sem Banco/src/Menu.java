import javax.swing.JOptionPane;

public class Menu {
    
    Controle controle = new Controle();
    BancoDeDados bancodedados = new BancoDeDados();
    Arquivo arquivo = new Arquivo();       
    ControleFinal controlefinal = new ControleFinal();
    
    public void menu(){
                    
        int op=Integer.parseInt(JOptionPane.showInputDialog("Digite: \n(1) Cadastros \n(2) Contagens \n(3) Exibições \n(4) Gravar \n(5) Controle Final "));

        switch(op){
            case 1:{

                op=Integer.parseInt(JOptionPane.showInputDialog("Digite para Cadastrar: \n(1) Evento \n(2) Funcionarios \n(3) Bebidas \n(4) Cigarros \n(5) Menu"));

                switch(op){
                    case 1:{
                        controle.cadastroEvento(bancodedados);
                        menu();
                        break;
                    }
                    case 2:{
                        controle.cadastroFuncionarios(bancodedados);
                        menu();                        
                        break;
                    }
                    case 3:{
                        controle.cadastroBebidas(bancodedados);
                        menu();
                        break;
                    }
                    case 4:{
                        controle.cadastroCigarros(bancodedados);
                        menu();
                        break;
                    }
                    case 5:{
                        menu();
                        break;
                    }
                    default:{
                        menu();
                        break;
                    }
                }
                break;
            }
            case 2:{

                op=Integer.parseInt(JOptionPane.showInputDialog("Escolha os lugares das contagens: \n(1) BarVip \n(2) BarPista \n(3) BarFora \n(4) Estoque \n(5) Menu"));

                switch(op){
                    case 1:{
                        controle.contagemBarVip(bancodedados);
                        menu();
                        break;
                    }
                    case 2:{
                        controle.contagemBarPista(bancodedados);
                        menu();
                        break;
                    }
                    case 3:{
                        controle.contagemBarFora(bancodedados);
                        menu();
                        break;
                    }
                    case 4:{
                        controle.contagemEstoque(bancodedados);
                        
                        menu();
                        break;
                    }
                    case 5:{
                        menu();
                        break;
                    }
                    default:{
                        menu();
                        break;
                    }
                }
                break;               
            }           
            case 3:{
                
                op=Integer.parseInt(JOptionPane.showInputDialog("Digite para exibir: \n(1) Evento \n(2) Funcionarios \n(3) Bebidas \n(4) Cigarros \n(5) Contagens \n(6) Menu"));

                switch(op){
                    case 1:{
                        controle.exibirEvento(bancodedados);
                        menu();
                        break;
                    }
                    case 2:{
                        controle.exibirFuncionarios(bancodedados);
                        menu();
                        break;
                    }
                    case 3:{
                        controle.exibirBebidas(bancodedados);
                        menu();
                        break;
                    }
                    case 4:{
                        controle.exibirCigarros(bancodedados);
                        menu();
                        break;
                    }
                    case 5:{
                        controle.exibirContagens(bancodedados);
                        menu();
                        break;
                    }
                    case 6:{
                        menu();
                        break;
                    }
                    default:{
                        menu();
                        break;
                    }                    
                }
                break;               
            }
            case 4:{
               arquivo.salvar(bancodedados,controlefinal); 
               menu();
               break;
            }
            case 5:{               
                controlefinal.juntar(bancodedados);
                menu();
                break;
            }           
            default:{
                menu();
                break;
            }                      
        }       
    }
}
