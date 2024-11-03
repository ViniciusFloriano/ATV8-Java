package BombadeCombustivel;

class BombaEtanol extends Bomba {
	
    public BombaEtanol(double totalLitros, float valorLitro) {
        super(totalLitros, valorLitro);
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BombaEtanol [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
    
}

