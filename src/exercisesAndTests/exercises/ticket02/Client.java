package exercisesAndTests.exercises.ticket02;

public class Client {
	
	int id;
	String name;
	
	public Client(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + "]";
	}
	
	
}
