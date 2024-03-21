package exercisesAndTests.oo.inheritance.ex07;

class Employee extends Person{
	
	private int employeeId;
	private String jobTitle;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String firstName, String lastName, int employeeId, String jobTitle) {
		super(firstName, lastName);
		this.employeeId = employeeId;
		this.jobTitle = jobTitle;
	}

	@Override
	public String getLastName() {
		return super.getLastName() + " " + getJobTitle() ;
	}
}
