
public class Pen {
	//instance variables
	String make,color;
	int inkLevel;
	
	public String getMake() {
		return make;
	}
	public void  setMake(String m) {
		make=m;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String c) {
		color=c;
	}
	
	public int getInkLevel() {
		return inkLevel;
	}
	public void setInkLevel(int il) {
		inkLevel=il;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void initPen(String m,String c,int i) {
		make=m;
		color=c;;
		inkLevel=i;
	}
	public void writeSomething() {
		
	}
	public void refillInk() {
		
	}
	
	public void displayPenInformation() {
		System.out.println("Make :"+make);
		System.out.println("Color :"+color);
		System.out.println("InkLevel :"+inkLevel);
	}
	
	public static void main(String[] args) {
		Pen p1=new Pen();
		Pen p2=new Pen();
//		p1.initPen("Renyolds","blue",5);
//		p2.initPen("Cello","black",4);
//		p1.displayPenInformation();
//		p2.displayPenInformation();
		
		p1.setColor("Blue");
		p1.setInkLevel(4);
		p1.setMake("Reynolds");
		
		System.out.println(p1.getColor());
		
		
		
		
		
	}

}
