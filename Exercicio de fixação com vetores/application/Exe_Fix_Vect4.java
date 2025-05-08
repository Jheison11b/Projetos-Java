package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Fix_Vect;

public class Exe_Fix_Vect4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		
		Fix_Vect[] vect = new Fix_Vect[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Informe um numero: ");
			int numero = sc.nextInt();
			sc.nextLine();
			vect[i] = new Fix_Vect(numero);
		}
		
		int numero_par = 0;
		System.out.println("Numeros Pares: ");
		for (int i=0; i<n; i++) {
			if (vect[i].getNumero() % 2 == 0) {
				numero_par++;
				System.out.printf(" " + vect[i].getNumero() + " ");
			}
				
		}
		
		System.out.printf("\nQuantidade de pares = %d", numero_par);
		
		
		
		sc.close();
	}

}
