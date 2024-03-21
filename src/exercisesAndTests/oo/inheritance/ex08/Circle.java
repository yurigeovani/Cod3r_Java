package exercisesAndTests.oo.inheritance.ex08;

class Circle extends Shape{
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	@Override
	public double getPerimeter() {
		return Math.PI*getRadius()*2;
	}
	
	@Override
	public double getArea() {
		return Math.PI*Math.pow(getRadius(), 2);
	}
}
