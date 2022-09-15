package java_ex_laco_repeticao_09_09_22;

public class ex1_laco_repeticao {

	public static void main(String[] args) {

		int x;

		for (x = 1000; x <= 1999; x++) {
			if (x % 11 == 5) {
				x++;
				System.out.println("\n Valores dentro da condicao: " + x);
			}

		}

	}

}
