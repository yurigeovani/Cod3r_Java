package exercisesAndTests.exercises.ticket;

public class Product {
	int code;
	String name;
	double price;
	
	public Product() {
	}

	public Product(int code, String name, double price) {
		this.code = code;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "\nProduct [code=" + code + ", name=" + name + ", price=" + price + "]";
	}
}
