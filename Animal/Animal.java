package Animal;
public abstract class Animal {
    
	protected String nome;
	protected int idade;

    public abstract void emitirSom();
    public abstract void mover();

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [nome=");
		builder.append(nome);
		builder.append(", idade=");
		builder.append(idade);
		builder.append("]");
		return builder.toString();
	}
    
}
