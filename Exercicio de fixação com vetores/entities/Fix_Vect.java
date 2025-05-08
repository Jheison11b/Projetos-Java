package entities;

public class Fix_Vect {
	private int numero;
	private String nome;
	private int idade;
	private int A;
	private int B;
	private int C;
	private double altura;

	public Fix_Vect(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	public Fix_Vect(double altura) {
		this.altura = altura;
	}
	
	public Fix_Vect(int numero) {
		this.numero = numero;
	}
	
	

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getNumero() {
		return numero;	
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getA() {
		return A;
	}

	public void setA(int a) {
		A = a;
	}

	public int getB() {
		return B;
	}

	public void setB(int b) {
		B = b;
	}
	
	public int getC() {
		return C;
	}

	public void setC(int c) {
		C = c;
	}

	public Fix_Vect(int a, int b, int c) {
		super();
		A = a;
		B = b;
		C= c;
	}

	public Fix_Vect(int a, int b) {
		super();
		A = a;
		B = b;
	}

	
	
	
}
