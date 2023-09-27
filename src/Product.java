
public class Product {

	private String name; 
	
	private double price;
	
	private int taxPerc;
	
	private double totalPrice;
	

	public Product() {
		System.out.println("In constructor Product");
	}
	
	public Product(double price) {
		this.price = price;
	}
	
	public void calculateTotalPrice() {
		totalPrice = price * taxPerc;
	}
	
	public void printPrice() {
		System.out.println("Prijs = " + price);
	
	}
	
	public void setPrice(double newPrice) {
		if (newPrice > 0 && newPrice <10000)
			price = newPrice;
	}
	
	public boolean isExpensive() {
		return price > 100;
	}
	
	public double getPrice() {
		return price;
	}
}