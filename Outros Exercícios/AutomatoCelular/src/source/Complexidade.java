package source;

public class Complexidade {
	
	public int[] pa(int primeiroNr, int razao, int nrElementos) {
		int[] elementos = new int[nrElementos];
		elementos[0] = primeiroNr;
		for(int x=1;x<nrElementos;x++) {
			elementos[x] = elementos[x-1]+razao;
		}		
		return elementos;
	}
	
	public static void main(String args[]) {
		Complexidade complex = new Complexidade();
		int[] vetor = complex.pa(3,2,5);
		for(int x=0;x<5;x++) {
			System.out.print(vetor[x]+"\t");
		}
	}

}
