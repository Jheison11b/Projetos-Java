package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Fix_Vect;

public class Exe_Fix_Vect5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros deseja inserir: ");
		int n = sc.nextInt();
		sc.nextLine();
		Fix_Vect[] vect = new Fix_Vect[n];
		
		for (int i = 0; i<n; i++) {
			System.out.println("Digite um numero: ");
			int numero = sc.nextInt();
			vect[i] = new Fix_Vect(numero);
		}
		
		int maior = 0;
		int posmaior = 0;

		for (int i = 0; i<n; i++) {
			if (vect[i].getNumero() > maior) {
				maior = vect[i].getNumero(); 
				posmaior = i;
			}
		}
		
		System.out.println("Maior valor = " + maior);
		System.out.println("Posição do maior valor = " + posmaior);
		
		sc.close();
	}

}
