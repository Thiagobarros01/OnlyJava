package polimorfismo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramMain {

	public static void main(String[] args) {
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com o número de produtos: ");
		List<Product> list = new ArrayList<>();
		int n = sc.nextInt();
		
		
		for (int i = 1; i <= n; i++) {
			
			System.out.println("Dados do product #" + i);
			System.out.print("Comum, usado ou importado? (c/u/i)");
			char tipo = sc.next().charAt(0);
			sc.nextLine();
			if (tipo == 'c') {
				System.out.println("Nome: ");
				String name = sc.nextLine();
				
				System.out.print("Preço: ");
				double price = sc.nextDouble();
				list.add(new Product(name, price));
			} else if (tipo == 'u') {
				System.out.println("Nome: ");
				String name = sc.nextLine();
				System.out.println("Preço: ");
				double price = sc.nextDouble();
				System.out.println("Data da Manufatura: ");
				LocalDate manufactureDate = LocalDate.parse(sc.next(), dt);
				list.add(new UsedProduct(name, price, manufactureDate));
			} else if (tipo == 'i') {
				System.out.println("Nome: ");
				String name = sc.nextLine();
				System.out.println("Preço: ");
				double price = sc.nextDouble();
				System.out.println("Customs free: ");
				double customFree = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customFree));
			}

		}

		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (Product product : list) {
			System.out.println(product.priceTag());
		}
		sc.close();
	}

}
