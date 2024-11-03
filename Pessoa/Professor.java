package Pessoa;

public class Professor extends Pessoa {

	private int disciplina;

	public int getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(int disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Professor [disciplina=");
		builder.append(disciplina);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}

