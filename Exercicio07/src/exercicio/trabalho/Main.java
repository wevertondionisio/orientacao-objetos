package exercicio.trabalho;

import exercicio.trabalho.pessoas.Gerente;
import exercicio.trabalho.pessoas.Supervisor;
import exercicio.trabalho.pessoas.Vendedor;

public class Main {

	public static void main(String[] args) {
		Gerente funcionario1 = new Gerente("Joao Carlos", 45, 15_000.00);
		Supervisor funcionario2 = new Supervisor("Lucas da Silva", 32, 8_000.00);
		Vendedor funcionario3 = new Vendedor("Andre de Andrade", 28, 5_000.00);
		
		
		
		System.out.println("------------Gerente ------------");
		funcionario1.bonificacao();
		System.out.println(funcionario1);
		
		
		System.out.println("------------Supervisor ------------");
		funcionario2.bonificacao();
		System.out.println(funcionario2);
		
		System.out.println("------------Vendedor ------------");
		funcionario3.bonificacao();
		System.out.println(funcionario3);
	}

}
