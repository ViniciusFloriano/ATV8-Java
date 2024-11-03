package Animal;
public class Lagarto extends Reptil {

    @Override
    public void emitirSom() {
        System.out.println("Som de lagarto (hiss).");
    }

    @Override
    public void mover() {
        System.out.println(nome + " está se arrastando rapidamente.");
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lagarto [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
    
}