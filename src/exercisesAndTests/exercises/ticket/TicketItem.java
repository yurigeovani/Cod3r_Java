package exercisesAndTests.exercises.ticket;

public class TicketItem {
	
	Product product = new Product();
	int quantity;
	double priceByItem = 0;

	public TicketItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
		
		priceByItem = product.price * quantity;
	}

	@Override
	public String toString() {
		String rs = "R$";
		System.out.printf("%d %-20s\t%02d %s %7.02f = %s %7.02f", product.code, product.name , quantity, rs, product.price , rs, priceByItem);
		return "";
	}

}
