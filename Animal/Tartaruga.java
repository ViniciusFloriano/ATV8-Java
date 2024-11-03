package Animal;
public class Tartaruga extends Reptil {

    @Override
    public void emitirSom() {
        System.out.println("Som de tartaruga (silenciosa).");
    }

    @Override
    public void mover() {
        System.out.println(nome + " está andando lentamente.");
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tartaruga [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
    
}
