package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Fix_Vect;

public class Exe_Fix_Vect7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		Fix_Vect[] vect = new Fix_Vect[n];
		
		for (int i = 0; i<n; i++) {
			System.out.print("Digite um numero: ");
			double altura = sc.nextDouble();
			vect[i] = new Fix_Vect(altura);
		}
		
		double soma = 0;
		for (int i = 0; i<n; i++) {
			soma += vect[i].getAltura();
		}
		
		double media = soma / n;
		System.out.printf("Media do Vetor = %.3f\n", media);
		for (int i = 0; i<n; i++) {
			if (vect[i].getAltura() < media) {
			System.out.printf("%.1f\n", vect[i].getAltura());
			}
		}
		
		
		
		sc.close();
	}

}
