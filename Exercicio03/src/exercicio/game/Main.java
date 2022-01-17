package exercicio.game;

import java.util.ArrayList;


import exercicio.game.team.Guerreiro;
import exercicio.game.team.Mago;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Guerreiro player1 = new Guerreiro ("Thor", 100, 1, 0, 1, 1, 1);
		
		ArrayList<Guerreiro> guerreiro = new ArrayList<>();
		guerreiro.add(player1);
		
		Mago player2 = new Mago("Sabio", 100, 1, 0, 1, 1, 1);
		
		ArrayList<Mago> mago = new ArrayList<>();
		mago.add(player2);
		
		
		
		player1.lvlUp();
		player1.attack();
		
		System.out.println("-----------");
		System.out.println(guerreiro.toString());
		System.out.println("-----------");
		
		player2.lvlUp();
		player2.attack();
		
		System.out.println("-----------");
		System.out.println(mago.toString());
		System.out.println("-----------");
	}

}


//Pessoa a1 = new Pessoa ("João", 15);
//Pessoa a2 = new Pessoa ("Leandro", 21);
//Pessoa a3 = new Pessoa ("Paulo", 17);
//Pessoa a4 = new Pessoa ("Jessica", 18);
//
//ArrayList<Pessoa> pessoa = new ArrayList<>();
//pessoa.add(a1);
//pessoa.add(a2);
//pessoa.add(a3);
//pessoa.add(a4);
//
//Collections.sort(pessoa, Comparator.comparing(Pessoa::getIdade));
//
//System.out.println(pessoa.get(3));