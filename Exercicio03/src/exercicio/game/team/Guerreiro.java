package exercicio.game.team;

public class Guerreiro extends Personagem {
		
	private String habilidade;
	
	public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		// TODO Auto-generated constructor stub
	}
		



	@Override
	public String toString() {
		return "Guerreiro [habilidade=" + habilidade + ", Nome=" + getNome() + ", Vida=" + getVida()
				+ ", Mana=" + getMana() + ", Xp=" + getXp() + ", Forca=" + getForca()
				+ ", Inteligencia=" + getInteligencia() + ", Level=" + getLevel() + "]";
	}


	public String getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(String habilidade) {
		this.habilidade = habilidade;
	}
	
	public void attack() {
		int golpe = this.getForca() + this.getLevel();
		int golpeFinal = golpe + (int) Math.random() * 300;
 		
		System.out.println(this.getNome() + " atacou e causou dano: " + golpeFinal + " nos pontos de vida.");
	}
	
	public void aprenderHabilidade() {
		this.setHabilidade("Arco e Flecha");
		System.out.println("Aprendeu nova habilidade, Arco e Flecha");
	}

	@Override
	public void lvlUp() {
		// TODO Auto-generated method stub
		this.setLevel(getLevel() + 1);
		this.setVida(getVida() + 10);
		this.setForca(getForca() + 50);
		
		if (this.getLevel() == 2) {
			this.aprenderHabilidade();
		}
			
		System.out.println("Parabéns seu Gerreiro " + this.getNome() + " subiu de level: " + this.getLevel());
		System.out.println("Ganhou: " + this.getVida() + " de vida.");
		System.out.println("Ganhou: " + this.getForca() + " força.");
	}
	
	
	
	
}
 