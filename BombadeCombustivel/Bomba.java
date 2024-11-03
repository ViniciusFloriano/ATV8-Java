package BombadeCombustivel;

public class Bomba {

	private double totalLitros;
	private float valorLitro;
	
	public double getTotalLitros() {
		return totalLitros;
	}
	
	public void setTotalLitros(double totalLitros) {
		this.totalLitros = totalLitros;
	}
	
	public float getValorLitro() {
		return valorLitro;
	}
	
	public void setValorLitro(float valorLitro) {
		this.valorLitro = valorLitro;
	}
	
	public Bomba(double totalLitros, float valorLitro) {
        this.totalLitros = totalLitros;
        this.valorLitro = valorLitro;
    }
	
	 public boolean abastecerPorLitro(int litros) {
        if (litros <= 0 || litros > totalLitros) {
            System.out.println("Quantidade de litros inválida ou insuficiente.");
            return false;
        }
        totalLitros -= litros;
        System.out.println("Abastecido " + litros + " litros. Total restante: " + totalLitros + " litros.");
        return true;
    }
	 
	 public boolean abastecerPorValor(double valor) {
        int litros = (int) (valor / valorLitro);
        return abastecerPorLitro(litros);
    }
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bomba [totalLitros=");
		builder.append(totalLitros);
		builder.append(", valorLitro=");
		builder.append(valorLitro);
		builder.append("]");
		return builder.toString();
	}
	
}
