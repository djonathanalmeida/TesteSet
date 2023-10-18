package aplicacao;

import java.util.HashSet;
import java.util.Set;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Set<Produto> set = new HashSet<>();
		
		set.add(new Produto("Martelo", 9.99));
		set.add(new Produto("Alicate", 12.00));
		
		for(Produto test : set) {
			System.out.println(test);
		}
	}

}
