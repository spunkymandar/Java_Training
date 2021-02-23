//Application class
public class TriangleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t=new Triangle();
		
		t.initTriangle(10);
		//t.height=200;
		double area=t.calculateArea();
		System.out.println("Area="+area);

	}

}
