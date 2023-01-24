package exercisesAndTests.exercises.ticket01;

public class MySystem {

	public static void main(String[] args) {
		
		Product p1 = new Product(100, "Huawei", 100);
		Product p2 = new Product(101, "Moto G42", 20);
		Product p3 = new Product(102, "iPhone", 30);

		Client c1 = new Client(11, "Yuri");
		Client c2 = new Client(12, "Thaty");
		Client c3 = new Client(13, "Luma");
		
//		TicketItem item1 = new TicketItem(p1, 2);
//		TicketItem item2 = new TicketItem(p2, 2);
//		TicketItem item3 = new TicketItem(p3, 2);
//		System.out.println(item1);
//		System.out.println(item2);
//		System.out.println(item3);
		
		Ticket t1 = new Ticket();
		
		t1.addClient(c1);
		t1.addItem(p1, 2);
		t1.addItem(p2, 3);
		t1.addItem(p3, 1);
		
		Ticket t2 = new Ticket();
		t2.addClient(c2);
		t2.addItem(p3, 2);
		
		Ticket t3 = new Ticket(c3);
		t3.addItem(p1, 1);
		
		Ticket t4 = new Ticket(new Client(14, "Lola"));
		t4.addItem(p3, 2);
		t4.addItem(p2, 1);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
	}

}
