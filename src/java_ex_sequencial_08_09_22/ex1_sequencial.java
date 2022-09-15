package java_ex_sequencial_08_09_22;

import java.util.Scanner;

public class ex1_sequencial {

	public static void main(String[] args) {
		
		int ano=365,mes=30,dia=1,idade,anos,meses,dias;
		Scanner leia = new Scanner(System.in);
	
		System.out.println("\nInsira sua idade no formato anos, meses e dias. ");
		System.out.println("\nInsira sua idade em anos: ");
		anos=leia.nextInt();
		System.out.println("\nMeses: ");
		meses=leia.nextInt();
		System.out.println("\nDias: ");
		dias=leia.nextInt();
		
		idade=((ano*anos)+(mes*meses)+(dias*dia));
		
		System.out.println("\nSua idade em dias sera ..."+idade);
		
		
	}

}
