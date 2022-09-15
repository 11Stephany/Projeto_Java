package java_ex_laco_repeticao_09_09_22;

import java.util.Scanner;

public class ex5_laco_repeticao {
	
		public static void main(String[] args) {			
		
			Scanner ler = new Scanner (System.in);		
			int num,somaNum=0;
			
						
			do {
				
				System.out.println("\nDigite um numero: ");
				num = ler.nextInt();
				
				somaNum += num;
			
			}while (num != 0);			
			
			System.out.println("\nA soma dos numeros digitados eh: "+ somaNum);	
				
				
	}	
}
		
