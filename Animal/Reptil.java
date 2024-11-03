package Animal;
public abstract class Reptil extends Animal {
	
    protected String tipoEscamas;

    public String getTipoEscamas() {
		return tipoEscamas;
	}

	public void setTipoEscamas(String tipoEscamas) {
		this.tipoEscamas = tipoEscamas;
	}

	public void trocarPele() {
        System.out.println(nome + " está trocando de pele.");
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reptil [tipoEscamas=");
		builder.append(tipoEscamas);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}