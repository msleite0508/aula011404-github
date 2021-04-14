package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class listas_secao10 {

	public static void main(String[] args) {

		List <String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); // adicionar o Marco na posição 2
		
		System.out.println(list.size()); //tamanho da lista
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("--------------------------------");
		
//		list.remove("Anna");
//		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M'); //remover com predicado
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco")); //qdo nao encontra o elemento, retorna -1
		
		System.out.println("---------------------------------"); ///deixar somente na lista elemento que começa com a letra A
		List <String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		System.out.println("------------------------------"); //encontrar um elemento da lista que atenda um certo predicado - ex. o primeiro da lista que começa com a letra A
		String name = list.stream().filter(x -> x.charAt(0)=='A').findFirst().orElse(null);
		System.out.println(name);
	}

}
