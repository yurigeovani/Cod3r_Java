package exercisesAndTests.interfaces.ex05;

class Rectangle implements Resizable{
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public void resizeWidth(int width) {
		this.width+=width;
	}

	@Override
	public void resizeHeight(int height) {
		this.height += height;
	}
	
	@Override
	public String toString() {
		String result = "A rectangle with " + this.width + " X " + this.height; 
		return result;
	}
}
