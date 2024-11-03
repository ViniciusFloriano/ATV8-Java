package Animal;
public abstract class Mamifero extends Animal {
	
	protected String tipoPelagem;

    public String getTipoPelagem() {
		return tipoPelagem;
	}

	public void setTipoPelagem(String tipoPelagem) {
		this.tipoPelagem = tipoPelagem;
	}

	public void amamentar() {
        System.out.println(nome + " está amamentando.");
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mamifero [tipoPelagem=");
		builder.append(tipoPelagem);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}