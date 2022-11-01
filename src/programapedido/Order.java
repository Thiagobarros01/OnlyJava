package programapedido;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
	public  DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	private LocalDateTime moment;
	private OrderStatus status;

	private Client client;

	private List<OrderItem> itens = new ArrayList<>();

	public Order() {

	}

	public Order(OrderStatus status, Client client) {

		this.moment = LocalDateTime.now();
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void addItem(OrderItem item) {
		itens.add(item);
	}

	public void removeItem(OrderItem item) {
		itens.remove(item);
	}

	public double total() {
		double sum = 0.0;
		for (OrderItem x : itens) {
			sum += x.subTotal();
		}
		return sum;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: "+ moment.format(dt));
		sb.append(" Order status: "+getStatus());
		sb.append("Client: "+client.getName()+" - "+ client.getEmail());
		sb.append("Order itens: ");
		return sb.toString();
	}
	
}
