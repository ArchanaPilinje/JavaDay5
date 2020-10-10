package customShape;
import java.util.Scanner;


public class TestShape {
	static void check(Shape c[],int num) throws InvalidShapeException{
		int countC=0;
		int countS=0;
		for(int i=0;i<num;i++) {
			if(c[i] instanceof Circle) {
				countC++;
			}
			else {
				countS++;
			}
		}
		
		if((countC!=0 && countS==0)||(countS!=0 && countC==0)) {
			for(int i=0;i<num;i++) {
				c[i].printShape();
			}
		}
		
		else {
			throw new InvalidShapeException("Only one type of shape must be present in the array");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of shapes");
		int num=sc.nextInt();
		Shape c[]=new Shape[num];
		for(int i=0;i<num;i++) {
			System.out.println("Enter 1.Circle 2.Square ");
			int ch=sc.nextInt();
		
			switch(ch) {
			case 1: System.out.println("Enter the radii (in float)");
					float r=sc.nextFloat();
					c[i]=new Circle(r);
					break;
			
			case 2: System.out.println("Enter the side length");
					float l=sc.nextFloat();
					c[i]=new Square(l);
					break;
			}
		}
		
		for(int i=0;i<num;i++) {
			c[i].findArea();
		}
		
		try {
		check(c,num);
		}
		catch(InvalidShapeException i) {
			i.printException();
		}

	}

}
