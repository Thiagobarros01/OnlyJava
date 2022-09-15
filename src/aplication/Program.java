package aplication;

import java.util.Locale;
import java.util.Scanner;

import utilidades.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta ;
		
		System.out.print("Adicione o número do conta: ");
		int number = sc.nextInt(); 
		System.out.println("Adicione o nome do titular: ");
		sc.nextLine();
		String tiular = sc.nextLine();
		System.out.print("Deseja fazer um depósito inicial?");
		
		
		
		sc.close();
	}

}
