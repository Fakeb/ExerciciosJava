package source;

public class Celula {
	int TAM;
	int estado=0;
	int linha, coluna;

	Celula vizinho0,vizinho1,vizinho2,vizinho3;
	
	public Celula(int tamGrade) {
		TAM = tamGrade;
	}
	
	public void determinaVizinhos(Celula[][] grade) {
		if(linha!=0) {vizinho0 = grade[linha-1][coluna];}else {vizinho0=null;}
		if(coluna!=0) {vizinho1 = grade[linha][coluna-1];}else {vizinho1=null;}
		if(coluna!=(TAM-1)) {vizinho2 = grade[linha][coluna+1];}else {vizinho2=null;}
		if(linha!=(TAM-1)) {vizinho3 = grade[linha+1][coluna];}else {vizinho3=null;}
	}

	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public int getColuna() {
		return coluna;
	}
	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public Celula getVizinho0() {
		return vizinho0;
	}
	public void setVizinho0(Celula vizinho0) {
		this.vizinho0 = vizinho0;
	}
	public Celula getVizinho1() {
		return vizinho1;
	}
	public void setVizinho1(Celula vizinho1) {
		this.vizinho1 = vizinho1;
	}
	public Celula getVizinho2() {
		return vizinho2;
	}
	public void setVizinho2(Celula vizinho2) {
		this.vizinho2 = vizinho2;
	}
	public Celula getVizinho3() {
		return vizinho3;
	}
	public void setVizinho3(Celula vizinho3) {
		this.vizinho3 = vizinho3;
	}
}
