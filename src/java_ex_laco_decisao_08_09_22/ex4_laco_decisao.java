package java_ex_laco_decisao_08_09_22;

import java.util.Scanner;

public class ex4_laco_decisao {

	public static void main(String[] args) {
		
		double operacao;
		float num;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um numero qualquer inteiro: ");
		num=leia.nextFloat();
		
		if(num%2 == 0) {
			operacao=Math.sqrt(num);
			System.out.println("\nNumero par e sua raiz eh :");
		} else {
			operacao=Math.pow(num, 2);
			System.out.println("\nNumero impar e sua potencia eh :");
		}
		
		System.out.println(" resultado:  "+operacao);

	}

}
