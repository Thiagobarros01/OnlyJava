package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Thor");
		list.add("Julia");
		list.add("Fernanda");
		list.add(2, "strange");
		list.add(2, "Marcos");
		list.add(2, "Maria");
		list.add(2, "ARIVALDO");
		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);

		}

		System.out.println(list.indexOf("Maria"));

		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		System.out.println("------------");

		System.out.println("------------------------");

		String nome = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(nome);

	}

}
