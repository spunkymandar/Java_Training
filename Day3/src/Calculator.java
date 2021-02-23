
public class Calculator {
	
//	public int add(int value1,int value2) {
//		return value1+value2;
//	}
//	
//	//overloaded method
//	public int add(int value1,int value2,int value3) {
//		return value1+value2+value3;
//	}
//	
//	//overloaded method
//	public int add(int value1,int value2,int value3,int value4) {
//		return value1+value2+value3+value4;
//	}
	
	
	//var-argments (datatype... var_name)
	/*
	 * 1. You can have single var-argument in a method
	 * 2. If your var argument is added to other arguments, then var-argument should be 
	 * at the last
	 */
	public int add(String owner, int... values) {
		int sum=0;
		for(int i=0;i<values.length;i++) {
			sum=sum+values[i];
		}
		System.out.println(owner);
		return sum;
	}
	
//	public int add(int[] values) {
//		return 0;
//	}
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1=new Calculator();
		
		System.out.println(c1.add("Rakesh",10, 2));
		System.out.println(c1.add("Sunil",10, 2,4));
		System.out.println(c1.add("John",10, 2,4,6));
		System.out.println(c1.add("Williams",10, 2,4,6,34,65,23,65));
	}

}
