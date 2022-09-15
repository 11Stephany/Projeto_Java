package java_ex_laco_decisao_08_09_22;

import java.util.Scanner;

public class ex2_laco_decisao {

	public static void main(String[] args) {
		
		float n1,n2,n3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro numero: ");
		n1=leia.nextFloat();
		System.out.println("\nDigite o segundo numero: ");
		n2=leia.nextFloat();
		System.out.println("\nDigite o terceiro numero: ");
		n3=leia.nextFloat();
		
		if(n1 >= n2 && n2 >= n3) {
			System.out.println("\nEm ordem crescente: "+n1+", "+n2+" e "+n3);
		}else if (n1 >= n3 && n3 >= n2){
			System.out.println("\nEm ordem crescente: "+n1+", "+n3+" e "+n2);
		}else if(n2 >= n1 && n1 >= n3) {
			System.out.println("\nEm ordem crescente: "+n2+", "+n1+" e "+n3);
		}else if(n2 >= n3 && n3 >= n1) {
			System.out.println("\nEm ordem crescente: "+n2+", "+n3+" e "+n1);
		}else if (n3 >= n1 && n1 >= n2) {
			System.out.println("\nEm ordem crescente: "+n3+", "+n1+" e "+n2);
		}else {
			System.out.println("\nEm ordem crescente: "+n3+", "+n2+" e "+n1);
		}

	}

}
