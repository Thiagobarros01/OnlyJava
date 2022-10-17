package aplication;

import java.util.Date;

import utilidades.Order;
import utilidades.enums.OrderStatus;

public class ProgramPedido {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(),OrderStatus.AguardandoPagamento);

		System.out.println(order);
		
		
	}

}
