package aplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAlturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas Pessoas serão digitadas? ");
		int n = sc.nextInt();
		String[] pessoa = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "º pessoa?");
			System.out.print("Nome: ");
			pessoa[i] = sc.next();
			System.out.print("idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();

		}
		double altMedia = 0.0;
		for (int i = 0; i < n; i++) {

			altMedia += altura[i];
		}

		altMedia = altMedia / n;
		System.out.printf("Altura média: %.2f%n ", altMedia);

		int cont = 0;
		for (int i = 0; i < n; i++) {
			if (idade[i] < 18) {
				cont++;
			}

		}
		double porcentagem = cont * 100 / n;
		System.out.printf("Pessoas com menos de 18 anos, equivalente a : %.1f%%%n ", porcentagem);
		
		System.out.println("Lista dos menores de idade: ------- ");
		for (int i = 0; i < n; i++) {
			if (idade[i] < 18) {
				 System.out.println(pessoa[i]);
			}
		}
	}

}
