package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Fix_Vect;

public class Exe_Fix_Vect {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Fix_Vect[] vect = new Fix_Vect[n];
		
		for (int i = 0; i<vect.length; i++) {
			System.out.println("Digite um numero: ");
			
			int numero = sc.nextInt();
			vect[i] = new Fix_Vect(numero); 
		}
		
		
		
		for (int i = 0; i<vect.length; i++) {
			if (vect[i].getNumero() < 0) {
				System.out.printf("%d\n", vect[i].getNumero());
			}
		}
		
		
		
		sc.close();
	}


}