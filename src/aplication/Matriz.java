package aplication;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat. length; j++) {
				mat[i][j] = sc.nextInt();
			}

		}

		System.out.println("Diagonal principal : ");
		for (int i = 0; i < mat[i].length; i++) {
			System.out.println(mat[i][i]);

		}
		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}

			}

		}
		System.out.println("Numeros negativos:" + count);
	}
}