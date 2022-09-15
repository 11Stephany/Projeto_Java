package java_ex_heranca_14_09_22;

public class Cavalo extends Animal {

	private String deveCorrer;

	public Cavalo(String nome, int idade, String emitirSom, String deveCorrer) {
		super(nome, idade, emitirSom);

		this.setDeveCorrer(deveCorrer);
	}

	public String getDeveCorrer() {
		return deveCorrer;
	}

	public void setDeveCorrer(String deveCorrer) {
		this.deveCorrer = deveCorrer;
	}

	public void imprimirInfo() {
		System.out.println("\nNome Cavalo: " + getNome() + "\n idade: " + getIdade() + "\n Emitir Som: "
				+ getEmitirSom() + "\n Cavalo do Pantanal? " + deveCorrer);
	}
}
