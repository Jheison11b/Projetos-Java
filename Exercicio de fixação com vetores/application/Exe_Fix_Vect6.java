package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Fix_Vect;

public class Exe_Fix_Vect6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Informe quantos valores quer inserir: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Fix_Vect[] vect = new Fix_Vect[n];
		
		for(int i = 0; i<n; i++) {
			System.out.println("Informe o valor de A: ");
			int A = sc.nextInt();
			System.out.println("Informe o valor de B: ");
			int B = sc.nextInt();
			sc.nextLine();
			int C = A + B;
			vect[i] = new Fix_Vect(A, B, C);
		}
		
		System.out.println("Vetor Resultante");
		for(int i = 0; i<n; i++) {
			System.out.println(vect[i].getC());
		}
		
		
		
		
	
	
	sc.close();
	}
}
