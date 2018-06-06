package java_basic;

public class MyConstructorTest {
	
	
	
	public static void main (String[]args){
		
		//Default values are passed from class 
		
		MyConstructor obj1= new MyConstructor();
		System.out.println("My emploayee id =" +obj1.getId());
		System.out.println("Employee Name ="+obj1.getName());
		System.out.println("Designation ="+obj1.getDesign());
		System.out.println("This is from default constructor");
		System.out.println("#############################");
		
		//Values passed from Test class 
		
		MyConstructor obj2 =new MyConstructor(1,"Prasad Joshi","QA Engineer");
		System.out.println("My emploayee id =" +obj2.getId());
		System.out.println("Employee Name ="+obj2.getName());
		System.out.println("Designation ="+obj2.getDesign());
		System.out.println("All values are passed through getter method ");
	}

}
