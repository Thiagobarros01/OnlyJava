package aplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaVet {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}

		double sum = 0.0;
		for (int i = 0; i < n; i ++) {
			sum += vect[i];
		}
		double media = sum/n;
		System.out.printf("A m�dia aritim�tica � : %.2f ", media);
		
		sc.close();

	}

}
