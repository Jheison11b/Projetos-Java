package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Fix_Vect;

public class Exe_Fix_Vect3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			

		
		int n = sc.nextInt();
		sc.nextLine();
		
		Fix_Vect[] vect = new Fix_Vect[n];
		for(int i = 0; i<n; i++) {
			System.out.println("Informe um nome: ");
			String nome = sc.nextLine();
			System.out.println("Informe a idade: ");
			int idade = sc.nextInt();
			System.out.println("Informe a altura: ");
			double altura = sc.nextDouble();
			sc.nextLine();
			vect[i] = new Fix_Vect(nome, idade, altura);
		}
		
		double soma = 0;
		for(int i = 0; i<vect.length; i++) {
			soma += vect[i].getAltura();
		}
		
		double media = soma / vect.length;
		
		System.out.printf("Altura média é %.2f\n", media);
		
		int menores_16 = 0;
		for (int i = 0; i<n; i++) {
			if (vect[i].getIdade()<16) {
				menores_16++;
			}
		}
		double perc_16 = ((double) menores_16 / vect.length) * 100;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", perc_16);
		
		for (int i = 0; i<n; i++) {
			if (vect[i].getIdade()<16) {
				System.out.println(vect[i].getNome());
			}
		}
		
		
		
		sc.close();

		}
}
