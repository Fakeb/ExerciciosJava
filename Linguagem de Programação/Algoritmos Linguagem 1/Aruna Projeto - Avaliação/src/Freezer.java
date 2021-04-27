public class Freezer {

    private int quantidadeBebidasUnicas;

    private Bebidas[] vetor = new Bebidas[25];

    private BarVip barVip;

    private BarPista barPista;

    private BarFora barFora;

    public void adicionarBebida(Bebidas bebida){
        vetor[quantidadeBebidasUnicas] = bebida;
        quantidadeBebidasUnicas++;
    }

    public Bebidas[] getVetor() {
        return vetor;
    }
}