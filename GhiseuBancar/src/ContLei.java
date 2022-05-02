
public class ContLei extends ContBancar {

	public ContLei(String numarCont, float suma) {
		super(numarCont, suma);
	}
	
	public void transfer(ContBancar contDestinatie, float suma) {
		if(this.removeSuma());
			contDestinatie.addSuma(suma);
	}
	
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
