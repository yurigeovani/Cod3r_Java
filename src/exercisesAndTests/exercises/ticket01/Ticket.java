package exercisesAndTests.exercises.ticket;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
	List<TicketItem> item = new ArrayList<>();
	Client client = new Client();
	
	void addClient(Client client) {
		this.client = client;
	}
	
	void addItem (Product product, int qtt) {
		TicketItem ite = new TicketItem(product, qtt);
		item.add(ite);
	}
	
	void printClient () {
		System.out.println("Client: " + client.name);
	}
	
	void printItens (){
		for (TicketItem item : item) {
			System.out.println(item);
		}
	}
	
	double calcTotal() {
		double total = 0;
		for (TicketItem item : item) {
			total += item.priceByItem;
		}
		return total;
	}
	
	public Ticket() {
		super();
	}

	public Ticket(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		String rs = "R$";
		printClient();
		printItens();
		System.out.printf("TOTAL %44s %7.02f", rs, calcTotal());
		return "\n\n";
	}
	
}
