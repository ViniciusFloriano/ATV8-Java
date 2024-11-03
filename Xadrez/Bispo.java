package Xadrez;

public class Bispo extends Peca {

    public Bispo(int linha, int coluna, boolean cor) {
        super(linha, coluna, cor);
    }

    @Override
    public boolean mover(int novaLinha, int novaColuna) {
        return Math.abs(linha - novaLinha) == Math.abs(coluna - novaColuna);
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bispo [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
    
}