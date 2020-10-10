package customShape;

public class Circle extends Shape {
	float radius;

	public Circle() {

	}

	public Circle( float radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void findArea() {
		area = 3.14f * radius * radius;
	}

	@Override
	public void printShape() {
		System.out.println("Radius= " + radius);
		super.printShape();
	}
}
