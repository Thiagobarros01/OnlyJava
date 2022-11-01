package programapedido;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os dados do cliente: ");
		System.out.println("Nome: ");
		String name = sc.nextLine();
		System.out.println("Email: ");
		String email = sc.next();
		System.out.println("Data de nascimento (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), dt);

		Client cliente = new Client(name, email, date); 

		System.out.println("Dados do pedido: ");
		System.out.print("Status: ");
		String status = sc.next();
		Order order = new Order(OrderStatus.valueOf(status), cliente);
		System.out.println("Quantos itens para este pedido? ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= n; i++) {
			System.out.print("Nome do produto: ");
			String namep = sc.nextLine();
			System.out.print("Preço do produto: ");
			Double price = sc.nextDouble();
			System.out.print("Quantidade : ");
			int quantidade = sc.nextInt();
			sc.nextLine();
			Product p = new Product(namep, price);
			OrderItem item = new OrderItem(quantidade, price, p);
			order.addItem(item);

		}
		System.out.println();
		System.out.println(order);
		
		

		sc.close();
	}

}
