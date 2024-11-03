package Xadrez;

public abstract class Peca {
    protected int linha;
    protected int coluna;
    protected boolean cor;
    protected int movimentos;

    public Peca(int linha, int coluna, boolean cor) {
        this.linha = linha;
        this.coluna = coluna;
        this.cor = cor;
        this.movimentos = 0;
    }
    
    public abstract boolean mover(int novaLinha, int novaColuna);

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Peca [linha=");
		builder.append(linha);
		builder.append(", coluna=");
		builder.append(coluna);
		builder.append(", cor=");
		builder.append(cor);
		builder.append(", movimentos=");
		builder.append(movimentos);
		builder.append("]");
		return builder.toString();
	}
	
}
