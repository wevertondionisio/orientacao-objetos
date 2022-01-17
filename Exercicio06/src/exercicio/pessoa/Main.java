package exercicio.pessoa;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		Pessoa a1 = new Pessoa ("João", 15);
		Pessoa a2 = new Pessoa ("Leandro", 21);
		Pessoa a3 = new Pessoa ("Paulo", 17);
		Pessoa a4 = new Pessoa ("Jessica", 18);
		
		ArrayList<Pessoa> pessoa = new ArrayList<>();
		pessoa.add(a1);
		pessoa.add(a2);
		pessoa.add(a3);
		pessoa.add(a4);
		
		Iterator<Pessoa> lista = pessoa.iterator();
		
		while(lista.hasNext()) {
			Pessoa novalista = lista.next();
			
			
			if (novalista.getNome() == "Jessica") {	
				System.out.println(novalista.getIdade());
			} 
			lista.remove();
			
		}
	
	}
}
 