package java_ex_laco_repeticao_09_09_22;

import java.util.Scanner;

public class ex2_laco_repeticao {

	public static void main(String[] args) {

		try (Scanner leia = new Scanner(System.in)) {
			int num;
			float par = 0, impar = 0;

			for (num = 0; num <= 10; num++) {

				System.out.println("\nDigite um numero : ");
				num = leia.nextInt();

				if (num % 2 == 0) {
					par++;
				} else {
					impar++;
				}

			}

			System.out.println("\nPares: " + par);
			System.out.println("\nImpares: " + impar);
			leia.close();
		}
	}

}
