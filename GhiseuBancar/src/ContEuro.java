
public class ContEuro extends ContBancar {

	public ContEuro(String numarCont, float suma) {
		super(numarCont, suma);
	}
	
	public float getDobanda() {
		if(this.getSuma() > 500) {
			return (float) (this.getSuma() * 0.3); }
		else 
			return this.getSuma();
	}

	@Override
	public float getSumaTotala() {
		return this.getSuma();
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
	
	
}
