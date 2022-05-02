import java.util.Objects;

public class Client {
	private String nume;
	private String adresa;
	
	
	public Client(String nume, String adresa) {
		super();
		this.nume = nume;
		this.adresa = adresa;
	}

	public ContBancar creazaCont(String numarCont, float suma, String moneda) {
		if(moneda == "Lei") {
			return new ContLei(numarCont, suma);
		}
		else return new ContEuro(numarCont, suma);
	}

	@Override
	public int hashCode() {
		return Objects.hash(adresa, nume);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(adresa, other.adresa) && Objects.equals(nume, other.nume);
	}

	@Override
	public String toString() {
		return "Client [nume=" + nume + ", adresa=" + adresa + "]";
	}


}
