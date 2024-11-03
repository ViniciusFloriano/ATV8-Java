package Animal;
public class Cao extends Mamifero {

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

    @Override
    public void mover() {
        System.out.println(nome + " está correndo.");
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cao [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
    
}