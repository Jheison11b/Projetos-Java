package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Fix_Vect;

public class Exe_Fix_Vect8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Fix_Vect[] vect = new Fix_Vect[n];
		
		for(int i = 0; i<n; i++) {
			System.out.println("Digite um numero: ");
			int numero = sc.nextInt();
			sc.nextLine();
			vect[i] = new Fix_Vect(numero);
		}
		int soma = 0;
		int quantidadepar = 0;
		for(int i = 0; i<n; i++) {
			if (vect[i].getNumero() % 2 == 0) {
				soma += vect[i].getNumero();
				quantidadepar++;
			}
		}
		
		if (quantidadepar > 0) {
			double media = (double) soma / quantidadepar;
			System.out.println("Media dos pares = " + media);
		} else {
			System.out.println("Nenhum numero par");
		}
		
	
		
		
		sc.close();
	}

}
