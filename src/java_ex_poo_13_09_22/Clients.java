package java_ex_poo_13_09_22;

public class Clients {

	private String nome;
	private String ID;
	private int idade;
	private int numConta;
	private char genero;

	public Clients(String nome, String ID, int idade,  int numConta,char genero) {

		this.nome = nome;
		this.ID = ID;
		this.idade = idade;
		this.numConta = numConta;
		this.genero = genero;

	}

	public void imprimirInfo() {

		System.out.println("\nCliente: " + nome + "\nId: " + ID + "\nIdade: " + idade + "\nGênero: " + genero
				+ "\nNumero da conta: " + numConta);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getID() {
		return ID;
	}

	public void setIDe(String ID) {
		this.ID = ID;
	}

	public int getidade() {
		return idade;
	}

	public void setidade(int idade) {
		this.idade = idade;
	}

	public int getnumConta() {
		return numConta;
	}

	public void setIDe(int numConta) {
		this.numConta = numConta;
	}

	public char getgenero() {
		return genero;
	}

	public void setIDe(char genero) {
		this.genero = genero;
	}

}
