package Xadrez;

public class Peao extends Peca {

    public Peao(int linha, int coluna, boolean cor) {
        super(linha, coluna, cor);
    }

    @Override
    public boolean mover(int novaLinha, int novaColuna) {
        int direcao = cor ? -1 : 1;
        if (coluna == novaColuna && linha + direcao == novaLinha) {
            return true;
        }
        
        if (coluna == novaColuna && linha + 2 * direcao == novaLinha && movimentos == 0) {
            return true;
        }

        if (Math.abs(coluna - novaColuna) == 1 && linha + direcao == novaLinha) {
            return true;
        }
        return false;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Peao [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
    
}