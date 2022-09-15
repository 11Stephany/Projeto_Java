package java_ex_array_12_09_22;

import java.util.Scanner;

public class ex1_array {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int[] a = { 1, 0, 5, -2, -5, 7 };
		int[] somaA = new int[1];
		int x;

		System.out.println("\nConsidere vetor A = {1,0,5,-2,-5,7} e faça a seguir: ");

		somaA[0] = a[0] + a[1] + a[5];
		System.out.println("\nA soma dos elementos de a[0],a[1] e a[5] : "+ 
				"["+a[0]+"]+"+"["+a[1]+"]+"+"["+a[5]+"]"+" = " + somaA[0]);

		a[4] = 100;
		System.out.println("\nAtribuindo novo valor de a[4] : " + "\na[4]=" + a[4]);

		for (x = 0; x < 6; x++) {

			System.out.println("\nVetor A = ["+x+"]= "+a[x]);
		}

	}

}
