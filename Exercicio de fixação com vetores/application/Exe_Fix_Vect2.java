package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Fix_Vect;

public class Exe_Fix_Vect2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		int n = sc.nextInt();
		Fix_Vect[] vect = new Fix_Vect[n];
			
		for (int i = 0; i<vect.length; i++) {
			System.out.println("Digite um numero: ");
			sc.nextLine();
			int numero = sc.nextInt();
			vect[i] = new Fix_Vect(numero); 
		}
			
		int sum = 0;
			
		for (int i = 0; i<vect.length; i++) {
			sum += vect[i].getNumero();
		}
			
		System.out.printf("%d\n", sum);
			
		int media = sum / vect.length;
			
		System.out.printf("%d\n", media);
			
		sc.close();

		}
}