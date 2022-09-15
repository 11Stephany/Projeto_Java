package java_ex_poo_13_09_22;

public class ClientsTeste {

	public static void main(String[] args) {
		
		Clients cliente1 = new Clients ("Stephany Souza Ribeiro","1995",26,154623,'F');
		Clients cliente2 = new Clients ("Victor Valencio","1999",22,485692,'M');
		
		cliente1.imprimirInfo();
		cliente2.imprimirInfo();

	}

}
