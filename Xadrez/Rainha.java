package Xadrez;

public class Rainha extends Peca {

    public Rainha(int linha, int coluna, boolean cor) {
        super(linha, coluna, cor);
    }

    @Override
    public boolean mover(int novaLinha, int novaColuna) {
        return (linha == novaLinha || coluna == novaColuna || Math.abs(linha - novaLinha) == Math.abs(coluna - novaColuna));
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rainha [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
    
}