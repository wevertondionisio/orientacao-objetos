package exercicio.pessoa;

public class Pessoa {
	private String nome;
	private int idade;
	

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}


	@Override
	public String toString() {
		return "[nome : " + this.getNome() + ", " + "idade : " + this.getIdade()+ "]";
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
	
	
	
}
