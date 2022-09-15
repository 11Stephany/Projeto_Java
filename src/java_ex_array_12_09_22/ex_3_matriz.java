package java_ex_array_12_09_22;

import java.util.Scanner;

public class ex_3_matriz {

	public static void main(String[] args) {

		int matriz[][] = new int[3][3];
		int numero, valoresMaiores = 0, linha, coluna;

		Scanner leia = new Scanner(System.in);

		for (linha = 0; linha < 3; linha++) {

			for (coluna = 0; coluna < 3; coluna++) {
				System.out.println("\n Insira um valor: ");
				numero = leia.nextInt();

				if (numero > 10) {
					valoresMaiores++;
				}
			}

		}
		System.out.println("\nA quantidade de números maiores que 10 é: " + valoresMaiores);

	}

}
