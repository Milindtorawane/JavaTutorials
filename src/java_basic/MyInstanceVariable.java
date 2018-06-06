package java_basic;

public class MyInstanceVariable {
	
	//Declare the instance variable outside the method but inside the class
	
	int i= 99;
	
	void InstanceVar()
	{
		
		System.out.println(i);
	}
	
	
	public static void main (String[]args)
	{
		int i=22;
		MyInstanceVariable obj= new MyInstanceVariable ();
		System.out.println(i);
		
		
		
		obj.InstanceVar();
			
	}

}
