package exercisesAndTests.interfaces.ex01;

class Rectangle implements Shape{
	private double width;
	private double length;

	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	public Rectangle() {
		super();
	}
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	@Override
	public double getArea() {
		return getWidth()*getLength();
	}
}
