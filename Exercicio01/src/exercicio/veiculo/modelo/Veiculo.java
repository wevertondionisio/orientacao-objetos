package exercicio.veiculo.modelo;

public class Veiculo implements AcoesVeiculo {
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isligado;
	private int litrosCombustivel;
	private int velocidade;
	private double preco;
	
	

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
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getKm() {
		return km;
	}
	public void setKm(float km) {
		this.km = km;
	}
	public boolean isIsligado() {
		return isligado;
	}
	public void setIsligado(boolean isligado) {
		this.isligado = isligado;
	}
	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}
	public int setLitrosCombustivel(int litrosCombustivel) {
		return this.litrosCombustivel = litrosCombustivel;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	public Veiculo(float km, boolean isligado, int litrosCombustivel, int velocidade) {
		super();
		this.km = 0;
		this.isligado = false;
		this.litrosCombustivel = 0;
		this.velocidade = 0;
	}
	@Override
	public String toString() {
		return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", cor=" + cor + ", km=" + km
				+ ", isligado=" + isligado + ", litrosCombustivel=" + litrosCombustivel + ", velocidade=" + velocidade
				+ ", preco=" + preco + "]";
	}
	@Override
	public void acelerar() {
		if (this.isIsligado() == false) {
			System.out.println("O carro n�o esta ligado, ent�o voc� n�o pode acelerar.");
		} else {
		
		this.setVelocidade(this.getVelocidade() + 20);
			System.out.println("Carro acelerando!");
		}
	}
	

	@Override
	public void frear() {
		
		
		this.setVelocidade(this.getVelocidade() - 20);
		
	}
	
	//pintar(String cor): recebe uma cor como par�metro e altera o atributo.

	@Override
	public void pintar() {
		this.setCor(cor);		
	}

	
	
	//ligar(): Verifica se o ve�culo j� se encontra ligado, caso n�o, liga o carro.

	@Override
	public void ligar() {
		boolean ligado = true;
		
		if (this.isIsligado() == ligado) {
			System.out.println("O carro j� est� ligado.");
		} else {
			this.setIsligado(true);
			System.out.println("Carro ligado!");
		}
	}
	
	//desligar(): Verifica se o ve�culo j� se encontra desligado, caso n�o, desliga
	//o carro. N�o permitir que desligue o ve�culo com (velocidade > 0.
			
	@Override
	public void desligar() {
		boolean desligado = false;
		
		if (this.isIsligado() == desligado) {
			System.out.println("O veiculo j� est� desligado");
		} else {
			this.setIsligado(false);
			System.out.println("Carro desligado!");
		}
	}
	
	//abastecer(int combustivel): recebe como par�metro uma quantidade de
	//combust�vel e atribui a listrosCombustivel. OBS O limite do tanque de
	//combust�vel � de 60 litros, validar para n�o ultrapassar.

	
	@Override
	public void abastecer(int combustivel) {
		
		if (this.getLitrosCombustivel() == 0) {
			this.setLitrosCombustivel(getLitrosCombustivel() + 20);
			System.out.println("Combust�vel " + this.getLitrosCombustivel() + " litros. Foi adicionado mais 20!");
		
		} else if (this.getLitrosCombustivel() == 20) {
			this.setLitrosCombustivel(getLitrosCombustivel() + 20);
			System.out.println("Combust�vel " + this.getLitrosCombustivel() + " litros. O limite � 60 litros!");
		
		} else if (this.getLitrosCombustivel() == 40) {
			this.setLitrosCombustivel(getLitrosCombustivel() + 20);
			System.out.println("Combust�vel " + this.getLitrosCombustivel() + " litros. O limite � 60 litros!");
			
		} else if (this.getLitrosCombustivel() == 60) {
			System.out.println("Combust�vel " + this.getLitrosCombustivel() + " litros. Esta cheio!");

		}
			

	}
	
}
	