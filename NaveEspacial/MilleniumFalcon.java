package NaveEspacial;

public class MilleniumFalcon extends Apollo11{

	private float classeHiperpropulsor;

	public float getClasseHiperpropulsor() {
		return classeHiperpropulsor;
	}

	public void setClasseHiperpropulsor(float classeHiperpropulsor) {
		this.classeHiperpropulsor = classeHiperpropulsor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MilleniumFalcon [classeHiperpropulsor=");
		builder.append(classeHiperpropulsor);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
