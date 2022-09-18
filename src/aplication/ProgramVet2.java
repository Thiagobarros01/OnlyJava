package aplication;

import java.util.Locale;
import java.util.Scanner;

import utilidades.Product;

public class ProgramVet2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n]; 
		
		for (int i=0;i<vect.length;i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name,price);
			
		}
		double sum = 0.0;
		for (int i=0;i<vect.length;i++) {
			 sum += vect[i].getPrice();
		}
		double avg = sum /vect.length;
		System.out.printf("Avarage price: %.2f%n ",avg);
	}

}
