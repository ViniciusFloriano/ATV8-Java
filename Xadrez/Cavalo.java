package Xadrez;

public class Cavalo extends Peca {

    public Cavalo(int linha, int coluna, boolean cor) {
        super(linha, coluna, cor);
    }

    @Override
    public boolean mover(int novaLinha, int novaColuna) {
        int deltaLinha = Math.abs(linha - novaLinha);
        int deltaColuna = Math.abs(coluna - novaColuna);
        return (deltaLinha == 2 && deltaColuna == 1) || (deltaLinha == 1 && deltaColuna == 2);
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cavalo [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
    
}