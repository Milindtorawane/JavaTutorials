package java_basic;

public class ConstructorOverloading {

	int EmpId;
	String Name;
	int Age;
	
	
	ConstructorOverloading(int i,String Abc){
		
	 EmpId=i;
	 Name=Abc;
	}
	
	//Overloading on previous constructor
	ConstructorOverloading(int i,String Abc,int j){
		
		EmpId=i;
		Name=Abc;
		Age=j;
		
	}
	
	
	void display()
	{ 
		System.out.println(EmpId+" "+Name+" "+Age);
		
	}
	
	
	
	public static void main (String[]args){
		
		ConstructorOverloading obj =new ConstructorOverloading(5,"Milind",10);
		obj.display();
		
		
	}
	


}
