package java_ex_laco_repeticao_09_09_22;

import java.util.Scanner;

public class ex6_laco_repeticao {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int num;
		float media = 0, contNum = 0, somaNum = 0;
		

		do {

			System.out.printf("\nDigite um numero: ");
			num = ler.nextInt();

			if (num % 3 == 0 && num != 0) {

				contNum++;
				somaNum = somaNum + num;

			}

		} while (num != 0);

		media = somaNum / contNum;

		System.out.print("\nA media dos multiplos de 3 eh: " + media );

	}

}
