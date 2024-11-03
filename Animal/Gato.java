package Animal;
public class Gato extends Mamifero {

    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    @Override
    public void mover() {
        System.out.println(nome + " está caminhando suavemente.");
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Gato [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
    
}