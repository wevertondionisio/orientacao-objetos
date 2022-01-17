package exercicio.trabalho.pessoas;

public class Gerente extends Pai implements Funcionario {

	public Gerente(String nome, int idade, double salario) {
		super(nome, idade, salario);
		// TODO Auto-generated constructor stub
	}
	


	@Override
	public String toString() {
		return "Gerente [getNome()=" + getNome() + ", getIdade()=" + getIdade() + ", getSalario()=" + getSalario()
				+ "]";
	}


	@Override
	public void bonificacao() {
		// TODO Auto-generated method stub
		this.setSalario(getSalario() + 10_000.00);
	}

	
}
