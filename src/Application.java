
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		
		// met "new" kunnen we een nieuw product object aanmaken 
		Product product1 = new Product();
		Product product2 = new Product();
		
		// Passen we de gegevens van product 1 aan
		// product1.name = "TV";
		// product1.price = 123.50;
		product1.printPrice();
		product1.setPrice(250);
		
		// Passen we de gegevens aan van product 2
		// product2.name = "Laptop";
		// product2.price = 850.12;
		product2.printPrice();
		product2.setPrice(20.50);
		
		// System.out.println("Product 2 prijs is " + product2.price);
		
		boolean outcome = product2.isExpensive();
		System.out.println("Product 2 is duur: " + outcome);
		
		product2.setPrice(120.50);
		outcome = product2.isExpensive();
		System.out.println("Product 2 is duur: " + outcome);
		
		Product product3 = new Product(34.75);
		System.out.println("Product 3 prijs = " + product3.getPrice());
		
	}

}
