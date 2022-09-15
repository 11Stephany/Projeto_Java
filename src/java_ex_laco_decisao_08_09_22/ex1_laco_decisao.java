package java_ex_laco_decisao_08_09_22;

import java.util.Scanner;

public class ex1_laco_decisao {

	public static void main(String[] args) {
		
		int n1,n2,n3;
		Scanner leia = new Scanner(System.in);
				
		System.out.println("\nDigite o primeiro numero inteiro: ");
		n1=leia.nextInt();
		System.out.println("\nDigite o segundo numero inteiro: ");
		n2=leia.nextInt();
		System.out.println("\nDigite o terceiro numero inteiro: ");
		n3=leia.nextInt();
		
		if(n1>n2 && n2>n3) {
			System.out.println("\nO maior numero eh: "+n1);			
		}else if(n2>n1 && n2 >3) {
			System.out.println("\nO maior numero eh: "+n2);
		}else {
			System.out.println("\nO maior numero eh: "+n3);
		}
		
		
		

	}

}
