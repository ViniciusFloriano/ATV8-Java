package BombadeCombustivel;

class BombaGasolina extends Bomba {
	
    public BombaGasolina(double totalLitros, float valorLitro) {
        super(totalLitros, valorLitro);
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BombaGasolina [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
    
}
