package java_ex_heranca_14_09_22;

public class Animal {

	private String nome;
	private int idade;
	private String emitirSom;

	public Animal(String nome, int idade, String emitirSom) {

		this.nome = nome;
		this.idade = idade;
		this.emitirSom = emitirSom;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmitirSom() {
		return emitirSom;
	}

	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}

}
