import java.util.HashSet;

public class Banca {
	
	private String codBanca;

	public static void main(String[] args) {
		HashSet<Client> listaClienti = new HashSet<Client>();
		Client client1 = new Client("Andrei", "Ion Bradu 3");
		Client client2 = new Client("Sara", "Nucetului 8");
		client1.creazaCont("2345 5643 6897", 300, "Lei");
		
		listaClienti.add(client1);
		listaClienti.add(client2);
		System.out.println(client1.toString());
		
	}

}
