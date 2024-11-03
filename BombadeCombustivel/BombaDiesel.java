package BombadeCombustivel;

class BombaDiesel extends Bomba {
	
    public BombaDiesel(double totalLitros, float valorLitro) {
        super(totalLitros, valorLitro);
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BombaDiesel [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
    
}