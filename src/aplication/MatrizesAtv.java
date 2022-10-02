package aplication;

import java.util.Locale;
import java.util.Scanner;

public class MatrizesAtv {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero de linhas: ");
		int l = sc.nextInt();
		System.out.println("Digite o numero de colunas: ");
		int c = sc.nextInt();
		Integer[][] mat = new Integer[l][c];

		for (int i = 0; i < mat.length; i++) {
			for (int s = 0; s < mat[i].length; s++) {
				mat[i][s] = sc.nextInt();
			}
		}
		System.out.println("Digite um numero a ser achado: ");
		int x = sc.nextInt();
		for (int i = 0; i < mat.length; i++) {
			for (int s = 0; s < mat[i].length; s++) {
				if (mat[i][s] == x) {
					System.out.println("posicao" + i + "," + s);
					if (s > 0) {
						System.out.println("esquerda: " + mat[i][s - 1]); 
					}
					if (i > 0) {
						System.out.println("acima: " + mat[i - 1][s]);  
					}
					if (s < mat[i].length - 1) {
						System.out.println("direita: " + mat[i][s + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("abaixo: " + mat[i + 1][s]);

					}
				}

				sc.close();

			}

		}
	}
}