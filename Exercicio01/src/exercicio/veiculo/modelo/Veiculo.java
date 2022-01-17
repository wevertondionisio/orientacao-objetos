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
			System.out.println("O carro não esta ligado, então você não pode acelerar.");
		} else {
		
		this.setVelocidade(this.getVelocidade() + 20);
			System.out.println("Carro acelerando!");
		}
	}
	

	@Override
	public void frear() {
		
		
		this.setVelocidade(this.getVelocidade() - 20);
		
	}
	
	//pintar(String cor): recebe uma cor como parâmetro e altera o atributo.

	@Override
	public void pintar() {
		this.setCor(cor);		
	}

	
	
	//ligar(): Verifica se o veículo já se encontra ligado, caso não, liga o carro.

	@Override
	public void ligar() {
		boolean ligado = true;
		
		if (this.isIsligado() == ligado) {
			System.out.println("O carro já está ligado.");
		} else {
			this.setIsligado(true);
			System.out.println("Carro ligado!");
		}
	}
	
	//desligar(): Verifica se o veículo já se encontra desligado, caso não, desliga
	//o carro. Não permitir que desligue o veículo com (velocidade > 0.
			
	@Override
	public void desligar() {
		boolean desligado = false;
		
		if (this.isIsligado() == desligado) {
			System.out.println("O veiculo já está desligado");
		} else {
			this.setIsligado(false);
			System.out.println("Carro desligado!");
		}
	}
	
	//abastecer(int combustivel): recebe como parâmetro uma quantidade de
	//combustível e atribui a listrosCombustivel. OBS O limite do tanque de
	//combustível é de 60 litros, validar para não ultrapassar.

	
	@Override
	public void abastecer(int combustivel) {
		
		if (this.getLitrosCombustivel() == 0) {
			this.setLitrosCombustivel(getLitrosCombustivel() + 20);
			System.out.println("Combustível " + this.getLitrosCombustivel() + " litros. Foi adicionado mais 20!");
		
		} else if (this.getLitrosCombustivel() == 20) {
			this.setLitrosCombustivel(getLitrosCombustivel() + 20);
			System.out.println("Combustível " + this.getLitrosCombustivel() + " litros. O limite é 60 litros!");
		
		} else if (this.getLitrosCombustivel() == 40) {
			this.setLitrosCombustivel(getLitrosCombustivel() + 20);
			System.out.println("Combustível " + this.getLitrosCombustivel() + " litros. O limite é 60 litros!");
			
		} else if (this.getLitrosCombustivel() == 60) {
			System.out.println("Combustível " + this.getLitrosCombustivel() + " litros. Esta cheio!");

		}
			

	}
	
}
	