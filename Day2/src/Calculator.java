
public class Calculator {
	int a,b,ans;
	
	public void initCalculator(int value1,int value2) {
		a=value1;
		b=value2;
	}
	
	public int add() {
		ans=a+b;
		return ans;
	}
	
	public int substract() {
		ans=a-b;
		return ans;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1=new Calculator();//creation of object
		c1.initCalculator(10, 2);
		int ans1=c1.add();
		System.out.println("Addition ="+ans1);
		
		
		
		int ans2=c1.substract();
		System.out.println("Substraction ="+ans2);

	}

}
