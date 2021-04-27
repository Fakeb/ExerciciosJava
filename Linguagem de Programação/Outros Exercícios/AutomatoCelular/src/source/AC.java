package source;

public class AC {
	int TAMANHO=5;
	public Celula[][] grade = new Celula[TAMANHO][TAMANHO];
	
	public void inicia() {
            Celula cel = null;
            for(int x=0;x<TAMANHO;x++) {
                for(int y=0;y<TAMANHO;y++) {
                    cel = new Celula(TAMANHO);
                    cel.setLinha(x);
                    cel.setColuna(y);
                    this.grade[x][y]=cel;
                    cel.determinaVizinhos(grade);
                }
            }	
	}	
	
	public int regraTransicao(Celula celula) {
            celula.determinaVizinhos(grade);
            int contaVizinhosVivos=0;

            if(celula.vizinho0!=null) {if(celula.vizinho0.getEstado()==1) 
                                                                    {contaVizinhosVivos++;}}
            if(celula.vizinho1!=null) {if(celula.vizinho1.getEstado()==1) 
                                                                    {contaVizinhosVivos++;}}
            if(celula.vizinho2!=null) {if(celula.vizinho2.getEstado()==1) 
                                                                    {contaVizinhosVivos++;}}
            if(celula.vizinho3!=null) {if(celula.vizinho3.getEstado()==1) 
                                                                    {contaVizinhosVivos++;}}

            if(contaVizinhosVivos==1 || contaVizinhosVivos == 2) {
                    return 1;
            }
            if(contaVizinhosVivos==3 || contaVizinhosVivos == 4) {
                    return 0;
            }
            return -1;
	}
	
	public Celula[][] geracao() {
            Celula[][] temp = new Celula[TAMANHO][TAMANHO];
		
            for(int x=0;x<TAMANHO;x++) {
                for(int y=0;y<TAMANHO;y++) {
                        int estado = regraTransicao(grade[x][y]);
                        Celula nova = new Celula(TAMANHO);
                        nova.setLinha(x);
                        nova.setColuna(y);
                        if(estado==-1) {nova.setEstado(grade[x][y].getEstado());}
                        else {nova.setEstado(estado);}

                        nova.determinaVizinhos(grade);
                        temp[x][y] = nova;
                }
            }

            return temp;
		
	}
	
	public void mostraGrade() {
		for(int x=0;x<TAMANHO;x++) {
			for(int y=0;y<TAMANHO;y++) {
				System.out.print((this.grade[x][y]).getEstado()+"\t");
			}
		System.out.print("\n");
		}
	}
	
	public static void main(String[] args) {
		
		AC automato = new AC();
		
		automato.inicia();
		
		automato.mostraGrade();
		System.out.println("\n\n");
		
		automato.grade[1][1].setEstado(1);
		automato.grade[3][3].setEstado(1);
		
		automato.mostraGrade();
		
		for(int ger=0;ger<5;ger++) {
			System.out.println("****************");
			System.out.println("Geração "+ger);
			System.out.println("\n\n");
			automato.grade = automato.geracao();
			automato.mostraGrade();	
		}
		
	}

}
