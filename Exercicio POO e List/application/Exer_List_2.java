package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Exer_List_Abs;

public class Exer_List_2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos funcionáriso você deseja registrar?");
		int n = sc.nextInt();
		sc.nextLine();
		
		Exer_List_Abs[] lista = new Exer_List_Abs[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("informe o ID do funcionário: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("informe o nome do funcionário: ");
			String name = sc.nextLine();
			System.out.println("informe o salário do funcionário: ");
			double salary = sc.nextDouble();
			sc.nextLine();
			lista[i] = new Exer_List_Abs(id, name, salary);
		}
		
		for (int i = 0; i < n; i++) {
			int empregado = i + 1;
			System.out.println("Employee "+ empregado);
			System.out.println("Id: "+ lista[i].getId());
			System.out.println("Name: "+  lista[i].getName());
			System.out.printf("Salary: %.2f\n",  lista[i].getSalary());
		}
		
		
		System.out.println("Informe a matricula do empregado que deseja alterar salario: ");
		int alteracao = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Informe o percentual que deseja alterar no salario: ");
		double percentual = sc.nextDouble();
		sc.nextLine();
		
		boolean found = false;
		
		for (int i = 0; i < n; i++) {
			if (alteracao == lista[i].getId()) {
				lista[i].setSalary(lista[i].getSalary() * (1 + percentual / 100));	
				found = true;
				break;
			}		
			
		}
		
		if (!found) {
			System.out.println("Funcionário com essa matrícula não existe.");
		}
		
		
		for (int i = 0; i < n; i++) {
			int empregado = i + 1;
			System.out.println("Employee "+ empregado);
			System.out.println("Id: "+ lista[i].getId());
			System.out.println("Name: "+  lista[i].getName());
			System.out.printf("Salary: %.2f\n",  lista[i].getSalary());
		}
		
		
		sc.close();
		}

}
