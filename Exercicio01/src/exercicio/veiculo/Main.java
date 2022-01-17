package exercicio.veiculo;

import exercicio.veiculo.modelo.Veiculo;

public class Main {

	public static void main(String[] args) {
		Veiculo carroOne = new Veiculo(0, false, 0, 0);
		carroOne.setMarca("Fiat");
		carroOne.setModelo("Palio");
		carroOne.setPlaca("GFT-2021");
		carroOne.setPreco(30_000);
		carroOne.setCor("Preto");
		carroOne.setKm(100_000);
		
		
		carroOne.setCor("Vermelho");
		carroOne.ligar();
		carroOne.desligar();
		carroOne.ligar();
		carroOne.acelerar();
		carroOne.abastecer(20);
		carroOne.abastecer(20);
		carroOne.abastecer(20);
		carroOne.abastecer(20);


		
		System.out.println("-------- Status --------");
		System.out.println(carroOne.toString());
		System.out.println("-------- Status --------");
	
		
	}

}
