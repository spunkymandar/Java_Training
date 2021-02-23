
/*
 * Calculate area of right angle triangle and initiate base. 
 * height should be double of base;
 */
public class Triangle {
	//tight encapsulation
	private int base,height;
	
	public void initTriangle(int b) {
		base =b;
		height=base*2;
	}
	public double calculateArea() {
		return 0.5*base*height;
		
	}
}
