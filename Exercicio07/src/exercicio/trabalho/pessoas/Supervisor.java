package exercicio.trabalho.pessoas;

public class Supervisor extends Pai implements Funcionario {

	
	public Supervisor(String pai, int idade, double salario) {
		super(pai, idade, salario);
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public String toString() {
		return "Supervisor [getNome()=" + getNome() + ", getIdade()=" + getIdade() + ", getSalario()=" + getSalario()
				+ "]";
	}



	@Override
	public void bonificacao() {
		// TODO Auto-generated method stub
		this.setSalario(getSalario() + 5_000.00);
	}
	
}
