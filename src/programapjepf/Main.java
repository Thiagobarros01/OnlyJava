package programapjepf;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Contribuinte> list = new ArrayList<>();

		System.out.println("DIGITE O NUMERO DA TAXA A PAGAR: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("IMPOSTO DO #" + i);
			System.out.println("Qual o tipo: (i/c) ");
			char c = sc.next().charAt(0);
			if (c == 'i') {
				sc.nextLine();

				System.out.println("Nome: ");
				String nome = sc.nextLine();
				System.out.println("Renda anual: ");
				double rendaAnual = sc.nextDouble();
				System.out.println("Despesas com saude: ");
				double despesaSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, despesaSaude));
			} else {
				sc.nextLine();
				System.out.println("Nome: ");
				String nome = sc.nextLine();
				System.out.println("Renda anual: ");
				double rendaAnual = sc.nextDouble();
				System.out.println("Nº DE FUNCIONARIOS: ");
				int nFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, nFuncionarios));
			}
		}
		System.out.println();
		System.out.println("Impostos: ");
		for (Contribuinte cont : list) {
			System.out.println(cont.imposto());
		}

		sc.close();
	}

}
