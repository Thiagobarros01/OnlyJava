package aplication;

import java.util.Locale;
import java.util.Scanner;

import utilidades.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta ;
		
		System.out.print("Adicione o número da conta: ");
		int number = sc.nextInt(); 
		System.out.print("Adicione o nome do titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Deseja fazer um depósito inicial? (y/n)");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Qual o valor de depósito?");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(number, titular, depositoInicial);
		} else {
			conta = new Conta(number, titular);
			System.out.print("Qual o valor de depósito?");
			conta.depositar(sc.nextDouble());
			
		}
		
		System.out.println("Valor para saque? ");
		conta.sacar(sc.nextDouble());
		
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(conta);

		
		
		sc.close();
	}

}
