package exercicio.trabalho.pessoas;

public class Vendedor extends Pai implements Funcionario {

	public Vendedor(String pai, int idade, double salario) {
		super(pai, idade, salario);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Vendedor [getNome()=" + getNome() + ", getIdade()=" + getIdade() + ", getSalario()=" + getSalario()
				+ "]";
	}


	@Override
	public void bonificacao() {
		// TODO Auto-generated method stub
		this.setSalario(getSalario() + 3_000.00);
	}

	
}
