package exercicio.pessoa;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa a1 = new Pessoa ("João", 15);
		Pessoa a2 = new Pessoa ("Leandro", 21);
		Pessoa a3 = new Pessoa ("Paulo", 17);
		Pessoa a4 = new Pessoa ("Jessica", 18);
		
		ArrayList<Pessoa> pessoa = new ArrayList<>();
		pessoa.add(a1);
		pessoa.add(a2);
		pessoa.add(a3);
		pessoa.add(a4);
	
		System.out.println(pessoa);
		
		Iterator<Pessoa> lista = pessoa.iterator();
		
		while(lista.hasNext()) {
			Pessoa novalista = lista.next();
			
			
			if (novalista.getIdade() >= 18) {	
				System.out.println(novalista);
			} 
			lista.remove();
		}
		
//		pessoa.stream()
//		.filter(p -> p.getIdade() > 18)
//		.mapToInt(Pessoa::getIdade)
//		.forEach(System.out::println);
			
	}
}
 