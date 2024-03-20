package exercisesAndTests.oo.inheritance.ex04;

class HRManager extends Employee{

	@Override
	public void work() {
		System.out.println("HR working!");
	}
	
	public void addEmployee() {
		System.out.println("Adding employee!");
	}
}
