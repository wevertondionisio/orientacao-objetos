package exercicio.game.team;


public class Mago extends Personagem {
	
	private String magia;
	
	public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Mago [magia=" + magia + ", Nome=" + getNome() + ", Vida=" + getVida() + ", Mana="
				+ getMana() + ", tXp=" + getXp() + ", Forca=" + getForca() + ", Inteligencia="
				+ getInteligencia() + ", Level=" + getLevel() + "]";
	}


	public String getMagia() {
		return magia;
	}

	public void setMagia(String magia) {
		this.magia = magia;
	}
	
	public void attack() {
		int golpe = this.getInteligencia() + this.getMana();
		int golpeFinal = golpe + (int) Math.random() * 300;
		
		System.out.println(this.getNome() + " atacou e causou dano: " + golpeFinal + " nos pontos de vida.");
	}
	
	public void aprenderMagia() {
		this.setMagia("Bola de fogo");
		System.out.println("Aprendeu nova habilidade, Bola de Foga");
		
		
	}

	@Override
	public void lvlUp() {
		// TODO Auto-generated method stub
		this.setLevel(getLevel() + 1);
		this.setMana(getMana() * 2);
		this.setInteligencia(getInteligencia() * 2);
		
		if (this.getLevel() == 2) {
			this.aprenderMagia();
		} 
		
		
		
		System.out.println("Parabéns seu Mago " + this.getNome() + " subiu de level: " + this.getLevel());
		System.out.println("Ganhou: " + this.getMana() + " de mana.");
		System.out.println("Ganhou: " + this.getInteligencia() + " inteligência.");
		
	}

}
