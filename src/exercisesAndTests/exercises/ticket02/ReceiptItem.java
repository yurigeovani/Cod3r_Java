package exercisesAndTests.exercises.ticket02;

public class ReceiptItem {
	Product product;
	int qtt;
	double subtotal;
	
	public ReceiptItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReceiptItem(Product product, int qtt) {
		super();
		this.product = product;
		this.qtt = qtt;
		
		this.subtotal = product.price * qtt;
	}

	@Override
	public String toString() {
		return "\n" + product.name + "\t\t" + qtt + "\t $ " + product.price + "\t $ " + subtotal;
	}
	
	
}
