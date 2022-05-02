import java.util.Objects;

public abstract class ContBancar implements SumaTotala {

	private String numarCont;
	private float suma;
	
	public ContBancar(String numarCont, float suma) {
		this.numarCont = numarCont;
		this.suma = suma;
	}

	public String getNumarCont() {
		return numarCont;
	}

	public void setNumarCont(String numarCont) {
		this.numarCont = numarCont;
	}
	
	public float getSuma() {
		return suma;
	}

	public void setSuma(float suma) {
		this.suma = suma;
	}
	
	public void addSuma(float suma) {
		this.suma +=suma;
	}
	
	public boolean removeSuma() {
		if(this.suma < suma) {
			System.out.println("Fonduri insuficiente!");
			return false;
		}
		this.suma -= suma;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		return Objects.hash(numarCont, suma);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContBancar other = (ContBancar) obj;
		return Objects.equals(numarCont, other.numarCont)
				&& Float.floatToIntBits(suma) == Float.floatToIntBits(other.suma);
	}

	@Override
	public String toString() {
		return "ContBancar [numarCont=" + numarCont + ", suma=" + suma + "]";
	}



}
