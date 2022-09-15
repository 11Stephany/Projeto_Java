package java_ex_sequencial_08_09_22;

import java.util.Scanner;

public class ex2_sequencial {

	public static void main(String[] args) {
		
		int totaldias,anos,meses,dias;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInsira sua idade completa apenas em Dias: ");
		totaldias=leia.nextInt();
		
		anos=totaldias/365;
		meses=(totaldias%365)/30;
		dias=(totaldias%365)%30;
		
		System.out.println("\nSua idade em "+anos+" anos,"+meses+" meses e "+dias+" dias.");
		

	}

}
