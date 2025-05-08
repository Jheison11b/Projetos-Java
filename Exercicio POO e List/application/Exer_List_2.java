package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Exer_List_Abs;
import java.util.ArrayList;
import java.util.List;

public class Exer_List_2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos funcionáriso você deseja registrar?");
		int n = sc.nextInt();
		sc.nextLine();
		
		List<Exer_List_Abs> lista = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			System.out.println("informe o ID do funcionário: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("informe o nome do funcionário: ");
			String name = sc.nextLine();
			System.out.println("informe o salário do funcionário: ");
			double salary = sc.nextDouble();
			sc.nextLine();
			
			lista.add(new Exer_List_Abs(id, name, salary));
		}
		
		  for (int i = 0; i < lista.size(); i++) {
	            Exer_List_Abs emp = lista.get(i);
	            System.out.println("Employee " + (i + 1));
	            System.out.println("Id: " + emp.getId());
	            System.out.println("Name: " + emp.getName());
	            System.out.printf("Salary: %.2f\n", emp.getSalary());
	        }
		
		
		System.out.println("Informe a matricula do empregado que deseja alterar salario: ");
		int alteracao = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Informe o percentual que deseja alterar no salario: ");
		double percentual = sc.nextDouble();
		sc.nextLine();
		
		boolean found = false;
		

        for (Exer_List_Abs emp : lista) {
            if (emp.getId() == alteracao) {
                emp.setSalary(emp.getSalary() * (1 + percentual / 100));
                found = true;
                break;
            }
        }
		
		if (!found) {
			System.out.println("Funcionário com essa matrícula não existe.");
		}
		
		
		System.out.println("\nLista atualizada de funcionários:");
        for (int i = 0; i < lista.size(); i++) {
            Exer_List_Abs emp = lista.get(i);
            System.out.println("Employee " + (i + 1));
            System.out.println("Id: " + emp.getId());
            System.out.println("Name: " + emp.getName());
            System.out.printf("Salary: %.2f\n", emp.getSalary());
        }
		
		
		sc.close();
		}

}
