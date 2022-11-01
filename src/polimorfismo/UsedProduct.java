package polimorfismo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
	public static DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private LocalDate manufactureDate;
	
	public UsedProduct() {
		
	}

	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	@Override
	public String priceTag() {
		return getName() + "(usado) $" + String.format("%.2f", getPrice()) + "Manufacture date: "+ getManufactureDate().format(dt);
	}
	
	
}
