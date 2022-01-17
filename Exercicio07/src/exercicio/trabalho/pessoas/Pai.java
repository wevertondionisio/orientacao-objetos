package exercicio.trabalho.pessoas;

public abstract class Pai {
	private String nome;
	private int idade;
	private double salario;
	
	public Pai(String nome, int idade, double salario) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double d) {
		this.salario = d;
	}
	
	
}
