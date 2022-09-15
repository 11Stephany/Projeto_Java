package java_ex_laco_repeticao_09_09_22;

import java.util.Scanner;

public class ex4_laco_repeticao {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int pessoas=0, idade=0, genero = 0, cp = 0, totalcalmas = 0,totalMn=0,totalHa=0,totalNd=0,numNacima=0,numCmenor=0;

		while (pessoas++ <= 2) {

			System.out.printf("\nInsira sua idade: ");
			idade = ler.nextInt();

			while (idade < 1 || idade > 101) {

				System.out.printf("\nInsira sua idade novamente: ");
				idade = ler.nextInt();

			}

			System.out.println("\nIndique a opcao de genero ao qual se identifica:");
			System.out.println("\n1- Feminino" + "\n2- Masculino" + "\n3- Nao Declarado");
			genero = ler.nextInt();

			while (genero < 1 || genero > 3) {

				System.out.println("\nIndique novamente a opcao de genero ao qual se identifica:");
				System.out.println("\n1- Feminino" + "\n2- Masculino" + "\n3- Nao Declarado");
				genero = ler.nextInt();
			}

			System.out.println("\nIndique a opcao que se assemelha a sua caracteristica:");
			System.out.println("\n1- Calma" + "\n2- Nervosa" + "\n3- Agressiva");
			cp = ler.nextInt();

			while (cp < 1 || cp > 3) {

				System.out.println("\nIndique novamente a opcao que se assemelha a sua caracteristica:");
				System.out.println("\n1- Calma" + "\n2- Nervosa" + "\n3- Agressiva");
				cp = ler.nextInt();
			}
			if (cp == 1) {

				totalcalmas++;						
			}		
			if (genero == 1 && cp == 2) {

				totalMn++;
			}
			if (genero == 2 && cp ==3) {
				
				totalHa++;			
			}
			if (genero == 3 && cp == 1) {
				
				totalNd++;				
			}
			if (cp == 2 && idade > 40) {
				
				numNacima++;			
			}
			if(cp == 1 && idade < 18) {
				
				numCmenor++;
			}
		}		
			
		System.out.printf("\nNumero de pessoas calmas: " + totalcalmas);
		System.out.printf("\nNumero de mulheres nervosas: " + totalMn);
		System.out.printf("\nNumero de homens agressivos: " + totalHa);
		System.out.printf("\nNumero de Nao declarados e calmos: " + totalNd);
		System.out.printf("\nNumero de pessoas nervosas acima de 40 anos: " + numNacima);
		System.out.printf("\nNumero de pessoas calmas com menos de 18 anos: " + numCmenor);
		System.out.printf("\n\nObrigado pela sua participacao !");
		
	}
	
}
