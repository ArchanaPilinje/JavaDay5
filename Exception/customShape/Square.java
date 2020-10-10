package customShape;

public class Square extends Shape {
	float side;
	public Square() {
		// TODO Auto-generated constructor stub
	}

	public Square(float side) {
		super();
		this.side=side;
	}

	@Override
	public void findArea() {
		area = side*side;
	}
	
	@Override
	public void printShape() {
		System.out.println("Side length= " + side);
		super.printShape();
	}
}
