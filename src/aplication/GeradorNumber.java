package aplication;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class GeradorNumber {
	// DESAFIO DE NUMEROS ALEATORIOS
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Desafio dos 50 n�meros : Acerte!");
		System.out.println("--------------------");

		Random aleatorio = new Random();
		int numero = aleatorio.nextInt(50);
		int n = -1;
		char cont = 0;
		int contador = 0;
		while (n != numero) {
			contador++;
			System.out.print("Digite um numero: ");
			n = sc.nextInt();
			if (n < numero) {
				System.out.println("o numero que procura, � maior que " + n);
			}
			if (n > numero) {
				System.out.println("o numero que procura, � menor que " + n);
			}
			if (n == numero) {
				System.out.println("parabens! voc� acertou!");
				System.out.println("Voc� digitou "+contador+" n�meros at� achar o valor correto!");
				System.out.println("Deseja continuar? (y/n)");
				cont = sc.next().charAt(0);
				if (cont == 'y') {
					numero = aleatorio.nextInt(50);
				} else {
					System.out.println("Volte sempre!");
				}

			}

		}

	}
}