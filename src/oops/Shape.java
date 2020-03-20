package oops;

public abstract class Shape {
		
	private String color;

	// abstract method 
	public abstract double area();

	public Shape(String color) {
		System.out.println("=========== Shape constructor called===== >>>>> ");
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
}
