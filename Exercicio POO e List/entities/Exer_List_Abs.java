package entities;

public class Exer_List_Abs {
	private String name;
	private int id;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Exer_List_Abs(int id, String name, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	

	
	
}
