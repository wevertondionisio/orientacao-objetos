package exercicio.bookstore.produto;


public class Livro extends Produto implements Imposto {
	
	private String autor;
	private String tema;
	private int qtdPag;
	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preco, qtd);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Livro [autor=" + autor + ", tema=" + tema + ", qtdPag=" + qtdPag + "]";
	}


	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public int getQtdPag() {
		return qtdPag;
	}
	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}
	@Override
	public void calculaImposto() {
				
		if (this.getTema() != "educativo") {
			this.setPreco(this.getPreco() / 100 * 10);
			System.out.println("R$ " + this.getPreco() + " de impostos sobre o livros " + this.getNome());

		} else {
			System.out.println("Livro educativo não tem imposto: R$ 0.");	
		}
	}
}
