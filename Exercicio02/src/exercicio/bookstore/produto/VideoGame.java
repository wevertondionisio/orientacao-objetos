package exercicio.bookstore.produto;


public class VideoGame extends Produto implements Imposto {
	
	private String marca;
	private String modelo;
	private boolean isUsado;
	
	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		// TODO Auto-generated constructor stub
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isUsado() {
		return isUsado;
	}
	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}
	@Override
	public void calculaImposto() {
		
		boolean usado = true;
		double impostoFinalUsado = (this.getPreco() / 100 * 25);
		
		if (this.isUsado() == usado) {
			impostoFinalUsado += this.getPreco();
			
			System.out.println("Imposto " + this.getNome() + " usado, " + impostoFinalUsado);
		}  
		
		double impostoFinal = this.getPreco() / 100 *45;
		
		if (this.isUsado() != usado) {
			System.out.println("Imposto " + this.getNome() + " R$ " + impostoFinal);
		}
	}

}
 