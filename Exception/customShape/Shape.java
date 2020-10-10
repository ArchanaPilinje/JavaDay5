package customShape;

public abstract class Shape {
	
	double area;
	
	public Shape() {
	
	}

	
	public abstract void findArea();
	
	public void printShape() {
		
		System.out.println("Area= " + area);
	}
}
