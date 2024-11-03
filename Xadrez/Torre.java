package Xadrez;

public class Torre extends Peca {

    public Torre(int linha, int coluna, boolean cor) {
        super(linha, coluna, cor);
    }

    @Override
    public boolean mover(int novaLinha, int novaColuna) {
        return (linha == novaLinha || coluna == novaColuna);
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Torre [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
    
}