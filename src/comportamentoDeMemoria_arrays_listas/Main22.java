package comportamentoDeMemoria_arrays_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main22 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(); // dentro do <> só aceita wrapper class, list não aceita tipos primitivos
// É possível dentro do argumento new add novamente a wrapper class, mas para ficar mais limpo pode deixar em branco ArrayList<String>

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); // para inserir na posição desejada o primeiro argumento e depois a String
		
		System.out.println(list.size()); // ver o tamanho da lista
				
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------------");
/*		list.remove("Anna"); // É outra instância de String
		list.remove(1); // Remove a posição 1 da lista. Instância int
		list.removeIf(x -> x.charAt(0) == 'M'); // remove todo mundo com a letra inicial M, precisará do uso do predicado, para usá-lo removeIF()
*/	
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));// indexOf é para encontrar a posição de um elemento
		System.out.println("Index of Kaio: " + list.indexOf("Kaio")); // O que aparecerá se eu chamar alguém que não existe na list. Retornará -1
		System.out.println("------------------------");
	
	// filtrar para todos que começam com A
		List <String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
// Primeiro passo: declarar uma nova lista, criar uma nova variável e converter para stream. List <String> result = list.stream()
// Obs: stream aceita operações lamba
// Segundo passo fazer a operação lambda. filter(x -> x.charAt(0) == 'A') para descobrir as pessoas que começam com A
// Terceiro passo: voltar para a lista, pois Stream não é compatível com lista. collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("------------------------");
		// Encontrar o primeiro elemento que começa com a letra A
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
// findFirst pegará o primeiro nome da lista que atende o predicado filter, se ele não existir para retornar null (nulo)
				System.out.println(name);
	}
	
}
