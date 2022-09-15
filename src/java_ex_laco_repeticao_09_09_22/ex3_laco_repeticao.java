package java_ex_laco_repeticao_09_09_22;

import java.util.Scanner;

public class ex3_laco_repeticao {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
	

		int idade = 1, totalMenor = 0, totalMaior = 0;

		System.out.printf("\nEntre com a sua idade: ");
		idade = ler.nextInt();

		while (idade != -99) {

			if (idade < 21) {
				totalMenor++;

			} else if (idade > 50) {
				totalMaior++;

			}

			System.out.printf("\nEntre com a sua idade: ");
			idade = ler.nextInt();
			

		}
		ler.close();
		System.out.printf("\nTotal pessoas menores que 21 anos:  " + totalMenor);
		System.out.printf("\nTotal pessoas maiores que 50 anos:  " + totalMaior);

	}

}
