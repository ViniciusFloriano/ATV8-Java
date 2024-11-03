package Xadrez;

public class Rei extends Peca {

    public Rei(int linha, int coluna, boolean cor) {
        super(linha, coluna, cor);
    }

    @Override
    public boolean mover(int novaLinha, int novaColuna) {
        return (Math.abs(linha - novaLinha) <= 1 && Math.abs(coluna - novaColuna) <= 1);
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rei [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
    
}