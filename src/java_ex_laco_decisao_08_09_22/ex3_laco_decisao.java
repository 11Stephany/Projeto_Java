package java_ex_laco_decisao_08_09_22;

import java.util.Scanner;

public class ex3_laco_decisao {

	public static void main(String[] args) {
		
		int idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInsira sua idade: ");
		idade=leia.nextInt();
		
		
			if(idade >= 10 && idade <= 14) {
				System.out.println("\nCategoria infantil !");
			}else if(idade >= 15 && idade <= 17) {
				System.out.println("\nCategoria juvenil !");
			}else if(idade >= 18) {
				System.out.println("\nCategoria adulto !");			
			}else {
				System.out.println("\nCategoria nao classificada !");
			}
						
		
	}

		
}

