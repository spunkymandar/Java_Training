
public class Employee {
	int empId;
	String empName;
	
	/*
	 * constructor name must match with classname
	 * there should not be any return type
	 * 
	 */
	
	//default constructor
//	public Employee() {
//		empId=101;
//		System.out.println("Inside constructor");
//	}
	
	//parameterized constructor: overloaded constructor
	public Employee(int id,String name) {
		empId=id;
		empName=name;
	}
	public void displayEmployee() {
		System.out.println(empId+" "+empName);
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee(101,"Rakesh");
		Employee e2=new Employee(102,"Sachin");
		Employee e3=new Employee(103,"Yogesh");
		Employee e4=new Employee(104,"Sachin");
		Employee e5=new Employee(105,"Rahul");
		
		/*
		 * data_type[] array_name=new data_type[size]
		 * data_type array_name[]=new data_type[size]
		 */
		
		//Employee[] empArray=new Employee[5];
		Employee[] empArray= {e1,e2,e3,e4,e5};
		
//		for(Employee emp:empArray) {
//			emp.displayEmployee();
//		}
		
		
		for(int i=0;i<empArray.length;i++) {
			empArray[i].displayEmployee();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
